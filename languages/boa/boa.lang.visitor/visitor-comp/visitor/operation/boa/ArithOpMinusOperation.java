package visitor.operation.boa;

import boa.visitor.boa.Ctx;
import boa.visitor.boa.EvalRes;

public interface ArithOpMinusOperation extends ArithOpOperation {
	EvalRes eval(Ctx ctx);
}