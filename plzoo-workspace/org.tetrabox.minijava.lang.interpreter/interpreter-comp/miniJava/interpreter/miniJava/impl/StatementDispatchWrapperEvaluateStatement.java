package miniJava.interpreter.miniJava.impl;

import com.oracle.truffle.api.Assumption;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.utilities.CyclicAssumption;
import miniJava.interpreter.miniJava.Statement;

public class StatementDispatchWrapperEvaluateStatement {
  private RootCallTarget callTarget;

  private final CyclicAssumption callTargetStable;

  protected StatementDispatchWrapperEvaluateStatement(Statement it) {
    this.callTargetStable = new CyclicAssumption("StatementDispatchWrapperEvaluateStatement_6.1142311618307166E7");
    this.callTarget = Truffle.getRuntime().createCallTarget(new StatementEvaluateStatementRootNode(it));
  }

  public RootCallTarget getCallTarget() {
    return callTarget;}

  public Assumption getCallTargetStable() {
    return callTargetStable.getAssumption();}
}
