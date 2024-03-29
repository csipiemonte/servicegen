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

import it.csi.mddtools.appresources.AppresourcesPackage;

import it.csi.mddtools.servicedef.ServicedefPackage;

import it.csi.mddtools.svcorch.CheckCondition;
import it.csi.mddtools.svcorch.CustomTransformation;
import it.csi.mddtools.svcorch.DataSlot;
import it.csi.mddtools.svcorch.DataSlots;
import it.csi.mddtools.svcorch.DeclarativeTransformation;
import it.csi.mddtools.svcorch.EndLoop;
import it.csi.mddtools.svcorch.ExceptionHandler;
import it.csi.mddtools.svcorch.ExceptionMapping;
import it.csi.mddtools.svcorch.ExceptionMappings;
import it.csi.mddtools.svcorch.FlowNode;
import it.csi.mddtools.svcorch.ForEach;
import it.csi.mddtools.svcorch.InputParamBindings;
import it.csi.mddtools.svcorch.Node;
import it.csi.mddtools.svcorch.Nodes;
import it.csi.mddtools.svcorch.OpNode;
import it.csi.mddtools.svcorch.Orchestration;
import it.csi.mddtools.svcorch.PAPDCall;
import it.csi.mddtools.svcorch.ParamBinding;
import it.csi.mddtools.svcorch.SrvCall;
import it.csi.mddtools.svcorch.StartNode;
import it.csi.mddtools.svcorch.StopNode;
import it.csi.mddtools.svcorch.SvcorchFactory;
import it.csi.mddtools.svcorch.SvcorchPackage;
import it.csi.mddtools.svcorch.Transformation;
import it.csi.mddtools.svcorch.UserDefinedOpNode;
import it.csi.mddtools.svcorch.WSCall;

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
public class SvcorchPackageImpl extends EPackageImpl implements SvcorchPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orchestrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srvCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass papdCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarativeTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSlotsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputParamBindingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedOpNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionMappingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionMappingEClass = null;

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
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SvcorchPackageImpl() {
		super(eNS_URI, SvcorchFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SvcorchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SvcorchPackage init() {
		if (isInited) return (SvcorchPackage)EPackage.Registry.INSTANCE.getEPackage(SvcorchPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSvcorchPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SvcorchPackageImpl theSvcorchPackage = registeredSvcorchPackage instanceof SvcorchPackageImpl ? (SvcorchPackageImpl)registeredSvcorchPackage : new SvcorchPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		AppresourcesPackage.eINSTANCE.eClass();
		ServicedefPackage.eINSTANCE.eClass();
		TypedefPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSvcorchPackage.createPackageContents();

		// Initialize created meta-data
		theSvcorchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSvcorchPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SvcorchPackage.eNS_URI, theSvcorchPackage);
		return theSvcorchPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrchestration() {
		return orchestrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestration_Nodes() {
		return (EReference)orchestrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestration_GlobalSlots() {
		return (EReference)orchestrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestration_Service() {
		return (EReference)orchestrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestration_Operation() {
		return (EReference)orchestrationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestration_InputParamBindings() {
		return (EReference)orchestrationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestration_ReturnSlot() {
		return (EReference)orchestrationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestration_ExceptionMappings() {
		return (EReference)orchestrationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrchestration_PrincipalNameSlot() {
		return (EReference)orchestrationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Description() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpNode() {
		return opNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpNode_Next() {
		return (EReference)opNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNode() {
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartNode() {
		return startNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartNode_Next() {
		return (EReference)startNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopNode() {
		return stopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrvCall() {
		return srvCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrvCall_Operation() {
		return (EReference)srvCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrvCall_ServiceConnector() {
		return (EReference)srvCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrvCall_ParamBindings() {
		return (EReference)srvCallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrvCall_OutputSlot() {
		return (EReference)srvCallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrvCall_OnException() {
		return (EReference)srvCallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPAPDCall() {
		return papdCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSCall() {
		return wsCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Input() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Output() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_InitOutSlot() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTransformation() {
		return customTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarativeTransformation() {
		return declarativeTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckCondition() {
		return checkConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckCondition_ThenNode() {
		return (EReference)checkConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckCondition_ElseNode() {
		return (EReference)checkConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckCondition_Input() {
		return (EReference)checkConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForEach() {
		return forEachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEach_Collection() {
		return (EReference)forEachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEach_Item() {
		return (EReference)forEachEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEach_FirstLoopNode() {
		return (EReference)forEachEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForEach_AfterLoopNode() {
		return (EReference)forEachEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSlot() {
		return dataSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSlot_Name() {
		return (EAttribute)dataSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSlot_Type() {
		return (EReference)dataSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodes() {
		return nodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNodes_Nodes() {
		return (EReference)nodesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSlots() {
		return dataSlotsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSlots_Slots() {
		return (EReference)dataSlotsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamBinding() {
		return paramBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamBinding_Slot() {
		return (EReference)paramBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamBinding_Param() {
		return (EReference)paramBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandler() {
		return exceptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_HandledException() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_FirstRecoveryNode() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputParamBindings() {
		return inputParamBindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputParamBindings_InputParams() {
		return (EReference)inputParamBindingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndLoop() {
		return endLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndLoop_LoopHeadNode() {
		return (EReference)endLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedOpNode() {
		return userDefinedOpNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionMappings() {
		return exceptionMappingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionMappings_Mapping() {
		return (EReference)exceptionMappingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionMapping() {
		return exceptionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionMapping_Msg() {
		return (EAttribute)exceptionMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionMapping_From() {
		return (EReference)exceptionMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionMapping_To() {
		return (EReference)exceptionMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvcorchFactory getSvcorchFactory() {
		return (SvcorchFactory)getEFactoryInstance();
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
		orchestrationEClass = createEClass(ORCHESTRATION);
		createEReference(orchestrationEClass, ORCHESTRATION__NODES);
		createEReference(orchestrationEClass, ORCHESTRATION__GLOBAL_SLOTS);
		createEReference(orchestrationEClass, ORCHESTRATION__SERVICE);
		createEReference(orchestrationEClass, ORCHESTRATION__OPERATION);
		createEReference(orchestrationEClass, ORCHESTRATION__INPUT_PARAM_BINDINGS);
		createEReference(orchestrationEClass, ORCHESTRATION__RETURN_SLOT);
		createEReference(orchestrationEClass, ORCHESTRATION__EXCEPTION_MAPPINGS);
		createEReference(orchestrationEClass, ORCHESTRATION__PRINCIPAL_NAME_SLOT);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);
		createEAttribute(nodeEClass, NODE__DESCRIPTION);

		opNodeEClass = createEClass(OP_NODE);
		createEReference(opNodeEClass, OP_NODE__NEXT);

		flowNodeEClass = createEClass(FLOW_NODE);

		startNodeEClass = createEClass(START_NODE);
		createEReference(startNodeEClass, START_NODE__NEXT);

		stopNodeEClass = createEClass(STOP_NODE);

		srvCallEClass = createEClass(SRV_CALL);
		createEReference(srvCallEClass, SRV_CALL__OPERATION);
		createEReference(srvCallEClass, SRV_CALL__SERVICE_CONNECTOR);
		createEReference(srvCallEClass, SRV_CALL__PARAM_BINDINGS);
		createEReference(srvCallEClass, SRV_CALL__OUTPUT_SLOT);
		createEReference(srvCallEClass, SRV_CALL__ON_EXCEPTION);

		papdCallEClass = createEClass(PAPD_CALL);

		wsCallEClass = createEClass(WS_CALL);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__INPUT);
		createEReference(transformationEClass, TRANSFORMATION__OUTPUT);
		createEAttribute(transformationEClass, TRANSFORMATION__INIT_OUT_SLOT);

		customTransformationEClass = createEClass(CUSTOM_TRANSFORMATION);

		declarativeTransformationEClass = createEClass(DECLARATIVE_TRANSFORMATION);

		checkConditionEClass = createEClass(CHECK_CONDITION);
		createEReference(checkConditionEClass, CHECK_CONDITION__THEN_NODE);
		createEReference(checkConditionEClass, CHECK_CONDITION__ELSE_NODE);
		createEReference(checkConditionEClass, CHECK_CONDITION__INPUT);

		forEachEClass = createEClass(FOR_EACH);
		createEReference(forEachEClass, FOR_EACH__COLLECTION);
		createEReference(forEachEClass, FOR_EACH__ITEM);
		createEReference(forEachEClass, FOR_EACH__FIRST_LOOP_NODE);
		createEReference(forEachEClass, FOR_EACH__AFTER_LOOP_NODE);

		dataSlotEClass = createEClass(DATA_SLOT);
		createEAttribute(dataSlotEClass, DATA_SLOT__NAME);
		createEReference(dataSlotEClass, DATA_SLOT__TYPE);

		nodesEClass = createEClass(NODES);
		createEReference(nodesEClass, NODES__NODES);

		dataSlotsEClass = createEClass(DATA_SLOTS);
		createEReference(dataSlotsEClass, DATA_SLOTS__SLOTS);

		paramBindingEClass = createEClass(PARAM_BINDING);
		createEReference(paramBindingEClass, PARAM_BINDING__SLOT);
		createEReference(paramBindingEClass, PARAM_BINDING__PARAM);

		exceptionHandlerEClass = createEClass(EXCEPTION_HANDLER);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__HANDLED_EXCEPTION);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__FIRST_RECOVERY_NODE);

		inputParamBindingsEClass = createEClass(INPUT_PARAM_BINDINGS);
		createEReference(inputParamBindingsEClass, INPUT_PARAM_BINDINGS__INPUT_PARAMS);

		endLoopEClass = createEClass(END_LOOP);
		createEReference(endLoopEClass, END_LOOP__LOOP_HEAD_NODE);

		userDefinedOpNodeEClass = createEClass(USER_DEFINED_OP_NODE);

		exceptionMappingsEClass = createEClass(EXCEPTION_MAPPINGS);
		createEReference(exceptionMappingsEClass, EXCEPTION_MAPPINGS__MAPPING);

		exceptionMappingEClass = createEClass(EXCEPTION_MAPPING);
		createEAttribute(exceptionMappingEClass, EXCEPTION_MAPPING__MSG);
		createEReference(exceptionMappingEClass, EXCEPTION_MAPPING__FROM);
		createEReference(exceptionMappingEClass, EXCEPTION_MAPPING__TO);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		opNodeEClass.getESuperTypes().add(this.getNode());
		flowNodeEClass.getESuperTypes().add(this.getNode());
		startNodeEClass.getESuperTypes().add(this.getFlowNode());
		stopNodeEClass.getESuperTypes().add(this.getFlowNode());
		srvCallEClass.getESuperTypes().add(this.getOpNode());
		papdCallEClass.getESuperTypes().add(this.getSrvCall());
		wsCallEClass.getESuperTypes().add(this.getSrvCall());
		transformationEClass.getESuperTypes().add(this.getOpNode());
		customTransformationEClass.getESuperTypes().add(this.getTransformation());
		declarativeTransformationEClass.getESuperTypes().add(this.getTransformation());
		checkConditionEClass.getESuperTypes().add(this.getFlowNode());
		forEachEClass.getESuperTypes().add(this.getFlowNode());
		endLoopEClass.getESuperTypes().add(this.getFlowNode());
		userDefinedOpNodeEClass.getESuperTypes().add(this.getOpNode());

		// Initialize classes and features; add operations and parameters
		initEClass(orchestrationEClass, Orchestration.class, "Orchestration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrchestration_Nodes(), this.getNodes(), null, "nodes", null, 0, 1, Orchestration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestration_GlobalSlots(), this.getDataSlots(), null, "globalSlots", null, 0, 1, Orchestration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestration_Service(), theServicedefPackage.getServiceDef(), null, "service", null, 0, 1, Orchestration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestration_Operation(), theServicedefPackage.getOperation(), null, "operation", null, 0, 1, Orchestration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestration_InputParamBindings(), this.getInputParamBindings(), null, "inputParamBindings", null, 0, 1, Orchestration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestration_ReturnSlot(), this.getDataSlot(), null, "returnSlot", null, 0, 1, Orchestration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestration_ExceptionMappings(), this.getExceptionMappings(), null, "exceptionMappings", null, 0, 1, Orchestration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrchestration_PrincipalNameSlot(), this.getDataSlot(), null, "principalNameSlot", null, 0, 1, Orchestration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Description(), ecorePackage.getEString(), "description", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opNodeEClass, OpNode.class, "OpNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpNode_Next(), this.getNode(), null, "next", null, 0, 1, OpNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowNodeEClass, FlowNode.class, "FlowNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startNodeEClass, StartNode.class, "StartNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartNode_Next(), this.getNode(), null, "next", null, 0, 1, StartNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopNodeEClass, StopNode.class, "StopNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(srvCallEClass, SrvCall.class, "SrvCall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrvCall_Operation(), theServicedefPackage.getOperation(), null, "operation", null, 0, 1, SrvCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrvCall_ServiceConnector(), theAppresourcesPackage.getServiceConnector(), null, "serviceConnector", null, 0, 1, SrvCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrvCall_ParamBindings(), this.getParamBinding(), null, "paramBindings", null, 0, -1, SrvCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrvCall_OutputSlot(), this.getDataSlot(), null, "outputSlot", null, 0, 1, SrvCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSrvCall_OnException(), this.getExceptionHandler(), null, "onException", null, 0, -1, SrvCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(papdCallEClass, PAPDCall.class, "PAPDCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsCallEClass, WSCall.class, "WSCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_Input(), this.getDataSlot(), null, "input", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Output(), this.getDataSlot(), null, "output", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_InitOutSlot(), ecorePackage.getEBoolean(), "initOutSlot", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customTransformationEClass, CustomTransformation.class, "CustomTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(declarativeTransformationEClass, DeclarativeTransformation.class, "DeclarativeTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkConditionEClass, CheckCondition.class, "CheckCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckCondition_ThenNode(), this.getNode(), null, "thenNode", null, 0, 1, CheckCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckCondition_ElseNode(), this.getNode(), null, "elseNode", null, 0, 1, CheckCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckCondition_Input(), this.getDataSlot(), null, "input", null, 0, -1, CheckCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEachEClass, ForEach.class, "ForEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForEach_Collection(), this.getDataSlot(), null, "collection", null, 0, 1, ForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEach_Item(), this.getDataSlot(), null, "item", null, 0, 1, ForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEach_FirstLoopNode(), this.getNode(), null, "firstLoopNode", null, 0, 1, ForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForEach_AfterLoopNode(), this.getNode(), null, "afterLoopNode", null, 0, 1, ForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSlotEClass, DataSlot.class, "DataSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSlot_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSlot_Type(), theTypedefPackage.getType(), null, "type", null, 0, 1, DataSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodesEClass, Nodes.class, "Nodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNodes_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Nodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSlotsEClass, DataSlots.class, "DataSlots", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSlots_Slots(), this.getDataSlot(), null, "slots", null, 0, -1, DataSlots.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramBindingEClass, ParamBinding.class, "ParamBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamBinding_Slot(), this.getDataSlot(), null, "slot", null, 0, 1, ParamBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamBinding_Param(), theServicedefPackage.getParam(), null, "param", null, 0, 1, ParamBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionHandlerEClass, ExceptionHandler.class, "ExceptionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionHandler_HandledException(), theTypedefPackage.getException(), null, "handledException", null, 0, -1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionHandler_FirstRecoveryNode(), this.getNode(), null, "firstRecoveryNode", null, 0, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputParamBindingsEClass, InputParamBindings.class, "InputParamBindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputParamBindings_InputParams(), this.getParamBinding(), null, "inputParams", null, 0, -1, InputParamBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endLoopEClass, EndLoop.class, "EndLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndLoop_LoopHeadNode(), this.getNode(), null, "loopHeadNode", null, 0, 1, EndLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedOpNodeEClass, UserDefinedOpNode.class, "UserDefinedOpNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceptionMappingsEClass, ExceptionMappings.class, "ExceptionMappings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionMappings_Mapping(), this.getExceptionMapping(), null, "mapping", null, 0, -1, ExceptionMappings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionMappingEClass, ExceptionMapping.class, "ExceptionMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExceptionMapping_Msg(), ecorePackage.getEString(), "msg", null, 0, 1, ExceptionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionMapping_From(), theTypedefPackage.getException(), null, "from", null, 0, 1, ExceptionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExceptionMapping_To(), theTypedefPackage.getException(), null, "to", null, 0, 1, ExceptionMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SvcorchPackageImpl
