/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.CustomConstraint#getCheckMethodName <em>Check Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getCustomConstraint()
 * @model
 * @generated
 */
public interface CustomConstraint extends SimpleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Check Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Method Name</em>' attribute.
	 * @see #setCheckMethodName(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getCustomConstraint_CheckMethodName()
	 * @model
	 * @generated
	 */
	String getCheckMethodName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.CustomConstraint#getCheckMethodName <em>Check Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Method Name</em>' attribute.
	 * @see #getCheckMethodName()
	 * @generated
	 */
	void setCheckMethodName(String value);

} // CustomConstraint
