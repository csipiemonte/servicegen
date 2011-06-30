/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import it.csi.mddtools.servicedef.ServiceDef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Impl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.ServiceImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.ServiceImpl#getServiceComponent <em>Service Component</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.ServiceImpl#getImplCartridge <em>Impl Cartridge</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getServiceImpl()
 * @model
 * @generated
 */
public interface ServiceImpl extends EObject {
	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provides</em>' reference.
	 * @see #setProvides(ServiceDef)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getServiceImpl_Provides()
	 * @model
	 * @generated
	 */
	ServiceDef getProvides();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.ServiceImpl#getProvides <em>Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides</em>' reference.
	 * @see #getProvides()
	 * @generated
	 */
	void setProvides(ServiceDef value);

	/**
	 * Returns the value of the '<em><b>Service Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Component</em>' containment reference.
	 * @see #setServiceComponent(ServiceComponent)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getServiceImpl_ServiceComponent()
	 * @model containment="true"
	 * @generated
	 */
	ServiceComponent getServiceComponent();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.ServiceImpl#getServiceComponent <em>Service Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Component</em>' containment reference.
	 * @see #getServiceComponent()
	 * @generated
	 */
	void setServiceComponent(ServiceComponent value);

	/**
	 * Returns the value of the '<em><b>Impl Cartridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl Cartridge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Impl Cartridge</em>' containment reference.
	 * @see #setImplCartridge(LogicImplCartridge)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getServiceImpl_ImplCartridge()
	 * @model containment="true"
	 * @generated
	 */
	LogicImplCartridge getImplCartridge();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.ServiceImpl#getImplCartridge <em>Impl Cartridge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl Cartridge</em>' containment reference.
	 * @see #getImplCartridge()
	 * @generated
	 */
	void setImplCartridge(LogicImplCartridge value);

} // ServiceImpl
