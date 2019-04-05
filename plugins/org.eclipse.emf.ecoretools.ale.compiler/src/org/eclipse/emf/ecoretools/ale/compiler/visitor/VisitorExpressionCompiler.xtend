package org.eclipse.emf.ecoretools.ale.compiler.visitor

import com.squareup.javapoet.ClassName
import com.squareup.javapoet.CodeBlock
import java.lang.reflect.Modifier
import java.util.List
import java.util.Map
import org.eclipse.acceleo.query.ast.Call
import org.eclipse.acceleo.query.ast.CallType
import org.eclipse.acceleo.query.ast.StringLiteral
import org.eclipse.acceleo.query.ast.VarRef
import org.eclipse.acceleo.query.validation.type.SequenceType
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecoretools.ale.compiler.common.AbstractExpressionCompiler
import org.eclipse.emf.ecoretools.ale.compiler.common.CommonTypeInferer
import org.eclipse.emf.ecoretools.ale.compiler.common.CompilerExpressionCtx
import org.eclipse.emf.ecoretools.ale.compiler.common.ResolvedClass
import org.eclipse.emf.ecoretools.ale.compiler.utils.EnumeratorService
import org.eclipse.emf.ecoretools.ale.implementation.ExtendedClass

class VisitorExpressionCompiler extends AbstractExpressionCompiler {

	extension VisitorTypeSystemUtil vtsu
	extension VisitorNamingUtils vnu
	extension EnumeratorService es
	val List<ResolvedClass> resolved
	val Map<String, Class<?>> registeredServices
	val String packageRoot

	new(VisitorTypeSystemUtil vtsu, List<ResolvedClass> resolved, Map<String, Class<?>> registeredServices,
		VisitorNamingUtils vnu, String packageRoot, CommonTypeInferer cti, EnumeratorService es) {
		super(cti, es, vtsu)
		this.vtsu = vtsu
		this.resolved = resolved
		this.registeredServices = registeredServices
		this.vnu = vnu
		this.packageRoot = packageRoot
		this.es = es
	}


	
	override compileThis(VarRef call, CompilerExpressionCtx ctx) {
		CodeBlock.of(if(call.variableName == 'self') 'this.it' else call.variableName)
	}

	def allMethods(ExtendedClass aleClass) {
		aleClass.allParents.map [
			it.methods
		].flatten
	}

	def allParents(ExtendedClass aleClass) {
		val ecls = resolved.filter[it.aleCls == aleClass].head.eCls

		resolved.filter[it.eCls == ecls || (it.eCls as EClass).isSuperTypeOf(ecls as EClass)].map [
			it.aleCls
		].filter[it !== null]
	}

	override defaultCall(Call call, CompilerExpressionCtx ctx) {
		if (call.type == CallType.CALLORAPPLY)
			if (call.serviceName == 'aqlFeatureAccess') {
				val t = infereType(call).head
				if (t instanceof SequenceType && (t as SequenceType).collectionType.type instanceof EClass) {
					CodeBlock.of('''$L.get$L()''', call.arguments.head.compileExpression(ctx),
						(call.arguments.get(1) as StringLiteral).value.toFirstUpper)
				} else if (t.type instanceof EClass || t.type instanceof EDataType) {
					if (t.type instanceof EDataType && ((t.type as EDataType).instanceClass == Boolean ||
						(t.type as EDataType).instanceClass == boolean))
						CodeBlock.of('''$L.is$L()''', call.arguments.head.compileExpression(ctx),
							(call.arguments.get(1) as StringLiteral).value.toFirstUpper)
					else
						CodeBlock.of('''$L.get$L()''', call.arguments.head.compileExpression(ctx),
							(call.arguments.get(1) as StringLiteral).value.toFirstUpper)
				} else {
					// TODO: add named block
					CodeBlock.
						of('''$L.«IF call.arguments.get(1) instanceof StringLiteral»get«(call.arguments.get(1) as StringLiteral).value.toFirstUpper»()«ELSE»«call.arguments.get(1).compileExpression(ctx)»«ENDIF»''',
							call.arguments.head.compileExpression(ctx))

				}
			} else if (call.serviceName == 'create') {
				val e = call.arguments.get(0)
				val t = infereType(e).head
				val ecls = t.type as EClass
				val epks = ecls.EPackage
				val hm = newHashMap("factory" -> epks.factoryIntClassName(packageRoot))
				CodeBlock.builder.addNamed('''$factory:T.eINSTANCE.create«ecls.name»()''', hm).build
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
						val hm = newHashMap()
						hm.put("typecaller", (call.arguments.head.infereType.head.type as EClass).solveType)
						hm.put("typeoperation",
							ClassName.get(packageRoot.operationInterfacePackageName(t.type as EClass),
								(t.type as EClass).operationInterfaceClassName))
						for (param : call.arguments.tail.enumerate) {
							hm.put("typeparam" + param.value, param.key.infereType.head.type.resolveType2)
							hm.put("expression" + param.value, param.key.compileExpression(ctx))
						}

						val a0 = call.arguments.head
						hm.put("caller", a0.compileExpression(ctx))
						hm.put("serviceName", call.serviceName)

						CodeBlock.builder.
							addNamed('''(($typeoperation:T)$caller:L.accept(vis)).$serviceName:L(«FOR p : call.arguments.tail.enumerate SEPARATOR ', '»($typeparam«p.value»:T)$expression«p.value»:L«ENDFOR»)''',
								hm).build
					} else {

						val methods = registeredServices.entrySet.map[e|e.value.methods.map[e.key -> it]].flatten.toList

						val candidate = methods.filter[Modifier.isStatic(it.value.modifiers)].filter [
							it.value.name == call.serviceName
						].head

						if (candidate !== null) {
							CodeBlock.
								of('''«candidate.key».«candidate.value.name»(«FOR p : call.arguments SEPARATOR ', '»«p.compileExpression(ctx)»«ENDFOR»)''')
						} else {
							CodeBlock.
								of('''«call.arguments.head.compileExpression(ctx)».«call.serviceName»(«FOR param : call.arguments.tail SEPARATOR ', '»«param.compileExpression(ctx)»«ENDFOR»)''')

						}
					}
				} else {
					val methods = registeredServices.entrySet.map[e|e.value.methods.map[e.key -> it]].flatten

					val candidate = methods.filter[Modifier.isStatic(it.value.modifiers)].filter [
						it.value.name == call.serviceName
					].head

					if (candidate !== null) {
						CodeBlock.
							of('''«candidate.key».«candidate.value.name»(«FOR p : call.arguments SEPARATOR ', '»«p.compileExpression(ctx)»«ENDFOR»)''')
					} else {
						CodeBlock.
							of('''«call.arguments.head.compileExpression(ctx)».«call.serviceName»(«FOR param : call.arguments.tail SEPARATOR ', '»«param.compileExpression(ctx)»«ENDFOR»)''')

					}
				}
			}
		else
			CodeBlock.of('''/*Call «call»*/''')
	}
}