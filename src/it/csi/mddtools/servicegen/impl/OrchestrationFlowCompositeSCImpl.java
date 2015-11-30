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
package it.csi.mddtools.servicegen.impl;

import it.csi.mddtools.appresources.ResourceSet;

import it.csi.mddtools.servicegen.FlowBasedSC;
import it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC;
import it.csi.mddtools.servicegen.ResourceBasedSC;
import it.csi.mddtools.servicegen.ServicegenPackage;

import it.csi.mddtools.svcorch.Orchestration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orchestration Flow Composite SC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.impl.OrchestrationFlowCompositeSCImpl#getOrchestrations <em>Orchestrations</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.OrchestrationFlowCompositeSCImpl#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrchestrationFlowCompositeSCImpl extends CompositeSCImpl implements OrchestrationFlowCompositeSC {
	/**
	 * The cached value of the '{@link #getOrchestrations() <em>Orchestrations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrchestrations()
	 * @generated
	 * @ordered
	 */
	protected EList<Orchestration> orchestrations;

	/**
	 * The cached value of the '{@link #getResourceSet() <em>Resource Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSet()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet resourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrchestrationFlowCompositeSCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicegenPackage.Literals.ORCHESTRATION_FLOW_COMPOSITE_SC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getResourceSet() {
		if (resourceSet != null && resourceSet.eIsProxy()) {
			InternalEObject oldResourceSet = (InternalEObject)resourceSet;
			resourceSet = (ResourceSet)eResolveProxy(oldResourceSet);
			if (resourceSet != oldResourceSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__RESOURCE_SET, oldResourceSet, resourceSet));
			}
		}
		return resourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet basicGetResourceSet() {
		return resourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSet(ResourceSet newResourceSet) {
		ResourceSet oldResourceSet = resourceSet;
		resourceSet = newResourceSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__RESOURCE_SET, oldResourceSet, resourceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Orchestration> getOrchestrations() {
		if (orchestrations == null) {
			orchestrations = new EObjectResolvingEList<Orchestration>(Orchestration.class, this, ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__ORCHESTRATIONS);
		}
		return orchestrations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__ORCHESTRATIONS:
				return getOrchestrations();
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__RESOURCE_SET:
				if (resolve) return getResourceSet();
				return basicGetResourceSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__ORCHESTRATIONS:
				getOrchestrations().clear();
				getOrchestrations().addAll((Collection<? extends Orchestration>)newValue);
				return;
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__RESOURCE_SET:
				setResourceSet((ResourceSet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__ORCHESTRATIONS:
				getOrchestrations().clear();
				return;
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__RESOURCE_SET:
				setResourceSet((ResourceSet)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__ORCHESTRATIONS:
				return orchestrations != null && !orchestrations.isEmpty();
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC__RESOURCE_SET:
				return resourceSet != null;
		}
		return super.eIsSet(featureID);
	}

} //OrchestrationFlowCompositeSCImpl
