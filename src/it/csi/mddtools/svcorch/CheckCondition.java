/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;


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
} // CheckCondition
