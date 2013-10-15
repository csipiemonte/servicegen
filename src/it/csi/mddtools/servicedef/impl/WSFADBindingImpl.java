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

import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.WSFADBinding;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WSFAD Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.WSFADBindingImpl#isUseLiteral <em>Use Literal</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.WSFADBindingImpl#isUseWrapped <em>Use Wrapped</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.WSFADBindingImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WSFADBindingImpl extends ServiceBindingImpl implements WSFADBinding {
	/**
	 * The default value of the '{@link #isUseLiteral() <em>Use Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_LITERAL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUseLiteral() <em>Use Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseLiteral()
	 * @generated
	 * @ordered
	 */
	protected boolean useLiteral = USE_LITERAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseWrapped() <em>Use Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseWrapped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_WRAPPED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUseWrapped() <em>Use Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseWrapped()
	 * @generated
	 * @ordered
	 */
	protected boolean useWrapped = USE_WRAPPED_EDEFAULT;
	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected WSFADBindingImpl() {
		super();
		this.setCodBinding("wsfad");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.WSFAD_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseLiteral() {
		return useLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseLiteral(boolean newUseLiteral) {
		boolean oldUseLiteral = useLiteral;
		useLiteral = newUseLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.WSFAD_BINDING__USE_LITERAL, oldUseLiteral, useLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseWrapped() {
		return useWrapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseWrapped(boolean newUseWrapped) {
		boolean oldUseWrapped = useWrapped;
		useWrapped = newUseWrapped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.WSFAD_BINDING__USE_WRAPPED, oldUseWrapped, useWrapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.WSFAD_BINDING__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicedefPackage.WSFAD_BINDING__USE_LITERAL:
				return isUseLiteral();
			case ServicedefPackage.WSFAD_BINDING__USE_WRAPPED:
				return isUseWrapped();
			case ServicedefPackage.WSFAD_BINDING__NAMESPACE:
				return getNamespace();
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
			case ServicedefPackage.WSFAD_BINDING__USE_LITERAL:
				setUseLiteral((Boolean)newValue);
				return;
			case ServicedefPackage.WSFAD_BINDING__USE_WRAPPED:
				setUseWrapped((Boolean)newValue);
				return;
			case ServicedefPackage.WSFAD_BINDING__NAMESPACE:
				setNamespace((String)newValue);
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
			case ServicedefPackage.WSFAD_BINDING__USE_LITERAL:
				setUseLiteral(USE_LITERAL_EDEFAULT);
				return;
			case ServicedefPackage.WSFAD_BINDING__USE_WRAPPED:
				setUseWrapped(USE_WRAPPED_EDEFAULT);
				return;
			case ServicedefPackage.WSFAD_BINDING__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
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
			case ServicedefPackage.WSFAD_BINDING__USE_LITERAL:
				return useLiteral != USE_LITERAL_EDEFAULT;
			case ServicedefPackage.WSFAD_BINDING__USE_WRAPPED:
				return useWrapped != USE_WRAPPED_EDEFAULT;
			case ServicedefPackage.WSFAD_BINDING__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
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
		result.append(" (useLiteral: ");
		result.append(useLiteral);
		result.append(", useWrapped: ");
		result.append(useWrapped);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //WSFADBindingImpl
