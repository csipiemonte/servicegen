/**
 */
package it.csi.mddtools.servicedef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.SDDocumentation#getDoc <em>Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getSDDocumentation()
 * @model
 * @generated
 */
public interface SDDocumentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Doc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc</em>' attribute.
	 * @see #setDoc(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getSDDocumentation_Doc()
	 * @model
	 * @generated
	 */
	String getDoc();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.SDDocumentation#getDoc <em>Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc</em>' attribute.
	 * @see #getDoc()
	 * @generated
	 */
	void setDoc(String value);

} // SDDocumentation
