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

import it.csi.mddtools.appresources.ResourceSet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Based Simple SC</b></em>'.
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
 *   <li>{@link it.csi.mddtools.servicegen.ResourceBasedSimpleSC#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getResourceBasedSimpleSC()
 * @model
 * @generated
 */
public interface ResourceBasedSimpleSC extends SimpleSC, ResourceBasedSC {

	/**
	 * Returns the value of the '<em><b>Resource Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Set</em>' reference.
	 * @see #setResourceSet(ResourceSet)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getResourceBasedSimpleSC_ResourceSet()
	 * @model
	 * @generated
	 */
	ResourceSet getResourceSet();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.ResourceBasedSimpleSC#getResourceSet <em>Resource Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set</em>' reference.
	 * @see #getResourceSet()
	 * @generated
	 */
	void setResourceSet(ResourceSet value);
} // ResourceBasedSimpleSC
