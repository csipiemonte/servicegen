/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.typedef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.Exception#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.typedef.TypedefPackage#getException()
 * @model
 * @generated
 */
public interface Exception extends Type {
	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.typedef.CSIExceptionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Type</em>' attribute.
	 * @see it.csi.mddtools.typedef.CSIExceptionTypes
	 * @see #setExceptionType(CSIExceptionTypes)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getException_ExceptionType()
	 * @model
	 * @generated
	 */
	CSIExceptionTypes getExceptionType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.Exception#getExceptionType <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' attribute.
	 * @see it.csi.mddtools.typedef.CSIExceptionTypes
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(CSIExceptionTypes value);

} // Exception
