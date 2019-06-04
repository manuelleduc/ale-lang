/*
 * generated by Xtext 2.14.0
 */
package org.tetrabox.minijava.xtext.fortest.formatting2

import com.google.inject.Inject
import miniJava.interpreter.miniJava.Clazz
import miniJava.interpreter.miniJava.Program
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.tetrabox.minijava.xtext.fortest.services.MiniJavaGrammarAccess

class MiniJavaFormatter extends AbstractFormatter2 {
	
	@Inject extension MiniJavaGrammarAccess

	def dispatch void format(Program program, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (_import : program.imports) {
			_import.format
		}
		for (typeDeclaration : program.classes) {
			typeDeclaration.format
		}
	}

	def dispatch void format(Clazz clazz, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (member : clazz.members) {
			member.format
		}
	}
	
	// TODO: implement for Interface, Method, Parameter, Field, Block, PrintStatement, Return, IfStatement, WhileStatement, ForStatement, VariableDeclaration, Assignment, Or, And, ArrayAccess, Not, Neg, MethodCall, NewObject, NewArray, ArrayTypeRef, Equality, Inequality, SuperiorOrEqual, InferiorOrEqual, Superior, Inferior, Plus, Minus, Multiplication, Division, ArrayLength, FieldAccess
}