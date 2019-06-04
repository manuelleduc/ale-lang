package miniJava.interpreter.miniJava.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import miniJava.interpreter.miniJava.Call;
import miniJava.interpreter.miniJava.Context;
import miniJava.interpreter.miniJava.Frame;
import miniJava.interpreter.miniJava.MiniJavaPackage;
import miniJava.interpreter.miniJava.ObjectInstance;
import miniJava.interpreter.miniJava.Value;

public class FrameImpl extends MinimalEObjectImpl.Container implements Frame {
	protected Call call;

	protected Frame childFrame;

	protected ObjectInstance instance;

	protected Value returnValue;

	protected Context rootContext;

	protected FrameImpl() {
		super();
	}

	public NotificationChain basicSetCall(Call newCall, NotificationChain msgs) {
		Call oldCall = call;
		call = newCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FRAME__CALL,
					oldCall, newCall);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	private NotificationChain basicSetChildFrame(Frame newChildFrame, NotificationChain msgsp) {
		NotificationChain msgs = msgsp;
		Frame oldChildFrame = childFrame;
		childFrame = newChildFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniJavaPackage.FRAME__CHILD_FRAME, oldChildFrame, newChildFrame);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public NotificationChain basicSetParentFrame(Frame newParentFrame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentFrame, MiniJavaPackage.FRAME__PARENT_FRAME, msgs);
		return msgs;
	}

	public NotificationChain basicSetReturnValue(Value newReturnValue, NotificationChain msgs) {
		Value oldReturnValue = returnValue;
		returnValue = newReturnValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniJavaPackage.FRAME__RETURN_VALUE, oldReturnValue, newReturnValue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public NotificationChain basicSetRootContext(Context newRootContext, NotificationChain msgs) {
		Context oldRootContext = rootContext;
		rootContext = newRootContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MiniJavaPackage.FRAME__ROOT_CONTEXT, oldRootContext, newRootContext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MiniJavaPackage.FRAME__CALL:
			return getCall();
		case MiniJavaPackage.FRAME__INSTANCE:
			return getInstance();
		case MiniJavaPackage.FRAME__CHILD_FRAME:
			return getChildFrame();
		case MiniJavaPackage.FRAME__PARENT_FRAME:
			return getParentFrame();
		case MiniJavaPackage.FRAME__ROOT_CONTEXT:
			return getRootContext();
		case MiniJavaPackage.FRAME__RETURN_VALUE:
			return getReturnValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs2) {
		NotificationChain msgs = msgs2;
		switch (featureID) {

		case MiniJavaPackage.FRAME__CHILD_FRAME:
			if (childFrame != null)
				msgs = ((org.eclipse.emf.ecore.InternalEObject) childFrame).eInverseRemove(this,
						MiniJavaPackage.FRAME__PARENT_FRAME, Frame.class, msgs);
			return basicSetChildFrame((Frame) otherEnd, msgs);

		case MiniJavaPackage.FRAME__PARENT_FRAME:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParentFrame((Frame) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MiniJavaPackage.FRAME__CALL:
			return basicSetCall(null, msgs);
		case MiniJavaPackage.FRAME__CHILD_FRAME:
			return basicSetChildFrame(null, msgs);
		case MiniJavaPackage.FRAME__PARENT_FRAME:
			return basicSetParentFrame(null, msgs);
		case MiniJavaPackage.FRAME__ROOT_CONTEXT:
			return basicSetRootContext(null, msgs);
		case MiniJavaPackage.FRAME__RETURN_VALUE:
			return basicSetReturnValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MiniJavaPackage.FRAME__CALL:
			return call != null;
		case MiniJavaPackage.FRAME__INSTANCE:
			return instance != null;
		case MiniJavaPackage.FRAME__CHILD_FRAME:
			return childFrame != null;
		case MiniJavaPackage.FRAME__PARENT_FRAME:
			return getParentFrame() != null;
		case MiniJavaPackage.FRAME__ROOT_CONTEXT:
			return rootContext != null;
		case MiniJavaPackage.FRAME__RETURN_VALUE:
			return returnValue != null;
		}
		return super.eIsSet(featureID);
	}

	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MiniJavaPackage.FRAME__CALL:
			setCall((Call) newValue);
			return;
		case MiniJavaPackage.FRAME__INSTANCE:
			setInstance((ObjectInstance) newValue);
			return;
		case MiniJavaPackage.FRAME__CHILD_FRAME:
			setChildFrame((Frame) newValue);
			return;
		case MiniJavaPackage.FRAME__PARENT_FRAME:
			setParentFrame((Frame) newValue);
			return;
		case MiniJavaPackage.FRAME__ROOT_CONTEXT:
			setRootContext((Context) newValue);
			return;
		case MiniJavaPackage.FRAME__RETURN_VALUE:
			setReturnValue((Value) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.FRAME;
	}

	public void eUnset(int featureID) {
		switch (featureID) {
		case MiniJavaPackage.FRAME__CALL:
			setCall((Call) null);
			return;
		case MiniJavaPackage.FRAME__INSTANCE:
			setInstance((ObjectInstance) null);
			return;
		case MiniJavaPackage.FRAME__CHILD_FRAME:
			setChildFrame((Frame) null);
			return;
		case MiniJavaPackage.FRAME__PARENT_FRAME:
			setParentFrame((Frame) null);
			return;
		case MiniJavaPackage.FRAME__ROOT_CONTEXT:
			setRootContext((Context) null);
			return;
		case MiniJavaPackage.FRAME__RETURN_VALUE:
			setReturnValue((Value) null);
			return;
		}
		super.eUnset(featureID);
	}

	public Context findCurrentContext() {
		Context result;
		if ((this.childFrame) != (null)) {
			result = this.childFrame.findCurrentContext();
		} else {
			if ((this.rootContext) != (null)) {
				result = this.rootContext.findCurrentContext();
			} else {
				result = null;
			}
		}
		;
		return result;
	}

	public Frame findCurrentFrame() {
		Frame result;
		if ((this.childFrame) != (null)) {
			result = this.childFrame.findCurrentFrame();
		} else {
			result = this;
		}
		;
		return result;
	}

	public Call getCall() {
		return call;
	}

	public Frame getChildFrame() {
		return childFrame;
	}

	public ObjectInstance getInstance() {
		return instance;
	}

	public Frame getParentFrame() {
		if (eContainerFeatureID() != MiniJavaPackage.FRAME__PARENT_FRAME)
			return null;
		return (Frame) eInternalContainer();
	}

	public Value getReturnValue() {
		return returnValue;
	}

	public Context getRootContext() {
		return rootContext;
	}

	public void setCall(Call newCall) {
		if (newCall != call) {
			NotificationChain msgs = null;
			if (call != null)
				msgs = ((InternalEObject) call).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FRAME__CALL, null, msgs);
			if (newCall != null)
				msgs = ((InternalEObject) newCall).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FRAME__CALL, null, msgs);
			msgs = basicSetCall(newCall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FRAME__CALL, newCall, newCall));
	}

	public void setChildFrame(Frame newChildFrame) {
		if (newChildFrame != childFrame) {
			NotificationChain msgs = null;
			if (childFrame != null)
				msgs = ((InternalEObject) childFrame).eInverseRemove(this, MiniJavaPackage.FRAME__PARENT_FRAME,
						Frame.class, msgs);
			if (newChildFrame != null)
				msgs = ((InternalEObject) newChildFrame).eInverseAdd(this, MiniJavaPackage.FRAME__PARENT_FRAME,
						Frame.class, msgs);
			msgs = basicSetChildFrame(newChildFrame, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FRAME__CHILD_FRAME, newChildFrame,
					newChildFrame));
	}

	public void setInstance(ObjectInstance newInstance) {
		ObjectInstance oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FRAME__INSTANCE, oldInstance,
					instance));
	}

	public void setParentFrame(Frame newParentFrame) {
		if (newParentFrame != eInternalContainer()
				|| (eContainerFeatureID() != MiniJavaPackage.FRAME__PARENT_FRAME && newParentFrame != null)) {
			if (EcoreUtil.isAncestor(this, newParentFrame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentFrame != null)
				msgs = ((InternalEObject) newParentFrame).eInverseAdd(this, MiniJavaPackage.FRAME__CHILD_FRAME,
						Frame.class, msgs);
			msgs = basicSetParentFrame(newParentFrame, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FRAME__PARENT_FRAME, newParentFrame,
					newParentFrame));
	}

	public void setReturnValue(Value newReturnValue) {
		if (newReturnValue != returnValue) {
			NotificationChain msgs = null;
			if (returnValue != null)
				msgs = ((InternalEObject) returnValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FRAME__RETURN_VALUE, null, msgs);
			if (newReturnValue != null)
				msgs = ((InternalEObject) newReturnValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FRAME__RETURN_VALUE, null, msgs);
			msgs = basicSetReturnValue(newReturnValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FRAME__RETURN_VALUE, newReturnValue,
					newReturnValue));
	}

	public void setRootContext(Context newRootContext) {
		if (newRootContext != rootContext) {
			NotificationChain msgs = null;
			if (rootContext != null)
				msgs = ((InternalEObject) rootContext).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FRAME__ROOT_CONTEXT, null, msgs);
			if (newRootContext != null)
				msgs = ((InternalEObject) newRootContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MiniJavaPackage.FRAME__ROOT_CONTEXT, null, msgs);
			msgs = basicSetRootContext(newRootContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.FRAME__ROOT_CONTEXT, newRootContext,
					newRootContext));
	}
}