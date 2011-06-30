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

import it.csi.mddtools.svcorch.DataSlot;
import it.csi.mddtools.svcorch.ForEach;
import it.csi.mddtools.svcorch.Node;
import it.csi.mddtools.svcorch.SvcorchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.impl.ForEachImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.ForEachImpl#getItem <em>Item</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.ForEachImpl#getFirstLoopNode <em>First Loop Node</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.ForEachImpl#getAfterLoopNode <em>After Loop Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachImpl extends FlowNodeImpl implements ForEach {
	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected DataSlot collection;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected DataSlot item;

	/**
	 * The cached value of the '{@link #getFirstLoopNode() <em>First Loop Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLoopNode()
	 * @generated
	 * @ordered
	 */
	protected Node firstLoopNode;

	/**
	 * The cached value of the '{@link #getAfterLoopNode() <em>After Loop Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfterLoopNode()
	 * @generated
	 * @ordered
	 */
	protected Node afterLoopNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForEachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvcorchPackage.Literals.FOR_EACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot getCollection() {
		if (collection != null && collection.eIsProxy()) {
			InternalEObject oldCollection = (InternalEObject)collection;
			collection = (DataSlot)eResolveProxy(oldCollection);
			if (collection != oldCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.FOR_EACH__COLLECTION, oldCollection, collection));
			}
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot basicGetCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollection(DataSlot newCollection) {
		DataSlot oldCollection = collection;
		collection = newCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.FOR_EACH__COLLECTION, oldCollection, collection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot getItem() {
		if (item != null && item.eIsProxy()) {
			InternalEObject oldItem = (InternalEObject)item;
			item = (DataSlot)eResolveProxy(oldItem);
			if (item != oldItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.FOR_EACH__ITEM, oldItem, item));
			}
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot basicGetItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(DataSlot newItem) {
		DataSlot oldItem = item;
		item = newItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.FOR_EACH__ITEM, oldItem, item));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFirstLoopNode() {
		if (firstLoopNode != null && firstLoopNode.eIsProxy()) {
			InternalEObject oldFirstLoopNode = (InternalEObject)firstLoopNode;
			firstLoopNode = (Node)eResolveProxy(oldFirstLoopNode);
			if (firstLoopNode != oldFirstLoopNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.FOR_EACH__FIRST_LOOP_NODE, oldFirstLoopNode, firstLoopNode));
			}
		}
		return firstLoopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFirstLoopNode() {
		return firstLoopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstLoopNode(Node newFirstLoopNode) {
		Node oldFirstLoopNode = firstLoopNode;
		firstLoopNode = newFirstLoopNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.FOR_EACH__FIRST_LOOP_NODE, oldFirstLoopNode, firstLoopNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getAfterLoopNode() {
		if (afterLoopNode != null && afterLoopNode.eIsProxy()) {
			InternalEObject oldAfterLoopNode = (InternalEObject)afterLoopNode;
			afterLoopNode = (Node)eResolveProxy(oldAfterLoopNode);
			if (afterLoopNode != oldAfterLoopNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.FOR_EACH__AFTER_LOOP_NODE, oldAfterLoopNode, afterLoopNode));
			}
		}
		return afterLoopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetAfterLoopNode() {
		return afterLoopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterLoopNode(Node newAfterLoopNode) {
		Node oldAfterLoopNode = afterLoopNode;
		afterLoopNode = newAfterLoopNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.FOR_EACH__AFTER_LOOP_NODE, oldAfterLoopNode, afterLoopNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvcorchPackage.FOR_EACH__COLLECTION:
				if (resolve) return getCollection();
				return basicGetCollection();
			case SvcorchPackage.FOR_EACH__ITEM:
				if (resolve) return getItem();
				return basicGetItem();
			case SvcorchPackage.FOR_EACH__FIRST_LOOP_NODE:
				if (resolve) return getFirstLoopNode();
				return basicGetFirstLoopNode();
			case SvcorchPackage.FOR_EACH__AFTER_LOOP_NODE:
				if (resolve) return getAfterLoopNode();
				return basicGetAfterLoopNode();
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
			case SvcorchPackage.FOR_EACH__COLLECTION:
				setCollection((DataSlot)newValue);
				return;
			case SvcorchPackage.FOR_EACH__ITEM:
				setItem((DataSlot)newValue);
				return;
			case SvcorchPackage.FOR_EACH__FIRST_LOOP_NODE:
				setFirstLoopNode((Node)newValue);
				return;
			case SvcorchPackage.FOR_EACH__AFTER_LOOP_NODE:
				setAfterLoopNode((Node)newValue);
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
			case SvcorchPackage.FOR_EACH__COLLECTION:
				setCollection((DataSlot)null);
				return;
			case SvcorchPackage.FOR_EACH__ITEM:
				setItem((DataSlot)null);
				return;
			case SvcorchPackage.FOR_EACH__FIRST_LOOP_NODE:
				setFirstLoopNode((Node)null);
				return;
			case SvcorchPackage.FOR_EACH__AFTER_LOOP_NODE:
				setAfterLoopNode((Node)null);
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
			case SvcorchPackage.FOR_EACH__COLLECTION:
				return collection != null;
			case SvcorchPackage.FOR_EACH__ITEM:
				return item != null;
			case SvcorchPackage.FOR_EACH__FIRST_LOOP_NODE:
				return firstLoopNode != null;
			case SvcorchPackage.FOR_EACH__AFTER_LOOP_NODE:
				return afterLoopNode != null;
		}
		return super.eIsSet(featureID);
	}

} //ForEachImpl
