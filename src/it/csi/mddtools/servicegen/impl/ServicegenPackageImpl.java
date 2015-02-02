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

import it.csi.mddtools.appresources.AppresourcesPackage;
import it.csi.mddtools.servicedef.ServicedefPackage;

import it.csi.mddtools.servicegen.BaseTypes;
import it.csi.mddtools.servicegen.CompositeSC;
import it.csi.mddtools.servicegen.CustomTemplateBasedImplCartridge;
import it.csi.mddtools.servicegen.FlowBasedSC;
import it.csi.mddtools.servicegen.FlowModelImplCartridge;
import it.csi.mddtools.servicegen.LogicImplCartridge;
import it.csi.mddtools.servicegen.ManualImplCartridge;
import it.csi.mddtools.servicegen.ModelBasedImplCartridge;
import it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC;
import it.csi.mddtools.servicegen.ResourceBasedSC;
import it.csi.mddtools.servicegen.ResourceBasedSimpleSC;
import it.csi.mddtools.servicegen.SOABEModel;
import it.csi.mddtools.servicegen.ServiceComponent;
import it.csi.mddtools.servicegen.ServiceImpl;
import it.csi.mddtools.servicegen.ServicegenFactory;
import it.csi.mddtools.servicegen.ServicegenPackage;
import it.csi.mddtools.servicegen.SimpleSC;
import it.csi.mddtools.servicegen.TargetPlatform;
import it.csi.mddtools.servicegen.TargetPlatformCodes;

