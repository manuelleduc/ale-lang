package interpreter.boa.interpreter.boa.impl;

import interpreter.boa.interpreter.boa.BoaFactory;
import interpreter.boa.interpreter.boa.BoaPackage;
import interpreter.boa.interpreter.boa.BoolOpAnd;
import interpreter.boa.interpreter.boa.Ctx;
import interpreter.boa.interpreter.boa.EvalBoolRes;
import interpreter.boa.interpreter.boa.EvalRes;
import interpreter.boa.interpreter.boa.Expr;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

public class BoolOpAndImpl extends BoolOpImpl implements BoolOpAnd {
	protected Expr lhs;

	protected Expr rhs;

	protected BoolOpAndImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return BoaPackage.Literals.BOOL_OP_AND;
	}

	public void setLhs(Expr newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject) lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - interpreter.boa.interpreter.boa.BoaPackage.BOOL_OP_AND__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - interpreter.boa.interpreter.boa.BoaPackage.BOOL_OP_AND__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, interpreter.boa.interpreter.boa.BoaPackage.BOOL_OP_AND__LHS, newLhs, newLhs));
	}

	public NotificationChain basicSetLhs(Expr newLhs, NotificationChain msgs) {
		Expr oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, interpreter.boa.interpreter.boa.BoaPackage.BOOL_OP_AND__LHS, oldLhs, newLhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject) rhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - interpreter.boa.interpreter.boa.BoaPackage.BOOL_OP_AND__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject)newRhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - interpreter.boa.interpreter.boa.BoaPackage.BOOL_OP_AND__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, interpreter.boa.interpreter.boa.BoaPackage.BOOL_OP_AND__RHS, newRhs, newRhs));
	}

	public NotificationChain basicSetRhs(Expr newRhs, NotificationChain msgs) {
		Expr oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, interpreter.boa.interpreter.boa.BoaPackage.BOOL_OP_AND__RHS, oldRhs, newRhs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	public Expr getRhs() {
		return rhs;
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case BoaPackage.BOOL_OP_AND__LHS :
				return basicSetLhs(null, msgs);
			case BoaPackage.BOOL_OP_AND__RHS :
				return basicSetRhs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BoaPackage.BOOL_OP_AND__LHS :
				return getLhs();
			case BoaPackage.BOOL_OP_AND__RHS :
				return getRhs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BoaPackage.BOOL_OP_AND__LHS :
				setLhs((Expr) newValue);
				return;
			case BoaPackage.BOOL_OP_AND__RHS :
				setRhs((Expr) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BoaPackage.BOOL_OP_AND__LHS :
				setLhs((Expr) null);
				return;
			case BoaPackage.BOOL_OP_AND__RHS :
				setRhs((Expr) null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BoaPackage.BOOL_OP_AND__LHS :
				return lhs != null;
			case BoaPackage.BOOL_OP_AND__RHS :
				return rhs != null;
		}
		return super.eIsSet(featureID);
	}

	public EvalRes eval(Ctx ctx) {
		EvalRes result;
		EvalRes vlhs = ((EvalRes) (((Expr)this.lhs).eval((Ctx) ctx)));
		EvalRes vrhs = ((EvalRes) (((Expr)this.rhs).eval((Ctx) ctx)));
		if (vlhs instanceof EvalBoolRes) {
			if (vrhs instanceof EvalBoolRes) {
				EvalBoolRes ivlhs = ((EvalBoolRes) (vlhs));
				EvalBoolRes ivrhs = ((EvalBoolRes) (vrhs));
				EvalBoolRes ret = ((EvalBoolRes) (BoaFactory.eINSTANCE.createEvalBoolRes()));
				ret.setValue(((ivlhs.isValue()) && (ivrhs.isValue())));
				result = ret;
			}
			else {
				result = null;
			}
		}
		else {
			result = null;
		}
		return result;
	}
}