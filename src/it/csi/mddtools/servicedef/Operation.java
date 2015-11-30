/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;

import it.csi.mddtools.typedef.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getParams <em>Params</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getOpType <em>Op Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getThrows <em>Throws</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getTxType <em>Tx Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getSince <em>Since</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getAuthorizedRoles <em>Authorized Roles</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getValidator <em>Validator</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Operation#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<Param> getParams();

	/**
	 * Returns the value of the '<em><b>Op Type</b></em>' attribute.
	 * The default value is <code>"synch"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.servicedef.OpTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Op Type</em>' attribute.
	 * @see it.csi.mddtools.servicedef.OpTypeEnum
	 * @see #setOpType(OpTypeEnum)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_OpType()
	 * @model default="synch"
	 * @generated
	 */
	OpTypeEnum getOpType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Operation#getOpType <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Type</em>' attribute.
	 * @see it.csi.mddtools.servicedef.OpTypeEnum
	 * @see #getOpType()
	 * @generated
	 */
	void setOpType(OpTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Type)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_ReturnType()
	 * @model
	 * @generated
	 */
	Type getReturnType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Operation#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Type value);

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.typedef.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Throws</em>' reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_Throws()
	 * @model
	 * @generated
	 */
	EList<it.csi.mddtools.typedef.Exception> getThrows();

	/**
	 * Returns the value of the '<em><b>Tx Type</b></em>' attribute.
	 * The default value is <code>"noTX"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.servicedef.TXTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tx Type</em>' attribute.
	 * @see it.csi.mddtools.servicedef.TXTypeEnum
	 * @see #setTxType(TXTypeEnum)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_TxType()
	 * @model default="noTX"
	 * @generated
	 */
	TXTypeEnum getTxType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Operation#getTxType <em>Tx Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Type</em>' attribute.
	 * @see it.csi.mddtools.servicedef.TXTypeEnum
	 * @see #getTxType()
	 * @generated
	 */
	void setTxType(TXTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Since</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Since</em>' attribute.
	 * @see #setSince(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_Since()
	 * @model
	 * @generated
	 */
	String getSince();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Operation#getSince <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Since</em>' attribute.
	 * @see #getSince()
	 * @generated
	 */
	void setSince(String value);

	/**
	 * Returns the value of the '<em><b>Authorized Roles</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorized Roles</em>' reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_AuthorizedRoles()
	 * @model
	 * @generated
	 */
	EList<Role> getAuthorizedRoles();

	/**
	 * Returns the value of the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validator</em>' containment reference.
	 * @see #setValidator(InputValidator)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_Validator()
	 * @model containment="true"
	 * @generated
	 */
	InputValidator getValidator();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Operation#getValidator <em>Validator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator</em>' containment reference.
	 * @see #getValidator()
	 * @generated
	 */
	void setValidator(InputValidator value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(SDDocumentation)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getOperation_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	SDDocumentation getDocumentation();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Operation#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(SDDocumentation value);

} // Operation
