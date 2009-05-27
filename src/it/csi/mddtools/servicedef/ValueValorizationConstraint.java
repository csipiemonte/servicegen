/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Valorization Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.ValueValorizationConstraint#isMustNotBeNull <em>Must Not Be Null</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getValueValorizationConstraint()
 * @model
 * @generated
 */
public interface ValueValorizationConstraint extends SimpleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Must Not Be Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Not Be Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Not Be Null</em>' attribute.
	 * @see #setMustNotBeNull(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getValueValorizationConstraint_MustNotBeNull()
	 * @model
	 * @generated
	 */
	boolean isMustNotBeNull();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ValueValorizationConstraint#isMustNotBeNull <em>Must Not Be Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Not Be Null</em>' attribute.
	 * @see #isMustNotBeNull()
	 * @generated
	 */
	void setMustNotBeNull(boolean value);

} // ValueValorizationConstraint
