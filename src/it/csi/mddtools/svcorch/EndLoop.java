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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.EndLoop#getLoopHeadNode <em>Loop Head Node</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getEndLoop()
 * @model
 * @generated
 */
public interface EndLoop extends FlowNode {

	/**
	 * Returns the value of the '<em><b>Loop Head Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Head Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Head Node</em>' reference.
	 * @see #setLoopHeadNode(Node)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getEndLoop_LoopHeadNode()
	 * @model
	 * @generated
	 */
	Node getLoopHeadNode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.EndLoop#getLoopHeadNode <em>Loop Head Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Head Node</em>' reference.
	 * @see #getLoopHeadNode()
	 * @generated
	 */
	void setLoopHeadNode(Node value);
} // EndLoop
