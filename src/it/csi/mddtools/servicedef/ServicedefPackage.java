/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;

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
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.servicedef.ServicedefFactory
 * @model kind="package"
 * @generated
 */
public interface ServicedefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "servicedef";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.csi.it/mddtools/servicedef";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "servicedef";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicedefPackage eINSTANCE = it.csi.mddtools.servicedef.impl.ServicedefPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.DocumentRootImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl <em>Service Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ServiceDefImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getServiceDef()
	 * @generated
	 */
	int SERVICE_DEF = 1;

	/**
	 * The feature id for the '<em><b>Cod Servizio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__COD_SERVIZIO = 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__BINDINGS = 1;

	/**
	 * The feature id for the '<em><b>Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__MONITORABLE = 2;

	/**
	 * The feature id for the '<em><b>Diag Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__DIAG_ENABLED = 3;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__OPERATIONS = 4;

	/**
	 * The feature id for the '<em><b>Versione</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__VERSIONE = 5;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__TYPES = 6;

	/**
	 * The feature id for the '<em><b>Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__TRACE_ENABLED = 7;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__SERVICE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Auth Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__AUTH_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__ROLES = 10;

	/**
	 * The feature id for the '<em><b>Cod Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__COD_PRODOTTO = 11;

	/**
	 * The feature id for the '<em><b>Cod Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__COD_COMPONENTE = 12;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF__ANNOTATIONS = 13;

	/**
	 * The number of structural features of the '<em>Service Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ServiceBindingImpl <em>Service Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ServiceBindingImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getServiceBinding()
	 * @generated
	 */
	int SERVICE_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Cod Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING__COD_BINDING = 0;

	/**
	 * The number of structural features of the '<em>Service Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_BINDING_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.EJBPABindingImpl <em>EJBPA Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.EJBPABindingImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getEJBPABinding()
	 * @generated
	 */
	int EJBPA_BINDING = 3;

	/**
	 * The feature id for the '<em><b>Cod Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJBPA_BINDING__COD_BINDING = SERVICE_BINDING__COD_BINDING;

	/**
	 * The number of structural features of the '<em>EJBPA Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJBPA_BINDING_FEATURE_COUNT = SERVICE_BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.SOAPPABRBindingImpl <em>SOAPPABR Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.SOAPPABRBindingImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSOAPPABRBinding()
	 * @generated
	 */
	int SOAPPABR_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Cod Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAPPABR_BINDING__COD_BINDING = SERVICE_BINDING__COD_BINDING;

	/**
	 * The number of structural features of the '<em>SOAPPABR Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOAPPABR_BINDING_FEATURE_COUNT = SERVICE_BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.WSFADBindingImpl <em>WSFAD Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.WSFADBindingImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getWSFADBinding()
	 * @generated
	 */
	int WSFAD_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Cod Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSFAD_BINDING__COD_BINDING = SERVICE_BINDING__COD_BINDING;

	/**
	 * The number of structural features of the '<em>WSFAD Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WSFAD_BINDING_FEATURE_COUNT = SERVICE_BINDING_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.OperationImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMS = 1;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OP_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__THROWS = 4;

	/**
	 * The feature id for the '<em><b>Tx Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TX_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Since</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SINCE = 6;

	/**
	 * The feature id for the '<em><b>Authorized Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__AUTHORIZED_ROLES = 7;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__VALIDATOR = 8;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ParamImpl <em>Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ParamImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getParam()
	 * @generated
	 */
	int PARAM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Validator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALIDATOR = 2;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__CONSTRAINT = 3;

	/**
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.TypesImpl <em>Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.TypesImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getTypes()
	 * @generated
	 */
	int TYPES = 8;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.BaseTypesImpl <em>Base Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.BaseTypesImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getBaseTypes()
	 * @generated
	 */
	int BASE_TYPES = 9;

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
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.RoleImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.InputValidatorImpl <em>Input Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.InputValidatorImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getInputValidator()
	 * @generated
	 */
	int INPUT_VALIDATOR = 11;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALIDATOR__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Input Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_VALIDATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ParamValidatorImpl <em>Param Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ParamValidatorImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getParamValidator()
	 * @generated
	 */
	int PARAM_VALIDATOR = 12;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALIDATOR__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Param Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_VALIDATOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ValueConstraintImpl <em>Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ValueConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getValueConstraint()
	 * @generated
	 */
	int VALUE_CONSTRAINT = 17;

	/**
	 * The number of structural features of the '<em>Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.SimpleValueConstraintImpl <em>Simple Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.SimpleValueConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSimpleValueConstraint()
	 * @generated
	 */
	int SIMPLE_VALUE_CONSTRAINT = 28;

	/**
	 * The number of structural features of the '<em>Simple Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_CONSTRAINT_FEATURE_COUNT = VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ValueRangeConstraintImpl <em>Value Range Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ValueRangeConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getValueRangeConstraint()
	 * @generated
	 */
	int VALUE_RANGE_CONSTRAINT = 13;

	/**
	 * The number of structural features of the '<em>Value Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_CONSTRAINT_FEATURE_COUNT = SIMPLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ValueValorizationConstraintImpl <em>Value Valorization Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ValueValorizationConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getValueValorizationConstraint()
	 * @generated
	 */
	int VALUE_VALORIZATION_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Must Not Be Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_VALORIZATION_CONSTRAINT__MUST_NOT_BE_NULL = SIMPLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Valorization Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_VALORIZATION_CONSTRAINT_FEATURE_COUNT = SIMPLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.CustomConstraintImpl <em>Custom Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.CustomConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getCustomConstraint()
	 * @generated
	 */
	int CUSTOM_CONSTRAINT = 15;

	/**
	 * The feature id for the '<em><b>Check Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONSTRAINT__CHECK_METHOD_NAME = SIMPLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_CONSTRAINT_FEATURE_COUNT = SIMPLE_VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.RelativeConstraintImpl <em>Relative Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.RelativeConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getRelativeConstraint()
	 * @generated
	 */
	int RELATIVE_CONSTRAINT = 16;

	/**
	 * The number of structural features of the '<em>Relative Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_CONSTRAINT_FEATURE_COUNT = SIMPLE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ParamConstraintImpl <em>Param Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ParamConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getParamConstraint()
	 * @generated
	 */
	int PARAM_CONSTRAINT = 22;

	/**
	 * The number of structural features of the '<em>Param Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.SimpleParamCoinstraintImpl <em>Simple Param Coinstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.SimpleParamCoinstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSimpleParamCoinstraint()
	 * @generated
	 */
	int SIMPLE_PARAM_COINSTRAINT = 18;

	/**
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM_COINSTRAINT__PARAM = PARAM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM_COINSTRAINT__CONSTRAINT = PARAM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Param Coinstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM_COINSTRAINT_FEATURE_COUNT = PARAM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.CompositeParamConstraintImpl <em>Composite Param Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.CompositeParamConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getCompositeParamConstraint()
	 * @generated
	 */
	int COMPOSITE_PARAM_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PARAM_CONSTRAINT__COMPONENT = PARAM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Param Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PARAM_CONSTRAINT_FEATURE_COUNT = PARAM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ANDParamConstraintImpl <em>AND Param Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ANDParamConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getANDParamConstraint()
	 * @generated
	 */
	int AND_PARAM_CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_PARAM_CONSTRAINT__COMPONENT = COMPOSITE_PARAM_CONSTRAINT__COMPONENT;

	/**
	 * The number of structural features of the '<em>AND Param Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_PARAM_CONSTRAINT_FEATURE_COUNT = COMPOSITE_PARAM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ORParamConstraintImpl <em>OR Param Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ORParamConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getORParamConstraint()
	 * @generated
	 */
	int OR_PARAM_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PARAM_CONSTRAINT__COMPONENT = COMPOSITE_PARAM_CONSTRAINT__COMPONENT;

	/**
	 * The number of structural features of the '<em>OR Param Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_PARAM_CONSTRAINT_FEATURE_COUNT = COMPOSITE_PARAM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.NOTParamConstraintImpl <em>NOT Param Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.NOTParamConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getNOTParamConstraint()
	 * @generated
	 */
	int NOT_PARAM_CONSTRAINT = 23;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PARAM_CONSTRAINT__COMPONENT = COMPOSITE_PARAM_CONSTRAINT__COMPONENT;

	/**
	 * The number of structural features of the '<em>NOT Param Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_PARAM_CONSTRAINT_FEATURE_COUNT = COMPOSITE_PARAM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.CompositeValueConstraintImpl <em>Composite Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.CompositeValueConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getCompositeValueConstraint()
	 * @generated
	 */
	int COMPOSITE_VALUE_CONSTRAINT = 24;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUE_CONSTRAINT__COMPONENT = VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_VALUE_CONSTRAINT_FEATURE_COUNT = VALUE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ANDValueConstraintImpl <em>AND Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ANDValueConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getANDValueConstraint()
	 * @generated
	 */
	int AND_VALUE_CONSTRAINT = 25;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_VALUE_CONSTRAINT__COMPONENT = COMPOSITE_VALUE_CONSTRAINT__COMPONENT;

	/**
	 * The number of structural features of the '<em>AND Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_VALUE_CONSTRAINT_FEATURE_COUNT = COMPOSITE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ORValueConstraintImpl <em>OR Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ORValueConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getORValueConstraint()
	 * @generated
	 */
	int OR_VALUE_CONSTRAINT = 26;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_VALUE_CONSTRAINT__COMPONENT = COMPOSITE_VALUE_CONSTRAINT__COMPONENT;

	/**
	 * The number of structural features of the '<em>OR Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_VALUE_CONSTRAINT_FEATURE_COUNT = COMPOSITE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.NOTValueConstraintImpl <em>NOT Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.NOTValueConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getNOTValueConstraint()
	 * @generated
	 */
	int NOT_VALUE_CONSTRAINT = 27;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_VALUE_CONSTRAINT__COMPONENT = COMPOSITE_VALUE_CONSTRAINT__COMPONENT;

	/**
	 * The number of structural features of the '<em>NOT Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_VALUE_CONSTRAINT_FEATURE_COUNT = COMPOSITE_VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ContinuousRangeConstraintImpl <em>Continuous Range Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ContinuousRangeConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getContinuousRangeConstraint()
	 * @generated
	 */
	int CONTINUOUS_RANGE_CONSTRAINT = 29;

	/**
	 * The feature id for the '<em><b>Lowerbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_CONSTRAINT__LOWERBOUND = VALUE_RANGE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upperbound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_CONSTRAINT__UPPERBOUND = VALUE_RANGE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Continuous Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_RANGE_CONSTRAINT_FEATURE_COUNT = VALUE_RANGE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.DiscreteRangeConstraintImpl <em>Discrete Range Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.DiscreteRangeConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getDiscreteRangeConstraint()
	 * @generated
	 */
	int DISCRETE_RANGE_CONSTRAINT = 30;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CONSTRAINT__LITERALS = VALUE_RANGE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Range Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_RANGE_CONSTRAINT_FEATURE_COUNT = VALUE_RANGE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.FeatureConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getFeatureConstraint()
	 * @generated
	 */
	int FEATURE_CONSTRAINT = 31;

	/**
	 * The number of structural features of the '<em>Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONSTRAINT_FEATURE_COUNT = VALUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.CompositeFeatureConstraintImpl <em>Composite Feature Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.CompositeFeatureConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getCompositeFeatureConstraint()
	 * @generated
	 */
	int COMPOSITE_FEATURE_CONSTRAINT = 32;

	/**
	 * The number of structural features of the '<em>Composite Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_CONSTRAINT_FEATURE_COUNT = FEATURE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.SimpleFeatureConstraintImpl <em>Simple Feature Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.SimpleFeatureConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSimpleFeatureConstraint()
	 * @generated
	 */
	int SIMPLE_FEATURE_CONSTRAINT = 33;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_CONSTRAINT__CONSTRAINT = FEATURE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_CONSTRAINT__ENTITY = FEATURE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_CONSTRAINT__FEATURE = FEATURE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_CONSTRAINT_FEATURE_COUNT = FEATURE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ANDFeatureConstraintImpl <em>AND Feature Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ANDFeatureConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getANDFeatureConstraint()
	 * @generated
	 */
	int AND_FEATURE_CONSTRAINT = 34;

	/**
	 * The number of structural features of the '<em>AND Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_CONSTRAINT_FEATURE_COUNT = COMPOSITE_FEATURE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ORFeatureConstraintImpl <em>OR Feature Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ORFeatureConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getORFeatureConstraint()
	 * @generated
	 */
	int OR_FEATURE_CONSTRAINT = 35;

	/**
	 * The number of structural features of the '<em>OR Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_CONSTRAINT_FEATURE_COUNT = COMPOSITE_FEATURE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.NOTFeatureConstraintImpl <em>NOT Feature Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.NOTFeatureConstraintImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getNOTFeatureConstraint()
	 * @generated
	 */
	int NOT_FEATURE_CONSTRAINT = 36;

	/**
	 * The number of structural features of the '<em>NOT Feature Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_CONSTRAINT_FEATURE_COUNT = COMPOSITE_FEATURE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.ServiceDefAnnotationImpl <em>Service Def Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.ServiceDefAnnotationImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getServiceDefAnnotation()
	 * @generated
	 */
	int SERVICE_DEF_ANNOTATION = 37;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_ANNOTATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_ANNOTATION__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Service Def Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.impl.SDAnnotationDetailImpl <em>SD Annotation Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.impl.SDAnnotationDetailImpl
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSDAnnotationDetail()
	 * @generated
	 */
	int SD_ANNOTATION_DETAIL = 38;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ANNOTATION_DETAIL__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ANNOTATION_DETAIL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>SD Annotation Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ANNOTATION_DETAIL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.OpTypeEnum <em>Op Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.OpTypeEnum
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getOpTypeEnum()
	 * @generated
	 */
	int OP_TYPE_ENUM = 39;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.TXTypeEnum <em>TX Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.TXTypeEnum
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getTXTypeEnum()
	 * @generated
	 */
	int TX_TYPE_ENUM = 40;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.SrvTypeEnum <em>Srv Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.SrvTypeEnum
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSrvTypeEnum()
	 * @generated
	 */
	int SRV_TYPE_ENUM = 41;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.AuthLevelEnum <em>Auth Level Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.AuthLevelEnum
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getAuthLevelEnum()
	 * @generated
	 */
	int AUTH_LEVEL_ENUM = 42;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see it.csi.mddtools.servicedef.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.DocumentRoot#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see it.csi.mddtools.servicedef.DocumentRoot#getService()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Service();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ServiceDef <em>Service Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Def</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef
	 * @generated
	 */
	EClass getServiceDef();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDef#getCodServizio <em>Cod Servizio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Servizio</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getCodServizio()
	 * @see #getServiceDef()
	 * @generated
	 */
	EAttribute getServiceDef_CodServizio();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.ServiceDef#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getBindings()
	 * @see #getServiceDef()
	 * @generated
	 */
	EReference getServiceDef_Bindings();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDef#isMonitorable <em>Monitorable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitorable</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#isMonitorable()
	 * @see #getServiceDef()
	 * @generated
	 */
	EAttribute getServiceDef_Monitorable();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDef#isDiagEnabled <em>Diag Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diag Enabled</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#isDiagEnabled()
	 * @see #getServiceDef()
	 * @generated
	 */
	EAttribute getServiceDef_DiagEnabled();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.ServiceDef#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getOperations()
	 * @see #getServiceDef()
	 * @generated
	 */
	EReference getServiceDef_Operations();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDef#getVersione <em>Versione</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versione</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getVersione()
	 * @see #getServiceDef()
	 * @generated
	 */
	EAttribute getServiceDef_Versione();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicedef.ServiceDef#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getTypes()
	 * @see #getServiceDef()
	 * @generated
	 */
	EReference getServiceDef_Types();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDef#isTraceEnabled <em>Trace Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trace Enabled</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#isTraceEnabled()
	 * @see #getServiceDef()
	 * @generated
	 */
	EAttribute getServiceDef_TraceEnabled();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDef#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getServiceType()
	 * @see #getServiceDef()
	 * @generated
	 */
	EAttribute getServiceDef_ServiceType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDef#getAuthLevel <em>Auth Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Level</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getAuthLevel()
	 * @see #getServiceDef()
	 * @generated
	 */
	EAttribute getServiceDef_AuthLevel();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.ServiceDef#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getRoles()
	 * @see #getServiceDef()
	 * @generated
	 */
	EReference getServiceDef_Roles();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDef#getCodProdotto <em>Cod Prodotto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Prodotto</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getCodProdotto()
	 * @see #getServiceDef()
	 * @generated
	 */
	EAttribute getServiceDef_CodProdotto();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDef#getCodComponente <em>Cod Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Componente</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getCodComponente()
	 * @see #getServiceDef()
	 * @generated
	 */
	EAttribute getServiceDef_CodComponente();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.ServiceDef#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDef#getAnnotations()
	 * @see #getServiceDef()
	 * @generated
	 */
	EReference getServiceDef_Annotations();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Binding</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceBinding
	 * @generated
	 */
	EClass getServiceBinding();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceBinding#getCodBinding <em>Cod Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Binding</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceBinding#getCodBinding()
	 * @see #getServiceBinding()
	 * @generated
	 */
	EAttribute getServiceBinding_CodBinding();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.EJBPABinding <em>EJBPA Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EJBPA Binding</em>'.
	 * @see it.csi.mddtools.servicedef.EJBPABinding
	 * @generated
	 */
	EClass getEJBPABinding();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.SOAPPABRBinding <em>SOAPPABR Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOAPPABR Binding</em>'.
	 * @see it.csi.mddtools.servicedef.SOAPPABRBinding
	 * @generated
	 */
	EClass getSOAPPABRBinding();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.WSFADBinding <em>WSFAD Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WSFAD Binding</em>'.
	 * @see it.csi.mddtools.servicedef.WSFADBinding
	 * @generated
	 */
	EClass getWSFADBinding();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see it.csi.mddtools.servicedef.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.servicedef.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.Operation#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see it.csi.mddtools.servicedef.Operation#getParams()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Params();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.Operation#getOpType <em>Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Type</em>'.
	 * @see it.csi.mddtools.servicedef.Operation#getOpType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_OpType();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.servicedef.Operation#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see it.csi.mddtools.servicedef.Operation#getReturnType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ReturnType();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.servicedef.Operation#getThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Throws</em>'.
	 * @see it.csi.mddtools.servicedef.Operation#getThrows()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Throws();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.Operation#getTxType <em>Tx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx Type</em>'.
	 * @see it.csi.mddtools.servicedef.Operation#getTxType()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_TxType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.Operation#getSince <em>Since</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Since</em>'.
	 * @see it.csi.mddtools.servicedef.Operation#getSince()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Since();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.servicedef.Operation#getAuthorizedRoles <em>Authorized Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authorized Roles</em>'.
	 * @see it.csi.mddtools.servicedef.Operation#getAuthorizedRoles()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_AuthorizedRoles();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicedef.Operation#getValidator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validator</em>'.
	 * @see it.csi.mddtools.servicedef.Operation#getValidator()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Validator();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param</em>'.
	 * @see it.csi.mddtools.servicedef.Param
	 * @generated
	 */
	EClass getParam();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.Param#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.servicedef.Param#getName()
	 * @see #getParam()
	 * @generated
	 */
	EAttribute getParam_Name();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.servicedef.Param#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see it.csi.mddtools.servicedef.Param#getType()
	 * @see #getParam()
	 * @generated
	 */
	EReference getParam_Type();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicedef.Param#getValidator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Validator</em>'.
	 * @see it.csi.mddtools.servicedef.Param#getValidator()
	 * @see #getParam()
	 * @generated
	 */
	EReference getParam_Validator();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.servicedef.Param#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.Param#getConstraint()
	 * @see #getParam()
	 * @generated
	 */
	EReference getParam_Constraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types</em>'.
	 * @see it.csi.mddtools.servicedef.Types
	 * @generated
	 */
	EClass getTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.Types#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see it.csi.mddtools.servicedef.Types#getTypes()
	 * @see #getTypes()
	 * @generated
	 */
	EReference getTypes_Types();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.BaseTypes <em>Base Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Types</em>'.
	 * @see it.csi.mddtools.servicedef.BaseTypes
	 * @generated
	 */
	EClass getBaseTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.BaseTypes#getBaseTypes <em>Base Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Types</em>'.
	 * @see it.csi.mddtools.servicedef.BaseTypes#getBaseTypes()
	 * @see #getBaseTypes()
	 * @generated
	 */
	EReference getBaseTypes_BaseTypes();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see it.csi.mddtools.servicedef.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.servicedef.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.InputValidator <em>Input Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Validator</em>'.
	 * @see it.csi.mddtools.servicedef.InputValidator
	 * @generated
	 */
	EClass getInputValidator();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicedef.InputValidator#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.InputValidator#getConstraint()
	 * @see #getInputValidator()
	 * @generated
	 */
	EReference getInputValidator_Constraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ParamValidator <em>Param Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Validator</em>'.
	 * @see it.csi.mddtools.servicedef.ParamValidator
	 * @generated
	 */
	EClass getParamValidator();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicedef.ParamValidator#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ParamValidator#getConstraint()
	 * @see #getParamValidator()
	 * @generated
	 */
	EReference getParamValidator_Constraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ValueRangeConstraint <em>Value Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Range Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ValueRangeConstraint
	 * @generated
	 */
	EClass getValueRangeConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ValueValorizationConstraint <em>Value Valorization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Valorization Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ValueValorizationConstraint
	 * @generated
	 */
	EClass getValueValorizationConstraint();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ValueValorizationConstraint#isMustNotBeNull <em>Must Not Be Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Not Be Null</em>'.
	 * @see it.csi.mddtools.servicedef.ValueValorizationConstraint#isMustNotBeNull()
	 * @see #getValueValorizationConstraint()
	 * @generated
	 */
	EAttribute getValueValorizationConstraint_MustNotBeNull();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.CustomConstraint <em>Custom Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.CustomConstraint
	 * @generated
	 */
	EClass getCustomConstraint();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.CustomConstraint#getCheckMethodName <em>Check Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Method Name</em>'.
	 * @see it.csi.mddtools.servicedef.CustomConstraint#getCheckMethodName()
	 * @see #getCustomConstraint()
	 * @generated
	 */
	EAttribute getCustomConstraint_CheckMethodName();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.RelativeConstraint <em>Relative Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.RelativeConstraint
	 * @generated
	 */
	EClass getRelativeConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ValueConstraint <em>Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ValueConstraint
	 * @generated
	 */
	EClass getValueConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.SimpleParamCoinstraint <em>Simple Param Coinstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Param Coinstraint</em>'.
	 * @see it.csi.mddtools.servicedef.SimpleParamCoinstraint
	 * @generated
	 */
	EClass getSimpleParamCoinstraint();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.servicedef.SimpleParamCoinstraint#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param</em>'.
	 * @see it.csi.mddtools.servicedef.SimpleParamCoinstraint#getParam()
	 * @see #getSimpleParamCoinstraint()
	 * @generated
	 */
	EReference getSimpleParamCoinstraint_Param();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicedef.SimpleParamCoinstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.SimpleParamCoinstraint#getConstraint()
	 * @see #getSimpleParamCoinstraint()
	 * @generated
	 */
	EReference getSimpleParamCoinstraint_Constraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.CompositeParamConstraint <em>Composite Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Param Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.CompositeParamConstraint
	 * @generated
	 */
	EClass getCompositeParamConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.CompositeParamConstraint#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see it.csi.mddtools.servicedef.CompositeParamConstraint#getComponent()
	 * @see #getCompositeParamConstraint()
	 * @generated
	 */
	EReference getCompositeParamConstraint_Component();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ANDParamConstraint <em>AND Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Param Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ANDParamConstraint
	 * @generated
	 */
	EClass getANDParamConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ORParamConstraint <em>OR Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Param Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ORParamConstraint
	 * @generated
	 */
	EClass getORParamConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ParamConstraint <em>Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ParamConstraint
	 * @generated
	 */
	EClass getParamConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.NOTParamConstraint <em>NOT Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOT Param Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.NOTParamConstraint
	 * @generated
	 */
	EClass getNOTParamConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.CompositeValueConstraint <em>Composite Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Value Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.CompositeValueConstraint
	 * @generated
	 */
	EClass getCompositeValueConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.CompositeValueConstraint#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see it.csi.mddtools.servicedef.CompositeValueConstraint#getComponent()
	 * @see #getCompositeValueConstraint()
	 * @generated
	 */
	EReference getCompositeValueConstraint_Component();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ANDValueConstraint <em>AND Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Value Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ANDValueConstraint
	 * @generated
	 */
	EClass getANDValueConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ORValueConstraint <em>OR Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Value Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ORValueConstraint
	 * @generated
	 */
	EClass getORValueConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.NOTValueConstraint <em>NOT Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOT Value Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.NOTValueConstraint
	 * @generated
	 */
	EClass getNOTValueConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.SimpleValueConstraint <em>Simple Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Value Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.SimpleValueConstraint
	 * @generated
	 */
	EClass getSimpleValueConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ContinuousRangeConstraint <em>Continuous Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Range Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ContinuousRangeConstraint
	 * @generated
	 */
	EClass getContinuousRangeConstraint();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ContinuousRangeConstraint#getLowerbound <em>Lowerbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lowerbound</em>'.
	 * @see it.csi.mddtools.servicedef.ContinuousRangeConstraint#getLowerbound()
	 * @see #getContinuousRangeConstraint()
	 * @generated
	 */
	EAttribute getContinuousRangeConstraint_Lowerbound();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ContinuousRangeConstraint#getUpperbound <em>Upperbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upperbound</em>'.
	 * @see it.csi.mddtools.servicedef.ContinuousRangeConstraint#getUpperbound()
	 * @see #getContinuousRangeConstraint()
	 * @generated
	 */
	EAttribute getContinuousRangeConstraint_Upperbound();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.DiscreteRangeConstraint <em>Discrete Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Range Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.DiscreteRangeConstraint
	 * @generated
	 */
	EClass getDiscreteRangeConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.servicedef.DiscreteRangeConstraint#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Literals</em>'.
	 * @see it.csi.mddtools.servicedef.DiscreteRangeConstraint#getLiterals()
	 * @see #getDiscreteRangeConstraint()
	 * @generated
	 */
	EAttribute getDiscreteRangeConstraint_Literals();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.FeatureConstraint <em>Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.FeatureConstraint
	 * @generated
	 */
	EClass getFeatureConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.CompositeFeatureConstraint <em>Composite Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Feature Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.CompositeFeatureConstraint
	 * @generated
	 */
	EClass getCompositeFeatureConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.SimpleFeatureConstraint <em>Simple Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Feature Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.SimpleFeatureConstraint
	 * @generated
	 */
	EClass getSimpleFeatureConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.servicedef.SimpleFeatureConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.SimpleFeatureConstraint#getConstraint()
	 * @see #getSimpleFeatureConstraint()
	 * @generated
	 */
	EReference getSimpleFeatureConstraint_Constraint();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.servicedef.SimpleFeatureConstraint#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see it.csi.mddtools.servicedef.SimpleFeatureConstraint#getEntity()
	 * @see #getSimpleFeatureConstraint()
	 * @generated
	 */
	EReference getSimpleFeatureConstraint_Entity();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.servicedef.SimpleFeatureConstraint#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see it.csi.mddtools.servicedef.SimpleFeatureConstraint#getFeature()
	 * @see #getSimpleFeatureConstraint()
	 * @generated
	 */
	EReference getSimpleFeatureConstraint_Feature();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ANDFeatureConstraint <em>AND Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Feature Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ANDFeatureConstraint
	 * @generated
	 */
	EClass getANDFeatureConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ORFeatureConstraint <em>OR Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Feature Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.ORFeatureConstraint
	 * @generated
	 */
	EClass getORFeatureConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.NOTFeatureConstraint <em>NOT Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NOT Feature Constraint</em>'.
	 * @see it.csi.mddtools.servicedef.NOTFeatureConstraint
	 * @generated
	 */
	EClass getNOTFeatureConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.ServiceDefAnnotation <em>Service Def Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Def Annotation</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDefAnnotation
	 * @generated
	 */
	EClass getServiceDefAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.ServiceDefAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDefAnnotation#getSource()
	 * @see #getServiceDefAnnotation()
	 * @generated
	 */
	EAttribute getServiceDefAnnotation_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.servicedef.ServiceDefAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details</em>'.
	 * @see it.csi.mddtools.servicedef.ServiceDefAnnotation#getDetails()
	 * @see #getServiceDefAnnotation()
	 * @generated
	 */
	EReference getServiceDefAnnotation_Details();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.servicedef.SDAnnotationDetail <em>SD Annotation Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SD Annotation Detail</em>'.
	 * @see it.csi.mddtools.servicedef.SDAnnotationDetail
	 * @generated
	 */
	EClass getSDAnnotationDetail();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.SDAnnotationDetail#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see it.csi.mddtools.servicedef.SDAnnotationDetail#getKey()
	 * @see #getSDAnnotationDetail()
	 * @generated
	 */
	EAttribute getSDAnnotationDetail_Key();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.servicedef.SDAnnotationDetail#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.csi.mddtools.servicedef.SDAnnotationDetail#getValue()
	 * @see #getSDAnnotationDetail()
	 * @generated
	 */
	EAttribute getSDAnnotationDetail_Value();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.servicedef.OpTypeEnum <em>Op Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Op Type Enum</em>'.
	 * @see it.csi.mddtools.servicedef.OpTypeEnum
	 * @generated
	 */
	EEnum getOpTypeEnum();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.servicedef.TXTypeEnum <em>TX Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TX Type Enum</em>'.
	 * @see it.csi.mddtools.servicedef.TXTypeEnum
	 * @generated
	 */
	EEnum getTXTypeEnum();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.servicedef.SrvTypeEnum <em>Srv Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Srv Type Enum</em>'.
	 * @see it.csi.mddtools.servicedef.SrvTypeEnum
	 * @generated
	 */
	EEnum getSrvTypeEnum();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.servicedef.AuthLevelEnum <em>Auth Level Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auth Level Enum</em>'.
	 * @see it.csi.mddtools.servicedef.AuthLevelEnum
	 * @generated
	 */
	EEnum getAuthLevelEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicedefFactory getServicedefFactory();

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
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.DocumentRootImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVICE = eINSTANCE.getDocumentRoot_Service();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ServiceDefImpl <em>Service Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ServiceDefImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getServiceDef()
		 * @generated
		 */
		EClass SERVICE_DEF = eINSTANCE.getServiceDef();

		/**
		 * The meta object literal for the '<em><b>Cod Servizio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF__COD_SERVIZIO = eINSTANCE.getServiceDef_CodServizio();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF__BINDINGS = eINSTANCE.getServiceDef_Bindings();

		/**
		 * The meta object literal for the '<em><b>Monitorable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF__MONITORABLE = eINSTANCE.getServiceDef_Monitorable();

		/**
		 * The meta object literal for the '<em><b>Diag Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF__DIAG_ENABLED = eINSTANCE.getServiceDef_DiagEnabled();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF__OPERATIONS = eINSTANCE.getServiceDef_Operations();

		/**
		 * The meta object literal for the '<em><b>Versione</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF__VERSIONE = eINSTANCE.getServiceDef_Versione();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF__TYPES = eINSTANCE.getServiceDef_Types();

		/**
		 * The meta object literal for the '<em><b>Trace Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF__TRACE_ENABLED = eINSTANCE.getServiceDef_TraceEnabled();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF__SERVICE_TYPE = eINSTANCE.getServiceDef_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Auth Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF__AUTH_LEVEL = eINSTANCE.getServiceDef_AuthLevel();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF__ROLES = eINSTANCE.getServiceDef_Roles();

		/**
		 * The meta object literal for the '<em><b>Cod Prodotto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF__COD_PRODOTTO = eINSTANCE.getServiceDef_CodProdotto();

		/**
		 * The meta object literal for the '<em><b>Cod Componente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF__COD_COMPONENTE = eINSTANCE.getServiceDef_CodComponente();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF__ANNOTATIONS = eINSTANCE.getServiceDef_Annotations();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ServiceBindingImpl <em>Service Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ServiceBindingImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getServiceBinding()
		 * @generated
		 */
		EClass SERVICE_BINDING = eINSTANCE.getServiceBinding();

		/**
		 * The meta object literal for the '<em><b>Cod Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_BINDING__COD_BINDING = eINSTANCE.getServiceBinding_CodBinding();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.EJBPABindingImpl <em>EJBPA Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.EJBPABindingImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getEJBPABinding()
		 * @generated
		 */
		EClass EJBPA_BINDING = eINSTANCE.getEJBPABinding();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.SOAPPABRBindingImpl <em>SOAPPABR Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.SOAPPABRBindingImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSOAPPABRBinding()
		 * @generated
		 */
		EClass SOAPPABR_BINDING = eINSTANCE.getSOAPPABRBinding();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.WSFADBindingImpl <em>WSFAD Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.WSFADBindingImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getWSFADBinding()
		 * @generated
		 */
		EClass WSFAD_BINDING = eINSTANCE.getWSFADBinding();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.OperationImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__PARAMS = eINSTANCE.getOperation_Params();

		/**
		 * The meta object literal for the '<em><b>Op Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__OP_TYPE = eINSTANCE.getOperation_OpType();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__RETURN_TYPE = eINSTANCE.getOperation_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__THROWS = eINSTANCE.getOperation_Throws();

		/**
		 * The meta object literal for the '<em><b>Tx Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TX_TYPE = eINSTANCE.getOperation_TxType();

		/**
		 * The meta object literal for the '<em><b>Since</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__SINCE = eINSTANCE.getOperation_Since();

		/**
		 * The meta object literal for the '<em><b>Authorized Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__AUTHORIZED_ROLES = eINSTANCE.getOperation_AuthorizedRoles();

		/**
		 * The meta object literal for the '<em><b>Validator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__VALIDATOR = eINSTANCE.getOperation_Validator();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ParamImpl <em>Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ParamImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getParam()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getParam_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM__TYPE = eINSTANCE.getParam_Type();

		/**
		 * The meta object literal for the '<em><b>Validator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM__VALIDATOR = eINSTANCE.getParam_Validator();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM__CONSTRAINT = eINSTANCE.getParam_Constraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.TypesImpl <em>Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.TypesImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getTypes()
		 * @generated
		 */
		EClass TYPES = eINSTANCE.getTypes();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPES__TYPES = eINSTANCE.getTypes_Types();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.BaseTypesImpl <em>Base Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.BaseTypesImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getBaseTypes()
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
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.RoleImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.InputValidatorImpl <em>Input Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.InputValidatorImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getInputValidator()
		 * @generated
		 */
		EClass INPUT_VALIDATOR = eINSTANCE.getInputValidator();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_VALIDATOR__CONSTRAINT = eINSTANCE.getInputValidator_Constraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ParamValidatorImpl <em>Param Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ParamValidatorImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getParamValidator()
		 * @generated
		 */
		EClass PARAM_VALIDATOR = eINSTANCE.getParamValidator();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_VALIDATOR__CONSTRAINT = eINSTANCE.getParamValidator_Constraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ValueRangeConstraintImpl <em>Value Range Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ValueRangeConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getValueRangeConstraint()
		 * @generated
		 */
		EClass VALUE_RANGE_CONSTRAINT = eINSTANCE.getValueRangeConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ValueValorizationConstraintImpl <em>Value Valorization Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ValueValorizationConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getValueValorizationConstraint()
		 * @generated
		 */
		EClass VALUE_VALORIZATION_CONSTRAINT = eINSTANCE.getValueValorizationConstraint();

		/**
		 * The meta object literal for the '<em><b>Must Not Be Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_VALORIZATION_CONSTRAINT__MUST_NOT_BE_NULL = eINSTANCE.getValueValorizationConstraint_MustNotBeNull();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.CustomConstraintImpl <em>Custom Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.CustomConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getCustomConstraint()
		 * @generated
		 */
		EClass CUSTOM_CONSTRAINT = eINSTANCE.getCustomConstraint();

		/**
		 * The meta object literal for the '<em><b>Check Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_CONSTRAINT__CHECK_METHOD_NAME = eINSTANCE.getCustomConstraint_CheckMethodName();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.RelativeConstraintImpl <em>Relative Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.RelativeConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getRelativeConstraint()
		 * @generated
		 */
		EClass RELATIVE_CONSTRAINT = eINSTANCE.getRelativeConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ValueConstraintImpl <em>Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ValueConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getValueConstraint()
		 * @generated
		 */
		EClass VALUE_CONSTRAINT = eINSTANCE.getValueConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.SimpleParamCoinstraintImpl <em>Simple Param Coinstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.SimpleParamCoinstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSimpleParamCoinstraint()
		 * @generated
		 */
		EClass SIMPLE_PARAM_COINSTRAINT = eINSTANCE.getSimpleParamCoinstraint();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM_COINSTRAINT__PARAM = eINSTANCE.getSimpleParamCoinstraint_Param();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM_COINSTRAINT__CONSTRAINT = eINSTANCE.getSimpleParamCoinstraint_Constraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.CompositeParamConstraintImpl <em>Composite Param Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.CompositeParamConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getCompositeParamConstraint()
		 * @generated
		 */
		EClass COMPOSITE_PARAM_CONSTRAINT = eINSTANCE.getCompositeParamConstraint();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_PARAM_CONSTRAINT__COMPONENT = eINSTANCE.getCompositeParamConstraint_Component();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ANDParamConstraintImpl <em>AND Param Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ANDParamConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getANDParamConstraint()
		 * @generated
		 */
		EClass AND_PARAM_CONSTRAINT = eINSTANCE.getANDParamConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ORParamConstraintImpl <em>OR Param Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ORParamConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getORParamConstraint()
		 * @generated
		 */
		EClass OR_PARAM_CONSTRAINT = eINSTANCE.getORParamConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ParamConstraintImpl <em>Param Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ParamConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getParamConstraint()
		 * @generated
		 */
		EClass PARAM_CONSTRAINT = eINSTANCE.getParamConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.NOTParamConstraintImpl <em>NOT Param Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.NOTParamConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getNOTParamConstraint()
		 * @generated
		 */
		EClass NOT_PARAM_CONSTRAINT = eINSTANCE.getNOTParamConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.CompositeValueConstraintImpl <em>Composite Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.CompositeValueConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getCompositeValueConstraint()
		 * @generated
		 */
		EClass COMPOSITE_VALUE_CONSTRAINT = eINSTANCE.getCompositeValueConstraint();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_VALUE_CONSTRAINT__COMPONENT = eINSTANCE.getCompositeValueConstraint_Component();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ANDValueConstraintImpl <em>AND Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ANDValueConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getANDValueConstraint()
		 * @generated
		 */
		EClass AND_VALUE_CONSTRAINT = eINSTANCE.getANDValueConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ORValueConstraintImpl <em>OR Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ORValueConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getORValueConstraint()
		 * @generated
		 */
		EClass OR_VALUE_CONSTRAINT = eINSTANCE.getORValueConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.NOTValueConstraintImpl <em>NOT Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.NOTValueConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getNOTValueConstraint()
		 * @generated
		 */
		EClass NOT_VALUE_CONSTRAINT = eINSTANCE.getNOTValueConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.SimpleValueConstraintImpl <em>Simple Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.SimpleValueConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSimpleValueConstraint()
		 * @generated
		 */
		EClass SIMPLE_VALUE_CONSTRAINT = eINSTANCE.getSimpleValueConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ContinuousRangeConstraintImpl <em>Continuous Range Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ContinuousRangeConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getContinuousRangeConstraint()
		 * @generated
		 */
		EClass CONTINUOUS_RANGE_CONSTRAINT = eINSTANCE.getContinuousRangeConstraint();

		/**
		 * The meta object literal for the '<em><b>Lowerbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_RANGE_CONSTRAINT__LOWERBOUND = eINSTANCE.getContinuousRangeConstraint_Lowerbound();

		/**
		 * The meta object literal for the '<em><b>Upperbound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTINUOUS_RANGE_CONSTRAINT__UPPERBOUND = eINSTANCE.getContinuousRangeConstraint_Upperbound();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.DiscreteRangeConstraintImpl <em>Discrete Range Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.DiscreteRangeConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getDiscreteRangeConstraint()
		 * @generated
		 */
		EClass DISCRETE_RANGE_CONSTRAINT = eINSTANCE.getDiscreteRangeConstraint();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCRETE_RANGE_CONSTRAINT__LITERALS = eINSTANCE.getDiscreteRangeConstraint_Literals();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.FeatureConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getFeatureConstraint()
		 * @generated
		 */
		EClass FEATURE_CONSTRAINT = eINSTANCE.getFeatureConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.CompositeFeatureConstraintImpl <em>Composite Feature Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.CompositeFeatureConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getCompositeFeatureConstraint()
		 * @generated
		 */
		EClass COMPOSITE_FEATURE_CONSTRAINT = eINSTANCE.getCompositeFeatureConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.SimpleFeatureConstraintImpl <em>Simple Feature Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.SimpleFeatureConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSimpleFeatureConstraint()
		 * @generated
		 */
		EClass SIMPLE_FEATURE_CONSTRAINT = eINSTANCE.getSimpleFeatureConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FEATURE_CONSTRAINT__CONSTRAINT = eINSTANCE.getSimpleFeatureConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FEATURE_CONSTRAINT__ENTITY = eINSTANCE.getSimpleFeatureConstraint_Entity();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FEATURE_CONSTRAINT__FEATURE = eINSTANCE.getSimpleFeatureConstraint_Feature();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ANDFeatureConstraintImpl <em>AND Feature Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ANDFeatureConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getANDFeatureConstraint()
		 * @generated
		 */
		EClass AND_FEATURE_CONSTRAINT = eINSTANCE.getANDFeatureConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ORFeatureConstraintImpl <em>OR Feature Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ORFeatureConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getORFeatureConstraint()
		 * @generated
		 */
		EClass OR_FEATURE_CONSTRAINT = eINSTANCE.getORFeatureConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.NOTFeatureConstraintImpl <em>NOT Feature Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.NOTFeatureConstraintImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getNOTFeatureConstraint()
		 * @generated
		 */
		EClass NOT_FEATURE_CONSTRAINT = eINSTANCE.getNOTFeatureConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.ServiceDefAnnotationImpl <em>Service Def Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.ServiceDefAnnotationImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getServiceDefAnnotation()
		 * @generated
		 */
		EClass SERVICE_DEF_ANNOTATION = eINSTANCE.getServiceDefAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DEF_ANNOTATION__SOURCE = eINSTANCE.getServiceDefAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_DEF_ANNOTATION__DETAILS = eINSTANCE.getServiceDefAnnotation_Details();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.impl.SDAnnotationDetailImpl <em>SD Annotation Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.impl.SDAnnotationDetailImpl
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSDAnnotationDetail()
		 * @generated
		 */
		EClass SD_ANNOTATION_DETAIL = eINSTANCE.getSDAnnotationDetail();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_ANNOTATION_DETAIL__KEY = eINSTANCE.getSDAnnotationDetail_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_ANNOTATION_DETAIL__VALUE = eINSTANCE.getSDAnnotationDetail_Value();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.OpTypeEnum <em>Op Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.OpTypeEnum
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getOpTypeEnum()
		 * @generated
		 */
		EEnum OP_TYPE_ENUM = eINSTANCE.getOpTypeEnum();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.TXTypeEnum <em>TX Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.TXTypeEnum
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getTXTypeEnum()
		 * @generated
		 */
		EEnum TX_TYPE_ENUM = eINSTANCE.getTXTypeEnum();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.SrvTypeEnum <em>Srv Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.SrvTypeEnum
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSrvTypeEnum()
		 * @generated
		 */
		EEnum SRV_TYPE_ENUM = eINSTANCE.getSrvTypeEnum();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.servicedef.AuthLevelEnum <em>Auth Level Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.servicedef.AuthLevelEnum
		 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getAuthLevelEnum()
		 * @generated
		 */
		EEnum AUTH_LEVEL_ENUM = eINSTANCE.getAuthLevelEnum();

	}

} //ServicedefPackage
