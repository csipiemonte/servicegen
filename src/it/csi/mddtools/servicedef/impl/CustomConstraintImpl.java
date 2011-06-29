/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.CustomConstraint;
import it.csi.mddtools.servicedef.ServicedefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.CustomConstraintImpl#getCheckMethodName <em>Check Method Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomConstraintImpl extends SimpleValueConstraintImpl implements CustomConstraint {
	/**
	 * The default value of the '{@link #getCheckMethodName() <em>Check Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckMethodName() <em>Check Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckMethodName()
	 * @generated
	 * @ordered
	 */
	protected String checkMethodName = CHECK_METHOD_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.CUSTOM_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckMethodName() {
		return checkMethodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckMethodName(String newCheckMethodName) {
		String oldCheckMethodName = checkMethodName;
		checkMethodName = newCheckMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.CUSTOM_CONSTRAINT__CHECK_METHOD_NAME, oldCheckMethodName, checkMethodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicedefPackage.CUSTOM_CONSTRAINT__CHECK_METHOD_NAME:
				return getCheckMethodName();
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
			case ServicedefPackage.CUSTOM_CONSTRAINT__CHECK_METHOD_NAME:
				setCheckMethodName((String)newValue);
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
			case ServicedefPackage.CUSTOM_CONSTRAINT__CHECK_METHOD_NAME:
				setCheckMethodName(CHECK_METHOD_NAME_EDEFAULT);
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
			case ServicedefPackage.CUSTOM_CONSTRAINT__CHECK_METHOD_NAME:
				return CHECK_METHOD_NAME_EDEFAULT == null ? checkMethodName != null : !CHECK_METHOD_NAME_EDEFAULT.equals(checkMethodName);
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
		result.append(" (checkMethodName: ");
		result.append(checkMethodName);
		result.append(')');
		return result.toString();
	}

} //CustomConstraintImpl
