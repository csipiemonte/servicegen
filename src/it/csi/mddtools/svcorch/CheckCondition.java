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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.CheckCondition#getThenNode <em>Then Node</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.CheckCondition#getElseNode <em>Else Node</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.CheckCondition#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getCheckCondition()
 * @model
 * @generated
 */
public interface CheckCondition extends FlowNode {

	/**
	 * Returns the value of the '<em><b>Then Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Node</em>' reference.
	 * @see #setThenNode(Node)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getCheckCondition_ThenNode()
	 * @model
	 * @generated
	 */
	Node getThenNode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.CheckCondition#getThenNode <em>Then Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Node</em>' reference.
	 * @see #getThenNode()
	 * @generated
	 */
	void setThenNode(Node value);

	/**
	 * Returns the value of the '<em><b>Else Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Node</em>' reference.
	 * @see #setElseNode(Node)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getCheckCondition_ElseNode()
	 * @model
	 * @generated
	 */
	Node getElseNode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.CheckCondition#getElseNode <em>Else Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Node</em>' reference.
	 * @see #getElseNode()
	 * @generated
	 */
	void setElseNode(Node value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.svcorch.DataSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getCheckCondition_Input()
	 * @model
	 * @generated
	 */
	EList<DataSlot> getInput();
} // CheckCondition
