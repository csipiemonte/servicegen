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

import it.csi.mddtools.svcorch.EndLoop;
import it.csi.mddtools.svcorch.Node;
import it.csi.mddtools.svcorch.SvcorchPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.impl.EndLoopImpl#getLoopHeadNode <em>Loop Head Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndLoopImpl extends FlowNodeImpl implements EndLoop {
	/**
	 * The cached value of the '{@link #getLoopHeadNode() <em>Loop Head Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopHeadNode()
	 * @generated
	 * @ordered
	 */
	protected Node loopHeadNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvcorchPackage.Literals.END_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getLoopHeadNode() {
		if (loopHeadNode != null && loopHeadNode.eIsProxy()) {
			InternalEObject oldLoopHeadNode = (InternalEObject)loopHeadNode;
			loopHeadNode = (Node)eResolveProxy(oldLoopHeadNode);
			if (loopHeadNode != oldLoopHeadNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.END_LOOP__LOOP_HEAD_NODE, oldLoopHeadNode, loopHeadNode));
			}
		}
		return loopHeadNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetLoopHeadNode() {
		return loopHeadNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopHeadNode(Node newLoopHeadNode) {
		Node oldLoopHeadNode = loopHeadNode;
		loopHeadNode = newLoopHeadNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.END_LOOP__LOOP_HEAD_NODE, oldLoopHeadNode, loopHeadNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvcorchPackage.END_LOOP__LOOP_HEAD_NODE:
				if (resolve) return getLoopHeadNode();
				return basicGetLoopHeadNode();
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
			case SvcorchPackage.END_LOOP__LOOP_HEAD_NODE:
				setLoopHeadNode((Node)newValue);
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
			case SvcorchPackage.END_LOOP__LOOP_HEAD_NODE:
				setLoopHeadNode((Node)null);
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
			case SvcorchPackage.END_LOOP__LOOP_HEAD_NODE:
				return loopHeadNode != null;
		}
		return super.eIsSet(featureID);
	}

} //EndLoopImpl
