/**
 * <copyright>
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
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.EndLoop#getLoopHeadNode <em>Loop Head Node</em>}</li>
 * </ul>
 * </p>
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
