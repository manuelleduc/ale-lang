package minijava_exec.impl.operation;

import miniJava.State;
import miniJava.Value;

public interface ModuloOp extends ExpressionOp {
	Value evaluateExpression(State state);
}