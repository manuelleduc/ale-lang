package boa_exec_revisitor.impl.operation.impl;

import boa.revisitor.BoaRevisitor;
import boa_exec_revisitor.impl.operation.App;
import boa_exec_revisitor.impl.operation.ArithOp;
import boa_exec_revisitor.impl.operation.ArithOpDivide;
import boa_exec_revisitor.impl.operation.ArithOpMinus;
import boa_exec_revisitor.impl.operation.ArithOpPlus;
import boa_exec_revisitor.impl.operation.ArithOpRemainder;
import boa_exec_revisitor.impl.operation.ArithOpTimes;
import boa_exec_revisitor.impl.operation.Assign;
import boa_exec_revisitor.impl.operation.BObject;
import boa_exec_revisitor.impl.operation.Bool;
import boa_exec_revisitor.impl.operation.BoolOp;
import boa_exec_revisitor.impl.operation.BoolOpAnd;
import boa_exec_revisitor.impl.operation.BoolOpOr;
import boa_exec_revisitor.impl.operation.CmpOp;
import boa_exec_revisitor.impl.operation.CmpOpEqual;
import boa_exec_revisitor.impl.operation.CmpOpLess;
import boa_exec_revisitor.impl.operation.CmpOpUnequal;
import boa_exec_revisitor.impl.operation.Copy;
import boa_exec_revisitor.impl.operation.Ctx;
import boa_exec_revisitor.impl.operation.Def;
import boa_exec_revisitor.impl.operation.EvalBoolRes;
import boa_exec_revisitor.impl.operation.EvalBoundFunRes;
import boa_exec_revisitor.impl.operation.EvalFunRes;
import boa_exec_revisitor.impl.operation.EvalIntRes;
import boa_exec_revisitor.impl.operation.EvalMapRes;
import boa_exec_revisitor.impl.operation.EvalRes;
import boa_exec_revisitor.impl.operation.Expr;
import boa_exec_revisitor.impl.operation.Field;
import boa_exec_revisitor.impl.operation.File;
import boa_exec_revisitor.impl.operation.Fun;
import boa_exec_revisitor.impl.operation.If;
import boa_exec_revisitor.impl.operation.Int;
import boa_exec_revisitor.impl.operation.Let;
import boa_exec_revisitor.impl.operation.Not;
import boa_exec_revisitor.impl.operation.Project;
import boa_exec_revisitor.impl.operation.Seq;
import boa_exec_revisitor.impl.operation.Skip;
import boa_exec_revisitor.impl.operation.This;
import boa_exec_revisitor.impl.operation.TopLevelCmd;
import boa_exec_revisitor.impl.operation.Var;
import boa_exec_revisitor.impl.operation.With;

public class AppImpl extends ExprImpl implements App {
  private BoaRevisitor<App, ArithOp, ArithOpDivide, ArithOpMinus, ArithOpPlus, ArithOpRemainder, ArithOpTimes, Assign, BObject, Bool, BoolOp, BoolOpAnd, BoolOpOr, CmpOp, CmpOpEqual, CmpOpLess, CmpOpUnequal, Copy, Ctx, Def, EvalBoolRes, EvalBoundFunRes, EvalFunRes, EvalIntRes, EvalMapRes, EvalRes, Expr, Field, File, Fun, If, Int, Let, Not, Project, Seq, Skip, This, TopLevelCmd, Var, With> rev;

  private boa.App obj;

  public AppImpl(boa.App obj,
      BoaRevisitor<App, ArithOp, ArithOpDivide, ArithOpMinus, ArithOpPlus, ArithOpRemainder, ArithOpTimes, Assign, BObject, Bool, BoolOp, BoolOpAnd, BoolOpOr, CmpOp, CmpOpEqual, CmpOpLess, CmpOpUnequal, Copy, Ctx, Def, EvalBoolRes, EvalBoundFunRes, EvalFunRes, EvalIntRes, EvalMapRes, EvalRes, Expr, Field, File, Fun, If, Int, Let, Not, Project, Seq, Skip, This, TopLevelCmd, Var, With> rev) {
    super(obj, rev);
    this.obj = obj;
    this.rev = rev;
  }

  public boa.EvalRes eval(boa.Ctx ctx) {
    boa.EvalRes result;
    boa.EvalRes vlhs = ((boa.EvalRes)rev.$(this.obj.getLhs()).eval(ctx));
    boa.EvalRes vrhs = ((boa.EvalRes)rev.$(this.obj.getRhs()).eval(ctx));
    if(vlhs instanceof boa.EvalFunRes) {
      if(vlhs instanceof boa.EvalBoundFunRes) {
        boa.EvalBoundFunRes fct = ((boa.EvalBoundFunRes)vlhs);
        boa.Ctx callCtx = ((boa.Ctx)boa.BoaFactory.eINSTANCE.createCtx());
        execboa.MapService.putAll(callCtx.getEnv(), fct.getCtx().getEnv());
        execboa.MapService.put(callCtx.getEnv(), fct.getName(), vrhs);
        execboa.MapService.replaceWith(callCtx.getTh(), fct.getTh());
        boa.EvalRes fe = ((boa.EvalRes)rev.$(this.obj).callFunc(fct,callCtx));
        if(fe instanceof boa.EvalFunRes) {
          boa.EvalFunRes fun = ((boa.EvalFunRes)fe);
          boa.EvalBoundFunRes tmp = ((boa.EvalBoundFunRes)boa.BoaFactory.eINSTANCE.createEvalBoundFunRes());
          tmp.setExp(fun.getExp());
          tmp.setCtx(fun.getCtx());
          tmp.setName(fun.getName());
          execboa.MapService.replaceWith(tmp.getTh(), fct.getTh());
          result = tmp;
        }
        else {
          result = fe;
        }
      }
      else {
        boa.EvalFunRes fct = ((boa.EvalFunRes)vlhs);
        boa.Ctx callCtx = ((boa.Ctx)boa.BoaFactory.eINSTANCE.createCtx());
        execboa.MapService.putAll(callCtx.getEnv(), fct.getCtx().getEnv());
        execboa.MapService.put(callCtx.getEnv(), fct.getName(), vrhs);
        execboa.MapService.replaceWith(callCtx.getTh(), ctx.getTh());
        boa.EvalRes fe = ((boa.EvalRes)rev.$(this.obj).callFunc(fct,callCtx));
        if(fe instanceof boa.EvalFunRes) {
          boa.EvalFunRes fun = ((boa.EvalFunRes)fe);
          boa.EvalBoundFunRes tmp = ((boa.EvalBoundFunRes)boa.BoaFactory.eINSTANCE.createEvalBoundFunRes());
          tmp.setExp(fun.getExp());
          tmp.setCtx(fun.getCtx());
          tmp.setName(fun.getName());
          execboa.MapService.replaceWith(tmp.getTh(), ctx.getTh());
          result = tmp;
        }
        else {
          result = fe;
        }
      }
    }
    else {
      result = null;
    }
    return result;
  }

  public boa.EvalRes callFunc(boa.EvalFunRes fct, boa.Ctx callCtx) {
    boa.EvalRes result;
    result = rev.$(fct.getExp()).eval(callCtx);
    return result;
  }
}
