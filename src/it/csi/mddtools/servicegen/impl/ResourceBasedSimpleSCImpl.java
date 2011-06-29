/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen.impl;

import it.csi.mddtools.appresources.ResourceSet;

import it.csi.mddtools.servicegen.ResourceBasedSC;
import it.csi.mddtools.servicegen.ResourceBasedSimpleSC;
import it.csi.mddtools.servicegen.ServicegenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Based Simple SC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.impl.ResourceBasedSimpleSCImpl#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceBasedSimpleSCImpl extends SimpleSCImpl implements ResourceBasedSimpleSC {
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
	protected ResourceBasedSimpleSCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicegenPackage.Literals.RESOURCE_BASED_SIMPLE_SC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET, oldResourceSet, resourceSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET, oldResourceSet, resourceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET:
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
			case ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET:
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
			case ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET:
				return resourceSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceBasedSimpleSCImpl
