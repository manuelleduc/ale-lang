package kmLogo.interpreter.kmLogo;

import org.eclipse.emf.ecore.EObject;

public interface Segment extends EObject {
  Point getBegin();

  void setBegin(Point begin);

  Point getEnd();

  void setEnd(Point end);
}
