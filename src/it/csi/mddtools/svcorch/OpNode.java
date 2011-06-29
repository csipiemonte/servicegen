/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.OpNode#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOpNode()
 * @model abstract="true"
 * @generated
 */
public interface OpNode extends Node {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Node)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOpNode_Next()
	 * @model
	 * @generated
	 */
	Node getNext();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.OpNode#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Node value);

} // OpNode
