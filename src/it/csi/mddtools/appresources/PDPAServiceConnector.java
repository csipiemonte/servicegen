/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.appresources;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDPA Service Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.PDPAServiceConnector#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.appresources.AppresourcesPackage#getPDPAServiceConnector()
 * @model
 * @generated
 */
public interface PDPAServiceConnector extends ResourceConnector {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(ServiceSelector)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getPDPAServiceConnector_Selector()
	 * @model containment="true"
	 * @generated
	 */
	ServiceSelector getSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.PDPAServiceConnector#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(ServiceSelector value);

} // PDPAServiceConnector
