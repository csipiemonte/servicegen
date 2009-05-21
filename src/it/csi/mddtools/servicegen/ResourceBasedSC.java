/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import it.csi.mddtools.appresources.ResourceSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Based SC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.ResourceBasedSC#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getResourceBasedSC()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResourceBasedSC extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Set</em>' containment reference.
	 * @see #setResourceSet(ResourceSet)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getResourceBasedSC_ResourceSet()
	 * @model containment="true"
	 * @generated
	 */
	ResourceSet getResourceSet();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.ResourceBasedSC#getResourceSet <em>Resource Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set</em>' containment reference.
	 * @see #getResourceSet()
	 * @generated
	 */
	void setResourceSet(ResourceSet value);

} // ResourceBasedSC
