package test1.visitor.test1.impl;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import test1.visitor.test1.ConceptA;
import test1.visitor.test1.Test1Package;
import visitor.VisitorInterface;

public class ConceptAImpl extends MinimalEObjectImpl.Container implements ConceptA {
	protected EList<Boolean> bs;

	protected ConceptAImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return Test1Package.Literals.CONCEPT_A;
	}

	public EList<Boolean> getBs() {
		if (bs == null) {
			bs = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, Test1Package.CONCEPT_A__BS);
		}
		return bs;
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Test1Package.CONCEPT_A__BS :
				return getBs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Test1Package.CONCEPT_A__BS :
				getBs().clear();
				getBs().addAll((Collection<? extends Boolean>) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Test1Package.CONCEPT_A__BS :
				getBs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Test1Package.CONCEPT_A__BS :
				return bs != null && !bs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Object accept(VisitorInterface visitor) {
		return visitor.visittest1__ConceptA(this);
	}
}
