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
import it.csi.mddtools.svcorch.Orchestration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestration Flow Composite SC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC#getOrchestrations <em>Orchestrations</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getOrchestrationFlowCompositeSC()
 * @model
 * @generated
 */
public interface OrchestrationFlowCompositeSC extends CompositeSC, FlowBasedSC, ResourceBasedSC {
	/**
	 * Returns the value of the '<em><b>Orchestrations</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.svcorch.Orchestration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orchestrations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orchestrations</em>' reference list.
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getOrchestrationFlowCompositeSC_Orchestrations()
	 * @model
	 * @generated
	 */
	EList<Orchestration> getOrchestrations();

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
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getOrchestrationFlowCompositeSC_ResourceSet()
	 * @model
	 * @generated
	 */
	ResourceSet getResourceSet();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC#getResourceSet <em>Resource Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set</em>' reference.
	 * @see #getResourceSet()
	 * @generated
	 */
	void setResourceSet(ResourceSet value);

} // OrchestrationFlowCompositeSC
