/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.App;
import org.xtext.example.mydsl.myDsl.ArithOpDivide;
import org.xtext.example.mydsl.myDsl.ArithOpMinus;
import org.xtext.example.mydsl.myDsl.ArithOpPlus;
import org.xtext.example.mydsl.myDsl.ArithOpRemainder;
import org.xtext.example.mydsl.myDsl.ArithOpTimes;
import org.xtext.example.mydsl.myDsl.Assign;
import org.xtext.example.mydsl.myDsl.BObject;
import org.xtext.example.mydsl.myDsl.Bool;
import org.xtext.example.mydsl.myDsl.BoolOpAnd;
import org.xtext.example.mydsl.myDsl.BoolOpOr;
import org.xtext.example.mydsl.myDsl.CmpOpEqual;
import org.xtext.example.mydsl.myDsl.CmpOpLess;
import org.xtext.example.mydsl.myDsl.CmpOpUnequal;
import org.xtext.example.mydsl.myDsl.Copy;
import org.xtext.example.mydsl.myDsl.Def;
import org.xtext.example.mydsl.myDsl.Field;
import org.xtext.example.mydsl.myDsl.File;
import org.xtext.example.mydsl.myDsl.Fun;
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.Int;
import org.xtext.example.mydsl.myDsl.Let;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Not;
import org.xtext.example.mydsl.myDsl.Project;
import org.xtext.example.mydsl.myDsl.Seq;
import org.xtext.example.mydsl.myDsl.Skip;
import org.xtext.example.mydsl.myDsl.This;
import org.xtext.example.mydsl.myDsl.Var;
import org.xtext.example.mydsl.myDsl.With;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.APP:
				sequence_App(context, (App) semanticObject); 
				return; 
			case MyDslPackage.ARITH_OP_DIVIDE:
				sequence_ArithOpDivide(context, (ArithOpDivide) semanticObject); 
				return; 
			case MyDslPackage.ARITH_OP_MINUS:
				sequence_ArithOpMinus(context, (ArithOpMinus) semanticObject); 
				return; 
			case MyDslPackage.ARITH_OP_PLUS:
				sequence_ArithOpPlus(context, (ArithOpPlus) semanticObject); 
				return; 
			case MyDslPackage.ARITH_OP_REMAINDER:
				sequence_ArithOpRemainder(context, (ArithOpRemainder) semanticObject); 
				return; 
			case MyDslPackage.ARITH_OP_TIMES:
				sequence_ArithOpTimes(context, (ArithOpTimes) semanticObject); 
				return; 
			case MyDslPackage.ASSIGN:
				sequence_Assign(context, (Assign) semanticObject); 
				return; 
			case MyDslPackage.BOBJECT:
				sequence_BObject(context, (BObject) semanticObject); 
				return; 
			case MyDslPackage.BOOL:
				sequence_Bool(context, (Bool) semanticObject); 
				return; 
			case MyDslPackage.BOOL_OP_AND:
				sequence_BoolOpAnd(context, (BoolOpAnd) semanticObject); 
				return; 
			case MyDslPackage.BOOL_OP_OR:
				sequence_BoolOpOr(context, (BoolOpOr) semanticObject); 
				return; 
			case MyDslPackage.CMP_OP_EQUAL:
				sequence_CmpOpEqual(context, (CmpOpEqual) semanticObject); 
				return; 
			case MyDslPackage.CMP_OP_LESS:
				sequence_CmpOpLess(context, (CmpOpLess) semanticObject); 
				return; 
			case MyDslPackage.CMP_OP_UNEQUAL:
				sequence_CmpOpUnequal(context, (CmpOpUnequal) semanticObject); 
				return; 
			case MyDslPackage.COPY:
				sequence_Copy(context, (Copy) semanticObject); 
				return; 
			case MyDslPackage.DEF:
				sequence_Def(context, (Def) semanticObject); 
				return; 
			case MyDslPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case MyDslPackage.FILE:
				sequence_File(context, (File) semanticObject); 
				return; 
			case MyDslPackage.FUN:
				sequence_Fun(context, (Fun) semanticObject); 
				return; 
			case MyDslPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case MyDslPackage.INT:
				sequence_Int0(context, (Int) semanticObject); 
				return; 
			case MyDslPackage.LET:
				sequence_Let(context, (Let) semanticObject); 
				return; 
			case MyDslPackage.NOT:
				sequence_Not(context, (Not) semanticObject); 
				return; 
			case MyDslPackage.PROJECT:
				sequence_Project(context, (Project) semanticObject); 
				return; 
			case MyDslPackage.SEQ:
				sequence_Seq(context, (Seq) semanticObject); 
				return; 
			case MyDslPackage.SKIP:
				sequence_Skip(context, (Skip) semanticObject); 
				return; 
			case MyDslPackage.THIS:
				sequence_This(context, (This) semanticObject); 
				return; 
			case MyDslPackage.VAR:
				sequence_Var(context, (Var) semanticObject); 
				return; 
			case MyDslPackage.WITH:
				sequence_With(context, (With) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns App
	 *     Expr returns App
	 *     App returns App
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_App(ISerializationContext context, App semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.APP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.APP__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.APP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.APP__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAppAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAppAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns ArithOpDivide
	 *     Expr returns ArithOpDivide
	 *     ArithOpDivide returns ArithOpDivide
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_ArithOpDivide(ISerializationContext context, ArithOpDivide semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_DIVIDE__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_DIVIDE__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_DIVIDE__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_DIVIDE__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithOpDivideAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getArithOpDivideAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns ArithOpMinus
	 *     Expr returns ArithOpMinus
	 *     ArithOpMinus returns ArithOpMinus
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_ArithOpMinus(ISerializationContext context, ArithOpMinus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_MINUS__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_MINUS__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_MINUS__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_MINUS__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithOpMinusAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getArithOpMinusAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns ArithOpPlus
	 *     Expr returns ArithOpPlus
	 *     ArithOpPlus returns ArithOpPlus
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_ArithOpPlus(ISerializationContext context, ArithOpPlus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_PLUS__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_PLUS__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_PLUS__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_PLUS__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithOpPlusAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getArithOpPlusAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns ArithOpRemainder
	 *     Expr returns ArithOpRemainder
	 *     ArithOpRemainder returns ArithOpRemainder
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_ArithOpRemainder(ISerializationContext context, ArithOpRemainder semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_REMAINDER__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_REMAINDER__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_REMAINDER__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_REMAINDER__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithOpRemainderAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getArithOpRemainderAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns ArithOpTimes
	 *     Expr returns ArithOpTimes
	 *     ArithOpTimes returns ArithOpTimes
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_ArithOpTimes(ISerializationContext context, ArithOpTimes semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_TIMES__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_TIMES__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ARITH_OP_TIMES__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ARITH_OP_TIMES__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArithOpTimesAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getArithOpTimesAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Assign
	 *     Expr returns Assign
	 *     Assign returns Assign
	 *
	 * Constraint:
	 *     (name=EString lhs=Expr rhs=Expr)
	 */
	protected void sequence_Assign(ISerializationContext context, Assign semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ASSIGN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ASSIGN__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ASSIGN__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ASSIGN__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ASSIGN__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ASSIGN__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAssignAccess().getLhsExprParserRuleCall_4_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAssignAccess().getRhsExprParserRuleCall_6_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns BObject
	 *     Expr returns BObject
	 *     BObject returns BObject
	 *
	 * Constraint:
	 *     (fields+=Field fields+=Field*)?
	 */
	protected void sequence_BObject(ISerializationContext context, BObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns BoolOpAnd
	 *     Expr returns BoolOpAnd
	 *     BoolOpAnd returns BoolOpAnd
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_BoolOpAnd(ISerializationContext context, BoolOpAnd semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.BOOL_OP_AND__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.BOOL_OP_AND__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.BOOL_OP_AND__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.BOOL_OP_AND__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoolOpAndAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getBoolOpAndAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns BoolOpOr
	 *     Expr returns BoolOpOr
	 *     BoolOpOr returns BoolOpOr
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_BoolOpOr(ISerializationContext context, BoolOpOr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.BOOL_OP_OR__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.BOOL_OP_OR__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.BOOL_OP_OR__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.BOOL_OP_OR__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBoolOpOrAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getBoolOpOrAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Bool
	 *     Expr returns Bool
	 *     Bool returns Bool
	 *
	 * Constraint:
	 *     value?='value'?
	 */
	protected void sequence_Bool(ISerializationContext context, Bool semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns CmpOpEqual
	 *     Expr returns CmpOpEqual
	 *     CmpOpEqual returns CmpOpEqual
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_CmpOpEqual(ISerializationContext context, CmpOpEqual semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CMP_OP_EQUAL__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CMP_OP_EQUAL__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CMP_OP_EQUAL__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CMP_OP_EQUAL__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCmpOpEqualAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getCmpOpEqualAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns CmpOpLess
	 *     Expr returns CmpOpLess
	 *     CmpOpLess returns CmpOpLess
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_CmpOpLess(ISerializationContext context, CmpOpLess semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CMP_OP_LESS__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CMP_OP_LESS__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CMP_OP_LESS__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CMP_OP_LESS__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCmpOpLessAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getCmpOpLessAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns CmpOpUnequal
	 *     Expr returns CmpOpUnequal
	 *     CmpOpUnequal returns CmpOpUnequal
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_CmpOpUnequal(ISerializationContext context, CmpOpUnequal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CMP_OP_UNEQUAL__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CMP_OP_UNEQUAL__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CMP_OP_UNEQUAL__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CMP_OP_UNEQUAL__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCmpOpUnequalAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getCmpOpUnequalAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Copy
	 *     Expr returns Copy
	 *     Copy returns Copy
	 *
	 * Constraint:
	 *     copy=Expr
	 */
	protected void sequence_Copy(ISerializationContext context, Copy semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.COPY__COPY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.COPY__COPY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCopyAccess().getCopyExprParserRuleCall_3_0(), semanticObject.getCopy());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Def
	 *     Def returns Def
	 *
	 * Constraint:
	 *     (name=EString expr=Expr)
	 */
	protected void sequence_Def(ISerializationContext context, Def semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DEF__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.DEF__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.DEF__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDefAccess().getExprExprParserRuleCall_4_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     (name=EString value=Expr)
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FIELD__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FIELD__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFieldAccess().getValueExprParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     File returns File
	 *
	 * Constraint:
	 *     (commands+=TopLevelCmd commands+=TopLevelCmd*)?
	 */
	protected void sequence_File(ISerializationContext context, File semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Fun
	 *     Expr returns Fun
	 *     Fun returns Fun
	 *
	 * Constraint:
	 *     (name=EString body=Expr)
	 */
	protected void sequence_Fun(ISerializationContext context, Fun semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FUN__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FUN__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FUN__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FUN__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunAccess().getBodyExprParserRuleCall_4_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns If
	 *     Expr returns If
	 *     If returns If
	 *
	 * Constraint:
	 *     (cond=Expr thn=Expr els=Expr)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.IF__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.IF__COND));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.IF__THN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.IF__THN));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.IF__ELS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.IF__ELS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIfAccess().getCondExprParserRuleCall_3_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getIfAccess().getThnExprParserRuleCall_5_0(), semanticObject.getThn());
		feeder.accept(grammarAccess.getIfAccess().getElsExprParserRuleCall_7_0(), semanticObject.getEls());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Int
	 *     Expr returns Int
	 *     Int0 returns Int
	 *
	 * Constraint:
	 *     value=EInt?
	 */
	protected void sequence_Int0(ISerializationContext context, Int semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Let
	 *     Expr returns Let
	 *     Let returns Let
	 *
	 * Constraint:
	 *     (name=EString lhs=Expr rhs=Expr)
	 */
	protected void sequence_Let(ISerializationContext context, Let semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LET__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LET__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LET__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LET__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.LET__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.LET__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLetAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLetAccess().getLhsExprParserRuleCall_4_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getLetAccess().getRhsExprParserRuleCall_6_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Not
	 *     Expr returns Not
	 *     Not returns Not
	 *
	 * Constraint:
	 *     value=Expr
	 */
	protected void sequence_Not(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.NOT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.NOT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNotAccess().getValueExprParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Project
	 *     Expr returns Project
	 *     Project returns Project
	 *
	 * Constraint:
	 *     (name=EString exp=Expr)
	 */
	protected void sequence_Project(ISerializationContext context, Project semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROJECT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROJECT__NAME));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.PROJECT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.PROJECT__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProjectAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProjectAccess().getExpExprParserRuleCall_4_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Seq
	 *     Expr returns Seq
	 *     Seq returns Seq
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_Seq(ISerializationContext context, Seq semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SEQ__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SEQ__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SEQ__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SEQ__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSeqAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getSeqAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Skip
	 *     Expr returns Skip
	 *     Skip returns Skip
	 *
	 * Constraint:
	 *     {Skip}
	 */
	protected void sequence_Skip(ISerializationContext context, Skip semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns This
	 *     Expr returns This
	 *     This returns This
	 *
	 * Constraint:
	 *     {This}
	 */
	protected void sequence_This(ISerializationContext context, This semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns Var
	 *     Expr returns Var
	 *     Var returns Var
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Var(ISerializationContext context, Var semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VAR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TopLevelCmd returns With
	 *     Expr returns With
	 *     With returns With
	 *
	 * Constraint:
	 *     (lhs=Expr rhs=Expr)
	 */
	protected void sequence_With(ISerializationContext context, With semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WITH__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WITH__LHS));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WITH__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WITH__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWithAccess().getLhsExprParserRuleCall_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getWithAccess().getRhsExprParserRuleCall_5_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
}