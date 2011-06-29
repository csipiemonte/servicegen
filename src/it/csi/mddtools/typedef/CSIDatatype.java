/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.typedef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSI Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.CSIDatatype#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.CSIDatatype#isNillable <em>Nillable</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.typedef.TypedefPackage#getCSIDatatype()
 * @model
 * @generated
 */
public interface CSIDatatype extends Type {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.typedef.CSIDatatypeCodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.typedef.CSIDatatypeCodes
	 * @see #setCode(CSIDatatypeCodes)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getCSIDatatype_Code()
	 * @model
	 * @generated
	 */
	CSIDatatypeCodes getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.CSIDatatype#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.typedef.CSIDatatypeCodes
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CSIDatatypeCodes value);

	/**
	 * Returns the value of the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nillable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nillable</em>' attribute.
	 * @see #setNillable(boolean)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getCSIDatatype_Nillable()
	 * @model
	 * @generated
	 */
	boolean isNillable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.CSIDatatype#isNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nillable</em>' attribute.
	 * @see #isNillable()
	 * @generated
	 */
	void setNillable(boolean value);

} // CSIDatatype
