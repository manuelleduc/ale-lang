package kmLogo.interpreter.kmLogo;

import org.eclipse.emf.ecore.EObject;

import com.oracle.truffle.api.nodes.NodeInterface;

public interface Div extends EObject, NodeInterface, BinaryExp {
	double eval(Turtle turtle);
}
