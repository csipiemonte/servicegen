/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;

import it.csi.mddtools.appresources.ServiceConnector;

import it.csi.mddtools.servicedef.Operation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Srv Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.SrvCall#getOperation <em>Operation</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.SrvCall#getServiceConnector <em>Service Connector</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.SrvCall#getParamBindings <em>Param Bindings</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.SrvCall#getOutputSlot <em>Output Slot</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.SrvCall#getOnException <em>On Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getSrvCall()
 * @model abstract="true"
 * @generated
 */
public interface SrvCall extends OpNode {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getSrvCall_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.SrvCall#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Service Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Connector</em>' reference.
	 * @see #setServiceConnector(ServiceConnector)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getSrvCall_ServiceConnector()
	 * @model
	 * @generated
	 */
	ServiceConnector getServiceConnector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.SrvCall#getServiceConnector <em>Service Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Connector</em>' reference.
	 * @see #getServiceConnector()
	 * @generated
	 */
	void setServiceConnector(ServiceConnector value);

	/**
	 * Returns the value of the '<em><b>Param Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.svcorch.ParamBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Bindings</em>' containment reference list.
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getSrvCall_ParamBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamBinding> getParamBindings();

	/**
	 * Returns the value of the '<em><b>Output Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Slot</em>' reference.
	 * @see #setOutputSlot(DataSlot)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getSrvCall_OutputSlot()
	 * @model
	 * @generated
	 */
	DataSlot getOutputSlot();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.SrvCall#getOutputSlot <em>Output Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Slot</em>' reference.
	 * @see #getOutputSlot()
	 * @generated
	 */
	void setOutputSlot(DataSlot value);

	/**
	 * Returns the value of the '<em><b>On Exception</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.svcorch.ExceptionHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Exception</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Exception</em>' containment reference list.
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getSrvCall_OnException()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExceptionHandler> getOnException();

} // SrvCall
