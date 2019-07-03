package fsm.interpreter.fsm.impl;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.nodes.NodeInfo;
import fsm.interpreter.fsm.FsmPackage;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecoretools.ale.compiler.lib.LogService;
import org.eclipse.emf.ecoretools.ale.compiler.truffle.MinimalTruffleEObjectImpl;

@NodeInfo(
		description = "Transition"
)
public class TransitionImpl extends MinimalTruffleEObjectImpl.TruffleContainer {
	protected static final String NAME_EDEFAULT = null;

	protected static final String TRIGGER_EDEFAULT = null;

	protected static final String ACTION_EDEFAULT = null;

	protected String name = NAME_EDEFAULT;

	protected String trigger = TRIGGER_EDEFAULT;

	protected String action = ACTION_EDEFAULT;

	protected StateImpl tgt;

	protected StateImpl src;

	protected TransitionImpl() {
		super();
	}

	@Override
	@TruffleBoundary
	protected EClass eStaticClass() {
		return FsmPackage.Literals.TRANSITION;
	}

	@TruffleBoundary
	public StateImpl getTgt() {
		if (tgt != null && tgt.eIsProxy()) {
			InternalEObject oldTgt = (InternalEObject) tgt;
			tgt = (StateImpl) eResolveProxy(oldTgt);
			if (tgt != oldTgt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRANSITION__TGT, oldTgt, tgt));
			}
		}
		return tgt;
	}

	public StateImpl basicGetTgt() {
		return tgt;
	}

	@TruffleBoundary
	public NotificationChain basicSetTgt(StateImpl newTgt, NotificationChain msgs) {
		StateImpl oldTgt = tgt;
		tgt = newTgt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__TGT, oldTgt, newTgt);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	@TruffleBoundary
	public void setTgt(StateImpl newTgt) {
		if (newTgt != tgt) {
			NotificationChain msgs = null;
			if (tgt != null)
				msgs = ((InternalEObject) tgt).eInverseRemove(this, FsmPackage.STATE__INCOMING, StateImpl.class, msgs);
			if (newTgt != null)
				msgs = ((InternalEObject) newTgt).eInverseAdd(this, FsmPackage.STATE__INCOMING, StateImpl.class, msgs);
			msgs = basicSetTgt(newTgt, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__TGT, newTgt, newTgt));
	}

	@TruffleBoundary
	public String getName() {
		return name;
	}

	@TruffleBoundary
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__NAME, oldName, name));
	}

	@TruffleBoundary
	public StateImpl getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject) src;
			src = (StateImpl) eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FsmPackage.TRANSITION__SRC, oldSrc, src));
			}
		}
		return src;
	}

	public StateImpl basicGetSrc() {
		return src;
	}

	@TruffleBoundary
	public NotificationChain basicSetSrc(StateImpl newSrc, NotificationChain msgs) {
		StateImpl oldSrc = src;
		src = newSrc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__SRC, oldSrc, newSrc);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	@TruffleBoundary
	public void setSrc(StateImpl newSrc) {
		if (newSrc != src) {
			NotificationChain msgs = null;
			if (src != null)
				msgs = ((InternalEObject) src).eInverseRemove(this, FsmPackage.STATE__OUTGOING, StateImpl.class, msgs);
			if (newSrc != null)
				msgs = ((InternalEObject) newSrc).eInverseAdd(this, FsmPackage.STATE__OUTGOING, StateImpl.class, msgs);
			msgs = basicSetSrc(newSrc, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__SRC, newSrc, newSrc));
	}

	@TruffleBoundary
	public FSMImpl getFsm() {
		if (eContainerFeatureID() != FsmPackage.TRANSITION__FSM)
			return null;
		return (FSMImpl) eInternalContainer();
	}

	public NotificationChain basicSetFsm(FSMImpl newFsm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFsm, FsmPackage.TRANSITION__FSM, msgs);
		return msgs;
	}

	@TruffleBoundary
	public void setFsm(FSMImpl newFsm) {
		if (newFsm != eInternalContainer() || (eContainerFeatureID() != FsmPackage.TRANSITION__FSM && newFsm != null)) {
			if (EcoreUtil.isAncestor(this, newFsm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFsm != null)
				msgs = ((InternalEObject) newFsm).eInverseAdd(this, FsmPackage.FSM__OWNED_TRANSITIONS, FSMImpl.class, msgs);
			msgs = basicSetFsm(newFsm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__FSM, newFsm, newFsm));
	}

	@TruffleBoundary
	public String getTrigger() {
		return trigger;
	}

	@TruffleBoundary
	public void setTrigger(String newTrigger) {
		String oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__TRIGGER, oldTrigger, trigger));
	}

	@TruffleBoundary
	public String getAction() {
		return action;
	}

	@TruffleBoundary
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FsmPackage.TRANSITION__ACTION, oldAction, action));
	}

	@Override
	@TruffleBoundary
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.TRANSITION__TGT :
				if (tgt != null)
					msgs = ((InternalEObject) tgt).eInverseRemove(this, FsmPackage.STATE__INCOMING, StateImpl.class, msgs);
				return basicSetTgt((StateImpl) otherEnd, msgs);
			case FsmPackage.TRANSITION__SRC :
				if (src != null)
					msgs = ((InternalEObject) src).eInverseRemove(this, FsmPackage.STATE__OUTGOING, StateImpl.class, msgs);
				return basicSetSrc((StateImpl) otherEnd, msgs);
			case FsmPackage.TRANSITION__FSM :
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFsm((FSMImpl) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	@Override
	@TruffleBoundary
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case FsmPackage.TRANSITION__TGT :
				return basicSetTgt(null, msgs);
			case FsmPackage.TRANSITION__SRC :
				return basicSetSrc(null, msgs);
			case FsmPackage.TRANSITION__FSM :
				return basicSetFsm(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FsmPackage.TRANSITION__FSM :
				return eInternalContainer().eInverseRemove(this, FsmPackage.FSM__OWNED_TRANSITIONS, FSMImpl.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	@Override
	@TruffleBoundary
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FsmPackage.TRANSITION__TGT :
				if (resolve)
					return getTgt();
				return basicGetTgt();
			case FsmPackage.TRANSITION__NAME :
				return getName();
			case FsmPackage.TRANSITION__SRC :
				if (resolve)
					return getSrc();
				return basicGetSrc();
			case FsmPackage.TRANSITION__FSM :
				return getFsm();
			case FsmPackage.TRANSITION__TRIGGER :
				return getTrigger();
			case FsmPackage.TRANSITION__ACTION :
				return getAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	@TruffleBoundary
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FsmPackage.TRANSITION__TGT :
				setTgt((StateImpl) newValue);
				return;
			case FsmPackage.TRANSITION__NAME :
				setName((String) newValue);
				return;
			case FsmPackage.TRANSITION__SRC :
				setSrc((StateImpl) newValue);
				return;
			case FsmPackage.TRANSITION__FSM :
				setFsm((FSMImpl) newValue);
				return;
			case FsmPackage.TRANSITION__TRIGGER :
				setTrigger((String) newValue);
				return;
			case FsmPackage.TRANSITION__ACTION :
				setAction((String) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	@TruffleBoundary
	public void eUnset(int featureID) {
		switch (featureID) {
			case FsmPackage.TRANSITION__TGT :
				setTgt((StateImpl) null);
				return;
			case FsmPackage.TRANSITION__NAME :
				setName(NAME_EDEFAULT);
				return;
			case FsmPackage.TRANSITION__SRC :
				setSrc((StateImpl) null);
				return;
			case FsmPackage.TRANSITION__FSM :
				setFsm((FSMImpl) null);
				return;
			case FsmPackage.TRANSITION__TRIGGER :
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case FsmPackage.TRANSITION__ACTION :
				setAction(ACTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	@TruffleBoundary
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FsmPackage.TRANSITION__TGT :
				return tgt != null;
			case FsmPackage.TRANSITION__NAME :
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FsmPackage.TRANSITION__SRC :
				return src != null;
			case FsmPackage.TRANSITION__FSM :
				return getFsm() != null;
			case FsmPackage.TRANSITION__TRIGGER :
				return TRIGGER_EDEFAULT == null ? trigger != null : !TRIGGER_EDEFAULT.equals(trigger);
			case FsmPackage.TRANSITION__ACTION :
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
		}
		return super.eIsSet(featureID);
	}

	public void fire() {
		LogService.log(((("Firing ") + (this.name)) + (" and entering ")) + (this.getTgt().getName()));
		FSMImpl fsm = ((FSMImpl) (this.getSrc().getFsm()));
		fsm.setCurrentState(this.getTgt());
		((BufferImpl) (fsm.getOutputBuffer())).enqueue((String) (this.action));
		fsm.setConsummedString((fsm.getConsummedString()) + (fsm.getUnderProcessTrigger()));
	}
}