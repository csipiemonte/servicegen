/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.appresources;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RC Annotation Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.RCAnnotationDetail#getKey <em>Key</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.RCAnnotationDetail#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRCAnnotationDetail()
 * @model
 * @generated
 */
public interface RCAnnotationDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRCAnnotationDetail_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.RCAnnotationDetail#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRCAnnotationDetail_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.RCAnnotationDetail#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // RCAnnotationDetail
