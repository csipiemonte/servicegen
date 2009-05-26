/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch.impl;

import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.ServiceDef;

import it.csi.mddtools.svcorch.DataSlot;
import it.csi.mddtools.svcorch.DataSlots;
import it.csi.mddtools.svcorch.InputParamBindings;
import it.csi.mddtools.svcorch.Nodes;
import it.csi.mddtools.svcorch.Orchestration;
import it.csi.mddtools.svcorch.SvcorchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orchestration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.impl.OrchestrationImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.OrchestrationImpl#getGlobalSlots <em>Global Slots</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.OrchestrationImpl#getService <em>Service</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.OrchestrationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.OrchestrationImpl#getInputParamBindings <em>Input Param Bindings</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.OrchestrationImpl#getReturnSlot <em>Return Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrchestrationImpl extends EObjectImpl implements Orchestration {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected Nodes nodes;

	/**
	 * The cached value of the '{@link #getGlobalSlots() <em>Global Slots</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalSlots()
	 * @generated
	 * @ordered
	 */
	protected DataSlots globalSlots;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected ServiceDef service;

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
	 * The cached value of the '{@link #getInputParamBindings() <em>Input Param Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParamBindings()
	 * @generated
	 * @ordered
	 */
	protected InputParamBindings inputParamBindings;

	/**
	 * The cached value of the '{@link #getReturnSlot() <em>Return Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnSlot()
	 * @generated
	 * @ordered
	 */
	protected DataSlot returnSlot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrchestrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvcorchPackage.Literals.ORCHESTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodes getNodes() {
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodes(Nodes newNodes, NotificationChain msgs) {
		Nodes oldNodes = nodes;
		nodes = newNodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvcorchPackage.ORCHESTRATION__NODES, oldNodes, newNodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(Nodes newNodes) {
		if (newNodes != nodes) {
			NotificationChain msgs = null;
			if (nodes != null)
				msgs = ((InternalEObject)nodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvcorchPackage.ORCHESTRATION__NODES, null, msgs);
			if (newNodes != null)
				msgs = ((InternalEObject)newNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvcorchPackage.ORCHESTRATION__NODES, null, msgs);
			msgs = basicSetNodes(newNodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.ORCHESTRATION__NODES, newNodes, newNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlots getGlobalSlots() {
		return globalSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalSlots(DataSlots newGlobalSlots, NotificationChain msgs) {
		DataSlots oldGlobalSlots = globalSlots;
		globalSlots = newGlobalSlots;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS, oldGlobalSlots, newGlobalSlots);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalSlots(DataSlots newGlobalSlots) {
		if (newGlobalSlots != globalSlots) {
			NotificationChain msgs = null;
			if (globalSlots != null)
				msgs = ((InternalEObject)globalSlots).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS, null, msgs);
			if (newGlobalSlots != null)
				msgs = ((InternalEObject)newGlobalSlots).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS, null, msgs);
			msgs = basicSetGlobalSlots(newGlobalSlots, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS, newGlobalSlots, newGlobalSlots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDef getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (ServiceDef)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.ORCHESTRATION__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDef basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(ServiceDef newService) {
		ServiceDef oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.ORCHESTRATION__SERVICE, oldService, service));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.ORCHESTRATION__OPERATION, oldOperation, operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.ORCHESTRATION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParamBindings getInputParamBindings() {
		return inputParamBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputParamBindings(InputParamBindings newInputParamBindings, NotificationChain msgs) {
		InputParamBindings oldInputParamBindings = inputParamBindings;
		inputParamBindings = newInputParamBindings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS, oldInputParamBindings, newInputParamBindings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputParamBindings(InputParamBindings newInputParamBindings) {
		if (newInputParamBindings != inputParamBindings) {
			NotificationChain msgs = null;
			if (inputParamBindings != null)
				msgs = ((InternalEObject)inputParamBindings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS, null, msgs);
			if (newInputParamBindings != null)
				msgs = ((InternalEObject)newInputParamBindings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS, null, msgs);
			msgs = basicSetInputParamBindings(newInputParamBindings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS, newInputParamBindings, newInputParamBindings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot getReturnSlot() {
		if (returnSlot != null && returnSlot.eIsProxy()) {
			InternalEObject oldReturnSlot = (InternalEObject)returnSlot;
			returnSlot = (DataSlot)eResolveProxy(oldReturnSlot);
			if (returnSlot != oldReturnSlot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.ORCHESTRATION__RETURN_SLOT, oldReturnSlot, returnSlot));
			}
		}
		return returnSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot basicGetReturnSlot() {
		return returnSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnSlot(DataSlot newReturnSlot) {
		DataSlot oldReturnSlot = returnSlot;
		returnSlot = newReturnSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.ORCHESTRATION__RETURN_SLOT, oldReturnSlot, returnSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SvcorchPackage.ORCHESTRATION__NODES:
				return basicSetNodes(null, msgs);
			case SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS:
				return basicSetGlobalSlots(null, msgs);
			case SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS:
				return basicSetInputParamBindings(null, msgs);
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
			case SvcorchPackage.ORCHESTRATION__NODES:
				return getNodes();
			case SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS:
				return getGlobalSlots();
			case SvcorchPackage.ORCHESTRATION__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case SvcorchPackage.ORCHESTRATION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS:
				return getInputParamBindings();
			case SvcorchPackage.ORCHESTRATION__RETURN_SLOT:
				if (resolve) return getReturnSlot();
				return basicGetReturnSlot();
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
			case SvcorchPackage.ORCHESTRATION__NODES:
				setNodes((Nodes)newValue);
				return;
			case SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS:
				setGlobalSlots((DataSlots)newValue);
				return;
			case SvcorchPackage.ORCHESTRATION__SERVICE:
				setService((ServiceDef)newValue);
				return;
			case SvcorchPackage.ORCHESTRATION__OPERATION:
				setOperation((Operation)newValue);
				return;
			case SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS:
				setInputParamBindings((InputParamBindings)newValue);
				return;
			case SvcorchPackage.ORCHESTRATION__RETURN_SLOT:
				setReturnSlot((DataSlot)newValue);
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
			case SvcorchPackage.ORCHESTRATION__NODES:
				setNodes((Nodes)null);
				return;
			case SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS:
				setGlobalSlots((DataSlots)null);
				return;
			case SvcorchPackage.ORCHESTRATION__SERVICE:
				setService((ServiceDef)null);
				return;
			case SvcorchPackage.ORCHESTRATION__OPERATION:
				setOperation((Operation)null);
				return;
			case SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS:
				setInputParamBindings((InputParamBindings)null);
				return;
			case SvcorchPackage.ORCHESTRATION__RETURN_SLOT:
				setReturnSlot((DataSlot)null);
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
			case SvcorchPackage.ORCHESTRATION__NODES:
				return nodes != null;
			case SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS:
				return globalSlots != null;
			case SvcorchPackage.ORCHESTRATION__SERVICE:
				return service != null;
			case SvcorchPackage.ORCHESTRATION__OPERATION:
				return operation != null;
			case SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS:
				return inputParamBindings != null;
			case SvcorchPackage.ORCHESTRATION__RETURN_SLOT:
				return returnSlot != null;
		}
		return super.eIsSet(featureID);
	}

} //OrchestrationImpl
