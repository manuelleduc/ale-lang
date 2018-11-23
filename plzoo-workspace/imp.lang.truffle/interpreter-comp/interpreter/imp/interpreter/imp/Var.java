package interpreter.imp.interpreter.imp;

import com.oracle.truffle.api.nodes.NodeInterface;
import java.lang.String;
import org.eclipse.emf.ecore.EObject;

public interface Var extends EObject, NodeInterface, Expr {
  String getName();

  void setName(String value);

  Value evaluate(Store s);
}
