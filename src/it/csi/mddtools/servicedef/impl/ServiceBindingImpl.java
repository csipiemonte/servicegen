/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.impl;

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
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceBindingImpl#getCodBinding <em>Cod Binding</em>}</li>
 * </ul>
 * </p>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicedefPackage.SERVICE_BINDING__COD_BINDING:
				return getCodBinding();
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
		result.append(')');
		return result.toString();
	}

} //ServiceBindingImpl
