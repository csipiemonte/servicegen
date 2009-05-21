/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.appresources.impl;

import it.csi.mddtools.appresources.AppresourcesPackage;
import it.csi.mddtools.appresources.ServiceConnector;
import it.csi.mddtools.appresources.ServiceSelector;

import it.csi.mddtools.servicedef.ServiceBinding;
import it.csi.mddtools.servicedef.ServiceDef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceConnectorImpl#getServiceDef <em>Service Def</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceConnectorImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceConnectorImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ServiceConnectorImpl extends ResourceConnectorImpl implements ServiceConnector {
	/**
	 * The cached value of the '{@link #getServiceDef() <em>Service Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDef()
	 * @generated
	 * @ordered
	 */
	protected ServiceDef serviceDef;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected ServiceBinding binding;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected ServiceSelector selector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppresourcesPackage.Literals.SERVICE_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDef getServiceDef() {
		if (serviceDef != null && serviceDef.eIsProxy()) {
			InternalEObject oldServiceDef = (InternalEObject)serviceDef;
			serviceDef = (ServiceDef)eResolveProxy(oldServiceDef);
			if (serviceDef != oldServiceDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppresourcesPackage.SERVICE_CONNECTOR__SERVICE_DEF, oldServiceDef, serviceDef));
			}
		}
		return serviceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDef basicGetServiceDef() {
		return serviceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDef(ServiceDef newServiceDef) {
		ServiceDef oldServiceDef = serviceDef;
		serviceDef = newServiceDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_CONNECTOR__SERVICE_DEF, oldServiceDef, serviceDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBinding getBinding() {
		if (binding != null && binding.eIsProxy()) {
			InternalEObject oldBinding = (InternalEObject)binding;
			binding = (ServiceBinding)eResolveProxy(oldBinding);
			if (binding != oldBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppresourcesPackage.SERVICE_CONNECTOR__BINDING, oldBinding, binding));
			}
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceBinding basicGetBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinding(ServiceBinding newBinding) {
		ServiceBinding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_CONNECTOR__BINDING, oldBinding, binding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSelector getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelector(ServiceSelector newSelector, NotificationChain msgs) {
		ServiceSelector oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_CONNECTOR__SELECTOR, oldSelector, newSelector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(ServiceSelector newSelector) {
		if (newSelector != selector) {
			NotificationChain msgs = null;
			if (selector != null)
				msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppresourcesPackage.SERVICE_CONNECTOR__SELECTOR, null, msgs);
			if (newSelector != null)
				msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppresourcesPackage.SERVICE_CONNECTOR__SELECTOR, null, msgs);
			msgs = basicSetSelector(newSelector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_CONNECTOR__SELECTOR, newSelector, newSelector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppresourcesPackage.SERVICE_CONNECTOR__SELECTOR:
				return basicSetSelector(null, msgs);
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
			case AppresourcesPackage.SERVICE_CONNECTOR__SERVICE_DEF:
				if (resolve) return getServiceDef();
				return basicGetServiceDef();
			case AppresourcesPackage.SERVICE_CONNECTOR__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
			case AppresourcesPackage.SERVICE_CONNECTOR__SELECTOR:
				return getSelector();
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
			case AppresourcesPackage.SERVICE_CONNECTOR__SERVICE_DEF:
				setServiceDef((ServiceDef)newValue);
				return;
			case AppresourcesPackage.SERVICE_CONNECTOR__BINDING:
				setBinding((ServiceBinding)newValue);
				return;
			case AppresourcesPackage.SERVICE_CONNECTOR__SELECTOR:
				setSelector((ServiceSelector)newValue);
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
			case AppresourcesPackage.SERVICE_CONNECTOR__SERVICE_DEF:
				setServiceDef((ServiceDef)null);
				return;
			case AppresourcesPackage.SERVICE_CONNECTOR__BINDING:
				setBinding((ServiceBinding)null);
				return;
			case AppresourcesPackage.SERVICE_CONNECTOR__SELECTOR:
				setSelector((ServiceSelector)null);
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
			case AppresourcesPackage.SERVICE_CONNECTOR__SERVICE_DEF:
				return serviceDef != null;
			case AppresourcesPackage.SERVICE_CONNECTOR__BINDING:
				return binding != null;
			case AppresourcesPackage.SERVICE_CONNECTOR__SELECTOR:
				return selector != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceConnectorImpl
