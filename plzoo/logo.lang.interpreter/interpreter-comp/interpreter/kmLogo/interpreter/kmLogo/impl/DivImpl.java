package interpreter.kmLogo.interpreter.kmLogo.impl;

import interpreter.kmLogo.interpreter.kmLogo.Div;
import interpreter.kmLogo.interpreter.kmLogo.Expression;
import interpreter.kmLogo.interpreter.kmLogo.KmLogoPackage;
import interpreter.kmLogo.interpreter.kmLogo.Turtle;
import java.lang.Override;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecoretools.ale.compiler.lib.EqualService;

public class DivImpl extends BinaryExpImpl implements Div {
	protected DivImpl() {
		super();
	}

	@Override
	protected EClass eStaticClass() {
		return KmLogoPackage.Literals.DIV;
	}

	public double eval(Turtle turtle) {
		double result;
		if (!EqualService.equals((((Expression) (this.rhs)).eval((Turtle) (turtle))), (0.0))) {
			result = (double) ((((Expression) (this.lhs)).eval((Turtle) (turtle))) / (((Expression) (this.rhs)).eval((Turtle) (turtle)))) ;
		}
		else {
			result = (double) (0.0) ;
		}
		return result;
	}
}
