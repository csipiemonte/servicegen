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

import it.csi.mddtools.servicegen.LogicImplCartridge;
import it.csi.mddtools.servicegen.ServiceComponent;
import it.csi.mddtools.servicegen.ServicegenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.impl.ServiceComponentImpl#getImplCartridge <em>Impl Cartridge</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceComponentImpl extends EObjectImpl implements ServiceComponent {
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
	protected ServiceComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicegenPackage.Literals.SERVICE_COMPONENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicegenPackage.SERVICE_COMPONENT__IMPL_CARTRIDGE, oldImplCartridge, newImplCartridge);
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
				msgs = ((InternalEObject)implCartridge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.SERVICE_COMPONENT__IMPL_CARTRIDGE, null, msgs);
			if (newImplCartridge != null)
				msgs = ((InternalEObject)newImplCartridge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.SERVICE_COMPONENT__IMPL_CARTRIDGE, null, msgs);
			msgs = basicSetImplCartridge(newImplCartridge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SERVICE_COMPONENT__IMPL_CARTRIDGE, newImplCartridge, newImplCartridge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicegenPackage.SERVICE_COMPONENT__IMPL_CARTRIDGE:
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
			case ServicegenPackage.SERVICE_COMPONENT__IMPL_CARTRIDGE:
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
			case ServicegenPackage.SERVICE_COMPONENT__IMPL_CARTRIDGE:
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
			case ServicegenPackage.SERVICE_COMPONENT__IMPL_CARTRIDGE:
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
			case ServicegenPackage.SERVICE_COMPONENT__IMPL_CARTRIDGE:
				return implCartridge != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceComponentImpl
