/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Platform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.TargetPlatform#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getTargetPlatform()
 * @model
 * @generated
 */
public interface TargetPlatform extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.servicegen.TargetPlatformCodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.servicegen.TargetPlatformCodes
	 * @see #setCode(TargetPlatformCodes)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getTargetPlatform_Code()
	 * @model
	 * @generated
	 */
	TargetPlatformCodes getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.TargetPlatform#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.servicegen.TargetPlatformCodes
	 * @see #getCode()
	 * @generated
	 */
	void setCode(TargetPlatformCodes value);

} // TargetPlatform
