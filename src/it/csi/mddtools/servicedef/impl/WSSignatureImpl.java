/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.WSSignature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WS Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.WSSignatureImpl#isInputMustBeSigned <em>Input Must Be Signed</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.WSSignatureImpl#isSignOutput <em>Sign Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WSSignatureImpl extends WSSecuritySpecImpl implements WSSignature {
	/**
	 * The default value of the '{@link #isInputMustBeSigned() <em>Input Must Be Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputMustBeSigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INPUT_MUST_BE_SIGNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInputMustBeSigned() <em>Input Must Be Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputMustBeSigned()
	 * @generated
	 * @ordered
	 */
	protected boolean inputMustBeSigned = INPUT_MUST_BE_SIGNED_EDEFAULT;

	/**
	 * The default value of the '{@link #isSignOutput() <em>Sign Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGN_OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSignOutput() <em>Sign Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean signOutput = SIGN_OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WSSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.WS_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInputMustBeSigned() {
		return inputMustBeSigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputMustBeSigned(boolean newInputMustBeSigned) {
		boolean oldInputMustBeSigned = inputMustBeSigned;
		inputMustBeSigned = newInputMustBeSigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.WS_SIGNATURE__INPUT_MUST_BE_SIGNED, oldInputMustBeSigned, inputMustBeSigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSignOutput() {
		return signOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignOutput(boolean newSignOutput) {
		boolean oldSignOutput = signOutput;
		signOutput = newSignOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.WS_SIGNATURE__SIGN_OUTPUT, oldSignOutput, signOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicedefPackage.WS_SIGNATURE__INPUT_MUST_BE_SIGNED:
				return isInputMustBeSigned();
			case ServicedefPackage.WS_SIGNATURE__SIGN_OUTPUT:
				return isSignOutput();
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
			case ServicedefPackage.WS_SIGNATURE__INPUT_MUST_BE_SIGNED:
				setInputMustBeSigned((Boolean)newValue);
				return;
			case ServicedefPackage.WS_SIGNATURE__SIGN_OUTPUT:
				setSignOutput((Boolean)newValue);
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
			case ServicedefPackage.WS_SIGNATURE__INPUT_MUST_BE_SIGNED:
				setInputMustBeSigned(INPUT_MUST_BE_SIGNED_EDEFAULT);
				return;
			case ServicedefPackage.WS_SIGNATURE__SIGN_OUTPUT:
				setSignOutput(SIGN_OUTPUT_EDEFAULT);
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
			case ServicedefPackage.WS_SIGNATURE__INPUT_MUST_BE_SIGNED:
				return inputMustBeSigned != INPUT_MUST_BE_SIGNED_EDEFAULT;
			case ServicedefPackage.WS_SIGNATURE__SIGN_OUTPUT:
				return signOutput != SIGN_OUTPUT_EDEFAULT;
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
		result.append(" (inputMustBeSigned: ");
		result.append(inputMustBeSigned);
		result.append(", signOutput: ");
		result.append(signOutput);
		result.append(')');
		return result.toString();
	}

} //WSSignatureImpl
