/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch.impl;

import it.csi.mddtools.svcorch.CheckCondition;
import it.csi.mddtools.svcorch.Node;
import it.csi.mddtools.svcorch.SvcorchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.impl.CheckConditionImpl#getThenNode <em>Then Node</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.CheckConditionImpl#getElseNode <em>Else Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CheckConditionImpl extends FlowNodeImpl implements CheckCondition {
	/**
	 * The cached value of the '{@link #getThenNode() <em>Then Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenNode()
	 * @generated
	 * @ordered
	 */
	protected Node thenNode;
	/**
	 * The cached value of the '{@link #getElseNode() <em>Else Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseNode()
	 * @generated
	 * @ordered
	 */
	protected Node elseNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvcorchPackage.Literals.CHECK_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getThenNode() {
		if (thenNode != null && thenNode.eIsProxy()) {
			InternalEObject oldThenNode = (InternalEObject)thenNode;
			thenNode = (Node)eResolveProxy(oldThenNode);
			if (thenNode != oldThenNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.CHECK_CONDITION__THEN_NODE, oldThenNode, thenNode));
			}
		}
		return thenNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetThenNode() {
		return thenNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenNode(Node newThenNode) {
		Node oldThenNode = thenNode;
		thenNode = newThenNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.CHECK_CONDITION__THEN_NODE, oldThenNode, thenNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getElseNode() {
		if (elseNode != null && elseNode.eIsProxy()) {
			InternalEObject oldElseNode = (InternalEObject)elseNode;
			elseNode = (Node)eResolveProxy(oldElseNode);
			if (elseNode != oldElseNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.CHECK_CONDITION__ELSE_NODE, oldElseNode, elseNode));
			}
		}
		return elseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetElseNode() {
		return elseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseNode(Node newElseNode) {
		Node oldElseNode = elseNode;
		elseNode = newElseNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.CHECK_CONDITION__ELSE_NODE, oldElseNode, elseNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvcorchPackage.CHECK_CONDITION__THEN_NODE:
				if (resolve) return getThenNode();
				return basicGetThenNode();
			case SvcorchPackage.CHECK_CONDITION__ELSE_NODE:
				if (resolve) return getElseNode();
				return basicGetElseNode();
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
			case SvcorchPackage.CHECK_CONDITION__THEN_NODE:
				setThenNode((Node)newValue);
				return;
			case SvcorchPackage.CHECK_CONDITION__ELSE_NODE:
				setElseNode((Node)newValue);
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
			case SvcorchPackage.CHECK_CONDITION__THEN_NODE:
				setThenNode((Node)null);
				return;
			case SvcorchPackage.CHECK_CONDITION__ELSE_NODE:
				setElseNode((Node)null);
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
			case SvcorchPackage.CHECK_CONDITION__THEN_NODE:
				return thenNode != null;
			case SvcorchPackage.CHECK_CONDITION__ELSE_NODE:
				return elseNode != null;
		}
		return super.eIsSet(featureID);
	}

} //CheckConditionImpl
