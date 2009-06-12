/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.appresources;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.ResourceConnector#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ResourceConnector#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.appresources.AppresourcesPackage#getResourceConnector()
 * @model abstract="true"
 * @generated
 */
public interface ResourceConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getResourceConnector_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ResourceConnector#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.appresources.RCAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getResourceConnector_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RCAnnotation> getAnnotations();

} // ResourceConnector
