/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.ContinuousRangeConstraint;
import it.csi.mddtools.servicedef.ServicedefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ContinuousRangeConstraintImpl#getLowerbound <em>Lowerbound</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ContinuousRangeConstraintImpl#getUpperbound <em>Upperbound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuousRangeConstraintImpl extends ValueRangeConstraintImpl implements ContinuousRangeConstraint {
	/**
	 * The default value of the '{@link #getLowerbound() <em>Lowerbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerbound()
	 * @generated
	 * @ordered
	 */
	protected static final String LOWERBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLowerbound() <em>Lowerbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerbound()
	 * @generated
	 * @ordered
	 */
	protected String lowerbound = LOWERBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperbound() <em>Upperbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperbound()
	 * @generated
	 * @ordered
	 */
	protected static final String UPPERBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpperbound() <em>Upperbound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperbound()
	 * @generated
	 * @ordered
	 */
	protected String upperbound = UPPERBOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousRangeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.CONTINUOUS_RANGE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLowerbound() {
		return lowerbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerbound(String newLowerbound) {
		String oldLowerbound = lowerbound;
		lowerbound = newLowerbound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__LOWERBOUND, oldLowerbound, lowerbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpperbound() {
		return upperbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperbound(String newUpperbound) {
		String oldUpperbound = upperbound;
		upperbound = newUpperbound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__UPPERBOUND, oldUpperbound, upperbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__LOWERBOUND:
				return getLowerbound();
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__UPPERBOUND:
				return getUpperbound();
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
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__LOWERBOUND:
				setLowerbound((String)newValue);
				return;
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__UPPERBOUND:
				setUpperbound((String)newValue);
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
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__LOWERBOUND:
				setLowerbound(LOWERBOUND_EDEFAULT);
				return;
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__UPPERBOUND:
				setUpperbound(UPPERBOUND_EDEFAULT);
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
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__LOWERBOUND:
				return LOWERBOUND_EDEFAULT == null ? lowerbound != null : !LOWERBOUND_EDEFAULT.equals(lowerbound);
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT__UPPERBOUND:
				return UPPERBOUND_EDEFAULT == null ? upperbound != null : !UPPERBOUND_EDEFAULT.equals(upperbound);
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
		result.append(" (lowerbound: ");
		result.append(lowerbound);
		result.append(", upperbound: ");
		result.append(upperbound);
		result.append(')');
		return result.toString();
	}

} //ContinuousRangeConstraintImpl