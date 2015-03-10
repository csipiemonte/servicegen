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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.Param#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Param#getType <em>Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Param#getValidator <em>Validator</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Param#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Param#isInHeader <em>In Header</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.Param#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getParam()
 * @model
 * @generated
 */
public interface Param extends EObject {
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
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getParam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Param#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getParam_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Param#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

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
	 * @see #setValidator(ParamValidator)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getParam_Validator()
	 * @model containment="true"
	 * @generated
	 */
	ParamValidator getValidator();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Param#getValidator <em>Validator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validator</em>' containment reference.
	 * @see #getValidator()
	 * @generated
	 */
	void setValidator(ParamValidator value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(ValueConstraint)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getParam_Constraint()
	 * @model
	 * @generated
	 */
	ValueConstraint getConstraint();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Param#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(ValueConstraint value);

	/**
	 * Returns the value of the '<em><b>In Header</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Header</em>' attribute.
	 * @see #setInHeader(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getParam_InHeader()
	 * @model default="false"
	 * @generated
	 */
	boolean isInHeader();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Param#isInHeader <em>In Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Header</em>' attribute.
	 * @see #isInHeader()
	 * @generated
	 */
	void setInHeader(boolean value);

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
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getParam_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	SDDocumentation getDocumentation();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.Param#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(SDDocumentation value);

} // Param
