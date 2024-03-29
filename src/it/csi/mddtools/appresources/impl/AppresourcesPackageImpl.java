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

import it.csi.mddtools.appresources.AppresourcesFactory;
import it.csi.mddtools.appresources.AppresourcesPackage;
import it.csi.mddtools.appresources.FileSystemConnector;
import it.csi.mddtools.appresources.JDBCDataSourceConnector;
import it.csi.mddtools.appresources.LdapJndiConnector;
import it.csi.mddtools.appresources.PDPAServiceConnector;
import it.csi.mddtools.appresources.RCAnnotation;
import it.csi.mddtools.appresources.RCAnnotationDetail;
import it.csi.mddtools.appresources.RPCWebServiceConnector;
import it.csi.mddtools.appresources.ResourceConnector;
import it.csi.mddtools.appresources.ResourceSet;
import it.csi.mddtools.appresources.ServiceConnector;
import it.csi.mddtools.appresources.ServiceSelector;

import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.typedef.TypedefPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppresourcesPackageImpl extends EPackageImpl implements AppresourcesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdpaServiceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSystemConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jdbcDataSourceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldapJndiConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcWebServiceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rcAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rcAnnotationDetailEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AppresourcesPackageImpl() {
		super(eNS_URI, AppresourcesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AppresourcesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AppresourcesPackage init() {
		if (isInited) return (AppresourcesPackage)EPackage.Registry.INSTANCE.getEPackage(AppresourcesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAppresourcesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AppresourcesPackageImpl theAppresourcesPackage = registeredAppresourcesPackage instanceof AppresourcesPackageImpl ? (AppresourcesPackageImpl)registeredAppresourcesPackage : new AppresourcesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ServicedefPackage.eINSTANCE.eClass();
		TypedefPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAppresourcesPackage.createPackageContents();

		// Initialize created meta-data
		theAppresourcesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAppresourcesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AppresourcesPackage.eNS_URI, theAppresourcesPackage);
		return theAppresourcesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceConnector() {
		return resourceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceConnector_Code() {
		return (EAttribute)resourceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceConnector_Annotations() {
		return (EReference)resourceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPDPAServiceConnector() {
		return pdpaServiceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSystemConnector() {
		return fileSystemConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJDBCDataSourceConnector() {
		return jdbcDataSourceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLdapJndiConnector() {
		return ldapJndiConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPCWebServiceConnector() {
		return rpcWebServiceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRPCWebServiceConnector_Endpoint() {
		return (EReference)rpcWebServiceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceSelector() {
		return serviceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSelector_CodProd() {
		return (EAttribute)serviceSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSelector_CodServ() {
		return (EAttribute)serviceSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSelector_VerServ() {
		return (EAttribute)serviceSelectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSelector_CodEnte() {
		return (EAttribute)serviceSelectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSelector_Istanza() {
		return (EAttribute)serviceSelectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSelector_Ambiente() {
		return (EAttribute)serviceSelectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceSelector_CodBinding() {
		return (EAttribute)serviceSelectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceSet() {
		return resourceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceSet_Resources() {
		return (EReference)resourceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceConnector() {
		return serviceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConnector_ServiceDef() {
		return (EReference)serviceConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConnector_Binding() {
		return (EReference)serviceConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceConnector_Selector() {
		return (EReference)serviceConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceConnector_UseRegistry() {
		return (EAttribute)serviceConnectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRCAnnotation() {
		return rcAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRCAnnotation_Source() {
		return (EAttribute)rcAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRCAnnotation_Details() {
		return (EReference)rcAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRCAnnotationDetail() {
		return rcAnnotationDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRCAnnotationDetail_Key() {
		return (EAttribute)rcAnnotationDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRCAnnotationDetail_Value() {
		return (EAttribute)rcAnnotationDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppresourcesFactory getAppresourcesFactory() {
		return (AppresourcesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		resourceConnectorEClass = createEClass(RESOURCE_CONNECTOR);
		createEAttribute(resourceConnectorEClass, RESOURCE_CONNECTOR__CODE);
		createEReference(resourceConnectorEClass, RESOURCE_CONNECTOR__ANNOTATIONS);

		pdpaServiceConnectorEClass = createEClass(PDPA_SERVICE_CONNECTOR);

		fileSystemConnectorEClass = createEClass(FILE_SYSTEM_CONNECTOR);

		jdbcDataSourceConnectorEClass = createEClass(JDBC_DATA_SOURCE_CONNECTOR);

		ldapJndiConnectorEClass = createEClass(LDAP_JNDI_CONNECTOR);

		rpcWebServiceConnectorEClass = createEClass(RPC_WEB_SERVICE_CONNECTOR);
		createEReference(rpcWebServiceConnectorEClass, RPC_WEB_SERVICE_CONNECTOR__ENDPOINT);

		serviceSelectorEClass = createEClass(SERVICE_SELECTOR);
		createEAttribute(serviceSelectorEClass, SERVICE_SELECTOR__COD_PROD);
		createEAttribute(serviceSelectorEClass, SERVICE_SELECTOR__COD_SERV);
		createEAttribute(serviceSelectorEClass, SERVICE_SELECTOR__VER_SERV);
		createEAttribute(serviceSelectorEClass, SERVICE_SELECTOR__COD_ENTE);
		createEAttribute(serviceSelectorEClass, SERVICE_SELECTOR__ISTANZA);
		createEAttribute(serviceSelectorEClass, SERVICE_SELECTOR__AMBIENTE);
		createEAttribute(serviceSelectorEClass, SERVICE_SELECTOR__COD_BINDING);

		resourceSetEClass = createEClass(RESOURCE_SET);
		createEReference(resourceSetEClass, RESOURCE_SET__RESOURCES);

		serviceConnectorEClass = createEClass(SERVICE_CONNECTOR);
		createEReference(serviceConnectorEClass, SERVICE_CONNECTOR__SERVICE_DEF);
		createEReference(serviceConnectorEClass, SERVICE_CONNECTOR__BINDING);
		createEReference(serviceConnectorEClass, SERVICE_CONNECTOR__SELECTOR);
		createEAttribute(serviceConnectorEClass, SERVICE_CONNECTOR__USE_REGISTRY);

		rcAnnotationEClass = createEClass(RC_ANNOTATION);
		createEAttribute(rcAnnotationEClass, RC_ANNOTATION__SOURCE);
		createEReference(rcAnnotationEClass, RC_ANNOTATION__DETAILS);

		rcAnnotationDetailEClass = createEClass(RC_ANNOTATION_DETAIL);
		createEAttribute(rcAnnotationDetailEClass, RC_ANNOTATION_DETAIL__KEY);
		createEAttribute(rcAnnotationDetailEClass, RC_ANNOTATION_DETAIL__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServicedefPackage theServicedefPackage = (ServicedefPackage)EPackage.Registry.INSTANCE.getEPackage(ServicedefPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pdpaServiceConnectorEClass.getESuperTypes().add(this.getServiceConnector());
		fileSystemConnectorEClass.getESuperTypes().add(this.getResourceConnector());
		jdbcDataSourceConnectorEClass.getESuperTypes().add(this.getResourceConnector());
		ldapJndiConnectorEClass.getESuperTypes().add(this.getResourceConnector());
		rpcWebServiceConnectorEClass.getESuperTypes().add(this.getServiceConnector());
		serviceConnectorEClass.getESuperTypes().add(this.getResourceConnector());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceConnectorEClass, ResourceConnector.class, "ResourceConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceConnector_Code(), ecorePackage.getEString(), "code", null, 0, 1, ResourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceConnector_Annotations(), this.getRCAnnotation(), null, "annotations", null, 0, -1, ResourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdpaServiceConnectorEClass, PDPAServiceConnector.class, "PDPAServiceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileSystemConnectorEClass, FileSystemConnector.class, "FileSystemConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jdbcDataSourceConnectorEClass, JDBCDataSourceConnector.class, "JDBCDataSourceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ldapJndiConnectorEClass, LdapJndiConnector.class, "LdapJndiConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpcWebServiceConnectorEClass, RPCWebServiceConnector.class, "RPCWebServiceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPCWebServiceConnector_Endpoint(), theServicedefPackage.getWSEndpoint(), null, "endpoint", null, 0, 1, RPCWebServiceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceSelectorEClass, ServiceSelector.class, "ServiceSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceSelector_CodProd(), ecorePackage.getEString(), "codProd", null, 0, 1, ServiceSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSelector_CodServ(), ecorePackage.getEString(), "codServ", null, 0, 1, ServiceSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSelector_VerServ(), ecorePackage.getEString(), "verServ", null, 0, 1, ServiceSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSelector_CodEnte(), ecorePackage.getEString(), "codEnte", null, 0, 1, ServiceSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSelector_Istanza(), ecorePackage.getEString(), "istanza", null, 0, 1, ServiceSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSelector_Ambiente(), ecorePackage.getEString(), "ambiente", null, 0, 1, ServiceSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceSelector_CodBinding(), ecorePackage.getEString(), "codBinding", null, 0, 1, ServiceSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceSetEClass, ResourceSet.class, "ResourceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceSet_Resources(), this.getResourceConnector(), null, "resources", null, 0, -1, ResourceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceConnectorEClass, ServiceConnector.class, "ServiceConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceConnector_ServiceDef(), theServicedefPackage.getServiceDef(), null, "serviceDef", null, 0, 1, ServiceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConnector_Binding(), theServicedefPackage.getServiceBinding(), null, "binding", null, 0, 1, ServiceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceConnector_Selector(), this.getServiceSelector(), null, "selector", null, 0, 1, ServiceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceConnector_UseRegistry(), ecorePackage.getEBoolean(), "useRegistry", null, 0, 1, ServiceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rcAnnotationEClass, RCAnnotation.class, "RCAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRCAnnotation_Source(), ecorePackage.getEString(), "source", null, 0, 1, RCAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRCAnnotation_Details(), this.getRCAnnotationDetail(), null, "details", null, 0, -1, RCAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rcAnnotationDetailEClass, RCAnnotationDetail.class, "RCAnnotationDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRCAnnotationDetail_Key(), ecorePackage.getEString(), "key", null, 0, 1, RCAnnotationDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRCAnnotationDetail_Value(), ecorePackage.getEString(), "value", null, 0, 1, RCAnnotationDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AppresourcesPackageImpl
