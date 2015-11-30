/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WS Endpoint Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.WSEndpointChannel#getWsSecurity <em>Ws Security</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSEndpointChannel()
 * @model
 * @generated
 */
public interface WSEndpointChannel extends EObject {
	/**
	 * Returns the value of the '<em><b>Ws Security</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.WSSecuritySpec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Security</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Security</em>' containment reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSEndpointChannel_WsSecurity()
	 * @model containment="true"
	 * @generated
	 */
	EList<WSSecuritySpec> getWsSecurity();

} // WSEndpointChannel
