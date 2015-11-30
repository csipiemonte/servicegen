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

import it.csi.mddtools.svcorch.ExceptionHandler;
import it.csi.mddtools.svcorch.Node;
import it.csi.mddtools.svcorch.SvcorchPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.impl.ExceptionHandlerImpl#getHandledException <em>Handled Exception</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.ExceptionHandlerImpl#getFirstRecoveryNode <em>First Recovery Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExceptionHandlerImpl extends EObjectImpl implements ExceptionHandler {
	/**
	 * The cached value of the '{@link #getHandledException() <em>Handled Exception</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandledException()
	 * @generated
	 * @ordered
	 */
	protected EList<it.csi.mddtools.typedef.Exception> handledException;

	/**
	 * The cached value of the '{@link #getFirstRecoveryNode() <em>First Recovery Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstRecoveryNode()
	 * @generated
	 * @ordered
	 */
	protected Node firstRecoveryNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvcorchPackage.Literals.EXCEPTION_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<it.csi.mddtools.typedef.Exception> getHandledException() {
		if (handledException == null) {
			handledException = new EObjectResolvingEList<it.csi.mddtools.typedef.Exception>(it.csi.mddtools.typedef.Exception.class, this, SvcorchPackage.EXCEPTION_HANDLER__HANDLED_EXCEPTION);
		}
		return handledException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFirstRecoveryNode() {
		if (firstRecoveryNode != null && firstRecoveryNode.eIsProxy()) {
			InternalEObject oldFirstRecoveryNode = (InternalEObject)firstRecoveryNode;
			firstRecoveryNode = (Node)eResolveProxy(oldFirstRecoveryNode);
			if (firstRecoveryNode != oldFirstRecoveryNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.EXCEPTION_HANDLER__FIRST_RECOVERY_NODE, oldFirstRecoveryNode, firstRecoveryNode));
			}
		}
		return firstRecoveryNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetFirstRecoveryNode() {
		return firstRecoveryNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstRecoveryNode(Node newFirstRecoveryNode) {
		Node oldFirstRecoveryNode = firstRecoveryNode;
		firstRecoveryNode = newFirstRecoveryNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.EXCEPTION_HANDLER__FIRST_RECOVERY_NODE, oldFirstRecoveryNode, firstRecoveryNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvcorchPackage.EXCEPTION_HANDLER__HANDLED_EXCEPTION:
				return getHandledException();
			case SvcorchPackage.EXCEPTION_HANDLER__FIRST_RECOVERY_NODE:
				if (resolve) return getFirstRecoveryNode();
				return basicGetFirstRecoveryNode();
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
			case SvcorchPackage.EXCEPTION_HANDLER__HANDLED_EXCEPTION:
				getHandledException().clear();
				getHandledException().addAll((Collection<? extends it.csi.mddtools.typedef.Exception>)newValue);
				return;
			case SvcorchPackage.EXCEPTION_HANDLER__FIRST_RECOVERY_NODE:
				setFirstRecoveryNode((Node)newValue);
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
			case SvcorchPackage.EXCEPTION_HANDLER__HANDLED_EXCEPTION:
				getHandledException().clear();
				return;
			case SvcorchPackage.EXCEPTION_HANDLER__FIRST_RECOVERY_NODE:
				setFirstRecoveryNode((Node)null);
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
			case SvcorchPackage.EXCEPTION_HANDLER__HANDLED_EXCEPTION:
				return handledException != null && !handledException.isEmpty();
			case SvcorchPackage.EXCEPTION_HANDLER__FIRST_RECOVERY_NODE:
				return firstRecoveryNode != null;
		}
		return super.eIsSet(featureID);
	}

} //ExceptionHandlerImpl
