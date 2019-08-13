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
package it.csi.mddtools.appresources.impl;

import it.csi.mddtools.appresources.AppresourcesPackage;
import it.csi.mddtools.appresources.ServiceSelector;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceSelectorImpl#getCodProd <em>Cod Prod</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceSelectorImpl#getCodServ <em>Cod Serv</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceSelectorImpl#getVerServ <em>Ver Serv</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceSelectorImpl#getCodEnte <em>Cod Ente</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceSelectorImpl#getIstanza <em>Istanza</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceSelectorImpl#getAmbiente <em>Ambiente</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.impl.ServiceSelectorImpl#getCodBinding <em>Cod Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceSelectorImpl extends EObjectImpl implements ServiceSelector {
	/**
	 * The default value of the '{@link #getCodProd() <em>Cod Prod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodProd()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_PROD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodProd() <em>Cod Prod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodProd()
	 * @generated
	 * @ordered
	 */
	protected String codProd = COD_PROD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodServ() <em>Cod Serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodServ()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_SERV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodServ() <em>Cod Serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodServ()
	 * @generated
	 * @ordered
	 */
	protected String codServ = COD_SERV_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerServ() <em>Ver Serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerServ()
	 * @generated
	 * @ordered
	 */
	protected static final String VER_SERV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerServ() <em>Ver Serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerServ()
	 * @generated
	 * @ordered
	 */
	protected String verServ = VER_SERV_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodEnte() <em>Cod Ente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodEnte()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_ENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodEnte() <em>Cod Ente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodEnte()
	 * @generated
	 * @ordered
	 */
	protected String codEnte = COD_ENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIstanza() <em>Istanza</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIstanza()
	 * @generated
	 * @ordered
	 */
	protected static final String ISTANZA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIstanza() <em>Istanza</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIstanza()
	 * @generated
	 * @ordered
	 */
	protected String istanza = ISTANZA_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmbiente() <em>Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbiente()
	 * @generated
	 * @ordered
	 */
	protected static final String AMBIENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmbiente() <em>Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmbiente()
	 * @generated
	 * @ordered
	 */
	protected String ambiente = AMBIENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodBinding() <em>Cod Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodBinding()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_BINDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodBinding() <em>Cod Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodBinding()
	 * @generated
	 * @ordered
	 */
	protected String codBinding = COD_BINDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppresourcesPackage.Literals.SERVICE_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodProd() {
		return codProd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodProd(String newCodProd) {
		String oldCodProd = codProd;
		codProd = newCodProd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_SELECTOR__COD_PROD, oldCodProd, codProd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodServ() {
		return codServ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodServ(String newCodServ) {
		String oldCodServ = codServ;
		codServ = newCodServ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_SELECTOR__COD_SERV, oldCodServ, codServ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVerServ() {
		return verServ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerServ(String newVerServ) {
		String oldVerServ = verServ;
		verServ = newVerServ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_SELECTOR__VER_SERV, oldVerServ, verServ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodEnte() {
		return codEnte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodEnte(String newCodEnte) {
		String oldCodEnte = codEnte;
		codEnte = newCodEnte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_SELECTOR__COD_ENTE, oldCodEnte, codEnte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIstanza() {
		return istanza;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIstanza(String newIstanza) {
		String oldIstanza = istanza;
		istanza = newIstanza;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_SELECTOR__ISTANZA, oldIstanza, istanza));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmbiente() {
		return ambiente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmbiente(String newAmbiente) {
		String oldAmbiente = ambiente;
		ambiente = newAmbiente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_SELECTOR__AMBIENTE, oldAmbiente, ambiente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodBinding() {
		return codBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodBinding(String newCodBinding) {
		String oldCodBinding = codBinding;
		codBinding = newCodBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppresourcesPackage.SERVICE_SELECTOR__COD_BINDING, oldCodBinding, codBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppresourcesPackage.SERVICE_SELECTOR__COD_PROD:
				return getCodProd();
			case AppresourcesPackage.SERVICE_SELECTOR__COD_SERV:
				return getCodServ();
			case AppresourcesPackage.SERVICE_SELECTOR__VER_SERV:
				return getVerServ();
			case AppresourcesPackage.SERVICE_SELECTOR__COD_ENTE:
				return getCodEnte();
			case AppresourcesPackage.SERVICE_SELECTOR__ISTANZA:
				return getIstanza();
			case AppresourcesPackage.SERVICE_SELECTOR__AMBIENTE:
				return getAmbiente();
			case AppresourcesPackage.SERVICE_SELECTOR__COD_BINDING:
				return getCodBinding();
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
			case AppresourcesPackage.SERVICE_SELECTOR__COD_PROD:
				setCodProd((String)newValue);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__COD_SERV:
				setCodServ((String)newValue);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__VER_SERV:
				setVerServ((String)newValue);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__COD_ENTE:
				setCodEnte((String)newValue);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__ISTANZA:
				setIstanza((String)newValue);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__AMBIENTE:
				setAmbiente((String)newValue);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__COD_BINDING:
				setCodBinding((String)newValue);
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
			case AppresourcesPackage.SERVICE_SELECTOR__COD_PROD:
				setCodProd(COD_PROD_EDEFAULT);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__COD_SERV:
				setCodServ(COD_SERV_EDEFAULT);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__VER_SERV:
				setVerServ(VER_SERV_EDEFAULT);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__COD_ENTE:
				setCodEnte(COD_ENTE_EDEFAULT);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__ISTANZA:
				setIstanza(ISTANZA_EDEFAULT);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__AMBIENTE:
				setAmbiente(AMBIENTE_EDEFAULT);
				return;
			case AppresourcesPackage.SERVICE_SELECTOR__COD_BINDING:
				setCodBinding(COD_BINDING_EDEFAULT);
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
			case AppresourcesPackage.SERVICE_SELECTOR__COD_PROD:
				return COD_PROD_EDEFAULT == null ? codProd != null : !COD_PROD_EDEFAULT.equals(codProd);
			case AppresourcesPackage.SERVICE_SELECTOR__COD_SERV:
				return COD_SERV_EDEFAULT == null ? codServ != null : !COD_SERV_EDEFAULT.equals(codServ);
			case AppresourcesPackage.SERVICE_SELECTOR__VER_SERV:
				return VER_SERV_EDEFAULT == null ? verServ != null : !VER_SERV_EDEFAULT.equals(verServ);
			case AppresourcesPackage.SERVICE_SELECTOR__COD_ENTE:
				return COD_ENTE_EDEFAULT == null ? codEnte != null : !COD_ENTE_EDEFAULT.equals(codEnte);
			case AppresourcesPackage.SERVICE_SELECTOR__ISTANZA:
				return ISTANZA_EDEFAULT == null ? istanza != null : !ISTANZA_EDEFAULT.equals(istanza);
			case AppresourcesPackage.SERVICE_SELECTOR__AMBIENTE:
				return AMBIENTE_EDEFAULT == null ? ambiente != null : !AMBIENTE_EDEFAULT.equals(ambiente);
			case AppresourcesPackage.SERVICE_SELECTOR__COD_BINDING:
				return COD_BINDING_EDEFAULT == null ? codBinding != null : !COD_BINDING_EDEFAULT.equals(codBinding);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (codProd: ");
		result.append(codProd);
		result.append(", codServ: ");
		result.append(codServ);
		result.append(", verServ: ");
		result.append(verServ);
		result.append(", codEnte: ");
		result.append(codEnte);
		result.append(", istanza: ");
		result.append(istanza);
		result.append(", ambiente: ");
		result.append(ambiente);
		result.append(", codBinding: ");
		result.append(codBinding);
		result.append(')');
		return result.toString();
	}

} //ServiceSelectorImpl