import it.csi.mddtools.svcorch.SvcorchPackage;
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
	private EClass serviceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleSCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeSCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceBasedSCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceBasedSimpleSCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orchestrationFlowCompositeSCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowBasedSCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicImplCartridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualImplCartridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTemplateBasedImplCartridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelBasedImplCartridgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowModelImplCartridgeEClass = null;

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
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ServicegenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
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
		ServicegenPackageImpl theServicegenPackage = (ServicegenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicegenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicegenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SvcorchPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServicegenPackage.createPackageContents();

		// Initialize created meta-data
		theServicegenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicegenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicegenPackage.eNS_URI, theServicegenPackage);
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
	public EReference getSOABEModel_ResourceSet() {
		return (EReference)soabeModelEClass.getEStructuralFeatures().get(8);
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
	public EReference getServiceImpl_ServiceComponent() {
		return (EReference)serviceImplEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceImpl_ImplCartridge() {
		return (EReference)serviceImplEClass.getEStructuralFeatures().get(2);
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
	public EClass getServiceComponent() {
		return serviceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceComponent_ImplCartridge() {
		return (EReference)serviceComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleSC() {
		return simpleSCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSC() {
		return compositeSCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceBasedSC() {
		return resourceBasedSCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceBasedSimpleSC() {
		return resourceBasedSimpleSCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceBasedSimpleSC_ResourceSet() {
		return (EReference)resourceBasedSimpleSCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrchestrationFlowCompositeSC() {
		return orchestrationFlowCompositeSCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestrationFlowCompositeSC_Orchestrations() {
		return (EReference)orchestrationFlowCompositeSCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestrationFlowCompositeSC_ResourceSet() {
		return (EReference)orchestrationFlowCompositeSCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowBasedSC() {
		return flowBasedSCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicImplCartridge() {
		return logicImplCartridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualImplCartridge() {
		return manualImplCartridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManualImplCartridge_UseInjectedPojo() {
		return (EAttribute)manualImplCartridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTemplateBasedImplCartridge() {
		return customTemplateBasedImplCartridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTemplateBasedImplCartridge_Template() {
		return (EAttribute)customTemplateBasedImplCartridgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelBasedImplCartridge() {
		return modelBasedImplCartridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowModelImplCartridge() {
		return flowModelImplCartridgeEClass;
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
		createEReference(soabeModelEClass, SOABE_MODEL__RESOURCE_SET);

		baseTypesEClass = createEClass(BASE_TYPES);
		createEReference(baseTypesEClass, BASE_TYPES__BASE_TYPES);

		serviceImplEClass = createEClass(SERVICE_IMPL);
		createEReference(serviceImplEClass, SERVICE_IMPL__PROVIDES);
		createEReference(serviceImplEClass, SERVICE_IMPL__SERVICE_COMPONENT);
		createEReference(serviceImplEClass, SERVICE_IMPL__IMPL_CARTRIDGE);

		targetPlatformEClass = createEClass(TARGET_PLATFORM);
		createEAttribute(targetPlatformEClass, TARGET_PLATFORM__CODE);

		serviceComponentEClass = createEClass(SERVICE_COMPONENT);
		createEReference(serviceComponentEClass, SERVICE_COMPONENT__IMPL_CARTRIDGE);

		simpleSCEClass = createEClass(SIMPLE_SC);

		compositeSCEClass = createEClass(COMPOSITE_SC);

		resourceBasedSCEClass = createEClass(RESOURCE_BASED_SC);

		resourceBasedSimpleSCEClass = createEClass(RESOURCE_BASED_SIMPLE_SC);
		createEReference(resourceBasedSimpleSCEClass, RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET);

		orchestrationFlowCompositeSCEClass = createEClass(ORCHESTRATION_FLOW_COMPOSITE_SC);
		createEReference(orchestrationFlowCompositeSCEClass, ORCHESTRATION_FLOW_COMPOSITE_SC__ORCHESTRATIONS);
		createEReference(orchestrationFlowCompositeSCEClass, ORCHESTRATION_FLOW_COMPOSITE_SC__RESOURCE_SET);

		flowBasedSCEClass = createEClass(FLOW_BASED_SC);

		logicImplCartridgeEClass = createEClass(LOGIC_IMPL_CARTRIDGE);

		manualImplCartridgeEClass = createEClass(MANUAL_IMPL_CARTRIDGE);
		createEAttribute(manualImplCartridgeEClass, MANUAL_IMPL_CARTRIDGE__USE_INJECTED_POJO);

		customTemplateBasedImplCartridgeEClass = createEClass(CUSTOM_TEMPLATE_BASED_IMPL_CARTRIDGE);
		createEAttribute(customTemplateBasedImplCartridgeEClass, CUSTOM_TEMPLATE_BASED_IMPL_CARTRIDGE__TEMPLATE);

		modelBasedImplCartridgeEClass = createEClass(MODEL_BASED_IMPL_CARTRIDGE);

		flowModelImplCartridgeEClass = createEClass(FLOW_MODEL_IMPL_CARTRIDGE);

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
		AppresourcesPackage theAppresourcesPackage = (AppresourcesPackage)EPackage.Registry.INSTANCE.getEPackage(AppresourcesPackage.eNS_URI);
		TypedefPackage theTypedefPackage = (TypedefPackage)EPackage.Registry.INSTANCE.getEPackage(TypedefPackage.eNS_URI);
		SvcorchPackage theSvcorchPackage = (SvcorchPackage)EPackage.Registry.INSTANCE.getEPackage(SvcorchPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleSCEClass.getESuperTypes().add(this.getServiceComponent());
		compositeSCEClass.getESuperTypes().add(this.getServiceComponent());
		resourceBasedSimpleSCEClass.getESuperTypes().add(this.getSimpleSC());
		resourceBasedSimpleSCEClass.getESuperTypes().add(this.getResourceBasedSC());
		orchestrationFlowCompositeSCEClass.getESuperTypes().add(this.getCompositeSC());
		orchestrationFlowCompositeSCEClass.getESuperTypes().add(this.getFlowBasedSC());
		orchestrationFlowCompositeSCEClass.getESuperTypes().add(this.getResourceBasedSC());
		manualImplCartridgeEClass.getESuperTypes().add(this.getLogicImplCartridge());
		customTemplateBasedImplCartridgeEClass.getESuperTypes().add(this.getLogicImplCartridge());
		modelBasedImplCartridgeEClass.getESuperTypes().add(this.getLogicImplCartridge());
		flowModelImplCartridgeEClass.getESuperTypes().add(this.getModelBasedImplCartridge());

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
		initEReference(getSOABEModel_ResourceSet(), theAppresourcesPackage.getResourceSet(), null, "resourceSet", null, 0, 1, SOABEModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseTypesEClass, BaseTypes.class, "BaseTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseTypes_BaseTypes(), theTypedefPackage.getType(), null, "baseTypes", null, 0, -1, BaseTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceImplEClass, ServiceImpl.class, "ServiceImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceImpl_Provides(), theServicedefPackage.getServiceDef(), null, "provides", null, 0, 1, ServiceImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceImpl_ServiceComponent(), this.getServiceComponent(), null, "serviceComponent", null, 0, 1, ServiceImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceImpl_ImplCartridge(), this.getLogicImplCartridge(), null, "implCartridge", null, 0, 1, ServiceImpl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetPlatformEClass, TargetPlatform.class, "TargetPlatform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetPlatform_Code(), this.getTargetPlatformCodes(), "code", null, 0, 1, TargetPlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceComponentEClass, ServiceComponent.class, "ServiceComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceComponent_ImplCartridge(), this.getLogicImplCartridge(), null, "implCartridge", null, 0, 1, ServiceComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleSCEClass, SimpleSC.class, "SimpleSC", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeSCEClass, CompositeSC.class, "CompositeSC", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceBasedSCEClass, ResourceBasedSC.class, "ResourceBasedSC", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceBasedSimpleSCEClass, ResourceBasedSimpleSC.class, "ResourceBasedSimpleSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceBasedSimpleSC_ResourceSet(), theAppresourcesPackage.getResourceSet(), null, "resourceSet", null, 0, 1, ResourceBasedSimpleSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orchestrationFlowCompositeSCEClass, OrchestrationFlowCompositeSC.class, "OrchestrationFlowCompositeSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrchestrationFlowCompositeSC_Orchestrations(), theSvcorchPackage.getOrchestration(), null, "orchestrations", null, 0, -1, OrchestrationFlowCompositeSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestrationFlowCompositeSC_ResourceSet(), theAppresourcesPackage.getResourceSet(), null, "resourceSet", null, 0, 1, OrchestrationFlowCompositeSC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowBasedSCEClass, FlowBasedSC.class, "FlowBasedSC", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicImplCartridgeEClass, LogicImplCartridge.class, "LogicImplCartridge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manualImplCartridgeEClass, ManualImplCartridge.class, "ManualImplCartridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManualImplCartridge_UseInjectedPojo(), ecorePackage.getEBoolean(), "useInjectedPojo", "false", 0, 1, ManualImplCartridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customTemplateBasedImplCartridgeEClass, CustomTemplateBasedImplCartridge.class, "CustomTemplateBasedImplCartridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomTemplateBasedImplCartridge_Template(), ecorePackage.getEString(), "template", null, 0, 1, CustomTemplateBasedImplCartridge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelBasedImplCartridgeEClass, ModelBasedImplCartridge.class, "ModelBasedImplCartridge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowModelImplCartridgeEClass, FlowModelImplCartridge.class, "FlowModelImplCartridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(targetPlatformCodesEEnum, TargetPlatformCodes.class, "TargetPlatformCodes");
		addEEnumLiteral(targetPlatformCodesEEnum, TargetPlatformCodes.WLS92);
		addEEnumLiteral(targetPlatformCodesEEnum, TargetPlatformCodes.JBOSS43);
		addEEnumLiteral(targetPlatformCodesEEnum, TargetPlatformCodes.JBOSS_EAP6);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// GenModel
		createGenModel_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "GenModel";	
		addAnnotation
		  (getServiceComponent_ImplCartridge(), 
		   source, 
		   new String[] {
			 "documentation", "[[ TODO - add documentation here ]]"
		   });
	}

} //ServicegenPackageImpl
