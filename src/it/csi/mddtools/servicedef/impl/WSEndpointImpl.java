/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.WSEndpoint;
import it.csi.mddtools.servicedef.WSEndpointChannel;
import it.csi.mddtools.servicedef.WSSecuritySpec;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WS Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.WSEndpointImpl#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.WSEndpointImpl#getInChannel <em>In Channel</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.WSEndpointImpl#getOutChannel <em>Out Channel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WSEndpointImpl extends EObjectImpl implements WSEndpoint {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInChannel() <em>In Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInChannel()
	 * @generated
	 * @ordered
	 */
	protected WSEndpointChannel inChannel;

	/**
	 * The cached value of the '{@link #getOutChannel() <em>Out Channel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutChannel()
	 * @generated
	 * @ordered
	 */
	protected WSEndpointChannel outChannel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WSEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.WS_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.WS_ENDPOINT__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSEndpointChannel getInChannel() {
		return inChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInChannel(WSEndpointChannel newInChannel, NotificationChain msgs) {
		WSEndpointChannel oldInChannel = inChannel;
		inChannel = newInChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicedefPackage.WS_ENDPOINT__IN_CHANNEL, oldInChannel, newInChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInChannel(WSEndpointChannel newInChannel) {
		if (newInChannel != inChannel) {
			NotificationChain msgs = null;
			if (inChannel != null)
				msgs = ((InternalEObject)inChannel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicedefPackage.WS_ENDPOINT__IN_CHANNEL, null, msgs);
			if (newInChannel != null)
				msgs = ((InternalEObject)newInChannel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicedefPackage.WS_ENDPOINT__IN_CHANNEL, null, msgs);
			msgs = basicSetInChannel(newInChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.WS_ENDPOINT__IN_CHANNEL, newInChannel, newInChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSEndpointChannel getOutChannel() {
		return outChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutChannel(WSEndpointChannel newOutChannel, NotificationChain msgs) {
		WSEndpointChannel oldOutChannel = outChannel;
		outChannel = newOutChannel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicedefPackage.WS_ENDPOINT__OUT_CHANNEL, oldOutChannel, newOutChannel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutChannel(WSEndpointChannel newOutChannel) {
		if (newOutChannel != outChannel) {
			NotificationChain msgs = null;
			if (outChannel != null)
				msgs = ((InternalEObject)outChannel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicedefPackage.WS_ENDPOINT__OUT_CHANNEL, null, msgs);
			if (newOutChannel != null)
				msgs = ((InternalEObject)newOutChannel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicedefPackage.WS_ENDPOINT__OUT_CHANNEL, null, msgs);
			msgs = basicSetOutChannel(newOutChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.WS_ENDPOINT__OUT_CHANNEL, newOutChannel, newOutChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicedefPackage.WS_ENDPOINT__IN_CHANNEL:
				return basicSetInChannel(null, msgs);
			case ServicedefPackage.WS_ENDPOINT__OUT_CHANNEL:
				return basicSetOutChannel(null, msgs);
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
			case ServicedefPackage.WS_ENDPOINT__CODE:
				return getCode();
			case ServicedefPackage.WS_ENDPOINT__IN_CHANNEL:
				return getInChannel();
			case ServicedefPackage.WS_ENDPOINT__OUT_CHANNEL:
				return getOutChannel();
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
			case ServicedefPackage.WS_ENDPOINT__CODE:
				setCode((String)newValue);
				return;
			case ServicedefPackage.WS_ENDPOINT__IN_CHANNEL:
				setInChannel((WSEndpointChannel)newValue);
				return;
			case ServicedefPackage.WS_ENDPOINT__OUT_CHANNEL:
				setOutChannel((WSEndpointChannel)newValue);
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
			case ServicedefPackage.WS_ENDPOINT__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ServicedefPackage.WS_ENDPOINT__IN_CHANNEL:
				setInChannel((WSEndpointChannel)null);
				return;
			case ServicedefPackage.WS_ENDPOINT__OUT_CHANNEL:
				setOutChannel((WSEndpointChannel)null);
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
			case ServicedefPackage.WS_ENDPOINT__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case ServicedefPackage.WS_ENDPOINT__IN_CHANNEL:
				return inChannel != null;
			case ServicedefPackage.WS_ENDPOINT__OUT_CHANNEL:
				return outChannel != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //WSEndpointImpl
