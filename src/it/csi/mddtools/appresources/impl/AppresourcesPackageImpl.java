/**
 * <copyright>
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
import it.csi.mddtools.appresources.RPCWebServiceConnector;
import it.csi.mddtools.appresources.ResourceConnector;
import it.csi.mddtools.appresources.ResourceSet;
import it.csi.mddtools.appresources.ServiceSelector;

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
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
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
		AppresourcesPackageImpl theAppresourcesPackage = (AppresourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof AppresourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new AppresourcesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAppresourcesPackage.createPackageContents();

		// Initialize created meta-data
		theAppresourcesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAppresourcesPackage.freeze();

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
	public EClass getPDPAServiceConnector() {
		return pdpaServiceConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPDPAServiceConnector_Selector() {
		return (EReference)pdpaServiceConnectorEClass.getEStructuralFeatures().get(0);
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
	public EReference getRPCWebServiceConnector_Selector() {
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

		pdpaServiceConnectorEClass = createEClass(PDPA_SERVICE_CONNECTOR);
		createEReference(pdpaServiceConnectorEClass, PDPA_SERVICE_CONNECTOR__SELECTOR);

		fileSystemConnectorEClass = createEClass(FILE_SYSTEM_CONNECTOR);

		jdbcDataSourceConnectorEClass = createEClass(JDBC_DATA_SOURCE_CONNECTOR);

		ldapJndiConnectorEClass = createEClass(LDAP_JNDI_CONNECTOR);

		rpcWebServiceConnectorEClass = createEClass(RPC_WEB_SERVICE_CONNECTOR);
		createEReference(rpcWebServiceConnectorEClass, RPC_WEB_SERVICE_CONNECTOR__SELECTOR);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pdpaServiceConnectorEClass.getESuperTypes().add(this.getResourceConnector());
		fileSystemConnectorEClass.getESuperTypes().add(this.getResourceConnector());
		jdbcDataSourceConnectorEClass.getESuperTypes().add(this.getResourceConnector());
		ldapJndiConnectorEClass.getESuperTypes().add(this.getResourceConnector());
		rpcWebServiceConnectorEClass.getESuperTypes().add(this.getResourceConnector());

		// Initialize classes and features; add operations and parameters
		initEClass(resourceConnectorEClass, ResourceConnector.class, "ResourceConnector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceConnector_Code(), ecorePackage.getEString(), "code", null, 0, 1, ResourceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pdpaServiceConnectorEClass, PDPAServiceConnector.class, "PDPAServiceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPDPAServiceConnector_Selector(), this.getServiceSelector(), null, "selector", null, 0, 1, PDPAServiceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileSystemConnectorEClass, FileSystemConnector.class, "FileSystemConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jdbcDataSourceConnectorEClass, JDBCDataSourceConnector.class, "JDBCDataSourceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ldapJndiConnectorEClass, LdapJndiConnector.class, "LdapJndiConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpcWebServiceConnectorEClass, RPCWebServiceConnector.class, "RPCWebServiceConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRPCWebServiceConnector_Selector(), this.getServiceSelector(), null, "selector", null, 0, 1, RPCWebServiceConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);
	}

} //AppresourcesPackageImpl
