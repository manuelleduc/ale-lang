/**
 * ******************************************************************************
 * Copyright (c) 2017 Inria and Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  *
 * Contributors:
 *     Inria - initial API and implementation
 *  *
 * generated by Xtext 2.12.0
 *  ******************************************************************************
 */
package org.eclipse.emf.ecoretools.ale;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seq Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.ecoretools.ale.SeqType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.ecoretools.ale.AlePackage#getSeqType()
 * @model
 * @generated
 */
public interface SeqType extends typeLiteral
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(typeLiteral)
   * @see org.eclipse.emf.ecoretools.ale.AlePackage#getSeqType_Type()
   * @model containment="true"
   * @generated
   */
  typeLiteral getType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.ecoretools.ale.SeqType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(typeLiteral value);

} // SeqType
