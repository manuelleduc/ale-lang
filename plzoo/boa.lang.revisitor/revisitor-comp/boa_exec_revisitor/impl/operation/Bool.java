package boa_exec_revisitor.impl.operation;

import boa.Ctx;
import boa.EvalRes;

public interface Bool extends Expr {
  EvalRes eval(Ctx ctx);
}
