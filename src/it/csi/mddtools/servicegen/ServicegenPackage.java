/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.servicegen.ServicegenFactory
 * @model kind="package"
 * @generated
 */
public interface ServicegenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "servicegen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.csi.it/mddtools/servicegen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "servicegen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicegenPackage eINSTANCE = it.csi.mddtools.servicegen.impl.ServicegenPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl <em>SOABE Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.SOABEModelImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getSOABEModel()
	 * @generated
	 */
	int SOABE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Base Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOABE_MODEL__BASE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Cod Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOABE_MODEL__COD_PRODOTTO = 1;

	/**
	 * The feature id for the '<em><b>Cod Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOABE_MODEL__COD_COMPONENTE = 2;

	/**
	 * The feature id for the '<em><b>Versione Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOABE_MODEL__VERSIONE_PRODOTTO = 3;

	/**
	 * The feature id for the '<em><b>Versione Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOABE_MODEL__VERSIONE_COMPONENTE = 4;

	/**
	 * The feature id for the '<em><b>Serviceimplementations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOABE_MODEL__SERVICEIMPLEMENTATIONS = 5;

	/**
	 * The feature id for the '<em><b>Service Defs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOABE_MODEL__SERVICE_DEFS = 6;

	/**
	 * The feature id for the '<em><b>Target Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOABE_MODEL__TARGET_PLATFORM = 7;

	/**
	 * The number of structural features of the '<em>SOABE Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOABE_MODEL_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.BaseTypesImpl <em>Base Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.BaseTypesImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getBaseTypes()
	 * @generated
	 */
	int BASE_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Base Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPES__BASE_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Base Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_TYPES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.ServiceImplImpl <em>Service Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.ServiceImplImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getServiceImpl()
	 * @generated
	 */
	int SERVICE_IMPL = 2;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL__PROVIDES = 0;

	/**
	 * The feature id for the '<em><b>Service Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL__SERVICE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Impl Cartridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL__IMPL_CARTRIDGE = 2;

	/**
	 * The number of structural features of the '<em>Service Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_IMPL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.TargetPlatformImpl <em>Target Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.TargetPlatformImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getTargetPlatform()
	 * @generated
	 */
	int TARGET_PLATFORM = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM__CODE = 0;

	/**
	 * The number of structural features of the '<em>Target Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.ServiceComponentImpl <em>Service Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.ServiceComponentImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getServiceComponent()
	 * @generated
	 */
	int SERVICE_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Impl Cartridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT__IMPL_CARTRIDGE = 0;

	/**
	 * The number of structural features of the '<em>Service Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.SimpleSCImpl <em>Simple SC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.SimpleSCImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getSimpleSC()
	 * @generated
	 */
	int SIMPLE_SC = 5;

	/**
	 * The feature id for the '<em><b>Impl Cartridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SC__IMPL_CARTRIDGE = SERVICE_COMPONENT__IMPL_CARTRIDGE;

	/**
	 * The number of structural features of the '<em>Simple SC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SC_FEATURE_COUNT = SERVICE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.CompositeSCImpl <em>Composite SC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.CompositeSCImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getCompositeSC()
	 * @generated
	 */
	int COMPOSITE_SC = 6;

	/**
	 * The feature id for the '<em><b>Impl Cartridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SC__IMPL_CARTRIDGE = SERVICE_COMPONENT__IMPL_CARTRIDGE;

	/**
	 * The number of structural features of the '<em>Composite SC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SC_FEATURE_COUNT = SERVICE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.ResourceBasedSC <em>Resource Based SC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.ResourceBasedSC
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getResourceBasedSC()
	 * @generated
	 */
	int RESOURCE_BASED_SC = 7;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BASED_SC__RESOURCE_SET = 0;

	/**
	 * The number of structural features of the '<em>Resource Based SC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BASED_SC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.ResourceBasedSimpleSCImpl <em>Resource Based Simple SC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.ResourceBasedSimpleSCImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getResourceBasedSimpleSC()
	 * @generated
	 */
	int RESOURCE_BASED_SIMPLE_SC = 8;

	/**
	 * The feature id for the '<em><b>Impl Cartridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BASED_SIMPLE_SC__IMPL_CARTRIDGE = SIMPLE_SC__IMPL_CARTRIDGE;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BASED_SIMPLE_SC__RESOURCE_SET = SIMPLE_SC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Based Simple SC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_BASED_SIMPLE_SC_FEATURE_COUNT = SIMPLE_SC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.OrchestrationFlowCompositeSCImpl <em>Orchestration Flow Composite SC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.OrchestrationFlowCompositeSCImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getOrchestrationFlowCompositeSC()
	 * @generated
	 */
	int ORCHESTRATION_FLOW_COMPOSITE_SC = 9;

	/**
	 * The feature id for the '<em><b>Impl Cartridge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_FLOW_COMPOSITE_SC__IMPL_CARTRIDGE = COMPOSITE_SC__IMPL_CARTRIDGE;

	/**
	 * The feature id for the '<em><b>Resource Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_FLOW_COMPOSITE_SC__RESOURCE_SET = COMPOSITE_SC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Orchestration Flow Composite SC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_FLOW_COMPOSITE_SC_FEATURE_COUNT = COMPOSITE_SC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.FlowBasedSC <em>Flow Based SC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.FlowBasedSC
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getFlowBasedSC()
	 * @generated
	 */
	int FLOW_BASED_SC = 10;

	/**
	 * The number of structural features of the '<em>Flow Based SC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_BASED_SC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.LogicImplCartridgeImpl <em>Logic Impl Cartridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.LogicImplCartridgeImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getLogicImplCartridge()
	 * @generated
	 */
	int LOGIC_IMPL_CARTRIDGE = 11;

	/**
	 * The number of structural features of the '<em>Logic Impl Cartridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_IMPL_CARTRIDGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.ManualImplCartridgeImpl <em>Manual Impl Cartridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.ManualImplCartridgeImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getManualImplCartridge()
	 * @generated
	 */
	int MANUAL_IMPL_CARTRIDGE = 12;

	/**
	 * The number of structural features of the '<em>Manual Impl Cartridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_IMPL_CARTRIDGE_FEATURE_COUNT = LOGIC_IMPL_CARTRIDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.CustomTemplateBasedImplCartridgeImpl <em>Custom Template Based Impl Cartridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.CustomTemplateBasedImplCartridgeImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getCustomTemplateBasedImplCartridge()
	 * @generated
	 */
	int CUSTOM_TEMPLATE_BASED_IMPL_CARTRIDGE = 13;

	/**
	 * The feature id for the '<em><b>Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TEMPLATE_BASED_IMPL_CARTRIDGE__TEMPLATE = LOGIC_IMPL_CARTRIDGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Template Based Impl Cartridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TEMPLATE_BASED_IMPL_CARTRIDGE_FEATURE_COUNT = LOGIC_IMPL_CARTRIDGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.ModelBasedImplCartridgeImpl <em>Model Based Impl Cartridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.ModelBasedImplCartridgeImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getModelBasedImplCartridge()
	 * @generated
	 */
	int MODEL_BASED_IMPL_CARTRIDGE = 14;

	/**
	 * The number of structural features of the '<em>Model Based Impl Cartridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_BASED_IMPL_CARTRIDGE_FEATURE_COUNT = LOGIC_IMPL_CARTRIDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.impl.FlowModelImplCartridgeImpl <em>Flow Model Impl Cartridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.impl.FlowModelImplCartridgeImpl
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getFlowModelImplCartridge()
	 * @generated
	 */
	int FLOW_MODEL_IMPL_CARTRIDGE = 15;

	/**
	 * The number of structural features of the '<em>Flow Model Impl Cartridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_MODEL_IMPL_CARTRIDGE_FEATURE_COUNT = MODEL_BASED_IMPL_CARTRIDGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicegen.TargetPlatformCodes <em>Target Platform Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicegen.TargetPlatformCodes
	 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getTargetPlatformCodes()
	 * @generated
	 */
	int TARGET_PLATFORM_CODES = 16;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.SOABEModel <em>SOABE Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOABE Model</em>'.
	 * @see it.csi.mddtools.servicegen.SOABEModel
	 * @generated
	 */
	EClass getSOABEModel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicegen.SOABEModel#getBaseTypes <em>Base Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Types</em>'.
	 * @see it.csi.mddtools.servicegen.SOABEModel#getBaseTypes()
	 * @see #getSOABEModel()
	 * @generated
	 */
	EReference getSOABEModel_BaseTypes();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicegen.SOABEModel#getCodProdotto <em>Cod Prodotto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Prodotto</em>'.
	 * @see it.csi.mddtools.servicegen.SOABEModel#getCodProdotto()
	 * @see #getSOABEModel()
	 * @generated
	 */
	EAttribute getSOABEModel_CodProdotto();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicegen.SOABEModel#getCodComponente <em>Cod Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Componente</em>'.
	 * @see it.csi.mddtools.servicegen.SOABEModel#getCodComponente()
	 * @see #getSOABEModel()
	 * @generated
	 */
	EAttribute getSOABEModel_CodComponente();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicegen.SOABEModel#getVersioneProdotto <em>Versione Prodotto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versione Prodotto</em>'.
	 * @see it.csi.mddtools.servicegen.SOABEModel#getVersioneProdotto()
	 * @see #getSOABEModel()
	 * @generated
	 */
	EAttribute getSOABEModel_VersioneProdotto();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicegen.SOABEModel#getVersioneComponente <em>Versione Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versione Componente</em>'.
	 * @see it.csi.mddtools.servicegen.SOABEModel#getVersioneComponente()
	 * @see #getSOABEModel()
	 * @generated
	 */
	EAttribute getSOABEModel_VersioneComponente();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicegen.SOABEModel#getServiceimplementations <em>Serviceimplementations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Serviceimplementations</em>'.
	 * @see it.csi.mddtools.servicegen.SOABEModel#getServiceimplementations()
	 * @see #getSOABEModel()
	 * @generated
	 */
	EReference getSOABEModel_Serviceimplementations();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicegen.SOABEModel#getServiceDefs <em>Service Defs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Defs</em>'.
	 * @see it.csi.mddtools.servicegen.SOABEModel#getServiceDefs()
	 * @see #getSOABEModel()
	 * @generated
	 */
	EReference getSOABEModel_ServiceDefs();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicegen.SOABEModel#getTargetPlatform <em>Target Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Platform</em>'.
	 * @see it.csi.mddtools.servicegen.SOABEModel#getTargetPlatform()
	 * @see #getSOABEModel()
	 * @generated
	 */
	EReference getSOABEModel_TargetPlatform();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.BaseTypes <em>Base Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Types</em>'.
	 * @see it.csi.mddtools.servicegen.BaseTypes
	 * @generated
	 */
	EClass getBaseTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicegen.BaseTypes#getBaseTypes <em>Base Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Types</em>'.
	 * @see it.csi.mddtools.servicegen.BaseTypes#getBaseTypes()
	 * @see #getBaseTypes()
	 * @generated
	 */
	EReference getBaseTypes_BaseTypes();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.ServiceImpl <em>Service Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Impl</em>'.
	 * @see it.csi.mddtools.servicegen.ServiceImpl
	 * @generated
	 */
	EClass getServiceImpl();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.servicegen.ServiceImpl#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provides</em>'.
	 * @see it.csi.mddtools.servicegen.ServiceImpl#getProvides()
	 * @see #getServiceImpl()
	 * @generated
	 */
	EReference getServiceImpl_Provides();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicegen.ServiceImpl#getServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Component</em>'.
	 * @see it.csi.mddtools.servicegen.ServiceImpl#getServiceComponent()
	 * @see #getServiceImpl()
	 * @generated
	 */
	EReference getServiceImpl_ServiceComponent();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicegen.ServiceImpl#getImplCartridge <em>Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Impl Cartridge</em>'.
	 * @see it.csi.mddtools.servicegen.ServiceImpl#getImplCartridge()
	 * @see #getServiceImpl()
	 * @generated
	 */
	EReference getServiceImpl_ImplCartridge();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.TargetPlatform <em>Target Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Platform</em>'.
	 * @see it.csi.mddtools.servicegen.TargetPlatform
	 * @generated
	 */
	EClass getTargetPlatform();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicegen.TargetPlatform#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see it.csi.mddtools.servicegen.TargetPlatform#getCode()
	 * @see #getTargetPlatform()
	 * @generated
	 */
	EAttribute getTargetPlatform_Code();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.ServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Component</em>'.
	 * @see it.csi.mddtools.servicegen.ServiceComponent
	 * @generated
	 */
	EClass getServiceComponent();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicegen.ServiceComponent#getImplCartridge <em>Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Impl Cartridge</em>'.
	 * @see it.csi.mddtools.servicegen.ServiceComponent#getImplCartridge()
	 * @see #getServiceComponent()
	 * @generated
	 */
	EReference getServiceComponent_ImplCartridge();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.SimpleSC <em>Simple SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple SC</em>'.
	 * @see it.csi.mddtools.servicegen.SimpleSC
	 * @generated
	 */
	EClass getSimpleSC();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.CompositeSC <em>Composite SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite SC</em>'.
	 * @see it.csi.mddtools.servicegen.CompositeSC
	 * @generated
	 */
	EClass getCompositeSC();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.ResourceBasedSC <em>Resource Based SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Based SC</em>'.
	 * @see it.csi.mddtools.servicegen.ResourceBasedSC
	 * @generated
	 */
	EClass getResourceBasedSC();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicegen.ResourceBasedSC#getResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Set</em>'.
	 * @see it.csi.mddtools.servicegen.ResourceBasedSC#getResourceSet()
	 * @see #getResourceBasedSC()
	 * @generated
	 */
	EReference getResourceBasedSC_ResourceSet();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.ResourceBasedSimpleSC <em>Resource Based Simple SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Based Simple SC</em>'.
	 * @see it.csi.mddtools.servicegen.ResourceBasedSimpleSC
	 * @generated
	 */
	EClass getResourceBasedSimpleSC();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC <em>Orchestration Flow Composite SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestration Flow Composite SC</em>'.
	 * @see it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC
	 * @generated
	 */
	EClass getOrchestrationFlowCompositeSC();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.FlowBasedSC <em>Flow Based SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Based SC</em>'.
	 * @see it.csi.mddtools.servicegen.FlowBasedSC
	 * @generated
	 */
	EClass getFlowBasedSC();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.LogicImplCartridge <em>Logic Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Impl Cartridge</em>'.
	 * @see it.csi.mddtools.servicegen.LogicImplCartridge
	 * @generated
	 */
	EClass getLogicImplCartridge();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.ManualImplCartridge <em>Manual Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Impl Cartridge</em>'.
	 * @see it.csi.mddtools.servicegen.ManualImplCartridge
	 * @generated
	 */
	EClass getManualImplCartridge();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.CustomTemplateBasedImplCartridge <em>Custom Template Based Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Template Based Impl Cartridge</em>'.
	 * @see it.csi.mddtools.servicegen.CustomTemplateBasedImplCartridge
	 * @generated
	 */
	EClass getCustomTemplateBasedImplCartridge();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicegen.CustomTemplateBasedImplCartridge#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template</em>'.
	 * @see it.csi.mddtools.servicegen.CustomTemplateBasedImplCartridge#getTemplate()
	 * @see #getCustomTemplateBasedImplCartridge()
	 * @generated
	 */
	EAttribute getCustomTemplateBasedImplCartridge_Template();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.ModelBasedImplCartridge <em>Model Based Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Based Impl Cartridge</em>'.
	 * @see it.csi.mddtools.servicegen.ModelBasedImplCartridge
	 * @generated
	 */
	EClass getModelBasedImplCartridge();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicegen.FlowModelImplCartridge <em>Flow Model Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Model Impl Cartridge</em>'.
	 * @see it.csi.mddtools.servicegen.FlowModelImplCartridge
	 * @generated
	 */
	EClass getFlowModelImplCartridge();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.servicegen.TargetPlatformCodes <em>Target Platform Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target Platform Codes</em>'.
	 * @see it.csi.mddtools.servicegen.TargetPlatformCodes
	 * @generated
	 */
	EEnum getTargetPlatformCodes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicegenFactory getServicegenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.SOABEModelImpl <em>SOABE Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.SOABEModelImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getSOABEModel()
		 * @generated
		 */
		EClass SOABE_MODEL = eINSTANCE.getSOABEModel();

		/**
		 * The meta object literal for the '<em><b>Base Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOABE_MODEL__BASE_TYPES = eINSTANCE.getSOABEModel_BaseTypes();

		/**
		 * The meta object literal for the '<em><b>Cod Prodotto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOABE_MODEL__COD_PRODOTTO = eINSTANCE.getSOABEModel_CodProdotto();

		/**
		 * The meta object literal for the '<em><b>Cod Componente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOABE_MODEL__COD_COMPONENTE = eINSTANCE.getSOABEModel_CodComponente();

		/**
		 * The meta object literal for the '<em><b>Versione Prodotto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOABE_MODEL__VERSIONE_PRODOTTO = eINSTANCE.getSOABEModel_VersioneProdotto();

		/**
		 * The meta object literal for the '<em><b>Versione Componente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOABE_MODEL__VERSIONE_COMPONENTE = eINSTANCE.getSOABEModel_VersioneComponente();

		/**
		 * The meta object literal for the '<em><b>Serviceimplementations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOABE_MODEL__SERVICEIMPLEMENTATIONS = eINSTANCE.getSOABEModel_Serviceimplementations();

		/**
		 * The meta object literal for the '<em><b>Service Defs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOABE_MODEL__SERVICE_DEFS = eINSTANCE.getSOABEModel_ServiceDefs();

		/**
		 * The meta object literal for the '<em><b>Target Platform</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOABE_MODEL__TARGET_PLATFORM = eINSTANCE.getSOABEModel_TargetPlatform();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.BaseTypesImpl <em>Base Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.BaseTypesImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getBaseTypes()
		 * @generated
		 */
		EClass BASE_TYPES = eINSTANCE.getBaseTypes();

		/**
		 * The meta object literal for the '<em><b>Base Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_TYPES__BASE_TYPES = eINSTANCE.getBaseTypes_BaseTypes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.ServiceImplImpl <em>Service Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.ServiceImplImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getServiceImpl()
		 * @generated
		 */
		EClass SERVICE_IMPL = eINSTANCE.getServiceImpl();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IMPL__PROVIDES = eINSTANCE.getServiceImpl_Provides();

		/**
		 * The meta object literal for the '<em><b>Service Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IMPL__SERVICE_COMPONENT = eINSTANCE.getServiceImpl_ServiceComponent();

		/**
		 * The meta object literal for the '<em><b>Impl Cartridge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_IMPL__IMPL_CARTRIDGE = eINSTANCE.getServiceImpl_ImplCartridge();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.TargetPlatformImpl <em>Target Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.TargetPlatformImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getTargetPlatform()
		 * @generated
		 */
		EClass TARGET_PLATFORM = eINSTANCE.getTargetPlatform();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_PLATFORM__CODE = eINSTANCE.getTargetPlatform_Code();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.ServiceComponentImpl <em>Service Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.ServiceComponentImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getServiceComponent()
		 * @generated
		 */
		EClass SERVICE_COMPONENT = eINSTANCE.getServiceComponent();

		/**
		 * The meta object literal for the '<em><b>Impl Cartridge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_COMPONENT__IMPL_CARTRIDGE = eINSTANCE.getServiceComponent_ImplCartridge();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.SimpleSCImpl <em>Simple SC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.SimpleSCImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getSimpleSC()
		 * @generated
		 */
		EClass SIMPLE_SC = eINSTANCE.getSimpleSC();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.CompositeSCImpl <em>Composite SC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.CompositeSCImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getCompositeSC()
		 * @generated
		 */
		EClass COMPOSITE_SC = eINSTANCE.getCompositeSC();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.ResourceBasedSC <em>Resource Based SC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.ResourceBasedSC
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getResourceBasedSC()
		 * @generated
		 */
		EClass RESOURCE_BASED_SC = eINSTANCE.getResourceBasedSC();

		/**
		 * The meta object literal for the '<em><b>Resource Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_BASED_SC__RESOURCE_SET = eINSTANCE.getResourceBasedSC_ResourceSet();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.ResourceBasedSimpleSCImpl <em>Resource Based Simple SC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.ResourceBasedSimpleSCImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getResourceBasedSimpleSC()
		 * @generated
		 */
		EClass RESOURCE_BASED_SIMPLE_SC = eINSTANCE.getResourceBasedSimpleSC();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.OrchestrationFlowCompositeSCImpl <em>Orchestration Flow Composite SC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.OrchestrationFlowCompositeSCImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getOrchestrationFlowCompositeSC()
		 * @generated
		 */
		EClass ORCHESTRATION_FLOW_COMPOSITE_SC = eINSTANCE.getOrchestrationFlowCompositeSC();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.FlowBasedSC <em>Flow Based SC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.FlowBasedSC
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getFlowBasedSC()
		 * @generated
		 */
		EClass FLOW_BASED_SC = eINSTANCE.getFlowBasedSC();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.LogicImplCartridgeImpl <em>Logic Impl Cartridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.LogicImplCartridgeImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getLogicImplCartridge()
		 * @generated
		 */
		EClass LOGIC_IMPL_CARTRIDGE = eINSTANCE.getLogicImplCartridge();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.ManualImplCartridgeImpl <em>Manual Impl Cartridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.ManualImplCartridgeImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getManualImplCartridge()
		 * @generated
		 */
		EClass MANUAL_IMPL_CARTRIDGE = eINSTANCE.getManualImplCartridge();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.CustomTemplateBasedImplCartridgeImpl <em>Custom Template Based Impl Cartridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.CustomTemplateBasedImplCartridgeImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getCustomTemplateBasedImplCartridge()
		 * @generated
		 */
		EClass CUSTOM_TEMPLATE_BASED_IMPL_CARTRIDGE = eINSTANCE.getCustomTemplateBasedImplCartridge();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_TEMPLATE_BASED_IMPL_CARTRIDGE__TEMPLATE = eINSTANCE.getCustomTemplateBasedImplCartridge_Template();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.ModelBasedImplCartridgeImpl <em>Model Based Impl Cartridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.ModelBasedImplCartridgeImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getModelBasedImplCartridge()
		 * @generated
		 */
		EClass MODEL_BASED_IMPL_CARTRIDGE = eINSTANCE.getModelBasedImplCartridge();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.impl.FlowModelImplCartridgeImpl <em>Flow Model Impl Cartridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.impl.FlowModelImplCartridgeImpl
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getFlowModelImplCartridge()
		 * @generated
		 */
		EClass FLOW_MODEL_IMPL_CARTRIDGE = eINSTANCE.getFlowModelImplCartridge();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicegen.TargetPlatformCodes <em>Target Platform Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicegen.TargetPlatformCodes
		 * @see it.csi.mddtools.servicegen.impl.ServicegenPackageImpl#getTargetPlatformCodes()
		 * @generated
		 */
		EEnum TARGET_PLATFORM_CODES = eINSTANCE.getTargetPlatformCodes();

	}

} //ServicegenPackage
