package boa.interpreter.boa.impl;

import boa.interpreter.boa.App;
import boa.interpreter.boa.BoaPackage;
import boa.interpreter.boa.Ctx;
import boa.interpreter.boa.EvalBoundFunRes;
import boa.interpreter.boa.EvalFunRes;
import boa.interpreter.boa.EvalRes;
import boa.interpreter.boa.Expr;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.nodes.IndirectCallNode;
import com.oracle.truffle.api.nodes.Node.Child;
import com.oracle.truffle.api.nodes.NodeInfo;
import java.lang.Object;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

@NodeInfo(description = "App")
public class AppImpl extends ExprImpl implements App {
	@Child
	protected Expr lhs;

	@Child
	protected Expr rhs;

	@Child
	private IndirectCallNode dispatchCallFunc;

	protected AppImpl() {
		super();
		this.dispatchCallFunc = com.oracle.truffle.api.Truffle.getRuntime().createIndirectCallNode();
	}

	public void setLhs(Expr newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject) lhs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - boa.interpreter.boa.BoaPackage.APP__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject) newLhs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - boa.interpreter.boa.BoaPackage.APP__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, boa.interpreter.boa.BoaPackage.APP__LHS, newLhs,
					newLhs));
	}

	public NotificationChain basicSetLhs(Expr newLhs, NotificationChain msgs) {
		Expr oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					boa.interpreter.boa.BoaPackage.APP__LHS, oldLhs, newLhs);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public Expr getLhs() {
		return lhs;
	}

	public void setRhs(Expr newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject) rhs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - boa.interpreter.boa.BoaPackage.APP__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject) newRhs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - boa.interpreter.boa.BoaPackage.APP__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, boa.interpreter.boa.BoaPackage.APP__RHS, newRhs,
					newRhs));
	}

	public NotificationChain basicSetRhs(Expr newRhs, NotificationChain msgs) {
		Expr oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					boa.interpreter.boa.BoaPackage.APP__RHS, oldRhs, newRhs);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public Expr getRhs() {
		return rhs;
	}

	protected EClass eStaticClass() {
		return BoaPackage.Literals.APP;
	}

	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BoaPackage.APP__LHS:
			setLhs((boa.interpreter.boa.Expr) newValue);
			return;
		case BoaPackage.APP__RHS:
			setRhs((boa.interpreter.boa.Expr) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	public void eUnset(int featureID) {
		switch (featureID) {
		case BoaPackage.APP__LHS:
			setLhs((boa.interpreter.boa.Expr) null);
			return;
		case BoaPackage.APP__RHS:
			setRhs((boa.interpreter.boa.Expr) null);
			return;
		}
		super.eUnset(featureID);
	}

	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BoaPackage.APP__LHS:
			return getLhs();
		case BoaPackage.APP__RHS:
			return getRhs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BoaPackage.APP__LHS:
			return lhs != null;
		case BoaPackage.APP__RHS:
			return rhs != null;
		}
		return super.eIsSet(featureID);
	}

	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case boa.interpreter.boa.BoaPackage.APP__LHS:
			return basicSetLhs(null, msgs);
		case boa.interpreter.boa.BoaPackage.APP__RHS:
			return basicSetRhs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	public EvalRes eval(Ctx ctx) {
		EvalRes result;
		EvalRes vlhs = ((EvalRes) this.getLhs().eval(ctx));
		EvalRes vrhs = ((EvalRes) this.getRhs().eval(ctx));
		if (vlhs instanceof boa.interpreter.boa.EvalFunRes) {
			if (vlhs instanceof boa.interpreter.boa.EvalBoundFunRes) {
				EvalBoundFunRes fct = ((EvalBoundFunRes) vlhs);

				Ctx callCtx = ((Ctx) boa.interpreter.boa.BoaFactory.eINSTANCE.createCtx());
				execboa.MapService.putAll(callCtx.getEnv(), fct.getCtx().getEnv());
				execboa.MapService.put(callCtx.getEnv(), fct.getName(), vrhs);
				execboa.MapService.replaceWith(callCtx.getTh(), fct.getTh());
				EvalRes fe = ((EvalRes) this.dispatchCallFunc.call(FunImpl.map.get(fct.getExp()),
						new Object[] { callCtx }));
				if (fe instanceof boa.interpreter.boa.EvalFunRes) {
					EvalFunRes fun = ((EvalFunRes) fe);
					EvalBoundFunRes tmp = ((EvalBoundFunRes) boa.interpreter.boa.BoaFactory.eINSTANCE
							.createEvalBoundFunRes());
					tmp.setExp(fun.getExp());
					tmp.setCtx(fun.getCtx());
					tmp.setName(fun.getName());
					execboa.MapService.replaceWith(tmp.getTh(), fct.getTh());
					result = tmp;
				} else {
					result = fe;
				}
			} else {
				EvalFunRes fct = ((EvalFunRes) vlhs);
				Ctx callCtx = ((Ctx) boa.interpreter.boa.BoaFactory.eINSTANCE.createCtx());
				execboa.MapService.putAll(callCtx.getEnv(), fct.getCtx().getEnv());
				execboa.MapService.put(callCtx.getEnv(), fct.getName(), vrhs);
				execboa.MapService.replaceWith(callCtx.getTh(), ctx.getTh());
				EvalRes fe = ((EvalRes) this.dispatchCallFunc.call(FunImpl.map.get(fct.getExp()),
						new Object[] { callCtx }));
				if (fe instanceof boa.interpreter.boa.EvalFunRes) {
					EvalFunRes fun = ((EvalFunRes) fe);
					EvalBoundFunRes tmp = ((EvalBoundFunRes) boa.interpreter.boa.BoaFactory.eINSTANCE
							.createEvalBoundFunRes());
					tmp.setExp(fun.getExp());
					tmp.setCtx(fun.getCtx());
					tmp.setName(fun.getName());
					execboa.MapService.replaceWith(tmp.getTh(), ctx.getTh());
					result = tmp;
				} else {
					result = fe;
				}
			}
		} else {
			result = null;
		}
		return result;
	}
}
