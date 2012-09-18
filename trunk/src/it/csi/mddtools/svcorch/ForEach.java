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
 * A representation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.ForEach#getCollection <em>Collection</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.ForEach#getItem <em>Item</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.ForEach#getFirstLoopNode <em>First Loop Node</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.ForEach#getAfterLoopNode <em>After Loop Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getForEach()
 * @model
 * @generated
 */
public interface ForEach extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(DataSlot)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getForEach_Collection()
	 * @model
	 * @generated
	 */
	DataSlot getCollection();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ForEach#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(DataSlot value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(DataSlot)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getForEach_Item()
	 * @model
	 * @generated
	 */
	DataSlot getItem();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ForEach#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(DataSlot value);

	/**
	 * Returns the value of the '<em><b>First Loop Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Loop Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Loop Node</em>' reference.
	 * @see #setFirstLoopNode(Node)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getForEach_FirstLoopNode()
	 * @model
	 * @generated
	 */
	Node getFirstLoopNode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ForEach#getFirstLoopNode <em>First Loop Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Loop Node</em>' reference.
	 * @see #getFirstLoopNode()
	 * @generated
	 */
	void setFirstLoopNode(Node value);

	/**
	 * Returns the value of the '<em><b>After Loop Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Loop Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Loop Node</em>' reference.
	 * @see #setAfterLoopNode(Node)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getForEach_AfterLoopNode()
	 * @model
	 * @generated
	 */
	Node getAfterLoopNode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ForEach#getAfterLoopNode <em>After Loop Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After Loop Node</em>' reference.
	 * @see #getAfterLoopNode()
	 * @generated
	 */
	void setAfterLoopNode(Node value);

} // ForEach
