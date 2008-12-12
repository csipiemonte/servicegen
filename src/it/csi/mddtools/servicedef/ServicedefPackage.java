/**
 * <copyright>
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
	 * The number of structural features of the '<em>Service Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DEF_FEATURE_COUNT = 11;

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
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 8;

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
	 * The number of structural features of the '<em>Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.OpTypeEnum <em>Op Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.OpTypeEnum
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getOpTypeEnum()
	 * @generated
	 */
	int OP_TYPE_ENUM = 11;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.TXTypeEnum <em>TX Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.TXTypeEnum
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getTXTypeEnum()
	 * @generated
	 */
	int TX_TYPE_ENUM = 12;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.SrvTypeEnum <em>Srv Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.SrvTypeEnum
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getSrvTypeEnum()
	 * @generated
	 */
	int SRV_TYPE_ENUM = 13;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.servicedef.AuthLevelEnum <em>Auth Level Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.servicedef.AuthLevelEnum
	 * @see it.csi.mddtools.servicedef.impl.ServicedefPackageImpl#getAuthLevelEnum()
	 * @generated
	 */
	int AUTH_LEVEL_ENUM = 14;


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
