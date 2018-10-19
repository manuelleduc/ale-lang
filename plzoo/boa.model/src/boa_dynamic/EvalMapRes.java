/**
 */
package boa_dynamic;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eval Map Res</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boa_dynamic.EvalMapRes#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see boa_dynamic.Boa_dynamicPackage#getEvalMapRes()
 * @model
 * @generated
 */
public interface EvalMapRes extends EvalRes {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link boa_dynamic.EvalRes},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' map.
	 * @see boa_dynamic.Boa_dynamicPackage#getEvalMapRes_Values()
	 * @model mapType="boa_dynamic.StringToEvalResMap&lt;org.eclipse.emf.ecore.EString, boa_dynamic.EvalRes&gt;"
	 * @generated
	 */
	EMap<String, EvalRes> getValues();

} // EvalMapRes