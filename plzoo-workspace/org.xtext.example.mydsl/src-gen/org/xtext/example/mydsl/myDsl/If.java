/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getCond <em>Cond</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getThn <em>Thn</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.If#getEls <em>Els</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf()
 * @model
 * @generated
 */
public interface If extends TopLevelCmd, Expr
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Cond()
   * @model containment="true"
   * @generated
   */
  Expr getCond();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expr value);

  /**
   * Returns the value of the '<em><b>Thn</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thn</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thn</em>' containment reference.
   * @see #setThn(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Thn()
   * @model containment="true"
   * @generated
   */
  Expr getThn();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getThn <em>Thn</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thn</em>' containment reference.
   * @see #getThn()
   * @generated
   */
  void setThn(Expr value);

  /**
   * Returns the value of the '<em><b>Els</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Els</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Els</em>' containment reference.
   * @see #setEls(Expr)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getIf_Els()
   * @model containment="true"
   * @generated
   */
  Expr getEls();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.If#getEls <em>Els</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Els</em>' containment reference.
   * @see #getEls()
   * @generated
   */
  void setEls(Expr value);

} // If