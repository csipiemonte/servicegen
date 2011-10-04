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

import it.csi.mddtools.servicedef.AuthLevelEnum;
import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.Role;
import it.csi.mddtools.servicedef.ServiceBinding;
import it.csi.mddtools.servicedef.ServiceDef;
import it.csi.mddtools.servicedef.ServiceDefAnnotation;
import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.SrvTypeEnum;
import it.csi.mddtools.servicedef.Types;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getCodServizio <em>Cod Servizio</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#isMonitorable <em>Monitorable</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#isDiagEnabled <em>Diag Enabled</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getVersione <em>Versione</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#isTraceEnabled <em>Trace Enabled</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getAuthLevel <em>Auth Level</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getCodComponente <em>Cod Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDefImpl extends EObjectImpl implements ServiceDef {
	/**
	 * The default value of the '{@link #getCodServizio() <em>Cod Servizio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodServizio()
	 * @generated
	 * @ordered
	 */
	protected static final String COD_SERVIZIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodServizio() <em>Cod Servizio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodServizio()
	 * @generated
	 * @ordered
	 */
	protected String codServizio = COD_SERVIZIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceBinding> bindings;

	/**
	 * The default value of the '{@link #isMonitorable() <em>Monitorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MONITORABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMonitorable() <em>Monitorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMonitorable()
	 * @generated
	 * @ordered
	 */
	protected boolean monitorable = MONITORABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDiagEnabled() <em>Diag Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiagEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIAG_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDiagEnabled() <em>Diag Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiagEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean diagEnabled = DIAG_ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * The default value of the '{@link #getVersione() <em>Versione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersione()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSIONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersione() <em>Versione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersione()
	 * @generated
	 * @ordered
	 */
	protected String versione = VERSIONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected Types types;

	/**
	 * The default value of the '{@link #isTraceEnabled() <em>Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraceEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACE_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTraceEnabled() <em>Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTraceEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean traceEnabled = TRACE_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final SrvTypeEnum SERVICE_TYPE_EDEFAULT = SrvTypeEnum.APPL;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected SrvTypeEnum serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthLevel() <em>Auth Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AuthLevelEnum AUTH_LEVEL_EDEFAULT = AuthLevelEnum.A0;

	/**
	 * The cached value of the '{@link #getAuthLevel() <em>Auth Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthLevel()
	 * @generated
	 * @ordered
	 */
	protected AuthLevelEnum authLevel = AUTH_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceDefAnnotation> annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.SERVICE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodServizio() {
		return codServizio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodServizio(String newCodServizio) {
		String oldCodServizio = codServizio;
		codServizio = newCodServizio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__COD_SERVIZIO, oldCodServizio, codServizio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceBinding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<ServiceBinding>(ServiceBinding.class, this, ServicedefPackage.SERVICE_DEF__BINDINGS);
		}
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMonitorable() {
		return monitorable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitorable(boolean newMonitorable) {
		boolean oldMonitorable = monitorable;
		monitorable = newMonitorable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__MONITORABLE, oldMonitorable, monitorable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDiagEnabled() {
		return diagEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagEnabled(boolean newDiagEnabled) {
		boolean oldDiagEnabled = diagEnabled;
		diagEnabled = newDiagEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__DIAG_ENABLED, oldDiagEnabled, diagEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, ServicedefPackage.SERVICE_DEF__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersione() {
		return versione;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersione(String newVersione) {
		String oldVersione = versione;
		versione = newVersione;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__VERSIONE, oldVersione, versione));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Types getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypes(Types newTypes, NotificationChain msgs) {
		Types oldTypes = types;
		types = newTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__TYPES, oldTypes, newTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(Types newTypes) {
		if (newTypes != types) {
			NotificationChain msgs = null;
			if (types != null)
				msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicedefPackage.SERVICE_DEF__TYPES, null, msgs);
			if (newTypes != null)
				msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicedefPackage.SERVICE_DEF__TYPES, null, msgs);
			msgs = basicSetTypes(newTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__TYPES, newTypes, newTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTraceEnabled() {
		return traceEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceEnabled(boolean newTraceEnabled) {
		boolean oldTraceEnabled = traceEnabled;
		traceEnabled = newTraceEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__TRACE_ENABLED, oldTraceEnabled, traceEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvTypeEnum getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(SrvTypeEnum newServiceType) {
		SrvTypeEnum oldServiceType = serviceType;
		serviceType = newServiceType == null ? SERVICE_TYPE_EDEFAULT : newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthLevelEnum getAuthLevel() {
		return authLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthLevel(AuthLevelEnum newAuthLevel) {
		AuthLevelEnum oldAuthLevel = authLevel;
		authLevel = newAuthLevel == null ? AUTH_LEVEL_EDEFAULT : newAuthLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__AUTH_LEVEL, oldAuthLevel, authLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, ServicedefPackage.SERVICE_DEF__ROLES);
		}
		return roles;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__COD_PRODOTTO, oldCodProdotto, codProdotto));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicedefPackage.SERVICE_DEF__COD_COMPONENTE, oldCodComponente, codComponente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceDefAnnotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<ServiceDefAnnotation>(ServiceDefAnnotation.class, this, ServicedefPackage.SERVICE_DEF__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicedefPackage.SERVICE_DEF__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
			case ServicedefPackage.SERVICE_DEF__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case ServicedefPackage.SERVICE_DEF__TYPES:
				return basicSetTypes(null, msgs);
			case ServicedefPackage.SERVICE_DEF__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ServicedefPackage.SERVICE_DEF__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case ServicedefPackage.SERVICE_DEF__COD_SERVIZIO:
				return getCodServizio();
			case ServicedefPackage.SERVICE_DEF__BINDINGS:
				return getBindings();
			case ServicedefPackage.SERVICE_DEF__MONITORABLE:
				return isMonitorable();
			case ServicedefPackage.SERVICE_DEF__DIAG_ENABLED:
				return isDiagEnabled();
			case ServicedefPackage.SERVICE_DEF__OPERATIONS:
				return getOperations();
			case ServicedefPackage.SERVICE_DEF__VERSIONE:
				return getVersione();
			case ServicedefPackage.SERVICE_DEF__TYPES:
				return getTypes();
			case ServicedefPackage.SERVICE_DEF__TRACE_ENABLED:
				return isTraceEnabled();
			case ServicedefPackage.SERVICE_DEF__SERVICE_TYPE:
				return getServiceType();
			case ServicedefPackage.SERVICE_DEF__AUTH_LEVEL:
				return getAuthLevel();
			case ServicedefPackage.SERVICE_DEF__ROLES:
				return getRoles();
			case ServicedefPackage.SERVICE_DEF__COD_PRODOTTO:
				return getCodProdotto();
			case ServicedefPackage.SERVICE_DEF__COD_COMPONENTE:
				return getCodComponente();
			case ServicedefPackage.SERVICE_DEF__ANNOTATIONS:
				return getAnnotations();
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
			case ServicedefPackage.SERVICE_DEF__COD_SERVIZIO:
				setCodServizio((String)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends ServiceBinding>)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__MONITORABLE:
				setMonitorable((Boolean)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__DIAG_ENABLED:
				setDiagEnabled((Boolean)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__VERSIONE:
				setVersione((String)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__TYPES:
				setTypes((Types)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__TRACE_ENABLED:
				setTraceEnabled((Boolean)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__SERVICE_TYPE:
				setServiceType((SrvTypeEnum)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__AUTH_LEVEL:
				setAuthLevel((AuthLevelEnum)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__COD_PRODOTTO:
				setCodProdotto((String)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__COD_COMPONENTE:
				setCodComponente((String)newValue);
				return;
			case ServicedefPackage.SERVICE_DEF__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends ServiceDefAnnotation>)newValue);
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
			case ServicedefPackage.SERVICE_DEF__COD_SERVIZIO:
				setCodServizio(COD_SERVIZIO_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_DEF__BINDINGS:
				getBindings().clear();
				return;
			case ServicedefPackage.SERVICE_DEF__MONITORABLE:
				setMonitorable(MONITORABLE_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_DEF__DIAG_ENABLED:
				setDiagEnabled(DIAG_ENABLED_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_DEF__OPERATIONS:
				getOperations().clear();
				return;
			case ServicedefPackage.SERVICE_DEF__VERSIONE:
				setVersione(VERSIONE_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_DEF__TYPES:
				setTypes((Types)null);
				return;
			case ServicedefPackage.SERVICE_DEF__TRACE_ENABLED:
				setTraceEnabled(TRACE_ENABLED_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_DEF__SERVICE_TYPE:
				setServiceType(SERVICE_TYPE_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_DEF__AUTH_LEVEL:
				setAuthLevel(AUTH_LEVEL_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_DEF__ROLES:
				getRoles().clear();
				return;
			case ServicedefPackage.SERVICE_DEF__COD_PRODOTTO:
				setCodProdotto(COD_PRODOTTO_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_DEF__COD_COMPONENTE:
				setCodComponente(COD_COMPONENTE_EDEFAULT);
				return;
			case ServicedefPackage.SERVICE_DEF__ANNOTATIONS:
				getAnnotations().clear();
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
			case ServicedefPackage.SERVICE_DEF__COD_SERVIZIO:
				return COD_SERVIZIO_EDEFAULT == null ? codServizio != null : !COD_SERVIZIO_EDEFAULT.equals(codServizio);
			case ServicedefPackage.SERVICE_DEF__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case ServicedefPackage.SERVICE_DEF__MONITORABLE:
				return monitorable != MONITORABLE_EDEFAULT;
			case ServicedefPackage.SERVICE_DEF__DIAG_ENABLED:
				return diagEnabled != DIAG_ENABLED_EDEFAULT;
			case ServicedefPackage.SERVICE_DEF__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case ServicedefPackage.SERVICE_DEF__VERSIONE:
				return VERSIONE_EDEFAULT == null ? versione != null : !VERSIONE_EDEFAULT.equals(versione);
			case ServicedefPackage.SERVICE_DEF__TYPES:
				return types != null;
			case ServicedefPackage.SERVICE_DEF__TRACE_ENABLED:
				return traceEnabled != TRACE_ENABLED_EDEFAULT;
			case ServicedefPackage.SERVICE_DEF__SERVICE_TYPE:
				return serviceType != SERVICE_TYPE_EDEFAULT;
			case ServicedefPackage.SERVICE_DEF__AUTH_LEVEL:
				return authLevel != AUTH_LEVEL_EDEFAULT;
			case ServicedefPackage.SERVICE_DEF__ROLES:
				return roles != null && !roles.isEmpty();
			case ServicedefPackage.SERVICE_DEF__COD_PRODOTTO:
				return COD_PRODOTTO_EDEFAULT == null ? codProdotto != null : !COD_PRODOTTO_EDEFAULT.equals(codProdotto);
			case ServicedefPackage.SERVICE_DEF__COD_COMPONENTE:
				return COD_COMPONENTE_EDEFAULT == null ? codComponente != null : !COD_COMPONENTE_EDEFAULT.equals(codComponente);
			case ServicedefPackage.SERVICE_DEF__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
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
		result.append(" (codServizio: ");
		result.append(codServizio);
		result.append(", monitorable: ");
		result.append(monitorable);
		result.append(", diagEnabled: ");
		result.append(diagEnabled);
		result.append(", versione: ");
		result.append(versione);
		result.append(", traceEnabled: ");
		result.append(traceEnabled);
		result.append(", serviceType: ");
		result.append(serviceType);
		result.append(", authLevel: ");
		result.append(authLevel);
		result.append(", codProdotto: ");
		result.append(codProdotto);
		result.append(", codComponente: ");
		result.append(codComponente);
		result.append(')');
		return result.toString();
	}

} //ServiceDefImpl
