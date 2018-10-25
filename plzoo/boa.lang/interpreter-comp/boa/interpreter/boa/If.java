package boa.interpreter.boa;

import boa_dynamic.interpreter.boa_dynamic.Ctx;
import boa_dynamic.interpreter.boa_dynamic.EvalRes;
import org.eclipse.emf.ecore.EObject;

public interface If extends EObject, Expr {
  Expr getCond();

  void setCond(Expr value);

  Expr getThn();

  void setThn(Expr value);

  Expr getEls();

  void setEls(Expr value);

  EvalRes eval(Ctx ctx);
}
