package emfswitch.operation;

import boa.BObject;
import boa.BoaFactory;
import boa.Ctx;
import boa.EvalMapRes;
import boa.EvalRes;
import boa.Field;
import emfswitch.SwitchImplementation;

public class BObjectOperation extends ExprOperation {
	private final BObject it;

	private final SwitchImplementation emfswitch;

	public BObjectOperation(BObject it, SwitchImplementation emfswitch) {
		super(it, emfswitch);
		this.it = it;
		this.emfswitch = emfswitch;
	}

	public EvalRes eval(Ctx ctx) {
		EvalRes result;
		EvalMapRes ret = ((EvalMapRes) (BoaFactory.eINSTANCE.createEvalMapRes()));
		for (Field x: this.it.getFields()) {
			EvalRes v = ((EvalRes) (((ExprOperation) emfswitch.doSwitch(x.getValue())).eval((Ctx) ctx)));
			execboa.MapService.put(ret.getValues(), x.getName(), v);
		}
		result = ret;
		return result;
	}
}
