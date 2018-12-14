/*
 * generated by Xtext 2.10.0
 */
package org.tetrabox.minijava.xtext.scoping

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.tetrabox.minijava.xtext.MiniJavaModelUtil
import org.tetrabox.minijava.xtext.miniJava.Assignment
import org.tetrabox.minijava.xtext.miniJava.Block
import org.tetrabox.minijava.xtext.miniJava.FieldAccess
import org.tetrabox.minijava.xtext.miniJava.ForStatement
import org.tetrabox.minijava.xtext.miniJava.Method
import org.tetrabox.minijava.xtext.miniJava.MethodCall
import org.tetrabox.minijava.xtext.miniJava.MiniJavaPackage
import org.tetrabox.minijava.xtext.miniJava.VariableDeclaration
import org.tetrabox.minijava.xtext.typing.MiniJavaTypeComputer

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MiniJavaScopeProvider extends AbstractMiniJavaScopeProvider {

	val epackage = MiniJavaPackage.eINSTANCE
	@Inject extension MiniJavaModelUtil
	@Inject extension MiniJavaTypeComputer

	override getScope(EObject context, EReference reference) {
		if (reference == epackage.symbolRef_Symbol) {
			return scopeForSymbolRef(context)
		} else if (context instanceof MethodCall) {
			return scopeForMethodCall(context)
		} else if (context instanceof FieldAccess) {
			return scopeForFieldAccess(context)
		}
		return super.getScope(context, reference)
	}

	// TODO field access? (not required, we have 'this')
	// TODO variable declaration atop for loop
	def protected IScope scopeForSymbolRef(EObject context) {
		val container = context.eContainer
		return switch (container) {
			Method:
				Scopes.scopeFor(container.params)
			Block:
				Scopes.scopeFor(
					container.statements.takeWhile[it != context].filter(Assignment).map[it.assignee].filter(
						VariableDeclaration),
					scopeForSymbolRef(container) // outer scope
				)
			ForStatement:
				Scopes.scopeFor(
					#[container.declaration.assignee],
					scopeForSymbolRef(container) // outer scope
				)
			default:
				scopeForSymbolRef(container)
		}
	}

	// TODO simplify?
	def IScope scopeForFieldAccess(FieldAccess sel) {
		val type = sel.receiver.typeFor

		if (type === null || type.isPrimitive)
			return IScope.NULLSCOPE

		val grouped = type.classHierarchyMembers.groupBy[it instanceof Method]
		val inheritedMethods = grouped.get(true) ?: emptyList
		val inheritedFields = grouped.get(false) ?: emptyList

		return Scopes.scopeFor(
			type.fields + type.methods,
			Scopes.scopeFor(inheritedFields + inheritedMethods)
		)
	}

	// TODO simplify?
	def IScope scopeForMethodCall(MethodCall sel) {
		val type = sel.receiver.typeFor

		if (type === null || type.isPrimitive)
			return IScope.NULLSCOPE

		val grouped = type.classHierarchyMembers.groupBy[it instanceof Method]
		val inheritedMethods = grouped.get(true) ?: emptyList
		val inheritedFields = grouped.get(false) ?: emptyList

		return Scopes.scopeFor(
			type.methods + type.fields,
			Scopes.scopeFor(inheritedMethods + inheritedFields)
		)
	}

}