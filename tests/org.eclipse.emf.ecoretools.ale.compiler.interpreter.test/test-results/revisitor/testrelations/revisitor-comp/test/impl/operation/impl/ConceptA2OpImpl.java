package test.impl.operation.impl;

import emfrelations.ConceptA2;
import emfrelations.revisitor.EmfrelationsRevisitor;
import test.impl.operation.ConceptA0Op;
import test.impl.operation.ConceptA10Op;
import test.impl.operation.ConceptA11Op;
import test.impl.operation.ConceptA1Op;
import test.impl.operation.ConceptA2Op;
import test.impl.operation.ConceptA3Op;
import test.impl.operation.ConceptA4Op;
import test.impl.operation.ConceptA5Op;
import test.impl.operation.ConceptA8Op;
import test.impl.operation.ConceptA9Op;
import test.impl.operation.ConceptB0Op;
import test.impl.operation.ConceptB10Op;
import test.impl.operation.ConceptB11Op;
import test.impl.operation.ConceptB1Op;
import test.impl.operation.ConceptB2Op;
import test.impl.operation.ConceptB3Op;
import test.impl.operation.ConceptB4Op;
import test.impl.operation.ConceptB5Op;
import test.impl.operation.ConceptB8Op;
import test.impl.operation.ConceptB9Op;

public class ConceptA2OpImpl implements ConceptA2Op {
  private EmfrelationsRevisitor<ConceptA0Op, ConceptA1Op, ConceptA10Op, ConceptA11Op, ConceptA2Op, ConceptA3Op, ConceptA4Op, ConceptA5Op, ConceptA8Op, ConceptA9Op, ConceptB0Op, ConceptB1Op, ConceptB10Op, ConceptB11Op, ConceptB2Op, ConceptB3Op, ConceptB4Op, ConceptB5Op, ConceptB8Op, ConceptB9Op> rev;

  private ConceptA2 obj;

  public ConceptA2OpImpl(ConceptA2 obj,
      EmfrelationsRevisitor<ConceptA0Op, ConceptA1Op, ConceptA10Op, ConceptA11Op, ConceptA2Op, ConceptA3Op, ConceptA4Op, ConceptA5Op, ConceptA8Op, ConceptA9Op, ConceptB0Op, ConceptB1Op, ConceptB10Op, ConceptB11Op, ConceptB2Op, ConceptB3Op, ConceptB4Op, ConceptB5Op, ConceptB8Op, ConceptB9Op> rev) {
    this.obj = obj;
    this.rev = rev;
  }
}
