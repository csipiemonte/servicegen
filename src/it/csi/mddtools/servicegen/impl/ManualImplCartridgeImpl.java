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

import it.csi.mddtools.servicegen.ManualImplCartridge;
import it.csi.mddtools.servicegen.ServicegenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manual Impl Cartridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.impl.ManualImplCartridgeImpl#isUseInjectedPojo <em>Use Injected Pojo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManualImplCartridgeImpl extends LogicImplCartridgeImpl implements ManualImplCartridge {
	/**
	 * The default value of the '{@link #isUseInjectedPojo() <em>Use Injected Pojo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInjectedPojo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_INJECTED_POJO_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUseInjectedPojo() <em>Use Injected Pojo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInjectedPojo()
	 * @generated
	 * @ordered
	 */
	protected boolean useInjectedPojo = USE_INJECTED_POJO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualImplCartridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicegenPackage.Literals.MANUAL_IMPL_CARTRIDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseInjectedPojo() {
		return useInjectedPojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseInjectedPojo(boolean newUseInjectedPojo) {
		boolean oldUseInjectedPojo = useInjectedPojo;
		useInjectedPojo = newUseInjectedPojo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.MANUAL_IMPL_CARTRIDGE__USE_INJECTED_POJO, oldUseInjectedPojo, useInjectedPojo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicegenPackage.MANUAL_IMPL_CARTRIDGE__USE_INJECTED_POJO:
				return isUseInjectedPojo();
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
			case ServicegenPackage.MANUAL_IMPL_CARTRIDGE__USE_INJECTED_POJO:
				setUseInjectedPojo((Boolean)newValue);
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
			case ServicegenPackage.MANUAL_IMPL_CARTRIDGE__USE_INJECTED_POJO:
				setUseInjectedPojo(USE_INJECTED_POJO_EDEFAULT);
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
			case ServicegenPackage.MANUAL_IMPL_CARTRIDGE__USE_INJECTED_POJO:
				return useInjectedPojo != USE_INJECTED_POJO_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (useInjectedPojo: ");
		result.append(useInjectedPojo);
		result.append(')');
		return result.toString();
	}

} //ManualImplCartridgeImpl
