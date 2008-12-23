/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Param Coinstraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.SimpleParamCoinstraint#getParam <em>Param</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.SimpleParamCoinstraint#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getSimpleParamCoinstraint()
 * @model
 * @generated
 */
public interface SimpleParamCoinstraint extends ParamConstraint {
	/**
	 * Returns the value of the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' reference.
	 * @see #setParam(Param)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getSimpleParamCoinstraint_Param()
	 * @model
	 * @generated
	 */
	Param getParam();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.SimpleParamCoinstraint#getParam <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(Param value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(ValueConstraint)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getSimpleParamCoinstraint_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	ValueConstraint getConstraint();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.SimpleParamCoinstraint#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ValueConstraint value);

} // SimpleParamCoinstraint
