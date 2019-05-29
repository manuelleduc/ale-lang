package org.eclipse.emf.ecoretools.ale.compiler.emfswitch

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.CodeBlock
import java.util.List
import java.util.Map
import org.eclipse.acceleo.query.ast.Call
import org.eclipse.acceleo.query.ast.CallType
import org.eclipse.acceleo.query.ast.StringLiteral
import org.eclipse.acceleo.query.validation.type.SequenceType
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecoretools.ale.compiler.common.AbstractExpressionCompiler
import org.eclipse.emf.ecoretools.ale.compiler.common.CommonTypeInferer
import org.eclipse.emf.ecoretools.ale.compiler.common.CompilerExpressionCtx
import org.eclipse.emf.ecoretools.ale.compiler.common.ResolvedClass
import org.eclipse.emf.ecoretools.ale.compiler.utils.EnumeratorService
import org.eclipse.emf.ecoretools.ale.implementation.Method

class SwitchExpressionCompiler extends AbstractExpressionCompiler {

	extension SwitchTypeSystemUtils tsu
	extension SwitchNamingUtils snu
	extension CommonTypeInferer cti
	extension EnumeratorService es
	val String packageRoot

	new(SwitchTypeSystemUtils tsu, List<ResolvedClass> resolved, SwitchNamingUtils snu, String packageRoot,
		Map<String, Class<?>> registeredServices, CommonTypeInferer cti, EnumeratorService es) {
		super(cti, es, tsu, snu, registeredServices, resolved)
		this.tsu = tsu
		this.snu = snu
		this.packageRoot = packageRoot
		this.cti = cti
		this.es = es
	}

	override getThis(CompilerExpressionCtx ctx) {
		'this.it'
	}

	override defaultCall(Call call, CompilerExpressionCtx ctx) {
		if (call.type == CallType.CALLORAPPLY) {
			if (call.serviceName == 'aqlFeatureAccess') {
				val t = infereType(call).head

				// it t is in the hierarchy of the current context eClass (as itself or one of his parents), we can skip the accessor and directly point to the field
				val lhs = call.arguments.head.compileExpression(ctx)
				if (lhs.toString == 'this') {
					if (t instanceof SequenceType && (t as SequenceType).collectionType.type instanceof EClass &&
						((t as SequenceType).collectionType.type as EClass).instanceClassName !=
							"java.util.Map$Entry") {
						val rhs = (call.arguments.get(1) as StringLiteral).value

						CodeBlock.of('''«lhs».get«rhs.toFirstUpper»()''')
					} else if (t.type instanceof EClass || t.type instanceof EDataType) {
						CodeBlock.of('''«lhs».«(call.arguments.get(1) as StringLiteral).value»''')
					} else {
						CodeBlock.
							of('''«lhs».«IF call.arguments.get(1) instanceof StringLiteral»«(call.arguments.get(1) as StringLiteral).value»«ELSE»«call.arguments.get(1).compileExpression(ctx)»«ENDIF»''')
					}

				} else {
					if (t instanceof SequenceType && (t as SequenceType).collectionType.type instanceof EClass) {
						CodeBlock.of('''$L.get$L()''', lhs, (call.arguments.get(1) as StringLiteral).value.toFirstUpper)
					} else if (t !== null && (t.type instanceof EClass || t.type instanceof EDataType)) {
						if (t.type instanceof EDataType && ((t.type as EDataType).instanceClass == Boolean ||
							(t.type as EDataType).instanceClass == boolean))
							CodeBlock.of('''$L.is$L()''', lhs,
								(call.arguments.get(1) as StringLiteral).value.toFirstUpper)
						else
							CodeBlock.of('''$L.get$L()''', lhs,
								(call.arguments.get(1) as StringLiteral).value.toFirstUpper)
					} else {
						CodeBlock.
							of('''$L.«IF call.arguments.get(1) instanceof StringLiteral»get«(call.arguments.get(1) as StringLiteral).value.toFirstUpper»()«ELSE»«call.arguments.get(1).compileExpression(ctx)»«ENDIF»''',
								lhs)
					}
				}
			} else if (call.serviceName == 'create') {
				call.callCreate(packageRoot)
			} else {
				val argumentsh = call.arguments.head
				val ts = argumentsh.infereType
				val t = ts.head
				val re = resolved.filter [
					if (t !== null && t.type instanceof EClass) {
						val tecls = t.type as EClass
						it.ECls.name == tecls.name && it.ECls.EPackage.name == tecls.EPackage.name
					} else {
						false
					}
				].head
				if (re !== null) {
					val allMethods = re.getAleCls.allMethods
					val methodExist = allMethods.exists [
						it.operationRef.name == call.serviceName
					]
					if (methodExist) {
						val methods = allMethods.filter[it.operationRef.name == call.serviceName].toList

						/* Look for the most specific method that matches the resolved class by walking up the hierarchy */
						var Method method = null
						var ResolvedClass rev = re
						while (method === null) {
							val lc = rev.aleCls
							method = methods.filter[it.eContainer === lc].head

							val revc = rev
							rev = resolved.filter [
								revc.eCls instanceof EClass && (revc.eCls as EClass).ESuperTypes.contains(it.eCls)
							].head
						}

						// lookup if one of the method declaration is declared with a dispatch
						var isDispatch = false
						rev = re
						while (!isDispatch && rev !== null) {
							val lc = rev.aleCls
							method = methods.filter[it.eContainer === lc].head

							isDispatch = method !== null && method.isDispatch

							val revc = rev
							rev = resolved.filter [
								revc.eCls instanceof EClass && (revc.eCls as EClass).ESuperTypes.contains(it.eCls)
							].head
						}

						val hm = newHashMap(
							"operationType" ->
								ClassName.get(packageRoot.operationPackageName,
									(t.type as EClassifier).solveType.operationClassName),
							"switched" -> call.arguments.head.compileExpression(ctx),
							"callService" -> call.serviceName
						)

						for (param : call.arguments.tail.enumerate) {
							hm.put("paramType" + param.value,
								param.key.infereType.head?.type?.resolveType2?.solveNothing(param.key))
							hm.put("paramExpr" + param.value, param.key.compileExpression(ctx))
						}

						CodeBlock.builder.
							addNamed('''(($operationType:T) emfswitch.doSwitch($switched:L)).$callService:L(«FOR param : call.arguments.tail.enumerate SEPARATOR ', '»($paramType«param.value»:T) ($paramExpr«param.value»:L)«ENDFOR»)''',
								hm).build
					} else {
						call.callService(ctx)
					}
				} else {
					call.callService(ctx)
				}
			}
		} else {
			CodeBlock.of('''/*Call «call»*/''')
		}
	}
}
