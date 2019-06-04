package boa.visitor.boa;

import org.eclipse.emf.ecore.EObject;
import visitor.AcceptInterface;

public interface With extends EObject, AcceptInterface, Expr {
	Expr getLhs();

	void setLhs(Expr value);

	Expr getRhs();

	void setRhs(Expr value);
}