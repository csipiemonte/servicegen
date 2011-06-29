/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.ContinuousRangeConstraint#getLowerbound <em>Lowerbound</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ContinuousRangeConstraint#getUpperbound <em>Upperbound</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getContinuousRangeConstraint()
 * @model
 * @generated
 */
public interface ContinuousRangeConstraint extends ValueRangeConstraint {
	/**
	 * Returns the value of the '<em><b>Lowerbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lowerbound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lowerbound</em>' attribute.
	 * @see #setLowerbound(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getContinuousRangeConstraint_Lowerbound()
	 * @model
	 * @generated
	 */
	String getLowerbound();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ContinuousRangeConstraint#getLowerbound <em>Lowerbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lowerbound</em>' attribute.
	 * @see #getLowerbound()
	 * @generated
	 */
	void setLowerbound(String value);

	/**
	 * Returns the value of the '<em><b>Upperbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upperbound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upperbound</em>' attribute.
	 * @see #setUpperbound(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getContinuousRangeConstraint_Upperbound()
	 * @model
	 * @generated
	 */
	String getUpperbound();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ContinuousRangeConstraint#getUpperbound <em>Upperbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upperbound</em>' attribute.
	 * @see #getUpperbound()
	 * @generated
	 */
	void setUpperbound(String value);

} // ContinuousRangeConstraint
