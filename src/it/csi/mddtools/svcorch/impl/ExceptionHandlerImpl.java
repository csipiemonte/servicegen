/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch.impl;

import it.csi.mddtools.svcorch.ExceptionHandler;
import it.csi.mddtools.svcorch.SvcorchPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.impl.ExceptionHandlerImpl#getHandledException <em>Handled Exception</em>}</li>
 * </ul>
 * </p>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvcorchPackage.EXCEPTION_HANDLER__HANDLED_EXCEPTION:
				return getHandledException();
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
		}
		return super.eIsSet(featureID);
	}

} //ExceptionHandlerImpl
