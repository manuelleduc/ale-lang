package visitor.operation.boa.impl;

import boa.visitor.boa.BoaFactory;
import boa.visitor.boa.Ctx;
import boa.visitor.boa.EvalBoundFunRes;
import boa.visitor.boa.EvalFunRes;
import boa.visitor.boa.EvalMapRes;
import boa.visitor.boa.EvalRes;
import boa.visitor.boa.Project;
import execboa.MapService;
import java.lang.String;
import org.eclipse.emf.common.util.EMap;
import visitor.VisitorInterface;
import visitor.operation.boa.ExprOperation;
import visitor.operation.boa.ProjectOperation;

public class ProjectOperationImpl extends ExprOperationImpl implements ProjectOperation {
	private final Project it;

	private final VisitorInterface vis;

	public ProjectOperationImpl(Project it, VisitorInterface vis) {
		super(it, vis);
		this.it = it;
		this.vis = vis;
	}

	public EvalRes eval(Ctx ctx) {
		EvalRes result;
		EvalRes vexp = ((EvalRes) (((ExprOperation)this.it.getExp().accept(vis)).eval((Ctx) (ctx))));
		if(vexp instanceof EvalMapRes) {
			EvalMapRes mvexp = ((EvalMapRes) (vexp));
			if(MapService.containsKey((EMap) (mvexp.getValues()), (String) (this.it.getName()))) {
				EvalRes x = ((EvalRes) (mvexp.getValues().get((String) (this.it.getName()))));
				if(x instanceof EvalFunRes) {
					EvalFunRes func = ((EvalFunRes) (x));
					result = ((EvalRes) (((ProjectOperation)this.it.accept(vis)).project((EvalFunRes) (func), (EvalMapRes) (mvexp))));
				}
				else {
					result = ((EvalRes) (x));
				}
			}
			else {
				result = ((EvalRes) (null));
			}
		}
		else {
			result = ((EvalRes) (null));
		}
		return result;
	}

	public EvalRes project(EvalFunRes func, EvalMapRes mvexp) {
		EvalRes result;
		EvalBoundFunRes ret = ((EvalBoundFunRes) (BoaFactory.eINSTANCE.createEvalBoundFunRes()));
		ret.setExp(func.getExp());
		ret.setCtx(func.getCtx());
		ret.setName(func.getName());
		MapService.replaceWith((EMap) (ret.getTh()), (EMap) (mvexp.getValues()));
		result = ((EvalBoundFunRes) (ret));
		return result;
	}
}
