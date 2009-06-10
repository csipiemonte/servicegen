/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.*;

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
public class ServicedefFactoryImpl extends EFactoryImpl implements ServicedefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServicedefFactory init() {
		try {
			ServicedefFactory theServicedefFactory = (ServicedefFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.csi.it/mddtools/servicedef"); 
			if (theServicedefFactory != null) {
				return theServicedefFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServicedefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicedefFactoryImpl() {
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
			case ServicedefPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ServicedefPackage.SERVICE_DEF: return createServiceDef();
			case ServicedefPackage.EJBPA_BINDING: return createEJBPABinding();
			case ServicedefPackage.SOAPPABR_BINDING: return createSOAPPABRBinding();
			case ServicedefPackage.WSFAD_BINDING: return createWSFADBinding();
			case ServicedefPackage.OPERATION: return createOperation();
			case ServicedefPackage.PARAM: return createParam();
			case ServicedefPackage.TYPES: return createTypes();
			case ServicedefPackage.BASE_TYPES: return createBaseTypes();
			case ServicedefPackage.ROLE: return createRole();
			case ServicedefPackage.INPUT_VALIDATOR: return createInputValidator();
			case ServicedefPackage.PARAM_VALIDATOR: return createParamValidator();
			case ServicedefPackage.VALUE_VALORIZATION_CONSTRAINT: return createValueValorizationConstraint();
			case ServicedefPackage.CUSTOM_CONSTRAINT: return createCustomConstraint();
			case ServicedefPackage.RELATIVE_CONSTRAINT: return createRelativeConstraint();
			case ServicedefPackage.SIMPLE_PARAM_COINSTRAINT: return createSimpleParamCoinstraint();
			case ServicedefPackage.AND_PARAM_CONSTRAINT: return createANDParamConstraint();
			case ServicedefPackage.OR_PARAM_CONSTRAINT: return createORParamConstraint();
			case ServicedefPackage.NOT_PARAM_CONSTRAINT: return createNOTParamConstraint();
			case ServicedefPackage.AND_VALUE_CONSTRAINT: return createANDValueConstraint();
			case ServicedefPackage.OR_VALUE_CONSTRAINT: return createORValueConstraint();
			case ServicedefPackage.NOT_VALUE_CONSTRAINT: return createNOTValueConstraint();
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT: return createContinuousRangeConstraint();
			case ServicedefPackage.DISCRETE_RANGE_CONSTRAINT: return createDiscreteRangeConstraint();
			case ServicedefPackage.SIMPLE_FEATURE_CONSTRAINT: return createSimpleFeatureConstraint();
			case ServicedefPackage.AND_FEATURE_CONSTRAINT: return createANDFeatureConstraint();
			case ServicedefPackage.OR_FEATURE_CONSTRAINT: return createORFeatureConstraint();
			case ServicedefPackage.NOT_FEATURE_CONSTRAINT: return createNOTFeatureConstraint();
			case ServicedefPackage.SERVICE_DEF_ANNOTATION: return createServiceDefAnnotation();
			case ServicedefPackage.SD_ANNOTATION_DETAIL: return createSDAnnotationDetail();
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
			case ServicedefPackage.OP_TYPE_ENUM:
				return createOpTypeEnumFromString(eDataType, initialValue);
			case ServicedefPackage.TX_TYPE_ENUM:
				return createTXTypeEnumFromString(eDataType, initialValue);
			case ServicedefPackage.SRV_TYPE_ENUM:
				return createSrvTypeEnumFromString(eDataType, initialValue);
			case ServicedefPackage.AUTH_LEVEL_ENUM:
				return createAuthLevelEnumFromString(eDataType, initialValue);
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
			case ServicedefPackage.OP_TYPE_ENUM:
				return convertOpTypeEnumToString(eDataType, instanceValue);
			case ServicedefPackage.TX_TYPE_ENUM:
				return convertTXTypeEnumToString(eDataType, instanceValue);
			case ServicedefPackage.SRV_TYPE_ENUM:
				return convertSrvTypeEnumToString(eDataType, instanceValue);
			case ServicedefPackage.AUTH_LEVEL_ENUM:
				return convertAuthLevelEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDef createServiceDef() {
		ServiceDefImpl serviceDef = new ServiceDefImpl();
		return serviceDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EJBPABinding createEJBPABinding() {
		EJBPABindingImpl ejbpaBinding = new EJBPABindingImpl();
		return ejbpaBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOAPPABRBinding createSOAPPABRBinding() {
		SOAPPABRBindingImpl soappabrBinding = new SOAPPABRBindingImpl();
		return soappabrBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WSFADBinding createWSFADBinding() {
		WSFADBindingImpl wsfadBinding = new WSFADBindingImpl();
		return wsfadBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Param createParam() {
		ParamImpl param = new ParamImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Types createTypes() {
		TypesImpl types = new TypesImpl();
		return types;
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
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputValidator createInputValidator() {
		InputValidatorImpl inputValidator = new InputValidatorImpl();
		return inputValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamValidator createParamValidator() {
		ParamValidatorImpl paramValidator = new ParamValidatorImpl();
		return paramValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueValorizationConstraint createValueValorizationConstraint() {
		ValueValorizationConstraintImpl valueValorizationConstraint = new ValueValorizationConstraintImpl();
		return valueValorizationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomConstraint createCustomConstraint() {
		CustomConstraintImpl customConstraint = new CustomConstraintImpl();
		return customConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeConstraint createRelativeConstraint() {
		RelativeConstraintImpl relativeConstraint = new RelativeConstraintImpl();
		return relativeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParamCoinstraint createSimpleParamCoinstraint() {
		SimpleParamCoinstraintImpl simpleParamCoinstraint = new SimpleParamCoinstraintImpl();
		return simpleParamCoinstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDParamConstraint createANDParamConstraint() {
		ANDParamConstraintImpl andParamConstraint = new ANDParamConstraintImpl();
		return andParamConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORParamConstraint createORParamConstraint() {
		ORParamConstraintImpl orParamConstraint = new ORParamConstraintImpl();
		return orParamConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOTParamConstraint createNOTParamConstraint() {
		NOTParamConstraintImpl notParamConstraint = new NOTParamConstraintImpl();
		return notParamConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDValueConstraint createANDValueConstraint() {
		ANDValueConstraintImpl andValueConstraint = new ANDValueConstraintImpl();
		return andValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORValueConstraint createORValueConstraint() {
		ORValueConstraintImpl orValueConstraint = new ORValueConstraintImpl();
		return orValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOTValueConstraint createNOTValueConstraint() {
		NOTValueConstraintImpl notValueConstraint = new NOTValueConstraintImpl();
		return notValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousRangeConstraint createContinuousRangeConstraint() {
		ContinuousRangeConstraintImpl continuousRangeConstraint = new ContinuousRangeConstraintImpl();
		return continuousRangeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteRangeConstraint createDiscreteRangeConstraint() {
		DiscreteRangeConstraintImpl discreteRangeConstraint = new DiscreteRangeConstraintImpl();
		return discreteRangeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleFeatureConstraint createSimpleFeatureConstraint() {
		SimpleFeatureConstraintImpl simpleFeatureConstraint = new SimpleFeatureConstraintImpl();
		return simpleFeatureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDFeatureConstraint createANDFeatureConstraint() {
		ANDFeatureConstraintImpl andFeatureConstraint = new ANDFeatureConstraintImpl();
		return andFeatureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORFeatureConstraint createORFeatureConstraint() {
		ORFeatureConstraintImpl orFeatureConstraint = new ORFeatureConstraintImpl();
		return orFeatureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOTFeatureConstraint createNOTFeatureConstraint() {
		NOTFeatureConstraintImpl notFeatureConstraint = new NOTFeatureConstraintImpl();
		return notFeatureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDefAnnotation createServiceDefAnnotation() {
		ServiceDefAnnotationImpl serviceDefAnnotation = new ServiceDefAnnotationImpl();
		return serviceDefAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDAnnotationDetail createSDAnnotationDetail() {
		SDAnnotationDetailImpl sdAnnotationDetail = new SDAnnotationDetailImpl();
		return sdAnnotationDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpTypeEnum createOpTypeEnumFromString(EDataType eDataType, String initialValue) {
		OpTypeEnum result = OpTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXTypeEnum createTXTypeEnumFromString(EDataType eDataType, String initialValue) {
		TXTypeEnum result = TXTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTXTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvTypeEnum createSrvTypeEnumFromString(EDataType eDataType, String initialValue) {
		SrvTypeEnum result = SrvTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSrvTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthLevelEnum createAuthLevelEnumFromString(EDataType eDataType, String initialValue) {
		AuthLevelEnum result = AuthLevelEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthLevelEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicedefPackage getServicedefPackage() {
		return (ServicedefPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicedefPackage getPackage() {
		return ServicedefPackage.eINSTANCE;
	}

} //ServicedefFactoryImpl
