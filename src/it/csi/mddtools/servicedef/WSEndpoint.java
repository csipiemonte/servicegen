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
 *   <li>{@link it.csi.mddtools.servicedef.WSEndpoint#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.WSEndpoint#getInChannel <em>In Channel</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.WSEndpoint#getOutChannel <em>Out Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSEndpoint()
 * @model
 * @generated
 */
public interface WSEndpoint extends EObject {
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

	/**
	 * Returns the value of the '<em><b>In Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Channel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Channel</em>' containment reference.
	 * @see #setInChannel(WSEndpointChannel)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSEndpoint_InChannel()
	 * @model containment="true"
	 * @generated
	 */
	WSEndpointChannel getInChannel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.WSEndpoint#getInChannel <em>In Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Channel</em>' containment reference.
	 * @see #getInChannel()
	 * @generated
	 */
	void setInChannel(WSEndpointChannel value);

	/**
	 * Returns the value of the '<em><b>Out Channel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Channel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Channel</em>' containment reference.
	 * @see #setOutChannel(WSEndpointChannel)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSEndpoint_OutChannel()
	 * @model containment="true"
	 * @generated
	 */
	WSEndpointChannel getOutChannel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.WSEndpoint#getOutChannel <em>Out Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Channel</em>' containment reference.
	 * @see #getOutChannel()
	 * @generated
	 */
	void setOutChannel(WSEndpointChannel value);

} // WSEndpoint
