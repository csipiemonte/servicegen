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

import it.csi.mddtools.servicedef.ServiceDef;

import it.csi.mddtools.servicegen.LogicImplCartridge;
import it.csi.mddtools.servicegen.ServiceComponent;
import it.csi.mddtools.servicegen.ServiceImpl;
import it.csi.mddtools.servicegen.ServicegenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Impl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.impl.ServiceImplImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.ServiceImplImpl#getServiceComponent <em>Service Component</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.ServiceImplImpl#getImplCartridge <em>Impl Cartridge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImplImpl extends EObjectImpl implements ServiceImpl {
	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected ServiceDef provides;

	/**
	 * The cached value of the '{@link #getServiceComponent() <em>Service Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceComponent()
	 * @generated
	 * @ordered
	 */
	protected ServiceComponent serviceComponent;
	/**
	 * The cached value of the '{@link #getImplCartridge() <em>Impl Cartridge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplCartridge()
	 * @generated
	 * @ordered
	 */
	protected LogicImplCartridge implCartridge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImplImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicegenPackage.Literals.SERVICE_IMPL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDef getProvides() {
		if (provides != null && provides.eIsProxy()) {
			InternalEObject oldProvides = (InternalEObject)provides;
			provides = (ServiceDef)eResolveProxy(oldProvides);
			if (provides != oldProvides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicegenPackage.SERVICE_IMPL__PROVIDES, oldProvides, provides));
			}
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDef basicGetProvides() {
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvides(ServiceDef newProvides) {
		ServiceDef oldProvides = provides;
		provides = newProvides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SERVICE_IMPL__PROVIDES, oldProvides, provides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceComponent getServiceComponent() {
		return serviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceComponent(ServiceComponent newServiceComponent, NotificationChain msgs) {
		ServiceComponent oldServiceComponent = serviceComponent;
		serviceComponent = newServiceComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicegenPackage.SERVICE_IMPL__SERVICE_COMPONENT, oldServiceComponent, newServiceComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceComponent(ServiceComponent newServiceComponent) {
		if (newServiceComponent != serviceComponent) {
			NotificationChain msgs = null;
			if (serviceComponent != null)
				msgs = ((InternalEObject)serviceComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.SERVICE_IMPL__SERVICE_COMPONENT, null, msgs);
			if (newServiceComponent != null)
				msgs = ((InternalEObject)newServiceComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.SERVICE_IMPL__SERVICE_COMPONENT, null, msgs);
			msgs = basicSetServiceComponent(newServiceComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SERVICE_IMPL__SERVICE_COMPONENT, newServiceComponent, newServiceComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicImplCartridge getImplCartridge() {
		return implCartridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplCartridge(LogicImplCartridge newImplCartridge, NotificationChain msgs) {
		LogicImplCartridge oldImplCartridge = implCartridge;
		implCartridge = newImplCartridge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicegenPackage.SERVICE_IMPL__IMPL_CARTRIDGE, oldImplCartridge, newImplCartridge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplCartridge(LogicImplCartridge newImplCartridge) {
		if (newImplCartridge != implCartridge) {
			NotificationChain msgs = null;
			if (implCartridge != null)
				msgs = ((InternalEObject)implCartridge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.SERVICE_IMPL__IMPL_CARTRIDGE, null, msgs);
			if (newImplCartridge != null)
				msgs = ((InternalEObject)newImplCartridge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.SERVICE_IMPL__IMPL_CARTRIDGE, null, msgs);
			msgs = basicSetImplCartridge(newImplCartridge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SERVICE_IMPL__IMPL_CARTRIDGE, newImplCartridge, newImplCartridge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicegenPackage.SERVICE_IMPL__SERVICE_COMPONENT:
				return basicSetServiceComponent(null, msgs);
			case ServicegenPackage.SERVICE_IMPL__IMPL_CARTRIDGE:
				return basicSetImplCartridge(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicegenPackage.SERVICE_IMPL__PROVIDES:
				if (resolve) return getProvides();
				return basicGetProvides();
			case ServicegenPackage.SERVICE_IMPL__SERVICE_COMPONENT:
				return getServiceComponent();
			case ServicegenPackage.SERVICE_IMPL__IMPL_CARTRIDGE:
				return getImplCartridge();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicegenPackage.SERVICE_IMPL__PROVIDES:
				setProvides((ServiceDef)newValue);
				return;
			case ServicegenPackage.SERVICE_IMPL__SERVICE_COMPONENT:
				setServiceComponent((ServiceComponent)newValue);
				return;
			case ServicegenPackage.SERVICE_IMPL__IMPL_CARTRIDGE:
				setImplCartridge((LogicImplCartridge)newValue);
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
			case ServicegenPackage.SERVICE_IMPL__PROVIDES:
				setProvides((ServiceDef)null);
				return;
			case ServicegenPackage.SERVICE_IMPL__SERVICE_COMPONENT:
				setServiceComponent((ServiceComponent)null);
				return;
			case ServicegenPackage.SERVICE_IMPL__IMPL_CARTRIDGE:
				setImplCartridge((LogicImplCartridge)null);
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
			case ServicegenPackage.SERVICE_IMPL__PROVIDES:
				return provides != null;
			case ServicegenPackage.SERVICE_IMPL__SERVICE_COMPONENT:
				return serviceComponent != null;
			case ServicegenPackage.SERVICE_IMPL__IMPL_CARTRIDGE:
				return implCartridge != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceImplImpl
