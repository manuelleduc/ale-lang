/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.ecoretools.ale;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RAssign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.ecoretools.ale.RAssign#getStmt <em>Stmt</em>}</li>
 *   <li>{@link org.eclipse.ecoretools.ale.RAssign#getLeft <em>Left</em>}</li>
 *   <li>{@link org.eclipse.ecoretools.ale.RAssign#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.eclipse.ecoretools.ale.AlePackage#getRAssign()
 * @model
 * @generated
 */
public interface RAssign extends RStatement
{
  /**
   * Returns the value of the '<em><b>Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmt</em>' containment reference.
   * @see #setStmt(RAssign)
   * @see org.eclipse.ecoretools.ale.AlePackage#getRAssign_Stmt()
   * @model containment="true"
   * @generated
   */
  RAssign getStmt();

  /**
   * Sets the value of the '{@link org.eclipse.ecoretools.ale.RAssign#getStmt <em>Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stmt</em>' containment reference.
   * @see #getStmt()
   * @generated
   */
  void setStmt(RAssign value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expr)
   * @see org.eclipse.ecoretools.ale.AlePackage#getRAssign_Left()
   * @model containment="true"
   * @generated
   */
  Expr getLeft();

  /**
   * Sets the value of the '{@link org.eclipse.ecoretools.ale.RAssign#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expr value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expr)
   * @see org.eclipse.ecoretools.ale.AlePackage#getRAssign_Right()
   * @model containment="true"
   * @generated
   */
  Expr getRight();

  /**
   * Sets the value of the '{@link org.eclipse.ecoretools.ale.RAssign#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expr value);

} // RAssign
