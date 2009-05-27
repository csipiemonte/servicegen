/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see it.csi.mddtools.svcorch.SvcorchFactory
 * @model kind="package"
 * @generated
 */
public interface SvcorchPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "svcorch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.csi.it/mddtools/svcorch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "svcorch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SvcorchPackage eINSTANCE = it.csi.mddtools.svcorch.impl.SvcorchPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.OrchestrationImpl <em>Orchestration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.OrchestrationImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getOrchestration()
	 * @generated
	 */
	int ORCHESTRATION = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION__NODES = 0;

	/**
	 * The feature id for the '<em><b>Global Slots</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION__GLOBAL_SLOTS = 1;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION__SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION__OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Input Param Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION__INPUT_PARAM_BINDINGS = 4;

	/**
	 * The feature id for the '<em><b>Return Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION__RETURN_SLOT = 5;

	/**
	 * The number of structural features of the '<em>Orchestration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORCHESTRATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.NodeImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.OpNodeImpl <em>Op Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.OpNodeImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getOpNode()
	 * @generated
	 */
	int OP_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_NODE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_NODE__NEXT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Op Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.FlowNodeImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.StartNodeImpl <em>Start Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.StartNodeImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getStartNode()
	 * @generated
	 */
	int START_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE__NEXT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.StopNodeImpl <em>Stop Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.StopNodeImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getStopNode()
	 * @generated
	 */
	int STOP_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Stop Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_NODE_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.SrvCallImpl <em>Srv Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.SrvCallImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getSrvCall()
	 * @generated
	 */
	int SRV_CALL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CALL__NAME = OP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CALL__DESCRIPTION = OP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CALL__NEXT = OP_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CALL__OPERATION = OP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CALL__SERVICE_CONNECTOR = OP_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CALL__PARAM_BINDINGS = OP_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CALL__OUTPUT_SLOT = OP_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>On Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CALL__ON_EXCEPTION = OP_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Srv Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRV_CALL_FEATURE_COUNT = OP_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.PAPDCallImpl <em>PAPD Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.PAPDCallImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getPAPDCall()
	 * @generated
	 */
	int PAPD_CALL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPD_CALL__NAME = SRV_CALL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPD_CALL__DESCRIPTION = SRV_CALL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPD_CALL__NEXT = SRV_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPD_CALL__OPERATION = SRV_CALL__OPERATION;

	/**
	 * The feature id for the '<em><b>Service Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPD_CALL__SERVICE_CONNECTOR = SRV_CALL__SERVICE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Param Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPD_CALL__PARAM_BINDINGS = SRV_CALL__PARAM_BINDINGS;

	/**
	 * The feature id for the '<em><b>Output Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPD_CALL__OUTPUT_SLOT = SRV_CALL__OUTPUT_SLOT;

	/**
	 * The feature id for the '<em><b>On Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPD_CALL__ON_EXCEPTION = SRV_CALL__ON_EXCEPTION;

	/**
	 * The number of structural features of the '<em>PAPD Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAPD_CALL_FEATURE_COUNT = SRV_CALL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.WSCallImpl <em>WS Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.WSCallImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getWSCall()
	 * @generated
	 */
	int WS_CALL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_CALL__NAME = SRV_CALL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_CALL__DESCRIPTION = SRV_CALL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_CALL__NEXT = SRV_CALL__NEXT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_CALL__OPERATION = SRV_CALL__OPERATION;

	/**
	 * The feature id for the '<em><b>Service Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_CALL__SERVICE_CONNECTOR = SRV_CALL__SERVICE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Param Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_CALL__PARAM_BINDINGS = SRV_CALL__PARAM_BINDINGS;

	/**
	 * The feature id for the '<em><b>Output Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_CALL__OUTPUT_SLOT = SRV_CALL__OUTPUT_SLOT;

	/**
	 * The feature id for the '<em><b>On Exception</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_CALL__ON_EXCEPTION = SRV_CALL__ON_EXCEPTION;

	/**
	 * The number of structural features of the '<em>WS Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WS_CALL_FEATURE_COUNT = SRV_CALL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.TransformationImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = OP_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DESCRIPTION = OP_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NEXT = OP_NODE__NEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INPUT = OP_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__OUTPUT = OP_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init Out Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INIT_OUT_SLOT = OP_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = OP_NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.CustomTransformationImpl <em>Custom Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.CustomTransformationImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getCustomTransformation()
	 * @generated
	 */
	int CUSTOM_TRANSFORMATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION__DESCRIPTION = TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION__NEXT = TRANSFORMATION__NEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION__INPUT = TRANSFORMATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION__OUTPUT = TRANSFORMATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Init Out Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION__INIT_OUT_SLOT = TRANSFORMATION__INIT_OUT_SLOT;

	/**
	 * The number of structural features of the '<em>Custom Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.DeclarativeTransformationImpl <em>Declarative Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.DeclarativeTransformationImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getDeclarativeTransformation()
	 * @generated
	 */
	int DECLARATIVE_TRANSFORMATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TRANSFORMATION__DESCRIPTION = TRANSFORMATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TRANSFORMATION__NEXT = TRANSFORMATION__NEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TRANSFORMATION__INPUT = TRANSFORMATION__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TRANSFORMATION__OUTPUT = TRANSFORMATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Init Out Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TRANSFORMATION__INIT_OUT_SLOT = TRANSFORMATION__INIT_OUT_SLOT;

	/**
	 * The number of structural features of the '<em>Declarative Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATIVE_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.CheckConditionImpl <em>Check Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.CheckConditionImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getCheckCondition()
	 * @generated
	 */
	int CHECK_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONDITION__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONDITION__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Check Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONDITION_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.ForEachImpl <em>For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.ForEachImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getForEach()
	 * @generated
	 */
	int FOR_EACH = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__COLLECTION = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ITEM = FLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Loop Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__FIRST_LOOP_NODE = FLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>After Loop Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__AFTER_LOOP_NODE = FLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.DataSlotImpl <em>Data Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.DataSlotImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getDataSlot()
	 * @generated
	 */
	int DATA_SLOT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SLOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SLOT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SLOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.NodesImpl <em>Nodes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.NodesImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getNodes()
	 * @generated
	 */
	int NODES = 15;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES__NODES = 0;

	/**
	 * The number of structural features of the '<em>Nodes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.DataSlotsImpl <em>Data Slots</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.DataSlotsImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getDataSlots()
	 * @generated
	 */
	int DATA_SLOTS = 16;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SLOTS__SLOTS = 0;

	/**
	 * The number of structural features of the '<em>Data Slots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SLOTS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.ParamBindingImpl <em>Param Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.ParamBindingImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getParamBinding()
	 * @generated
	 */
	int PARAM_BINDING = 17;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_BINDING__SLOT = 0;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_BINDING__PARAM = 1;

	/**
	 * The number of structural features of the '<em>Param Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_BINDING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.ExceptionHandlerImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getExceptionHandler()
	 * @generated
	 */
	int EXCEPTION_HANDLER = 18;

	/**
	 * The feature id for the '<em><b>Handled Exception</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER__HANDLED_EXCEPTION = 0;

	/**
	 * The number of structural features of the '<em>Exception Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.InputParamBindingsImpl <em>Input Param Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.InputParamBindingsImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getInputParamBindings()
	 * @generated
	 */
	int INPUT_PARAM_BINDINGS = 19;

	/**
	 * The feature id for the '<em><b>Input Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAM_BINDINGS__INPUT_PARAMS = 0;

	/**
	 * The number of structural features of the '<em>Input Param Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAM_BINDINGS_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.svcorch.impl.EndLoopImpl <em>End Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.svcorch.impl.EndLoopImpl
	 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getEndLoop()
	 * @generated
	 */
	int END_LOOP = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>End Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.Orchestration <em>Orchestration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orchestration</em>'.
	 * @see it.csi.mddtools.svcorch.Orchestration
	 * @generated
	 */
	EClass getOrchestration();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.svcorch.Orchestration#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nodes</em>'.
	 * @see it.csi.mddtools.svcorch.Orchestration#getNodes()
	 * @see #getOrchestration()
	 * @generated
	 */
	EReference getOrchestration_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.svcorch.Orchestration#getGlobalSlots <em>Global Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Slots</em>'.
	 * @see it.csi.mddtools.svcorch.Orchestration#getGlobalSlots()
	 * @see #getOrchestration()
	 * @generated
	 */
	EReference getOrchestration_GlobalSlots();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.Orchestration#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see it.csi.mddtools.svcorch.Orchestration#getService()
	 * @see #getOrchestration()
	 * @generated
	 */
	EReference getOrchestration_Service();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.Orchestration#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see it.csi.mddtools.svcorch.Orchestration#getOperation()
	 * @see #getOrchestration()
	 * @generated
	 */
	EReference getOrchestration_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.svcorch.Orchestration#getInputParamBindings <em>Input Param Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Param Bindings</em>'.
	 * @see it.csi.mddtools.svcorch.Orchestration#getInputParamBindings()
	 * @see #getOrchestration()
	 * @generated
	 */
	EReference getOrchestration_InputParamBindings();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.Orchestration#getReturnSlot <em>Return Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Slot</em>'.
	 * @see it.csi.mddtools.svcorch.Orchestration#getReturnSlot()
	 * @see #getOrchestration()
	 * @generated
	 */
	EReference getOrchestration_ReturnSlot();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see it.csi.mddtools.svcorch.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.svcorch.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.svcorch.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.svcorch.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see it.csi.mddtools.svcorch.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.OpNode <em>Op Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op Node</em>'.
	 * @see it.csi.mddtools.svcorch.OpNode
	 * @generated
	 */
	EClass getOpNode();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.OpNode#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see it.csi.mddtools.svcorch.OpNode#getNext()
	 * @see #getOpNode()
	 * @generated
	 */
	EReference getOpNode_Next();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see it.csi.mddtools.svcorch.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.StartNode <em>Start Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Node</em>'.
	 * @see it.csi.mddtools.svcorch.StartNode
	 * @generated
	 */
	EClass getStartNode();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.StartNode#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see it.csi.mddtools.svcorch.StartNode#getNext()
	 * @see #getStartNode()
	 * @generated
	 */
	EReference getStartNode_Next();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.StopNode <em>Stop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Node</em>'.
	 * @see it.csi.mddtools.svcorch.StopNode
	 * @generated
	 */
	EClass getStopNode();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.SrvCall <em>Srv Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Srv Call</em>'.
	 * @see it.csi.mddtools.svcorch.SrvCall
	 * @generated
	 */
	EClass getSrvCall();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.SrvCall#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see it.csi.mddtools.svcorch.SrvCall#getOperation()
	 * @see #getSrvCall()
	 * @generated
	 */
	EReference getSrvCall_Operation();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.SrvCall#getServiceConnector <em>Service Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Connector</em>'.
	 * @see it.csi.mddtools.svcorch.SrvCall#getServiceConnector()
	 * @see #getSrvCall()
	 * @generated
	 */
	EReference getSrvCall_ServiceConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.svcorch.SrvCall#getParamBindings <em>Param Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param Bindings</em>'.
	 * @see it.csi.mddtools.svcorch.SrvCall#getParamBindings()
	 * @see #getSrvCall()
	 * @generated
	 */
	EReference getSrvCall_ParamBindings();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.SrvCall#getOutputSlot <em>Output Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Slot</em>'.
	 * @see it.csi.mddtools.svcorch.SrvCall#getOutputSlot()
	 * @see #getSrvCall()
	 * @generated
	 */
	EReference getSrvCall_OutputSlot();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.svcorch.SrvCall#getOnException <em>On Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Exception</em>'.
	 * @see it.csi.mddtools.svcorch.SrvCall#getOnException()
	 * @see #getSrvCall()
	 * @generated
	 */
	EReference getSrvCall_OnException();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.PAPDCall <em>PAPD Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PAPD Call</em>'.
	 * @see it.csi.mddtools.svcorch.PAPDCall
	 * @generated
	 */
	EClass getPAPDCall();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.WSCall <em>WS Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WS Call</em>'.
	 * @see it.csi.mddtools.svcorch.WSCall
	 * @generated
	 */
	EClass getWSCall();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see it.csi.mddtools.svcorch.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.svcorch.Transformation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see it.csi.mddtools.svcorch.Transformation#getInput()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Input();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.Transformation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see it.csi.mddtools.svcorch.Transformation#getOutput()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Output();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.svcorch.Transformation#isInitOutSlot <em>Init Out Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Out Slot</em>'.
	 * @see it.csi.mddtools.svcorch.Transformation#isInitOutSlot()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_InitOutSlot();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.CustomTransformation <em>Custom Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Transformation</em>'.
	 * @see it.csi.mddtools.svcorch.CustomTransformation
	 * @generated
	 */
	EClass getCustomTransformation();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.DeclarativeTransformation <em>Declarative Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declarative Transformation</em>'.
	 * @see it.csi.mddtools.svcorch.DeclarativeTransformation
	 * @generated
	 */
	EClass getDeclarativeTransformation();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.CheckCondition <em>Check Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Condition</em>'.
	 * @see it.csi.mddtools.svcorch.CheckCondition
	 * @generated
	 */
	EClass getCheckCondition();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each</em>'.
	 * @see it.csi.mddtools.svcorch.ForEach
	 * @generated
	 */
	EClass getForEach();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.ForEach#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see it.csi.mddtools.svcorch.ForEach#getCollection()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_Collection();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.ForEach#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see it.csi.mddtools.svcorch.ForEach#getItem()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_Item();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.ForEach#getFirstLoopNode <em>First Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Loop Node</em>'.
	 * @see it.csi.mddtools.svcorch.ForEach#getFirstLoopNode()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_FirstLoopNode();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.ForEach#getAfterLoopNode <em>After Loop Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Loop Node</em>'.
	 * @see it.csi.mddtools.svcorch.ForEach#getAfterLoopNode()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_AfterLoopNode();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.DataSlot <em>Data Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Slot</em>'.
	 * @see it.csi.mddtools.svcorch.DataSlot
	 * @generated
	 */
	EClass getDataSlot();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.svcorch.DataSlot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.svcorch.DataSlot#getName()
	 * @see #getDataSlot()
	 * @generated
	 */
	EAttribute getDataSlot_Name();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.DataSlot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see it.csi.mddtools.svcorch.DataSlot#getType()
	 * @see #getDataSlot()
	 * @generated
	 */
	EReference getDataSlot_Type();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.Nodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodes</em>'.
	 * @see it.csi.mddtools.svcorch.Nodes
	 * @generated
	 */
	EClass getNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.svcorch.Nodes#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see it.csi.mddtools.svcorch.Nodes#getNodes()
	 * @see #getNodes()
	 * @generated
	 */
	EReference getNodes_Nodes();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.DataSlots <em>Data Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Slots</em>'.
	 * @see it.csi.mddtools.svcorch.DataSlots
	 * @generated
	 */
	EClass getDataSlots();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.svcorch.DataSlots#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see it.csi.mddtools.svcorch.DataSlots#getSlots()
	 * @see #getDataSlots()
	 * @generated
	 */
	EReference getDataSlots_Slots();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.ParamBinding <em>Param Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Binding</em>'.
	 * @see it.csi.mddtools.svcorch.ParamBinding
	 * @generated
	 */
	EClass getParamBinding();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.ParamBinding#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slot</em>'.
	 * @see it.csi.mddtools.svcorch.ParamBinding#getSlot()
	 * @see #getParamBinding()
	 * @generated
	 */
	EReference getParamBinding_Slot();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.svcorch.ParamBinding#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param</em>'.
	 * @see it.csi.mddtools.svcorch.ParamBinding#getParam()
	 * @see #getParamBinding()
	 * @generated
	 */
	EReference getParamBinding_Param();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.ExceptionHandler <em>Exception Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Handler</em>'.
	 * @see it.csi.mddtools.svcorch.ExceptionHandler
	 * @generated
	 */
	EClass getExceptionHandler();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.svcorch.ExceptionHandler#getHandledException <em>Handled Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Handled Exception</em>'.
	 * @see it.csi.mddtools.svcorch.ExceptionHandler#getHandledException()
	 * @see #getExceptionHandler()
	 * @generated
	 */
	EReference getExceptionHandler_HandledException();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.InputParamBindings <em>Input Param Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Param Bindings</em>'.
	 * @see it.csi.mddtools.svcorch.InputParamBindings
	 * @generated
	 */
	EClass getInputParamBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.svcorch.InputParamBindings#getInputParams <em>Input Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Params</em>'.
	 * @see it.csi.mddtools.svcorch.InputParamBindings#getInputParams()
	 * @see #getInputParamBindings()
	 * @generated
	 */
	EReference getInputParamBindings_InputParams();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.svcorch.EndLoop <em>End Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Loop</em>'.
	 * @see it.csi.mddtools.svcorch.EndLoop
	 * @generated
	 */
	EClass getEndLoop();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SvcorchFactory getSvcorchFactory();

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
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.OrchestrationImpl <em>Orchestration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.OrchestrationImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getOrchestration()
		 * @generated
		 */
		EClass ORCHESTRATION = eINSTANCE.getOrchestration();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION__NODES = eINSTANCE.getOrchestration_Nodes();

		/**
		 * The meta object literal for the '<em><b>Global Slots</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION__GLOBAL_SLOTS = eINSTANCE.getOrchestration_GlobalSlots();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION__SERVICE = eINSTANCE.getOrchestration_Service();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION__OPERATION = eINSTANCE.getOrchestration_Operation();

		/**
		 * The meta object literal for the '<em><b>Input Param Bindings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION__INPUT_PARAM_BINDINGS = eINSTANCE.getOrchestration_InputParamBindings();

		/**
		 * The meta object literal for the '<em><b>Return Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORCHESTRATION__RETURN_SLOT = eINSTANCE.getOrchestration_ReturnSlot();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.NodeImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.OpNodeImpl <em>Op Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.OpNodeImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getOpNode()
		 * @generated
		 */
		EClass OP_NODE = eINSTANCE.getOpNode();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP_NODE__NEXT = eINSTANCE.getOpNode_Next();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.FlowNodeImpl <em>Flow Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.FlowNodeImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getFlowNode()
		 * @generated
		 */
		EClass FLOW_NODE = eINSTANCE.getFlowNode();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.StartNodeImpl <em>Start Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.StartNodeImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getStartNode()
		 * @generated
		 */
		EClass START_NODE = eINSTANCE.getStartNode();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_NODE__NEXT = eINSTANCE.getStartNode_Next();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.StopNodeImpl <em>Stop Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.StopNodeImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getStopNode()
		 * @generated
		 */
		EClass STOP_NODE = eINSTANCE.getStopNode();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.SrvCallImpl <em>Srv Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.SrvCallImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getSrvCall()
		 * @generated
		 */
		EClass SRV_CALL = eINSTANCE.getSrvCall();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_CALL__OPERATION = eINSTANCE.getSrvCall_Operation();

		/**
		 * The meta object literal for the '<em><b>Service Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_CALL__SERVICE_CONNECTOR = eINSTANCE.getSrvCall_ServiceConnector();

		/**
		 * The meta object literal for the '<em><b>Param Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_CALL__PARAM_BINDINGS = eINSTANCE.getSrvCall_ParamBindings();

		/**
		 * The meta object literal for the '<em><b>Output Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_CALL__OUTPUT_SLOT = eINSTANCE.getSrvCall_OutputSlot();

		/**
		 * The meta object literal for the '<em><b>On Exception</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRV_CALL__ON_EXCEPTION = eINSTANCE.getSrvCall_OnException();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.PAPDCallImpl <em>PAPD Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.PAPDCallImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getPAPDCall()
		 * @generated
		 */
		EClass PAPD_CALL = eINSTANCE.getPAPDCall();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.WSCallImpl <em>WS Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.WSCallImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getWSCall()
		 * @generated
		 */
		EClass WS_CALL = eINSTANCE.getWSCall();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.TransformationImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__INPUT = eINSTANCE.getTransformation_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__OUTPUT = eINSTANCE.getTransformation_Output();

		/**
		 * The meta object literal for the '<em><b>Init Out Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__INIT_OUT_SLOT = eINSTANCE.getTransformation_InitOutSlot();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.CustomTransformationImpl <em>Custom Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.CustomTransformationImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getCustomTransformation()
		 * @generated
		 */
		EClass CUSTOM_TRANSFORMATION = eINSTANCE.getCustomTransformation();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.DeclarativeTransformationImpl <em>Declarative Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.DeclarativeTransformationImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getDeclarativeTransformation()
		 * @generated
		 */
		EClass DECLARATIVE_TRANSFORMATION = eINSTANCE.getDeclarativeTransformation();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.CheckConditionImpl <em>Check Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.CheckConditionImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getCheckCondition()
		 * @generated
		 */
		EClass CHECK_CONDITION = eINSTANCE.getCheckCondition();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.ForEachImpl <em>For Each</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.ForEachImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getForEach()
		 * @generated
		 */
		EClass FOR_EACH = eINSTANCE.getForEach();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__COLLECTION = eINSTANCE.getForEach_Collection();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__ITEM = eINSTANCE.getForEach_Item();

		/**
		 * The meta object literal for the '<em><b>First Loop Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__FIRST_LOOP_NODE = eINSTANCE.getForEach_FirstLoopNode();

		/**
		 * The meta object literal for the '<em><b>After Loop Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_EACH__AFTER_LOOP_NODE = eINSTANCE.getForEach_AfterLoopNode();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.DataSlotImpl <em>Data Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.DataSlotImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getDataSlot()
		 * @generated
		 */
		EClass DATA_SLOT = eINSTANCE.getDataSlot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SLOT__NAME = eINSTANCE.getDataSlot_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SLOT__TYPE = eINSTANCE.getDataSlot_Type();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.NodesImpl <em>Nodes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.NodesImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getNodes()
		 * @generated
		 */
		EClass NODES = eINSTANCE.getNodes();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODES__NODES = eINSTANCE.getNodes_Nodes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.DataSlotsImpl <em>Data Slots</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.DataSlotsImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getDataSlots()
		 * @generated
		 */
		EClass DATA_SLOTS = eINSTANCE.getDataSlots();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SLOTS__SLOTS = eINSTANCE.getDataSlots_Slots();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.ParamBindingImpl <em>Param Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.ParamBindingImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getParamBinding()
		 * @generated
		 */
		EClass PARAM_BINDING = eINSTANCE.getParamBinding();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_BINDING__SLOT = eINSTANCE.getParamBinding_Slot();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_BINDING__PARAM = eINSTANCE.getParamBinding_Param();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.ExceptionHandlerImpl <em>Exception Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.ExceptionHandlerImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getExceptionHandler()
		 * @generated
		 */
		EClass EXCEPTION_HANDLER = eINSTANCE.getExceptionHandler();

		/**
		 * The meta object literal for the '<em><b>Handled Exception</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION_HANDLER__HANDLED_EXCEPTION = eINSTANCE.getExceptionHandler_HandledException();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.InputParamBindingsImpl <em>Input Param Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.InputParamBindingsImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getInputParamBindings()
		 * @generated
		 */
		EClass INPUT_PARAM_BINDINGS = eINSTANCE.getInputParamBindings();

		/**
		 * The meta object literal for the '<em><b>Input Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAM_BINDINGS__INPUT_PARAMS = eINSTANCE.getInputParamBindings_InputParams();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.svcorch.impl.EndLoopImpl <em>End Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.svcorch.impl.EndLoopImpl
		 * @see it.csi.mddtools.svcorch.impl.SvcorchPackageImpl#getEndLoop()
		 * @generated
		 */
		EClass END_LOOP = eINSTANCE.getEndLoop();

	}

} //SvcorchPackage
