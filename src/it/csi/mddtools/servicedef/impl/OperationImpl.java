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
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.InputValidator;
import it.csi.mddtools.servicedef.OpTypeEnum;
import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.Param;
import it.csi.mddtools.servicedef.Role;
import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.TXTypeEnum;

import it.csi.mddtools.typedef.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.OperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.OperationImpl#getOpType <em>Op Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.OperationImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.OperationImpl#getThrows <em>Throws</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.OperationImpl#getTxType <em>Tx Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.OperationImpl#getSince <em>Since</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.OperationImpl#getAuthorizedRoles <em>Authorized Roles</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.OperationImpl#getValidator <em>Validator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Param> params;

	/**
	 * The default value of the '{@link #getOpType() <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpType()
	 * @generated
	 * @ordered
	 */
	protected static final OpTypeEnum OP_TYPE_EDEFAULT = OpTypeEnum.SYNCH;

	/**
	 * The cached value of the '{@link #getOpType() <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpType()
	 * @generated
	 * @ordered
	 */
	protected OpTypeEnum opType = OP_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * The cached value of the '{@link #getThrows() <em>Throws</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrows()
	 * @generated
	 * @ordered
	 */
	protected EList<it.csi.mddtools.typedef.Exception> throws_;

	/**
	 * The default value of the '{@link #getTxType() <em>Tx Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxType()
	 * @generated
	 * @ordered
	 */
	protected static final TXTypeEnum TX_TYPE_EDEFAULT = TXTypeEnum.NO_TX;

	/**
	 * The cached value of the '{@link #getTxType() <em>Tx Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxType()
	 * @generated
	 * @ordered
	 */
	protected TXTypeEnum txType = TX_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSince() <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSince()
	 * @generated
	 * @ordered
	 */
	protected static final String SINCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSince() <em>Since</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSince()
	 * @generated
	 * @ordered
	 */
	protected String since = SINCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthorizedRoles() <em>Authorized Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> authorizedRoles;

	/**
	 * The cached value of the '{@link #getValidator() <em>Validator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidator()
	 * @generated
	 * @ordered
	 */
	protected InputValidator validator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Param> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Param>(Param.class, this, ServicedefPackage.OPERATION__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpTypeEnum getOpType() {
		return opType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpType(OpTypeEnum newOpType) {
		OpTypeEnum oldOpType = opType;
		opType = newOpType == null ? OP_TYPE_EDEFAULT : newOpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.OPERATION__OP_TYPE, oldOpType, opType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Type)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicedefPackage.OPERATION__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.OPERATION__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<it.csi.mddtools.typedef.Exception> getThrows() {
		if (throws_ == null) {
			throws_ = new EObjectResolvingEList<it.csi.mddtools.typedef.Exception>(it.csi.mddtools.typedef.Exception.class, this, ServicedefPackage.OPERATION__THROWS);
		}
		return throws_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXTypeEnum getTxType() {
		return txType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxType(TXTypeEnum newTxType) {
		TXTypeEnum oldTxType = txType;
		txType = newTxType == null ? TX_TYPE_EDEFAULT : newTxType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.OPERATION__TX_TYPE, oldTxType, txType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSince() {
		return since;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSince(String newSince) {
		String oldSince = since;
		since = newSince;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.OPERATION__SINCE, oldSince, since));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getAuthorizedRoles() {
		if (authorizedRoles == null) {
			authorizedRoles = new EObjectResolvingEList<Role>(Role.class, this, ServicedefPackage.OPERATION__AUTHORIZED_ROLES);
		}
		return authorizedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValidator getValidator() {
		return validator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidator(InputValidator newValidator, NotificationChain msgs) {
		InputValidator oldValidator = validator;
		validator = newValidator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicedefPackage.OPERATION__VALIDATOR, oldValidator, newValidator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidator(InputValidator newValidator) {
		if (newValidator != validator) {
			NotificationChain msgs = null;
			if (validator != null)
				msgs = ((InternalEObject)validator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicedefPackage.OPERATION__VALIDATOR, null, msgs);
			if (newValidator != null)
				msgs = ((InternalEObject)newValidator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicedefPackage.OPERATION__VALIDATOR, null, msgs);
			msgs = basicSetValidator(newValidator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.OPERATION__VALIDATOR, newValidator, newValidator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicedefPackage.OPERATION__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
			case ServicedefPackage.OPERATION__VALIDATOR:
				return basicSetValidator(null, msgs);
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
			case ServicedefPackage.OPERATION__NAME:
				return getName();
			case ServicedefPackage.OPERATION__PARAMS:
				return getParams();
			case ServicedefPackage.OPERATION__OP_TYPE:
				return getOpType();
			case ServicedefPackage.OPERATION__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case ServicedefPackage.OPERATION__THROWS:
				return getThrows();
			case ServicedefPackage.OPERATION__TX_TYPE:
				return getTxType();
			case ServicedefPackage.OPERATION__SINCE:
				return getSince();
			case ServicedefPackage.OPERATION__AUTHORIZED_ROLES:
				return getAuthorizedRoles();
			case ServicedefPackage.OPERATION__VALIDATOR:
				return getValidator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicedefPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case ServicedefPackage.OPERATION__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Param>)newValue);
				return;
			case ServicedefPackage.OPERATION__OP_TYPE:
				setOpType((OpTypeEnum)newValue);
				return;
			case ServicedefPackage.OPERATION__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case ServicedefPackage.OPERATION__THROWS:
				getThrows().clear();
				getThrows().addAll((Collection<? extends it.csi.mddtools.typedef.Exception>)newValue);
				return;
			case ServicedefPackage.OPERATION__TX_TYPE:
				setTxType((TXTypeEnum)newValue);
				return;
			case ServicedefPackage.OPERATION__SINCE:
				setSince((String)newValue);
				return;
			case ServicedefPackage.OPERATION__AUTHORIZED_ROLES:
				getAuthorizedRoles().clear();
				getAuthorizedRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ServicedefPackage.OPERATION__VALIDATOR:
				setValidator((InputValidator)newValue);
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
			case ServicedefPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicedefPackage.OPERATION__PARAMS:
				getParams().clear();
				return;
			case ServicedefPackage.OPERATION__OP_TYPE:
				setOpType(OP_TYPE_EDEFAULT);
				return;
			case ServicedefPackage.OPERATION__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case ServicedefPackage.OPERATION__THROWS:
				getThrows().clear();
				return;
			case ServicedefPackage.OPERATION__TX_TYPE:
				setTxType(TX_TYPE_EDEFAULT);
				return;
			case ServicedefPackage.OPERATION__SINCE:
				setSince(SINCE_EDEFAULT);
				return;
			case ServicedefPackage.OPERATION__AUTHORIZED_ROLES:
				getAuthorizedRoles().clear();
				return;
			case ServicedefPackage.OPERATION__VALIDATOR:
				setValidator((InputValidator)null);
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
			case ServicedefPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicedefPackage.OPERATION__PARAMS:
				return params != null && !params.isEmpty();
			case ServicedefPackage.OPERATION__OP_TYPE:
				return opType != OP_TYPE_EDEFAULT;
			case ServicedefPackage.OPERATION__RETURN_TYPE:
				return returnType != null;
			case ServicedefPackage.OPERATION__THROWS:
				return throws_ != null && !throws_.isEmpty();
			case ServicedefPackage.OPERATION__TX_TYPE:
				return txType != TX_TYPE_EDEFAULT;
			case ServicedefPackage.OPERATION__SINCE:
				return SINCE_EDEFAULT == null ? since != null : !SINCE_EDEFAULT.equals(since);
			case ServicedefPackage.OPERATION__AUTHORIZED_ROLES:
				return authorizedRoles != null && !authorizedRoles.isEmpty();
			case ServicedefPackage.OPERATION__VALIDATOR:
				return validator != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", opType: ");
		result.append(opType);
		result.append(", txType: ");
		result.append(txType);
		result.append(", since: ");
		result.append(since);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
