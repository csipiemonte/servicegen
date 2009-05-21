/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.ServiceComponent#getImplCartridge <em>Impl Cartridge</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getServiceComponent()
 * @model abstract="true"
 * @generated
 */
public interface ServiceComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Impl Cartridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Cartridge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl Cartridge</em>' containment reference.
	 * @see #setImplCartridge(LogicImplCartridge)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getServiceComponent_ImplCartridge()
	 * @model containment="true"
	 *        annotation="GenModel documentation='[[ TODO - add documentation here ]]'"
	 * @generated
	 */
	LogicImplCartridge getImplCartridge();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.ServiceComponent#getImplCartridge <em>Impl Cartridge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Cartridge</em>' containment reference.
	 * @see #getImplCartridge()
	 * @generated
	 */
	void setImplCartridge(LogicImplCartridge value);

} // ServiceComponent
