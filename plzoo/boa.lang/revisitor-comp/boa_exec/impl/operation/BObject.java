package boa_exec.impl.operation;

import boa.Ctx;
import boa.EvalRes;

public interface BObject extends Expr {
  EvalRes eval(Ctx ctx);
}
