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
package it.csi.mddtools.appresources.impl;

import it.csi.mddtools.appresources.AppresourcesPackage;
import it.csi.mddtools.appresources.RPCWebServiceConnector;
import it.csi.mddtools.servicedef.WSEndpoint;
import it.csi.mddtools.appresources.ServiceSelector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPC Web Service Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.impl.RPCWebServiceConnectorImpl#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RPCWebServiceConnectorImpl extends ServiceConnectorImpl implements RPCWebServiceConnector {
	/**
	 * The cached value of the '{@link #getEndpoint() <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoint()
	 * @generated
	 * @ordered
	 */
	protected WSEndpoint endpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPCWebServiceConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppresourcesPackage.Literals.RPC_WEB_SERVICE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSEndpoint getEndpoint() {
		if (endpoint != null && endpoint.eIsProxy()) {
			InternalEObject oldEndpoint = (InternalEObject)endpoint;
			endpoint = (WSEndpoint)eResolveProxy(oldEndpoint);
			if (endpoint != oldEndpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppresourcesPackage.RPC_WEB_SERVICE_CONNECTOR__ENDPOINT, oldEndpoint, endpoint));
			}
		}
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSEndpoint basicGetEndpoint() {
		return endpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(WSEndpoint newEndpoint) {
		WSEndpoint oldEndpoint = endpoint;
		endpoint = newEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.RPC_WEB_SERVICE_CONNECTOR__ENDPOINT, oldEndpoint, endpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppresourcesPackage.RPC_WEB_SERVICE_CONNECTOR__ENDPOINT:
				if (resolve) return getEndpoint();
				return basicGetEndpoint();
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
			case AppresourcesPackage.RPC_WEB_SERVICE_CONNECTOR__ENDPOINT:
				setEndpoint((WSEndpoint)newValue);
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
			case AppresourcesPackage.RPC_WEB_SERVICE_CONNECTOR__ENDPOINT:
				setEndpoint((WSEndpoint)null);
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
			case AppresourcesPackage.RPC_WEB_SERVICE_CONNECTOR__ENDPOINT:
				return endpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //RPCWebServiceConnectorImpl
