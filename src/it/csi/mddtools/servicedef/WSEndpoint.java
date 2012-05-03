/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WS Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.WSEndpoint#getWsSecurity <em>Ws Security</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.WSEndpoint#getCode <em>Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSEndpoint()
 * @model
 * @generated
 */
public interface WSEndpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Ws Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws Security</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws Security</em>' containment reference.
	 * @see #setWsSecurity(WSSecuritySpec)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSEndpoint_WsSecurity()
	 * @model containment="true"
	 * @generated
	 */
	WSSecuritySpec getWsSecurity();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.WSEndpoint#getWsSecurity <em>Ws Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws Security</em>' containment reference.
	 * @see #getWsSecurity()
	 * @generated
	 */
	void setWsSecurity(WSSecuritySpec value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSEndpoint_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.WSEndpoint#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // WSEndpoint
