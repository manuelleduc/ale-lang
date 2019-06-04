package LogoProgram_revisitor.impl.operation.impl;

import LogoProgram_revisitor.impl.operation.BackOp;
import LogoProgram_revisitor.impl.operation.BinaryExpOp;
import LogoProgram_revisitor.impl.operation.BlockOp;
import LogoProgram_revisitor.impl.operation.CallStackOp;
import LogoProgram_revisitor.impl.operation.ClearOp;
import LogoProgram_revisitor.impl.operation.ConstantOp;
import LogoProgram_revisitor.impl.operation.ControlStructureOp;
import LogoProgram_revisitor.impl.operation.CosOp;
import LogoProgram_revisitor.impl.operation.DivOp;
import LogoProgram_revisitor.impl.operation.EqualsOp;
import LogoProgram_revisitor.impl.operation.ExpressionOp;
import LogoProgram_revisitor.impl.operation.ForwardOp;
import LogoProgram_revisitor.impl.operation.GreaterOp;
import LogoProgram_revisitor.impl.operation.IfOp;
import LogoProgram_revisitor.impl.operation.InstructionOp;
import LogoProgram_revisitor.impl.operation.LeftOp;
import LogoProgram_revisitor.impl.operation.LogoProgramOp;
import LogoProgram_revisitor.impl.operation.LowerOp;
import LogoProgram_revisitor.impl.operation.MinusOp;
import LogoProgram_revisitor.impl.operation.MultOp;
import LogoProgram_revisitor.impl.operation.ParameterCallOp;
import LogoProgram_revisitor.impl.operation.ParameterOp;
import LogoProgram_revisitor.impl.operation.PenDownOp;
import LogoProgram_revisitor.impl.operation.PenUpOp;
import LogoProgram_revisitor.impl.operation.PlusOp;
import LogoProgram_revisitor.impl.operation.PointOp;
import LogoProgram_revisitor.impl.operation.PrimitiveOp;
import LogoProgram_revisitor.impl.operation.ProcCallOp;
import LogoProgram_revisitor.impl.operation.ProcDeclarationOp;
import LogoProgram_revisitor.impl.operation.RepeatOp;
import LogoProgram_revisitor.impl.operation.RightOp;
import LogoProgram_revisitor.impl.operation.SegmentOp;
import LogoProgram_revisitor.impl.operation.SinOp;
import LogoProgram_revisitor.impl.operation.StackFrameOp;
import LogoProgram_revisitor.impl.operation.TanOp;
import LogoProgram_revisitor.impl.operation.TurtleOp;
import LogoProgram_revisitor.impl.operation.UnaryExpressionOp;
import LogoProgram_revisitor.impl.operation.VariableOp;
import LogoProgram_revisitor.impl.operation.WhileOp;
import kmLogo.Block;
import kmLogo.Expression;
import kmLogo.If;
import kmLogo.Turtle;
import kmLogo.revisitor.KmLogoRevisitor;
import org.eclipse.emf.ecoretools.ale.compiler.lib.EqualService;

public class IfOpImpl extends ControlStructureOpImpl implements IfOp {
  private KmLogoRevisitor<BackOp, BinaryExpOp, BlockOp, CallStackOp, ClearOp, ConstantOp, ControlStructureOp, CosOp, DivOp, EqualsOp, ExpressionOp, ForwardOp, GreaterOp, IfOp, InstructionOp, LeftOp, LogoProgramOp, LowerOp, MinusOp, MultOp, ParameterOp, ParameterCallOp, PenDownOp, PenUpOp, PlusOp, PointOp, PrimitiveOp, ProcCallOp, ProcDeclarationOp, RepeatOp, RightOp, SegmentOp, SinOp, StackFrameOp, TanOp, TurtleOp, UnaryExpressionOp, VariableOp, WhileOp> rev;

  private If obj;

  public IfOpImpl(If obj,
      KmLogoRevisitor<BackOp, BinaryExpOp, BlockOp, CallStackOp, ClearOp, ConstantOp, ControlStructureOp, CosOp, DivOp, EqualsOp, ExpressionOp, ForwardOp, GreaterOp, IfOp, InstructionOp, LeftOp, LogoProgramOp, LowerOp, MinusOp, MultOp, ParameterOp, ParameterCallOp, PenDownOp, PenUpOp, PlusOp, PointOp, PrimitiveOp, ProcCallOp, ProcDeclarationOp, RepeatOp, RightOp, SegmentOp, SinOp, StackFrameOp, TanOp, TurtleOp, UnaryExpressionOp, VariableOp, WhileOp> rev) {
    super(obj, rev);
    this.obj = obj;
    this.rev = rev;
  }

  public double eval(Turtle turtle) {
    double result;
    if(!EqualService.equals((rev.$((Expression)this.obj.getCondition()).eval(((Turtle) (turtle)))), (0.0))) {
      result = rev.$((Block)this.obj.getThenPart()).eval(((Turtle) (turtle)));
    }
    else {
      if(!EqualService.equals((this.obj.getElsePart()), (null))) {
        result = rev.$((Block)this.obj.getElsePart()).eval(((Turtle) (turtle)));
      }
      else {
        result = 0.0;
      }
    }
    return result;
  }
}