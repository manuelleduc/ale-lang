/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.ecoretools.ale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rBlock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ecoretools.ale.rBlock#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.eclipse.ecoretools.ale.AlePackage#getrBlock()
 * @model
 * @generated
 */
public interface rBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.ecoretools.ale.RStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see org.eclipse.ecoretools.ale.AlePackage#getrBlock_Statement()
   * @model containment="true"
   * @generated
   */
  EList<RStatement> getStatement();

} // rBlock
