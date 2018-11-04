package visitor.petrinet.visitor.petrinet.impl;

import java.lang.Object;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import visitor.petrinet.visitor.petrinet.Arc;
import visitor.petrinet.visitor.petrinet.Node;
import visitor.petrinet.visitor.petrinet.PetrinetPackage;
import visitor.visitor.VisitorInterface;

public class ArcImpl extends MinimalEObjectImpl.Container implements Arc {
  protected Node target;

  protected Node source;

  protected ArcImpl() {
    super();
  }

  public void setTarget(Node newTarget) {
    if (newTarget != target) {
    	NotificationChain msgs = null;
    	if (target != null)
    		msgs = ((InternalEObject) target).eInverseRemove(this, PetrinetPackage.NODE__INCOMMING, visitor.petrinet.visitor.petrinet.Node.class, msgs);
    	if (newTarget != null)
    		msgs = ((InternalEObject) newTarget).eInverseAdd(this, PetrinetPackage.NODE__INCOMMING, visitor.petrinet.visitor.petrinet.Node.class,
    				msgs);
    	msgs = basicSetTarget(newTarget, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__TARGET, newTarget, newTarget));
  }

  private NotificationChain basicSetTarget(Node newTarget, NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Node oldTarget = target;
    target = newTarget;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__TARGET,
    			oldTarget, newTarget);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }

  public Node getTarget() {
    return target;}

  public void setSource(Node newSource) {
    if (newSource != source) {
    	NotificationChain msgs = null;
    	if (source != null)
    		msgs = ((InternalEObject) source).eInverseRemove(this, PetrinetPackage.NODE__OUTGOING, visitor.petrinet.visitor.petrinet.Node.class, msgs);
    	if (newSource != null)
    		msgs = ((InternalEObject) newSource).eInverseAdd(this, PetrinetPackage.NODE__OUTGOING, visitor.petrinet.visitor.petrinet.Node.class,
    				msgs);
    	msgs = basicSetSource(newSource, msgs);
    	if (msgs != null)
    		msgs.dispatch();
    } else if (eNotificationRequired())
    	eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__SOURCE, newSource, newSource));
  }

  private NotificationChain basicSetSource(Node newSource, NotificationChain msgsp) {
    NotificationChain msgs = msgsp;
    Node oldSource = source;
    source = newSource;
    if (eNotificationRequired()) {
    	ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetrinetPackage.ARC__SOURCE,
    			oldSource, newSource);
    	if (msgs == null)
    		msgs = notification;
    	else
    		msgs.add(notification);
    }
    return msgs;
  }

  public Node getSource() {
    return source;}

  protected EClass eStaticClass() {
    return PetrinetPackage.Literals.ARC;}

  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case PetrinetPackage.ARC__TARGET:
    	setTarget((visitor.petrinet.visitor.petrinet.Node) newValue);
    return;
    case PetrinetPackage.ARC__SOURCE:
    	setSource((visitor.petrinet.visitor.petrinet.Node) newValue);
    return;
    }
    super.eSet(featureID, newValue);
  }

  public void eUnset(int featureID) {
    switch (featureID) {
    case PetrinetPackage.ARC__TARGET:
    	setTarget((visitor.petrinet.visitor.petrinet.Node) null);
    return;
    case PetrinetPackage.ARC__SOURCE:
    	setSource((visitor.petrinet.visitor.petrinet.Node) null);
    return;
    }
    super.eUnset(featureID);
  }

  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case PetrinetPackage.ARC__TARGET:
    return getTarget();
    case PetrinetPackage.ARC__SOURCE:
    return getSource();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case PetrinetPackage.ARC__TARGET:
    	return target != null;
    case PetrinetPackage.ARC__SOURCE:
    	return source != null;
    }
    return super.eIsSet(featureID);
  }

  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
      NotificationChain msgs) {
    switch(featureID) {
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
      NotificationChain msgs2) {
    NotificationChain msgs = msgs2;
    switch (featureID) {

    case PetrinetPackage.ARC__TARGET:
    	if (target != null)
    		msgs = ((org.eclipse.emf.ecore.InternalEObject) target).eInverseRemove(this, PetrinetPackage.NODE__INCOMMING, Node.class,
    				msgs);
    	return basicSetTarget((visitor.petrinet.visitor.petrinet.Node) otherEnd, msgs);

    case PetrinetPackage.ARC__SOURCE:
    	if (source != null)
    		msgs = ((org.eclipse.emf.ecore.InternalEObject) source).eInverseRemove(this, PetrinetPackage.NODE__OUTGOING, Node.class,
    				msgs);
    	return basicSetSource((visitor.petrinet.visitor.petrinet.Node) otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  public Object accept(VisitorInterface visitor) {
    return visitor.visitpetrinet__Arc(this);}
}
