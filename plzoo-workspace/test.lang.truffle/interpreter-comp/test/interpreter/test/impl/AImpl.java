package test.interpreter.test.impl;

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.nodes.NodeInfo;
import java.lang.Object;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecoretools.ale.compiler.truffle.MinimalTruffleEObjectImpl;
import test.interpreter.test.A;
import test.interpreter.test.TestPackage;

@NodeInfo(
    description = "A"
)
public class AImpl extends MinimalTruffleEObjectImpl.TruffleContainer implements A {
  @CompilationFinal
  private ADispatchWrapperEval cachedEval;

  protected AImpl() {
    super();
    this.cachedEval = new test.interpreter.test.impl.ADispatchWrapperEval(this);
  }

  @TruffleBoundary
  protected EClass eStaticClass() {
    return TestPackage.Literals.A;}

  @TruffleBoundary
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    }
    super.eSet(featureID, newValue);
  }

  @TruffleBoundary
  public void eUnset(int featureID) {
    switch (featureID) {
    }
    super.eUnset(featureID);
  }

  @TruffleBoundary
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    }
    return super.eGet(featureID, resolve, coreType);
  }

  @TruffleBoundary
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    }
    return super.eIsSet(featureID);
  }

  @TruffleBoundary
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
      NotificationChain msgs) {
    switch(featureID) {
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  public void eval() {
    org.eclipse.emf.ecoretools.ale.compiler.lib.LogService.log("A");
        ;
  }

  public ADispatchWrapperEval getCachedEval() {
    return this.cachedEval;
  }
}