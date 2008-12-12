/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import it.csi.mddtools.servicedef.ServiceDef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.ServiceImpl#getProvides <em>Provides</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getServiceImpl()
 * @model
 * @generated
 */
public interface ServiceImpl extends EObject {
	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference.
	 * @see #setProvides(ServiceDef)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getServiceImpl_Provides()
	 * @model
	 * @generated
	 */
	ServiceDef getProvides();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.ServiceImpl#getProvides <em>Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides</em>' reference.
	 * @see #getProvides()
	 * @generated
	 */
	void setProvides(ServiceDef value);

} // ServiceImpl
