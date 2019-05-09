package emfswitch.operation;

import boa.BoaFactory;
import boa.Copy;
import boa.Ctx;
import boa.EvalMapRes;
import boa.EvalRes;
import emfswitch.SwitchImplementation;

public class CopyOperation extends ExprOperation {
	private final Copy it;

	private final SwitchImplementation emfswitch;

	public CopyOperation(Copy it, SwitchImplementation emfswitch) {
		super(it, emfswitch);
		this.it = it;
		this.emfswitch = emfswitch;
	}

	public EvalRes eval(Ctx ctx) {
		EvalRes result;
		EvalRes vcopy = ((EvalRes) (((ExprOperation) emfswitch.doSwitch(this.it.getCopy())).eval((Ctx) ctx)));
		if(vcopy instanceof EvalMapRes) {
			EvalMapRes mvcopy = ((EvalMapRes) (vcopy));
			EvalMapRes ret = ((EvalMapRes) (BoaFactory.eINSTANCE.createEvalMapRes()));
			execboa.MapService.putAll(ret.getValues(), mvcopy.getValues());
			result = ret;
		}
		else {
			result = null;
		}
		return result;
	}
}
