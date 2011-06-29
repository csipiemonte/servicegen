/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Param Bindings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.InputParamBindings#getInputParams <em>Input Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getInputParamBindings()
 * @model
 * @generated
 */
public interface InputParamBindings extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Params</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.svcorch.ParamBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Params</em>' containment reference list.
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getInputParamBindings_InputParams()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamBinding> getInputParams();

} // InputParamBindings
