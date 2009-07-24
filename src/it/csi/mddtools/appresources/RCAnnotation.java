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
 * A representation of the model object '<em><b>RC Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Annotazione della risorsa
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.RCAnnotation#getSource <em>Source</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.RCAnnotation#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRCAnnotation()
 * @model
 * @generated
 */
public interface RCAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Serve per discriminare la fonte dell'annotazione.
	 * Attualmente � prevista la source "appresources".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRCAnnotation_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.RCAnnotation#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.appresources.RCAnnotationDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dettaglio di una annotazione. contiene il vero contenuto informativo dell'annotazione
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Details</em>' containment reference list.
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRCAnnotation_Details()
	 * @model containment="true"
	 * @generated
	 */
	EList<RCAnnotationDetail> getDetails();

} // RCAnnotation