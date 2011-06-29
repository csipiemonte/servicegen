/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
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
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.CheckCondition#getThenNode <em>Then Node</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.CheckCondition#getElseNode <em>Else Node</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.CheckCondition#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
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
