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
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.ChannelSecurityLevelEnum;
import it.csi.mddtools.servicedef.ServiceBinding;
import it.csi.mddtools.servicedef.ServicedefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceBindingImpl#getCodBinding <em>Cod Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceBindingImpl#getChannelSecurityLevel <em>Channel Security Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServiceBindingImpl extends EObjectImpl implements ServiceBinding {
	/**
	 * The default value of the '{@link #getCodBinding() <em>Cod Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_BINDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodBinding() <em>Cod Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodBinding()
	 * @generated
	 * @ordered
	 */
	protected String codBinding = COD_BINDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannelSecurityLevel() <em>Channel Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final ChannelSecurityLevelEnum CHANNEL_SECURITY_LEVEL_EDEFAULT = ChannelSecurityLevelEnum.C0;

	/**
	 * The cached value of the '{@link #getChannelSecurityLevel() <em>Channel Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelSecurityLevel()
	 * @generated
	 * @ordered
	 */
	protected ChannelSecurityLevelEnum channelSecurityLevel = CHANNEL_SECURITY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.SERVICE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodBinding() {
		return codBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodBinding(String newCodBinding) {
		String oldCodBinding = codBinding;
		codBinding = newCodBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_BINDING__COD_BINDING, oldCodBinding, codBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelSecurityLevelEnum getChannelSecurityLevel() {
		return channelSecurityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelSecurityLevel(ChannelSecurityLevelEnum newChannelSecurityLevel) {
		ChannelSecurityLevelEnum oldChannelSecurityLevel = channelSecurityLevel;
		channelSecurityLevel = newChannelSecurityLevel == null ? CHANNEL_SECURITY_LEVEL_EDEFAULT : newChannelSecurityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_BINDING__CHANNEL_SECURITY_LEVEL, oldChannelSecurityLevel, channelSecurityLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicedefPackage.SERVICE_BINDING__COD_BINDING:
				return getCodBinding();
			case ServicedefPackage.SERVICE_BINDING__CHANNEL_SECURITY_LEVEL:
				return getChannelSecurityLevel();
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
			case ServicedefPackage.SERVICE_BINDING__COD_BINDING:
				setCodBinding((String)newValue);
				return;
			case ServicedefPackage.SERVICE_BINDING__CHANNEL_SECURITY_LEVEL:
				setChannelSecurityLevel((ChannelSecurityLevelEnum)newValue);
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
			case ServicedefPackage.SERVICE_BINDING__COD_BINDING:
				setCodBinding(COD_BINDING_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_BINDING__CHANNEL_SECURITY_LEVEL:
				setChannelSecurityLevel(CHANNEL_SECURITY_LEVEL_EDEFAULT);
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
			case ServicedefPackage.SERVICE_BINDING__COD_BINDING:
				return COD_BINDING_EDEFAULT == null ? codBinding != null : !COD_BINDING_EDEFAULT.equals(codBinding);
			case ServicedefPackage.SERVICE_BINDING__CHANNEL_SECURITY_LEVEL:
				return channelSecurityLevel != CHANNEL_SECURITY_LEVEL_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (codBinding: ");
		result.append(codBinding);
		result.append(", channelSecurityLevel: ");
		result.append(channelSecurityLevel);
		result.append(')');
		return result.toString();
	}

} //ServiceBindingImpl
