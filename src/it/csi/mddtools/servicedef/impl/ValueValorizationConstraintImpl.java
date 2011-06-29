/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.ValueValorizationConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Valorization Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ValueValorizationConstraintImpl#isMustNotBeNull <em>Must Not Be Null</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueValorizationConstraintImpl extends SimpleValueConstraintImpl implements ValueValorizationConstraint {
	/**
	 * The default value of the '{@link #isMustNotBeNull() <em>Must Not Be Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustNotBeNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_NOT_BE_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustNotBeNull() <em>Must Not Be Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustNotBeNull()
	 * @generated
	 * @ordered
	 */
	protected boolean mustNotBeNull = MUST_NOT_BE_NULL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueValorizationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.VALUE_VALORIZATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustNotBeNull() {
		return mustNotBeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustNotBeNull(boolean newMustNotBeNull) {
		boolean oldMustNotBeNull = mustNotBeNull;
		mustNotBeNull = newMustNotBeNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.VALUE_VALORIZATION_CONSTRAINT__MUST_NOT_BE_NULL, oldMustNotBeNull, mustNotBeNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicedefPackage.VALUE_VALORIZATION_CONSTRAINT__MUST_NOT_BE_NULL:
				return isMustNotBeNull() ? Boolean.TRUE : Boolean.FALSE;
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
			case ServicedefPackage.VALUE_VALORIZATION_CONSTRAINT__MUST_NOT_BE_NULL:
				setMustNotBeNull(((Boolean)newValue).booleanValue());
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
			case ServicedefPackage.VALUE_VALORIZATION_CONSTRAINT__MUST_NOT_BE_NULL:
				setMustNotBeNull(MUST_NOT_BE_NULL_EDEFAULT);
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
			case ServicedefPackage.VALUE_VALORIZATION_CONSTRAINT__MUST_NOT_BE_NULL:
				return mustNotBeNull != MUST_NOT_BE_NULL_EDEFAULT;
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
		result.append(" (mustNotBeNull: ");
		result.append(mustNotBeNull);
		result.append(')');
		return result.toString();
	}

} //ValueValorizationConstraintImpl
