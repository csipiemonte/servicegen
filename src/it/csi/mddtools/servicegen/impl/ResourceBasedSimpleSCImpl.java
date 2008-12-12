/**
 * <copyright>
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
import org.eclipse.emf.common.notify.NotificationChain;

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
	 * The cached value of the '{@link #getResourceSet() <em>Resource Set</em>}' containment reference.
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
		return resourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceSet(ResourceSet newResourceSet, NotificationChain msgs) {
		ResourceSet oldResourceSet = resourceSet;
		resourceSet = newResourceSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET, oldResourceSet, newResourceSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSet(ResourceSet newResourceSet) {
		if (newResourceSet != resourceSet) {
			NotificationChain msgs = null;
			if (resourceSet != null)
				msgs = ((InternalEObject)resourceSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET, null, msgs);
			if (newResourceSet != null)
				msgs = ((InternalEObject)newResourceSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET, null, msgs);
			msgs = basicSetResourceSet(newResourceSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET, newResourceSet, newResourceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET:
				return basicSetResourceSet(null, msgs);
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
			case ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET:
				return getResourceSet();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceBasedSC.class) {
			switch (derivedFeatureID) {
				case ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET: return ServicegenPackage.RESOURCE_BASED_SC__RESOURCE_SET;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ResourceBasedSC.class) {
			switch (baseFeatureID) {
				case ServicegenPackage.RESOURCE_BASED_SC__RESOURCE_SET: return ServicegenPackage.RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ResourceBasedSimpleSCImpl
