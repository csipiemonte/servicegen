/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.WSEndpointChannel;
import it.csi.mddtools.servicedef.WSSecuritySpec;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WS Endpoint Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.WSEndpointChannelImpl#getWsSecurity <em>Ws Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WSEndpointChannelImpl extends EObjectImpl implements WSEndpointChannel {
	/**
	 * The cached value of the '{@link #getWsSecurity() <em>Ws Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWsSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<WSSecuritySpec> wsSecurity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WSEndpointChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.WS_ENDPOINT_CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WSSecuritySpec> getWsSecurity() {
		if (wsSecurity == null) {
			wsSecurity = new EObjectContainmentEList<WSSecuritySpec>(WSSecuritySpec.class, this, ServicedefPackage.WS_ENDPOINT_CHANNEL__WS_SECURITY);
		}
		return wsSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicedefPackage.WS_ENDPOINT_CHANNEL__WS_SECURITY:
				return ((InternalEList<?>)getWsSecurity()).basicRemove(otherEnd, msgs);
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
			case ServicedefPackage.WS_ENDPOINT_CHANNEL__WS_SECURITY:
				return getWsSecurity();
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
			case ServicedefPackage.WS_ENDPOINT_CHANNEL__WS_SECURITY:
				getWsSecurity().clear();
				getWsSecurity().addAll((Collection<? extends WSSecuritySpec>)newValue);
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
			case ServicedefPackage.WS_ENDPOINT_CHANNEL__WS_SECURITY:
				getWsSecurity().clear();
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
			case ServicedefPackage.WS_ENDPOINT_CHANNEL__WS_SECURITY:
				return wsSecurity != null && !wsSecurity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WSEndpointChannelImpl
