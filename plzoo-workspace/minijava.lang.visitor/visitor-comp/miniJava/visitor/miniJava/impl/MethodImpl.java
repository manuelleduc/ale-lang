package miniJava.visitor.miniJava.impl;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.util.Collection;
import java.util.Map.Entry;
import miniJava.visitor.miniJava.Block;
import miniJava.visitor.miniJava.Clazz;
import miniJava.visitor.miniJava.ClazzToMethodMap;
import miniJava.visitor.miniJava.Method;
import miniJava.visitor.miniJava.MiniJavaPackage;
import miniJava.visitor.miniJava.Parameter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import visitor.VisitorInterface;

public class MethodImpl extends MemberImpl implements Method {
	protected static final boolean ISABSTRACT_EDEFAULT = false;

	protected static final boolean ISSTATIC_EDEFAULT = false;

	protected boolean isabstract = ISABSTRACT_EDEFAULT;

	protected boolean isstatic = ISSTATIC_EDEFAULT;

	protected EList<Parameter> params;

	protected Block body;

	protected EList<Map.Entry<Clazz, Method>> cache;

	protected MethodImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return MiniJavaPackage.Literals.METHOD;
	}

	public boolean isIsabstract() {
		return isabstract;
	}

	public void setIsabstract(boolean newIsabstract) {
		boolean oldIsabstract = isabstract;
		isabstract = newIsabstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__ISABSTRACT, oldIsabstract, isabstract));
	}

	public boolean isIsstatic() {
		return isstatic;
	}

	public void setIsstatic(boolean newIsstatic) {
		boolean oldIsstatic = isstatic;
		isstatic = newIsstatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__ISSTATIC, oldIsstatic, isstatic));
	}

	public EList<Parameter> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Parameter>(Parameter.class, this, MiniJavaPackage.METHOD__PARAMS);
		}
		return params;
	}

	public Block getBody() {
		return body;
	}

	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__BODY, oldBody, newBody);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.METHOD__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD__BODY, newBody, newBody));
	}

	public EMap<Clazz, Method> getCache() {
		if (cache == null) {
			cache = new EObjectResolvingEList<ClazzToMethodMap>(ClazzToMethodMap.class, this, MiniJavaPackage.METHOD__CACHE);
		}
		return cache;
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
			case MiniJavaPackage.METHOD__PARAMS :
				return ((InternalEList<?>) getParams()).basicRemove(otherEnd, msgs);
			case MiniJavaPackage.METHOD__BODY :
				return basicSetBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MiniJavaPackage.METHOD__ISABSTRACT :
				return isIsabstract();
			case MiniJavaPackage.METHOD__ISSTATIC :
				return isIsstatic();
			case MiniJavaPackage.METHOD__PARAMS :
				return getParams();
			case MiniJavaPackage.METHOD__BODY :
				return getBody();
			case MiniJavaPackage.METHOD__CACHE :
				return getCache();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MiniJavaPackage.METHOD__ISABSTRACT :
				setIsabstract((Boolean)newValue);
				return;
			case MiniJavaPackage.METHOD__ISSTATIC :
				setIsstatic((Boolean)newValue);
				return;
			case MiniJavaPackage.METHOD__PARAMS :
				getParams().clear();
				getParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case MiniJavaPackage.METHOD__BODY :
				setBody((Block)newValue);
				return;
			case MiniJavaPackage.METHOD__CACHE :
				getCache().clear();
				getCache().addAll((Collection<? extends Map.Entry<Clazz, Method>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MiniJavaPackage.METHOD__ISABSTRACT :
				setIsabstract(ISABSTRACT_EDEFAULT);
				return;
			case MiniJavaPackage.METHOD__ISSTATIC :
				setIsstatic(ISSTATIC_EDEFAULT);
				return;
			case MiniJavaPackage.METHOD__PARAMS :
				getParams().clear();
				return;
			case MiniJavaPackage.METHOD__BODY :
				setBody((Block) null);
				return;
			case MiniJavaPackage.METHOD__CACHE :
				getCache().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MiniJavaPackage.METHOD__ISABSTRACT :
				return isabstract != ISABSTRACT_EDEFAULT;
			case MiniJavaPackage.METHOD__ISSTATIC :
				return isstatic != ISSTATIC_EDEFAULT;
			case MiniJavaPackage.METHOD__PARAMS :
				return params != null && !params.isEmpty();
			case MiniJavaPackage.METHOD__BODY :
				return body != null;
			case MiniJavaPackage.METHOD__CACHE :
				return cache != null && !cache.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Object accept(VisitorInterface visitor) {
		return visitor.visitminiJava__Method(this);
	}
}
