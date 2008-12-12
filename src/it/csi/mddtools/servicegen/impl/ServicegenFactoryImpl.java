/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen.impl;

import it.csi.mddtools.servicegen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ServicegenFactoryImpl extends EFactoryImpl implements ServicegenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServicegenFactory init() {
		try {
			ServicegenFactory theServicegenFactory = (ServicegenFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.csi.it/mddtools/servicegen"); 
			if (theServicegenFactory != null) {
				return theServicegenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServicegenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicegenFactoryImpl() {
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
			case ServicegenPackage.SOABE_MODEL: return createSOABEModel();
			case ServicegenPackage.BASE_TYPES: return createBaseTypes();
			case ServicegenPackage.SERVICE_IMPL: return createServiceImpl();
			case ServicegenPackage.TARGET_PLATFORM: return createTargetPlatform();
			case ServicegenPackage.RESOURCE_BASED_SIMPLE_SC: return createResourceBasedSimpleSC();
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC: return createOrchestrationFlowCompositeSC();
			case ServicegenPackage.MANUAL_IMPL_CARTRIDGE: return createManualImplCartridge();
			case ServicegenPackage.CUSTOM_TEMPLATE_BASED_IMPL_CARTRIDGE: return createCustomTemplateBasedImplCartridge();
			case ServicegenPackage.FLOW_MODEL_IMPL_CARTRIDGE: return createFlowModelImplCartridge();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ServicegenPackage.TARGET_PLATFORM_CODES:
				return createTargetPlatformCodesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ServicegenPackage.TARGET_PLATFORM_CODES:
				return convertTargetPlatformCodesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOABEModel createSOABEModel() {
		SOABEModelImpl soabeModel = new SOABEModelImpl();
		return soabeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseTypes createBaseTypes() {
		BaseTypesImpl baseTypes = new BaseTypesImpl();
		return baseTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceImpl createServiceImpl() {
		ServiceImplImpl serviceImpl = new ServiceImplImpl();
		return serviceImpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatform createTargetPlatform() {
		TargetPlatformImpl targetPlatform = new TargetPlatformImpl();
		return targetPlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceBasedSimpleSC createResourceBasedSimpleSC() {
		ResourceBasedSimpleSCImpl resourceBasedSimpleSC = new ResourceBasedSimpleSCImpl();
		return resourceBasedSimpleSC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationFlowCompositeSC createOrchestrationFlowCompositeSC() {
		OrchestrationFlowCompositeSCImpl orchestrationFlowCompositeSC = new OrchestrationFlowCompositeSCImpl();
		return orchestrationFlowCompositeSC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualImplCartridge createManualImplCartridge() {
		ManualImplCartridgeImpl manualImplCartridge = new ManualImplCartridgeImpl();
		return manualImplCartridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTemplateBasedImplCartridge createCustomTemplateBasedImplCartridge() {
		CustomTemplateBasedImplCartridgeImpl customTemplateBasedImplCartridge = new CustomTemplateBasedImplCartridgeImpl();
		return customTemplateBasedImplCartridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowModelImplCartridge createFlowModelImplCartridge() {
		FlowModelImplCartridgeImpl flowModelImplCartridge = new FlowModelImplCartridgeImpl();
		return flowModelImplCartridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformCodes createTargetPlatformCodesFromString(EDataType eDataType, String initialValue) {
		TargetPlatformCodes result = TargetPlatformCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetPlatformCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicegenPackage getServicegenPackage() {
		return (ServicegenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicegenPackage getPackage() {
		return ServicegenPackage.eINSTANCE;
	}

} //ServicegenFactoryImpl
