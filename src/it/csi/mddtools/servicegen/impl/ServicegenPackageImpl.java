/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen.impl;

import it.csi.mddtools.servicedef.ServicedefPackage;

import it.csi.mddtools.servicegen.BaseTypes;
import it.csi.mddtools.servicegen.SOABEModel;
import it.csi.mddtools.servicegen.ServiceImpl;
import it.csi.mddtools.servicegen.ServicegenFactory;
import it.csi.mddtools.servicegen.ServicegenPackage;
import it.csi.mddtools.servicegen.TargetPlatform;
import it.csi.mddtools.servicegen.TargetPlatformCodes;

import it.csi.mddtools.typedef.TypedefPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicegenPackageImpl extends EPackageImpl implements ServicegenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soabeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceImplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPlatformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetPlatformCodesEEnum = null;

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
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicegenPackageImpl() {
		super(eNS_URI, ServicegenFactory.eINSTANCE);
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
	public static ServicegenPackage init() {
		if (isInited) return (ServicegenPackage)EPackage.Registry.INSTANCE.getEPackage(ServicegenPackage.eNS_URI);

		// Obtain or create and register package
		ServicegenPackageImpl theServicegenPackage = (ServicegenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ServicegenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ServicegenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ServicedefPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServicegenPackage.createPackageContents();

		// Initialize created meta-data
		theServicegenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicegenPackage.freeze();

		return theServicegenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOABEModel() {
		return soabeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSOABEModel_BaseTypes() {
		return (EReference)soabeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOABEModel_CodProdotto() {
		return (EAttribute)soabeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOABEModel_CodComponente() {
		return (EAttribute)soabeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOABEModel_VersioneProdotto() {
		return (EAttribute)soabeModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOABEModel_VersioneComponente() {
		return (EAttribute)soabeModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSOABEModel_Serviceimplementations() {
		return (EReference)soabeModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSOABEModel_ServiceDefs() {
		return (EReference)soabeModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSOABEModel_TargetPlatform() {
		return (EReference)soabeModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseTypes() {
		return baseTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseTypes_BaseTypes() {
		return (EReference)baseTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceImpl() {
		return serviceImplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceImpl_Provides() {
		return (EReference)serviceImplEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetPlatform() {
		return targetPlatformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetPlatform_Code() {
		return (EAttribute)targetPlatformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTargetPlatformCodes() {
		return targetPlatformCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicegenFactory getServicegenFactory() {
		return (ServicegenFactory)getEFactoryInstance();
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
		soabeModelEClass = createEClass(SOABE_MODEL);
		createEReference(soabeModelEClass, SOABE_MODEL__BASE_TYPES);
		createEAttribute(soabeModelEClass, SOABE_MODEL__COD_PRODOTTO);
		createEAttribute(soabeModelEClass, SOABE_MODEL__COD_COMPONENTE);
		createEAttribute(soabeModelEClass, SOABE_MODEL__VERSIONE_PRODOTTO);
		createEAttribute(soabeModelEClass, SOABE_MODEL__VERSIONE_COMPONENTE);
		createEReference(soabeModelEClass, SOABE_MODEL__SERVICEIMPLEMENTATIONS);
		createEReference(soabeModelEClass, SOABE_MODEL__SERVICE_DEFS);
		createEReference(soabeModelEClass, SOABE_MODEL__TARGET_PLATFORM);

		baseTypesEClass = createEClass(BASE_TYPES);
		createEReference(baseTypesEClass, BASE_TYPES__BASE_TYPES);

		serviceImplEClass = createEClass(SERVICE_IMPL);
		createEReference(serviceImplEClass, SERVICE_IMPL__PROVIDES);

		targetPlatformEClass = createEClass(TARGET_PLATFORM);
		createEAttribute(targetPlatformEClass, TARGET_PLATFORM__CODE);

		// Create enums
		targetPlatformCodesEEnum = createEEnum(TARGET_PLATFORM_CODES);
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
		TypedefPackage theTypedefPackage = (TypedefPackage)EPackage.Registry.INSTANCE.getEPackage(TypedefPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(soabeModelEClass, SOABEModel.class, "SOABEModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSOABEModel_BaseTypes(), this.getBaseTypes(), null, "baseTypes", null, 0, -1, SOABEModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSOABEModel_CodProdotto(), ecorePackage.getEString(), "codProdotto", null, 0, 1, SOABEModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSOABEModel_CodComponente(), ecorePackage.getEString(), "codComponente", null, 0, 1, SOABEModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSOABEModel_VersioneProdotto(), ecorePackage.getEString(), "versioneProdotto", null, 0, 1, SOABEModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSOABEModel_VersioneComponente(), ecorePackage.getEString(), "versioneComponente", null, 0, 1, SOABEModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSOABEModel_Serviceimplementations(), this.getServiceImpl(), null, "serviceimplementations", null, 0, -1, SOABEModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSOABEModel_ServiceDefs(), theServicedefPackage.getServiceDef(), null, "serviceDefs", null, 0, -1, SOABEModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSOABEModel_TargetPlatform(), this.getTargetPlatform(), null, "targetPlatform", null, 0, 1, SOABEModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseTypesEClass, BaseTypes.class, "BaseTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseTypes_BaseTypes(), theTypedefPackage.getType(), null, "baseTypes", null, 0, -1, BaseTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceImplEClass, ServiceImpl.class, "ServiceImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceImpl_Provides(), theServicedefPackage.getServiceDef(), null, "provides", null, 0, 1, ServiceImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetPlatformEClass, TargetPlatform.class, "TargetPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetPlatform_Code(), this.getTargetPlatformCodes(), "code", null, 0, 1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(targetPlatformCodesEEnum, TargetPlatformCodes.class, "TargetPlatformCodes");
		addEEnumLiteral(targetPlatformCodesEEnum, TargetPlatformCodes.WLS92);
		addEEnumLiteral(targetPlatformCodesEEnum, TargetPlatformCodes.JBOSS43);

		// Create resource
		createResource(eNS_URI);
	}

} //ServicegenPackageImpl
