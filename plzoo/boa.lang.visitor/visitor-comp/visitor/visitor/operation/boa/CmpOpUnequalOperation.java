package visitor.visitor.operation.boa;

import visitor.boa.visitor.boa.Ctx;
import visitor.boa.visitor.boa.EvalRes;

public interface CmpOpUnequalOperation extends CmpOpOperation {
  EvalRes eval(Ctx ctx);
}
