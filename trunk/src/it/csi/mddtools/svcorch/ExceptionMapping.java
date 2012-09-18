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
package it.csi.mddtools.svcorch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.ExceptionMapping#getMsg <em>Msg</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.ExceptionMapping#getFrom <em>From</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.ExceptionMapping#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionMapping()
 * @model
 * @generated
 */
public interface ExceptionMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see #setMsg(String)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionMapping_Msg()
	 * @model
	 * @generated
	 */
	String getMsg();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ExceptionMapping#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(it.csi.mddtools.typedef.Exception)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionMapping_From()
	 * @model
	 * @generated
	 */
	it.csi.mddtools.typedef.Exception getFrom();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ExceptionMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(it.csi.mddtools.typedef.Exception value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(it.csi.mddtools.typedef.Exception)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionMapping_To()
	 * @model
	 * @generated
	 */
	it.csi.mddtools.typedef.Exception getTo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ExceptionMapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(it.csi.mddtools.typedef.Exception value);

} // ExceptionMapping
