package visitor.visitor.operation.boa;

import visitor.boa.visitor.boa.Ctx;
import visitor.boa.visitor.boa.EvalRes;

public interface ArithOpTimesOperation extends ArithOpOperation {
  EvalRes eval(Ctx ctx);
}
