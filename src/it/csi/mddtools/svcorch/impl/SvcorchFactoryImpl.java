/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch.impl;

import it.csi.mddtools.svcorch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SvcorchFactoryImpl extends EFactoryImpl implements SvcorchFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SvcorchFactory init() {
		try {
			SvcorchFactory theSvcorchFactory = (SvcorchFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.csi.it/mddtools/svcorch"); 
			if (theSvcorchFactory != null) {
				return theSvcorchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SvcorchFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvcorchFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SvcorchPackage.ORCHESTRATION: return createOrchestration();
			case SvcorchPackage.START_NODE: return createStartNode();
			case SvcorchPackage.STOP_NODE: return createStopNode();
			case SvcorchPackage.PAPD_CALL: return createPAPDCall();
			case SvcorchPackage.WS_CALL: return createWSCall();
			case SvcorchPackage.CUSTOM_TRANSFORMATION: return createCustomTransformation();
			case SvcorchPackage.DECLARATIVE_TRANSFORMATION: return createDeclarativeTransformation();
			case SvcorchPackage.CHECK_CONDITION: return createCheckCondition();
			case SvcorchPackage.FOR_EACH: return createForEach();
			case SvcorchPackage.DATA_SLOT: return createDataSlot();
			case SvcorchPackage.NODES: return createNodes();
			case SvcorchPackage.DATA_SLOTS: return createDataSlots();
			case SvcorchPackage.PARAM_BINDING: return createParamBinding();
			case SvcorchPackage.EXCEPTION_HANDLER: return createExceptionHandler();
			case SvcorchPackage.INPUT_PARAM_BINDINGS: return createInputParamBindings();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orchestration createOrchestration() {
		OrchestrationImpl orchestration = new OrchestrationImpl();
		return orchestration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartNode createStartNode() {
		StartNodeImpl startNode = new StartNodeImpl();
		return startNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopNode createStopNode() {
		StopNodeImpl stopNode = new StopNodeImpl();
		return stopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PAPDCall createPAPDCall() {
		PAPDCallImpl papdCall = new PAPDCallImpl();
		return papdCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSCall createWSCall() {
		WSCallImpl wsCall = new WSCallImpl();
		return wsCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTransformation createCustomTransformation() {
		CustomTransformationImpl customTransformation = new CustomTransformationImpl();
		return customTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarativeTransformation createDeclarativeTransformation() {
		DeclarativeTransformationImpl declarativeTransformation = new DeclarativeTransformationImpl();
		return declarativeTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckCondition createCheckCondition() {
		CheckConditionImpl checkCondition = new CheckConditionImpl();
		return checkCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForEach createForEach() {
		ForEachImpl forEach = new ForEachImpl();
		return forEach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlot createDataSlot() {
		DataSlotImpl dataSlot = new DataSlotImpl();
		return dataSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodes createNodes() {
		NodesImpl nodes = new NodesImpl();
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSlots createDataSlots() {
		DataSlotsImpl dataSlots = new DataSlotsImpl();
		return dataSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamBinding createParamBinding() {
		ParamBindingImpl paramBinding = new ParamBindingImpl();
		return paramBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionHandler createExceptionHandler() {
		ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
		return exceptionHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParamBindings createInputParamBindings() {
		InputParamBindingsImpl inputParamBindings = new InputParamBindingsImpl();
		return inputParamBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvcorchPackage getSvcorchPackage() {
		return (SvcorchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SvcorchPackage getPackage() {
		return SvcorchPackage.eINSTANCE;
	}

} //SvcorchFactoryImpl
