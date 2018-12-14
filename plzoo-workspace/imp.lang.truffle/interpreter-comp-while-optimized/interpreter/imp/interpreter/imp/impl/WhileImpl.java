package interpreter.imp.interpreter.imp.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.DirectCallNode;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;

import interpreter.imp.interpreter.imp.Expr;
import interpreter.imp.interpreter.imp.ImpPackage;
import interpreter.imp.interpreter.imp.Stmt;
import interpreter.imp.interpreter.imp.Store;
import interpreter.imp.interpreter.imp.While;

@NodeInfo(description = "While")
public class WhileImpl extends StmtImpl implements While {
	@Child
	protected Expr cond;

	@Child
	protected Stmt body;

	@Child
	private DirectCallNode dcn;

	protected WhileImpl() {
		super();
	}

	@TruffleBoundary
	public void setCond(Expr newCond) {
		if (newCond != cond) {
			NotificationChain msgs = null;
			if (cond != null)
				msgs = ((InternalEObject) cond).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - interpreter.imp.interpreter.imp.ImpPackage.WHILE__COND, null, msgs);
			if (newCond != null)
				msgs = ((InternalEObject) newCond).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - interpreter.imp.interpreter.imp.ImpPackage.WHILE__COND, null, msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					interpreter.imp.interpreter.imp.ImpPackage.WHILE__COND, newCond, newCond));
	}

	@TruffleBoundary
	public NotificationChain basicSetCond(Expr newCond, NotificationChain msgs) {
		Expr oldCond = cond;
		cond = newCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					interpreter.imp.interpreter.imp.ImpPackage.WHILE__COND, oldCond, newCond);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	@TruffleBoundary
	public Expr getCond() {
		return cond;
	}

	@TruffleBoundary
	public void setBody(Stmt newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject) body).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - interpreter.imp.interpreter.imp.ImpPackage.WHILE__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject) newBody).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - interpreter.imp.interpreter.imp.ImpPackage.WHILE__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					interpreter.imp.interpreter.imp.ImpPackage.WHILE__BODY, newBody, newBody));
	}

	@TruffleBoundary
	public NotificationChain basicSetBody(Stmt newBody, NotificationChain msgs) {
		Stmt oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					interpreter.imp.interpreter.imp.ImpPackage.WHILE__BODY, oldBody, newBody);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	@TruffleBoundary
	public Stmt getBody() {
		return body;
	}

	@TruffleBoundary
	protected EClass eStaticClass() {
		return ImpPackage.Literals.WHILE;
	}

	@TruffleBoundary
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ImpPackage.WHILE__COND:
			setCond((interpreter.imp.interpreter.imp.Expr) newValue);
			return;
		case ImpPackage.WHILE__BODY:
			setBody((interpreter.imp.interpreter.imp.Stmt) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	@TruffleBoundary
	public void eUnset(int featureID) {
		switch (featureID) {
		case ImpPackage.WHILE__COND:
			setCond((interpreter.imp.interpreter.imp.Expr) null);
			return;
		case ImpPackage.WHILE__BODY:
			setBody((interpreter.imp.interpreter.imp.Stmt) null);
			return;
		}
		super.eUnset(featureID);
	}

	@TruffleBoundary
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ImpPackage.WHILE__COND:
			return getCond();
		case ImpPackage.WHILE__BODY:
			return getBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@TruffleBoundary
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ImpPackage.WHILE__COND:
			return cond != null;
		case ImpPackage.WHILE__BODY:
			return body != null;
		}
		return super.eIsSet(featureID);
	}

	@TruffleBoundary
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case interpreter.imp.interpreter.imp.ImpPackage.WHILE__COND:
			return basicSetCond(null, msgs);
		case interpreter.imp.interpreter.imp.ImpPackage.WHILE__BODY:
			return basicSetBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	public Store execute(final Store s) {
		if (dcn == null) {
			CompilerDirectives.transferToInterpreterAndInvalidate();
			final RootNodeExtension rootNode = new RootNodeExtension(s);
			final RootCallTarget createCallTarget = Truffle.getRuntime().createCallTarget(rootNode);
			dcn = Truffle.getRuntime().createDirectCallNode(createCallTarget);
		}
		Store result;
		final boolean stop = ((boolean) false);
		final interpreter.imp.interpreter.imp.Store tmp = ((interpreter.imp.interpreter.imp.Store) s);
		final Data it = new Data(tmp, stop);
		while (!(it.stop)) {
			dcn.call(new Object[] { it });
		}
		result = it.tmp;
		;
		return result;
	}
	
	private final class RootNodeExtension extends RootNode {
		private final Store s;

		private RootNodeExtension(Store s) {
			super(null);
			this.s = s;
		}

		@Override
		public Object execute(VirtualFrame frame) {
			Data it = (Data) frame.getArguments()[0];
			interpreter.imp.interpreter.imp.Value conde = ((interpreter.imp.interpreter.imp.Value) cond
					.evaluate(s));
			if (conde instanceof interpreter.imp.interpreter.imp.BoolValue) {
				interpreter.imp.interpreter.imp.BoolValue condeb = ((interpreter.imp.interpreter.imp.BoolValue) conde);
				if (condeb.isValue()) {
					it.tmp = body.execute(it.tmp);
				} else {
					it.stop = true;
				}
			} else {
				it.stop = true;
			}
			return it;
		}
	}

	private final class Data {

		public Store tmp;
		private boolean stop;

		public Data(Store tmp, boolean stop) {
			this.tmp = tmp;
			this.stop = stop;
		}
		
	}
}