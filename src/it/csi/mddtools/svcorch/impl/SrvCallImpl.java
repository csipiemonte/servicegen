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
package it.csi.mddtools.svcorch.impl;

import it.csi.mddtools.appresources.ServiceConnector;

import it.csi.mddtools.servicedef.Operation;

import it.csi.mddtools.svcorch.DataSlot;
import it.csi.mddtools.svcorch.ExceptionHandler;
import it.csi.mddtools.svcorch.ParamBinding;
import it.csi.mddtools.svcorch.SrvCall;
import it.csi.mddtools.svcorch.SvcorchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Srv Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.impl.SrvCallImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.SrvCallImpl#getServiceConnector <em>Service Connector</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.SrvCallImpl#getParamBindings <em>Param Bindings</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.SrvCallImpl#getOutputSlot <em>Output Slot</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.SrvCallImpl#getOnException <em>On Exception</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SrvCallImpl extends OpNodeImpl implements SrvCall {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The cached value of the '{@link #getServiceConnector() <em>Service Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceConnector()
	 * @generated
	 * @ordered
	 */
	protected ServiceConnector serviceConnector;

	/**
	 * The cached value of the '{@link #getParamBindings() <em>Param Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamBinding> paramBindings;

	/**
	 * The cached value of the '{@link #getOutputSlot() <em>Output Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSlot()
	 * @generated
	 * @ordered
	 */
	protected DataSlot outputSlot;

	/**
	 * The cached value of the '{@link #getOnException() <em>On Exception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnException()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionHandler> onException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrvCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvcorchPackage.Literals.SRV_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.SRV_CALL__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.SRV_CALL__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConnector getServiceConnector() {
		if (serviceConnector != null && serviceConnector.eIsProxy()) {
			InternalEObject oldServiceConnector = (InternalEObject)serviceConnector;
			serviceConnector = (ServiceConnector)eResolveProxy(oldServiceConnector);
			if (serviceConnector != oldServiceConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.SRV_CALL__SERVICE_CONNECTOR, oldServiceConnector, serviceConnector));
			}
		}
		return serviceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceConnector basicGetServiceConnector() {
		return serviceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceConnector(ServiceConnector newServiceConnector) {
		ServiceConnector oldServiceConnector = serviceConnector;
		serviceConnector = newServiceConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.SRV_CALL__SERVICE_CONNECTOR, oldServiceConnector, serviceConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamBinding> getParamBindings() {
		if (paramBindings == null) {
			paramBindings = new EObjectContainmentEList<ParamBinding>(ParamBinding.class, this, SvcorchPackage.SRV_CALL__PARAM_BINDINGS);
		}
		return paramBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot getOutputSlot() {
		if (outputSlot != null && outputSlot.eIsProxy()) {
			InternalEObject oldOutputSlot = (InternalEObject)outputSlot;
			outputSlot = (DataSlot)eResolveProxy(oldOutputSlot);
			if (outputSlot != oldOutputSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.SRV_CALL__OUTPUT_SLOT, oldOutputSlot, outputSlot));
			}
		}
		return outputSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot basicGetOutputSlot() {
		return outputSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSlot(DataSlot newOutputSlot) {
		DataSlot oldOutputSlot = outputSlot;
		outputSlot = newOutputSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.SRV_CALL__OUTPUT_SLOT, oldOutputSlot, outputSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExceptionHandler> getOnException() {
		if (onException == null) {
			onException = new EObjectContainmentEList<ExceptionHandler>(ExceptionHandler.class, this, SvcorchPackage.SRV_CALL__ON_EXCEPTION);
		}
		return onException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvcorchPackage.SRV_CALL__PARAM_BINDINGS:
				return ((InternalEList<?>)getParamBindings()).basicRemove(otherEnd, msgs);
			case SvcorchPackage.SRV_CALL__ON_EXCEPTION:
				return ((InternalEList<?>)getOnException()).basicRemove(otherEnd, msgs);
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
			case SvcorchPackage.SRV_CALL__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case SvcorchPackage.SRV_CALL__SERVICE_CONNECTOR:
				if (resolve) return getServiceConnector();
				return basicGetServiceConnector();
			case SvcorchPackage.SRV_CALL__PARAM_BINDINGS:
				return getParamBindings();
			case SvcorchPackage.SRV_CALL__OUTPUT_SLOT:
				if (resolve) return getOutputSlot();
				return basicGetOutputSlot();
			case SvcorchPackage.SRV_CALL__ON_EXCEPTION:
				return getOnException();
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
			case SvcorchPackage.SRV_CALL__OPERATION:
				setOperation((Operation)newValue);
				return;
			case SvcorchPackage.SRV_CALL__SERVICE_CONNECTOR:
				setServiceConnector((ServiceConnector)newValue);
				return;
			case SvcorchPackage.SRV_CALL__PARAM_BINDINGS:
				getParamBindings().clear();
				getParamBindings().addAll((Collection<? extends ParamBinding>)newValue);
				return;
			case SvcorchPackage.SRV_CALL__OUTPUT_SLOT:
				setOutputSlot((DataSlot)newValue);
				return;
			case SvcorchPackage.SRV_CALL__ON_EXCEPTION:
				getOnException().clear();
				getOnException().addAll((Collection<? extends ExceptionHandler>)newValue);
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
			case SvcorchPackage.SRV_CALL__OPERATION:
				setOperation((Operation)null);
				return;
			case SvcorchPackage.SRV_CALL__SERVICE_CONNECTOR:
				setServiceConnector((ServiceConnector)null);
				return;
			case SvcorchPackage.SRV_CALL__PARAM_BINDINGS:
				getParamBindings().clear();
				return;
			case SvcorchPackage.SRV_CALL__OUTPUT_SLOT:
				setOutputSlot((DataSlot)null);
				return;
			case SvcorchPackage.SRV_CALL__ON_EXCEPTION:
				getOnException().clear();
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
			case SvcorchPackage.SRV_CALL__OPERATION:
				return operation != null;
			case SvcorchPackage.SRV_CALL__SERVICE_CONNECTOR:
				return serviceConnector != null;
			case SvcorchPackage.SRV_CALL__PARAM_BINDINGS:
				return paramBindings != null && !paramBindings.isEmpty();
			case SvcorchPackage.SRV_CALL__OUTPUT_SLOT:
				return outputSlot != null;
			case SvcorchPackage.SRV_CALL__ON_EXCEPTION:
				return onException != null && !onException.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SrvCallImpl
