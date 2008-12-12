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
 * A representation of the model object '<em><b>Service Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceBinding#getCodBinding <em>Cod Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceBinding()
 * @model abstract="true"
 * @generated
 */
public interface ServiceBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Cod Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cod Binding</em>' attribute.
	 * @see #setCodBinding(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceBinding_CodBinding()
	 * @model
	 * @generated
	 */
	String getCodBinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceBinding#getCodBinding <em>Cod Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Binding</em>' attribute.
	 * @see #getCodBinding()
	 * @generated
	 */
	void setCodBinding(String value);

} // ServiceBinding
