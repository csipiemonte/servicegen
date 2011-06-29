/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import it.csi.mddtools.appresources.ResourceSet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Based Simple SC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.ResourceBasedSimpleSC#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getResourceBasedSimpleSC()
 * @model
 * @generated
 */
public interface ResourceBasedSimpleSC extends SimpleSC, ResourceBasedSC {

	/**
	 * Returns the value of the '<em><b>Resource Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Set</em>' reference.
	 * @see #setResourceSet(ResourceSet)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getResourceBasedSimpleSC_ResourceSet()
	 * @model
	 * @generated
	 */
	ResourceSet getResourceSet();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.ResourceBasedSimpleSC#getResourceSet <em>Resource Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set</em>' reference.
	 * @see #getResourceSet()
	 * @generated
	 */
	void setResourceSet(ResourceSet value);
} // ResourceBasedSimpleSC
