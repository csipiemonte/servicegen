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
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.ServiceComponent#getImplCartridge <em>Impl Cartridge</em>}</li>
 * </ul>
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
