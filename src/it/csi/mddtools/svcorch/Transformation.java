/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.Transformation#getInput <em>Input</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Transformation#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getTransformation()
 * @model abstract="true"
 * @generated
 */
public interface Transformation extends OpNode {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(DataSlot)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getTransformation_Input()
	 * @model
	 * @generated
	 */
	DataSlot getInput();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Transformation#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(DataSlot value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(DataSlot)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getTransformation_Output()
	 * @model
	 * @generated
	 */
	DataSlot getOutput();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Transformation#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(DataSlot value);

} // Transformation
