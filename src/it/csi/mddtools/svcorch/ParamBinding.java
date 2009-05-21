/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;

import it.csi.mddtools.servicedef.Param;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.ParamBinding#getSlot <em>Slot</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.ParamBinding#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getParamBinding()
 * @model
 * @generated
 */
public interface ParamBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' reference.
	 * @see #setSlot(DataSlot)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getParamBinding_Slot()
	 * @model
	 * @generated
	 */
	DataSlot getSlot();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ParamBinding#getSlot <em>Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(DataSlot value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' reference.
	 * @see #setParam(Param)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getParamBinding_Param()
	 * @model
	 * @generated
	 */
	Param getParam();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ParamBinding#getParam <em>Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(Param value);

} // ParamBinding
