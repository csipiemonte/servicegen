/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import it.csi.mddtools.typedef.Type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.BaseTypes#getBaseTypes <em>Base Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getBaseTypes()
 * @model
 * @generated
 */
public interface BaseTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Types</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.typedef.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Types</em>' containment reference list.
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getBaseTypes_BaseTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getBaseTypes();

} // BaseTypes
