package boa_exec_revisitor.impl.operation;

import boa.Ctx;
import boa.EvalRes;

public interface ArithOpRemainder extends ArithOp {
  EvalRes eval(Ctx ctx);
}
