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
import it.csi.mddtools.svcorch.SvcorchPackage;
import it.csi.mddtools.svcorch.Transformation;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.impl.TransformationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.TransformationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.impl.TransformationImpl#isInitOutSlot <em>Init Out Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TransformationImpl extends OpNodeImpl implements Transformation {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<DataSlot> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected DataSlot output;

	/**
	 * The default value of the '{@link #isInitOutSlot() <em>Init Out Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitOutSlot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INIT_OUT_SLOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitOutSlot() <em>Init Out Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitOutSlot()
	 * @generated
	 * @ordered
	 */
	protected boolean initOutSlot = INIT_OUT_SLOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SvcorchPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataSlot> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<DataSlot>(DataSlot.class, this, SvcorchPackage.TRANSFORMATION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (DataSlot)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvcorchPackage.TRANSFORMATION__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(DataSlot newOutput) {
		DataSlot oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.TRANSFORMATION__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitOutSlot() {
		return initOutSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitOutSlot(boolean newInitOutSlot) {
		boolean oldInitOutSlot = initOutSlot;
		initOutSlot = newInitOutSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SvcorchPackage.TRANSFORMATION__INIT_OUT_SLOT, oldInitOutSlot, initOutSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SvcorchPackage.TRANSFORMATION__INPUT:
				return getInput();
			case SvcorchPackage.TRANSFORMATION__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case SvcorchPackage.TRANSFORMATION__INIT_OUT_SLOT:
				return isInitOutSlot() ? Boolean.TRUE : Boolean.FALSE;
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
			case SvcorchPackage.TRANSFORMATION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends DataSlot>)newValue);
				return;
			case SvcorchPackage.TRANSFORMATION__OUTPUT:
				setOutput((DataSlot)newValue);
				return;
			case SvcorchPackage.TRANSFORMATION__INIT_OUT_SLOT:
				setInitOutSlot(((Boolean)newValue).booleanValue());
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
			case SvcorchPackage.TRANSFORMATION__INPUT:
				getInput().clear();
				return;
			case SvcorchPackage.TRANSFORMATION__OUTPUT:
				setOutput((DataSlot)null);
				return;
			case SvcorchPackage.TRANSFORMATION__INIT_OUT_SLOT:
				setInitOutSlot(INIT_OUT_SLOT_EDEFAULT);
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
			case SvcorchPackage.TRANSFORMATION__INPUT:
				return input != null && !input.isEmpty();
			case SvcorchPackage.TRANSFORMATION__OUTPUT:
				return output != null;
			case SvcorchPackage.TRANSFORMATION__INIT_OUT_SLOT:
				return initOutSlot != INIT_OUT_SLOT_EDEFAULT;
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
		result.append(" (initOutSlot: ");
		result.append(initOutSlot);
		result.append(')');
		return result.toString();
	}

} //TransformationImpl
