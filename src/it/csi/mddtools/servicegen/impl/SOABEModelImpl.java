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
package it.csi.mddtools.servicegen.impl;

import it.csi.mddtools.appresources.ResourceSet;
import it.csi.mddtools.servicedef.ServiceDef;

import it.csi.mddtools.servicegen.BaseTypes;
import it.csi.mddtools.servicegen.SOABEModel;
import it.csi.mddtools.servicegen.ServiceImpl;
import it.csi.mddtools.servicegen.ServicegenPackage;
import it.csi.mddtools.servicegen.TargetPlatform;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SOABE Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl#getBaseTypes <em>Base Types</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl#getCodComponente <em>Cod Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl#getVersioneProdotto <em>Versione Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl#getVersioneComponente <em>Versione Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl#getServiceimplementations <em>Serviceimplementations</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl#getServiceDefs <em>Service Defs</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl#getTargetPlatform <em>Target Platform</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SOABEModelImpl extends EObjectImpl implements SOABEModel {
	/**
	 * The cached value of the '{@link #getBaseTypes() <em>Base Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BaseTypes> baseTypes;

	/**
	 * The default value of the '{@link #getCodProdotto() <em>Cod Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodProdotto()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_PRODOTTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodProdotto() <em>Cod Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodProdotto()
	 * @generated
	 * @ordered
	 */
	protected String codProdotto = COD_PRODOTTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodComponente() <em>Cod Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodComponente()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_COMPONENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodComponente() <em>Cod Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodComponente()
	 * @generated
	 * @ordered
	 */
	protected String codComponente = COD_COMPONENTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersioneProdotto() <em>Versione Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioneProdotto()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSIONE_PRODOTTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersioneProdotto() <em>Versione Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioneProdotto()
	 * @generated
	 * @ordered
	 */
	protected String versioneProdotto = VERSIONE_PRODOTTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersioneComponente() <em>Versione Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioneComponente()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSIONE_COMPONENTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersioneComponente() <em>Versione Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioneComponente()
	 * @generated
	 * @ordered
	 */
	protected String versioneComponente = VERSIONE_COMPONENTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceimplementations() <em>Serviceimplementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceimplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceImpl> serviceimplementations;

	/**
	 * The cached value of the '{@link #getServiceDefs() <em>Service Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDef> serviceDefs;

	/**
	 * The cached value of the '{@link #getTargetPlatform() <em>Target Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPlatform()
	 * @generated
	 * @ordered
	 */
	protected TargetPlatform targetPlatform;

	/**
	 * The cached value of the '{@link #getResourceSet() <em>Resource Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceSet()
	 * @generated
	 * @ordered
	 */
	protected ResourceSet resourceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SOABEModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicegenPackage.Literals.SOABE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaseTypes> getBaseTypes() {
		if (baseTypes == null) {
			baseTypes = new EObjectContainmentEList<BaseTypes>(BaseTypes.class, this, ServicegenPackage.SOABE_MODEL__BASE_TYPES);
		}
		return baseTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodProdotto() {
		return codProdotto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodProdotto(String newCodProdotto) {
		String oldCodProdotto = codProdotto;
		codProdotto = newCodProdotto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SOABE_MODEL__COD_PRODOTTO, oldCodProdotto, codProdotto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodComponente() {
		return codComponente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodComponente(String newCodComponente) {
		String oldCodComponente = codComponente;
		codComponente = newCodComponente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SOABE_MODEL__COD_COMPONENTE, oldCodComponente, codComponente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersioneProdotto() {
		return versioneProdotto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioneProdotto(String newVersioneProdotto) {
		String oldVersioneProdotto = versioneProdotto;
		versioneProdotto = newVersioneProdotto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SOABE_MODEL__VERSIONE_PRODOTTO, oldVersioneProdotto, versioneProdotto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersioneComponente() {
		return versioneComponente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioneComponente(String newVersioneComponente) {
		String oldVersioneComponente = versioneComponente;
		versioneComponente = newVersioneComponente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SOABE_MODEL__VERSIONE_COMPONENTE, oldVersioneComponente, versioneComponente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceImpl> getServiceimplementations() {
		if (serviceimplementations == null) {
			serviceimplementations = new EObjectContainmentEList<ServiceImpl>(ServiceImpl.class, this, ServicegenPackage.SOABE_MODEL__SERVICEIMPLEMENTATIONS);
		}
		return serviceimplementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDef> getServiceDefs() {
		if (serviceDefs == null) {
			serviceDefs = new EObjectContainmentEList<ServiceDef>(ServiceDef.class, this, ServicegenPackage.SOABE_MODEL__SERVICE_DEFS);
		}
		return serviceDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatform getTargetPlatform() {
		return targetPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPlatform(TargetPlatform newTargetPlatform, NotificationChain msgs) {
		TargetPlatform oldTargetPlatform = targetPlatform;
		targetPlatform = newTargetPlatform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM, oldTargetPlatform, newTargetPlatform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPlatform(TargetPlatform newTargetPlatform) {
		if (newTargetPlatform != targetPlatform) {
			NotificationChain msgs = null;
			if (targetPlatform != null)
				msgs = ((InternalEObject)targetPlatform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM, null, msgs);
			if (newTargetPlatform != null)
				msgs = ((InternalEObject)newTargetPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM, null, msgs);
			msgs = basicSetTargetPlatform(newTargetPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM, newTargetPlatform, newTargetPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet getResourceSet() {
		if (resourceSet != null && resourceSet.eIsProxy()) {
			InternalEObject oldResourceSet = (InternalEObject)resourceSet;
			resourceSet = (ResourceSet)eResolveProxy(oldResourceSet);
			if (resourceSet != oldResourceSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicegenPackage.SOABE_MODEL__RESOURCE_SET, oldResourceSet, resourceSet));
			}
		}
		return resourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet basicGetResourceSet() {
		return resourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceSet(ResourceSet newResourceSet) {
		ResourceSet oldResourceSet = resourceSet;
		resourceSet = newResourceSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicegenPackage.SOABE_MODEL__RESOURCE_SET, oldResourceSet, resourceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicegenPackage.SOABE_MODEL__BASE_TYPES:
				return ((InternalEList<?>)getBaseTypes()).basicRemove(otherEnd, msgs);
			case ServicegenPackage.SOABE_MODEL__SERVICEIMPLEMENTATIONS:
				return ((InternalEList<?>)getServiceimplementations()).basicRemove(otherEnd, msgs);
			case ServicegenPackage.SOABE_MODEL__SERVICE_DEFS:
				return ((InternalEList<?>)getServiceDefs()).basicRemove(otherEnd, msgs);
			case ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM:
				return basicSetTargetPlatform(null, msgs);
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
			case ServicegenPackage.SOABE_MODEL__BASE_TYPES:
				return getBaseTypes();
			case ServicegenPackage.SOABE_MODEL__COD_PRODOTTO:
				return getCodProdotto();
			case ServicegenPackage.SOABE_MODEL__COD_COMPONENTE:
				return getCodComponente();
			case ServicegenPackage.SOABE_MODEL__VERSIONE_PRODOTTO:
				return getVersioneProdotto();
			case ServicegenPackage.SOABE_MODEL__VERSIONE_COMPONENTE:
				return getVersioneComponente();
			case ServicegenPackage.SOABE_MODEL__SERVICEIMPLEMENTATIONS:
				return getServiceimplementations();
			case ServicegenPackage.SOABE_MODEL__SERVICE_DEFS:
				return getServiceDefs();
			case ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM:
				return getTargetPlatform();
			case ServicegenPackage.SOABE_MODEL__RESOURCE_SET:
				if (resolve) return getResourceSet();
				return basicGetResourceSet();
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
			case ServicegenPackage.SOABE_MODEL__BASE_TYPES:
				getBaseTypes().clear();
				getBaseTypes().addAll((Collection<? extends BaseTypes>)newValue);
				return;
			case ServicegenPackage.SOABE_MODEL__COD_PRODOTTO:
				setCodProdotto((String)newValue);
				return;
			case ServicegenPackage.SOABE_MODEL__COD_COMPONENTE:
				setCodComponente((String)newValue);
				return;
			case ServicegenPackage.SOABE_MODEL__VERSIONE_PRODOTTO:
				setVersioneProdotto((String)newValue);
				return;
			case ServicegenPackage.SOABE_MODEL__VERSIONE_COMPONENTE:
				setVersioneComponente((String)newValue);
				return;
			case ServicegenPackage.SOABE_MODEL__SERVICEIMPLEMENTATIONS:
				getServiceimplementations().clear();
				getServiceimplementations().addAll((Collection<? extends ServiceImpl>)newValue);
				return;
			case ServicegenPackage.SOABE_MODEL__SERVICE_DEFS:
				getServiceDefs().clear();
				getServiceDefs().addAll((Collection<? extends ServiceDef>)newValue);
				return;
			case ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM:
				setTargetPlatform((TargetPlatform)newValue);
				return;
			case ServicegenPackage.SOABE_MODEL__RESOURCE_SET:
				setResourceSet((ResourceSet)newValue);
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
			case ServicegenPackage.SOABE_MODEL__BASE_TYPES:
				getBaseTypes().clear();
				return;
			case ServicegenPackage.SOABE_MODEL__COD_PRODOTTO:
				setCodProdotto(COD_PRODOTTO_EDEFAULT);
				return;
			case ServicegenPackage.SOABE_MODEL__COD_COMPONENTE:
				setCodComponente(COD_COMPONENTE_EDEFAULT);
				return;
			case ServicegenPackage.SOABE_MODEL__VERSIONE_PRODOTTO:
				setVersioneProdotto(VERSIONE_PRODOTTO_EDEFAULT);
				return;
			case ServicegenPackage.SOABE_MODEL__VERSIONE_COMPONENTE:
				setVersioneComponente(VERSIONE_COMPONENTE_EDEFAULT);
				return;
			case ServicegenPackage.SOABE_MODEL__SERVICEIMPLEMENTATIONS:
				getServiceimplementations().clear();
				return;
			case ServicegenPackage.SOABE_MODEL__SERVICE_DEFS:
				getServiceDefs().clear();
				return;
			case ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM:
				setTargetPlatform((TargetPlatform)null);
				return;
			case ServicegenPackage.SOABE_MODEL__RESOURCE_SET:
				setResourceSet((ResourceSet)null);
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
			case ServicegenPackage.SOABE_MODEL__BASE_TYPES:
				return baseTypes != null && !baseTypes.isEmpty();
			case ServicegenPackage.SOABE_MODEL__COD_PRODOTTO:
				return COD_PRODOTTO_EDEFAULT == null ? codProdotto != null : !COD_PRODOTTO_EDEFAULT.equals(codProdotto);
			case ServicegenPackage.SOABE_MODEL__COD_COMPONENTE:
				return COD_COMPONENTE_EDEFAULT == null ? codComponente != null : !COD_COMPONENTE_EDEFAULT.equals(codComponente);
			case ServicegenPackage.SOABE_MODEL__VERSIONE_PRODOTTO:
				return VERSIONE_PRODOTTO_EDEFAULT == null ? versioneProdotto != null : !VERSIONE_PRODOTTO_EDEFAULT.equals(versioneProdotto);
			case ServicegenPackage.SOABE_MODEL__VERSIONE_COMPONENTE:
				return VERSIONE_COMPONENTE_EDEFAULT == null ? versioneComponente != null : !VERSIONE_COMPONENTE_EDEFAULT.equals(versioneComponente);
			case ServicegenPackage.SOABE_MODEL__SERVICEIMPLEMENTATIONS:
				return serviceimplementations != null && !serviceimplementations.isEmpty();
			case ServicegenPackage.SOABE_MODEL__SERVICE_DEFS:
				return serviceDefs != null && !serviceDefs.isEmpty();
			case ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM:
				return targetPlatform != null;
			case ServicegenPackage.SOABE_MODEL__RESOURCE_SET:
				return resourceSet != null;
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
		result.append(" (codProdotto: ");
		result.append(codProdotto);
		result.append(", codComponente: ");
		result.append(codComponente);
		result.append(", versioneProdotto: ");
		result.append(versioneProdotto);
		result.append(", versioneComponente: ");
		result.append(versioneComponente);
		result.append(')');
		return result.toString();
	}

} //SOABEModelImpl
