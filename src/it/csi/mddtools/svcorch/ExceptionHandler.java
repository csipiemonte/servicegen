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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.ExceptionHandler#getHandledException <em>Handled Exception</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.ExceptionHandler#getFirstRecoveryNode <em>First Recovery Node</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Handled Exception</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.typedef.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handled Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handled Exception</em>' reference list.
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionHandler_HandledException()
	 * @model
	 * @generated
	 */
	EList<it.csi.mddtools.typedef.Exception> getHandledException();

	/**
	 * Returns the value of the '<em><b>First Recovery Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Recovery Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Recovery Node</em>' reference.
	 * @see #setFirstRecoveryNode(Node)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionHandler_FirstRecoveryNode()
	 * @model
	 * @generated
	 */
	Node getFirstRecoveryNode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ExceptionHandler#getFirstRecoveryNode <em>First Recovery Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Recovery Node</em>' reference.
	 * @see #getFirstRecoveryNode()
	 * @generated
	 */
	void setFirstRecoveryNode(Node value);

} // ExceptionHandler
