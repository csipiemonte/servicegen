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
package it.csi.mddtools.appresources;

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
 * <!-- begin-model-doc -->
 * Questo package contiene le metaclassi utilizzate per modellare i connettori
 * alle risorse utilizzate dal sistema.
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.appresources.AppresourcesFactory
 * @model kind="package"
 * @generated
 */
public interface AppresourcesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "appresources";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.csi.it/mddtools/appresources";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "appresources";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppresourcesPackage eINSTANCE = it.csi.mddtools.appresources.impl.AppresourcesPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.ResourceConnectorImpl <em>Resource Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.ResourceConnectorImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getResourceConnector()
	 * @generated
	 */
	int RESOURCE_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONNECTOR__CODE = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONNECTOR__ANNOTATIONS = 1;

	/**
	 * The number of structural features of the '<em>Resource Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.ServiceConnectorImpl <em>Service Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.ServiceConnectorImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getServiceConnector()
	 * @generated
	 */
	int SERVICE_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR__CODE = RESOURCE_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR__ANNOTATIONS = RESOURCE_CONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Service Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR__SERVICE_DEF = RESOURCE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR__BINDING = RESOURCE_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR__SELECTOR = RESOURCE_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR__USE_REGISTRY = RESOURCE_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Service Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_CONNECTOR_FEATURE_COUNT = RESOURCE_CONNECTOR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.PDPAServiceConnectorImpl <em>PDPA Service Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.PDPAServiceConnectorImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getPDPAServiceConnector()
	 * @generated
	 */
	int PDPA_SERVICE_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDPA_SERVICE_CONNECTOR__CODE = SERVICE_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDPA_SERVICE_CONNECTOR__ANNOTATIONS = SERVICE_CONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Service Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDPA_SERVICE_CONNECTOR__SERVICE_DEF = SERVICE_CONNECTOR__SERVICE_DEF;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDPA_SERVICE_CONNECTOR__BINDING = SERVICE_CONNECTOR__BINDING;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDPA_SERVICE_CONNECTOR__SELECTOR = SERVICE_CONNECTOR__SELECTOR;

	/**
	 * The feature id for the '<em><b>Use Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDPA_SERVICE_CONNECTOR__USE_REGISTRY = SERVICE_CONNECTOR__USE_REGISTRY;

	/**
	 * The number of structural features of the '<em>PDPA Service Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDPA_SERVICE_CONNECTOR_FEATURE_COUNT = SERVICE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.FileSystemConnectorImpl <em>File System Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.FileSystemConnectorImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getFileSystemConnector()
	 * @generated
	 */
	int FILE_SYSTEM_CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_CONNECTOR__CODE = RESOURCE_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_CONNECTOR__ANNOTATIONS = RESOURCE_CONNECTOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>File System Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_CONNECTOR_FEATURE_COUNT = RESOURCE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.JDBCDataSourceConnectorImpl <em>JDBC Data Source Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.JDBCDataSourceConnectorImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getJDBCDataSourceConnector()
	 * @generated
	 */
	int JDBC_DATA_SOURCE_CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE_CONNECTOR__CODE = RESOURCE_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE_CONNECTOR__ANNOTATIONS = RESOURCE_CONNECTOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>JDBC Data Source Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JDBC_DATA_SOURCE_CONNECTOR_FEATURE_COUNT = RESOURCE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.LdapJndiConnectorImpl <em>Ldap Jndi Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.LdapJndiConnectorImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getLdapJndiConnector()
	 * @generated
	 */
	int LDAP_JNDI_CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDAP_JNDI_CONNECTOR__CODE = RESOURCE_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDAP_JNDI_CONNECTOR__ANNOTATIONS = RESOURCE_CONNECTOR__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Ldap Jndi Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDAP_JNDI_CONNECTOR_FEATURE_COUNT = RESOURCE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.RPCWebServiceConnectorImpl <em>RPC Web Service Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.RPCWebServiceConnectorImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getRPCWebServiceConnector()
	 * @generated
	 */
	int RPC_WEB_SERVICE_CONNECTOR = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR__CODE = SERVICE_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR__ANNOTATIONS = SERVICE_CONNECTOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Service Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR__SERVICE_DEF = SERVICE_CONNECTOR__SERVICE_DEF;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR__BINDING = SERVICE_CONNECTOR__BINDING;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR__SELECTOR = SERVICE_CONNECTOR__SELECTOR;

	/**
	 * The feature id for the '<em><b>Use Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR__USE_REGISTRY = SERVICE_CONNECTOR__USE_REGISTRY;

	/**
	 * The feature id for the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR__ENDPOINT = SERVICE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RPC Web Service Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR_FEATURE_COUNT = SERVICE_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.ServiceSelectorImpl <em>Service Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.ServiceSelectorImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getServiceSelector()
	 * @generated
	 */
	int SERVICE_SELECTOR = 6;

	/**
	 * The feature id for the '<em><b>Cod Prod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SELECTOR__COD_PROD = 0;

	/**
	 * The feature id for the '<em><b>Cod Serv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SELECTOR__COD_SERV = 1;

	/**
	 * The feature id for the '<em><b>Ver Serv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SELECTOR__VER_SERV = 2;

	/**
	 * The feature id for the '<em><b>Cod Ente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SELECTOR__COD_ENTE = 3;

	/**
	 * The feature id for the '<em><b>Istanza</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SELECTOR__ISTANZA = 4;

	/**
	 * The feature id for the '<em><b>Ambiente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SELECTOR__AMBIENTE = 5;

	/**
	 * The feature id for the '<em><b>Cod Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SELECTOR__COD_BINDING = 6;

	/**
	 * The number of structural features of the '<em>Service Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_SELECTOR_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.ResourceSetImpl <em>Resource Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.ResourceSetImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getResourceSet()
	 * @generated
	 */
	int RESOURCE_SET = 7;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SET__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SET_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.RCAnnotationImpl <em>RC Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.RCAnnotationImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getRCAnnotation()
	 * @generated
	 */
	int RC_ANNOTATION = 9;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RC_ANNOTATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RC_ANNOTATION__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>RC Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RC_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.appresources.impl.RCAnnotationDetailImpl <em>RC Annotation Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.appresources.impl.RCAnnotationDetailImpl
	 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getRCAnnotationDetail()
	 * @generated
	 */
	int RC_ANNOTATION_DETAIL = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RC_ANNOTATION_DETAIL__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RC_ANNOTATION_DETAIL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>RC Annotation Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RC_ANNOTATION_DETAIL_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.ResourceConnector <em>Resource Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Connector</em>'.
	 * @see it.csi.mddtools.appresources.ResourceConnector
	 * @generated
	 */
	EClass getResourceConnector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.ResourceConnector#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see it.csi.mddtools.appresources.ResourceConnector#getCode()
	 * @see #getResourceConnector()
	 * @generated
	 */
	EAttribute getResourceConnector_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.appresources.ResourceConnector#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see it.csi.mddtools.appresources.ResourceConnector#getAnnotations()
	 * @see #getResourceConnector()
	 * @generated
	 */
	EReference getResourceConnector_Annotations();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.PDPAServiceConnector <em>PDPA Service Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDPA Service Connector</em>'.
	 * @see it.csi.mddtools.appresources.PDPAServiceConnector
	 * @generated
	 */
	EClass getPDPAServiceConnector();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.FileSystemConnector <em>File System Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System Connector</em>'.
	 * @see it.csi.mddtools.appresources.FileSystemConnector
	 * @generated
	 */
	EClass getFileSystemConnector();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.JDBCDataSourceConnector <em>JDBC Data Source Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JDBC Data Source Connector</em>'.
	 * @see it.csi.mddtools.appresources.JDBCDataSourceConnector
	 * @generated
	 */
	EClass getJDBCDataSourceConnector();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.LdapJndiConnector <em>Ldap Jndi Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ldap Jndi Connector</em>'.
	 * @see it.csi.mddtools.appresources.LdapJndiConnector
	 * @generated
	 */
	EClass getLdapJndiConnector();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.RPCWebServiceConnector <em>RPC Web Service Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPC Web Service Connector</em>'.
	 * @see it.csi.mddtools.appresources.RPCWebServiceConnector
	 * @generated
	 */
	EClass getRPCWebServiceConnector();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.appresources.RPCWebServiceConnector#getEndpoint <em>Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint</em>'.
	 * @see it.csi.mddtools.appresources.RPCWebServiceConnector#getEndpoint()
	 * @see #getRPCWebServiceConnector()
	 * @generated
	 */
	EReference getRPCWebServiceConnector_Endpoint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.ServiceSelector <em>Service Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Selector</em>'.
	 * @see it.csi.mddtools.appresources.ServiceSelector
	 * @generated
	 */
	EClass getServiceSelector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.ServiceSelector#getCodProd <em>Cod Prod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Prod</em>'.
	 * @see it.csi.mddtools.appresources.ServiceSelector#getCodProd()
	 * @see #getServiceSelector()
	 * @generated
	 */
	EAttribute getServiceSelector_CodProd();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.ServiceSelector#getCodServ <em>Cod Serv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Serv</em>'.
	 * @see it.csi.mddtools.appresources.ServiceSelector#getCodServ()
	 * @see #getServiceSelector()
	 * @generated
	 */
	EAttribute getServiceSelector_CodServ();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.ServiceSelector#getVerServ <em>Ver Serv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ver Serv</em>'.
	 * @see it.csi.mddtools.appresources.ServiceSelector#getVerServ()
	 * @see #getServiceSelector()
	 * @generated
	 */
	EAttribute getServiceSelector_VerServ();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.ServiceSelector#getCodEnte <em>Cod Ente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Ente</em>'.
	 * @see it.csi.mddtools.appresources.ServiceSelector#getCodEnte()
	 * @see #getServiceSelector()
	 * @generated
	 */
	EAttribute getServiceSelector_CodEnte();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.ServiceSelector#getIstanza <em>Istanza</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Istanza</em>'.
	 * @see it.csi.mddtools.appresources.ServiceSelector#getIstanza()
	 * @see #getServiceSelector()
	 * @generated
	 */
	EAttribute getServiceSelector_Istanza();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.ServiceSelector#getAmbiente <em>Ambiente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ambiente</em>'.
	 * @see it.csi.mddtools.appresources.ServiceSelector#getAmbiente()
	 * @see #getServiceSelector()
	 * @generated
	 */
	EAttribute getServiceSelector_Ambiente();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.ServiceSelector#getCodBinding <em>Cod Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Binding</em>'.
	 * @see it.csi.mddtools.appresources.ServiceSelector#getCodBinding()
	 * @see #getServiceSelector()
	 * @generated
	 */
	EAttribute getServiceSelector_CodBinding();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.ResourceSet <em>Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Set</em>'.
	 * @see it.csi.mddtools.appresources.ResourceSet
	 * @generated
	 */
	EClass getResourceSet();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.appresources.ResourceSet#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see it.csi.mddtools.appresources.ResourceSet#getResources()
	 * @see #getResourceSet()
	 * @generated
	 */
	EReference getResourceSet_Resources();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.ServiceConnector <em>Service Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Connector</em>'.
	 * @see it.csi.mddtools.appresources.ServiceConnector
	 * @generated
	 */
	EClass getServiceConnector();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.appresources.ServiceConnector#getServiceDef <em>Service Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Def</em>'.
	 * @see it.csi.mddtools.appresources.ServiceConnector#getServiceDef()
	 * @see #getServiceConnector()
	 * @generated
	 */
	EReference getServiceConnector_ServiceDef();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.appresources.ServiceConnector#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see it.csi.mddtools.appresources.ServiceConnector#getBinding()
	 * @see #getServiceConnector()
	 * @generated
	 */
	EReference getServiceConnector_Binding();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.appresources.ServiceConnector#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see it.csi.mddtools.appresources.ServiceConnector#getSelector()
	 * @see #getServiceConnector()
	 * @generated
	 */
	EReference getServiceConnector_Selector();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.ServiceConnector#isUseRegistry <em>Use Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Registry</em>'.
	 * @see it.csi.mddtools.appresources.ServiceConnector#isUseRegistry()
	 * @see #getServiceConnector()
	 * @generated
	 */
	EAttribute getServiceConnector_UseRegistry();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.RCAnnotation <em>RC Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RC Annotation</em>'.
	 * @see it.csi.mddtools.appresources.RCAnnotation
	 * @generated
	 */
	EClass getRCAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.RCAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see it.csi.mddtools.appresources.RCAnnotation#getSource()
	 * @see #getRCAnnotation()
	 * @generated
	 */
	EAttribute getRCAnnotation_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.appresources.RCAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details</em>'.
	 * @see it.csi.mddtools.appresources.RCAnnotation#getDetails()
	 * @see #getRCAnnotation()
	 * @generated
	 */
	EReference getRCAnnotation_Details();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.RCAnnotationDetail <em>RC Annotation Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RC Annotation Detail</em>'.
	 * @see it.csi.mddtools.appresources.RCAnnotationDetail
	 * @generated
	 */
	EClass getRCAnnotationDetail();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.RCAnnotationDetail#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see it.csi.mddtools.appresources.RCAnnotationDetail#getKey()
	 * @see #getRCAnnotationDetail()
	 * @generated
	 */
	EAttribute getRCAnnotationDetail_Key();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.appresources.RCAnnotationDetail#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.csi.mddtools.appresources.RCAnnotationDetail#getValue()
	 * @see #getRCAnnotationDetail()
	 * @generated
	 */
	EAttribute getRCAnnotationDetail_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppresourcesFactory getAppresourcesFactory();

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
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.ResourceConnectorImpl <em>Resource Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.ResourceConnectorImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getResourceConnector()
		 * @generated
		 */
		EClass RESOURCE_CONNECTOR = eINSTANCE.getResourceConnector();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_CONNECTOR__CODE = eINSTANCE.getResourceConnector_Code();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONNECTOR__ANNOTATIONS = eINSTANCE.getResourceConnector_Annotations();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.PDPAServiceConnectorImpl <em>PDPA Service Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.PDPAServiceConnectorImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getPDPAServiceConnector()
		 * @generated
		 */
		EClass PDPA_SERVICE_CONNECTOR = eINSTANCE.getPDPAServiceConnector();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.FileSystemConnectorImpl <em>File System Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.FileSystemConnectorImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getFileSystemConnector()
		 * @generated
		 */
		EClass FILE_SYSTEM_CONNECTOR = eINSTANCE.getFileSystemConnector();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.JDBCDataSourceConnectorImpl <em>JDBC Data Source Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.JDBCDataSourceConnectorImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getJDBCDataSourceConnector()
		 * @generated
		 */
		EClass JDBC_DATA_SOURCE_CONNECTOR = eINSTANCE.getJDBCDataSourceConnector();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.LdapJndiConnectorImpl <em>Ldap Jndi Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.LdapJndiConnectorImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getLdapJndiConnector()
		 * @generated
		 */
		EClass LDAP_JNDI_CONNECTOR = eINSTANCE.getLdapJndiConnector();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.RPCWebServiceConnectorImpl <em>RPC Web Service Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.RPCWebServiceConnectorImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getRPCWebServiceConnector()
		 * @generated
		 */
		EClass RPC_WEB_SERVICE_CONNECTOR = eINSTANCE.getRPCWebServiceConnector();

		/**
		 * The meta object literal for the '<em><b>Endpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_WEB_SERVICE_CONNECTOR__ENDPOINT = eINSTANCE.getRPCWebServiceConnector_Endpoint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.ServiceSelectorImpl <em>Service Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.ServiceSelectorImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getServiceSelector()
		 * @generated
		 */
		EClass SERVICE_SELECTOR = eINSTANCE.getServiceSelector();

		/**
		 * The meta object literal for the '<em><b>Cod Prod</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SELECTOR__COD_PROD = eINSTANCE.getServiceSelector_CodProd();

		/**
		 * The meta object literal for the '<em><b>Cod Serv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SELECTOR__COD_SERV = eINSTANCE.getServiceSelector_CodServ();

		/**
		 * The meta object literal for the '<em><b>Ver Serv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SELECTOR__VER_SERV = eINSTANCE.getServiceSelector_VerServ();

		/**
		 * The meta object literal for the '<em><b>Cod Ente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SELECTOR__COD_ENTE = eINSTANCE.getServiceSelector_CodEnte();

		/**
		 * The meta object literal for the '<em><b>Istanza</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SELECTOR__ISTANZA = eINSTANCE.getServiceSelector_Istanza();

		/**
		 * The meta object literal for the '<em><b>Ambiente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SELECTOR__AMBIENTE = eINSTANCE.getServiceSelector_Ambiente();

		/**
		 * The meta object literal for the '<em><b>Cod Binding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_SELECTOR__COD_BINDING = eINSTANCE.getServiceSelector_CodBinding();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.ResourceSetImpl <em>Resource Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.ResourceSetImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getResourceSet()
		 * @generated
		 */
		EClass RESOURCE_SET = eINSTANCE.getResourceSet();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_SET__RESOURCES = eINSTANCE.getResourceSet_Resources();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.ServiceConnectorImpl <em>Service Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.ServiceConnectorImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getServiceConnector()
		 * @generated
		 */
		EClass SERVICE_CONNECTOR = eINSTANCE.getServiceConnector();

		/**
		 * The meta object literal for the '<em><b>Service Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTOR__SERVICE_DEF = eINSTANCE.getServiceConnector_ServiceDef();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTOR__BINDING = eINSTANCE.getServiceConnector_Binding();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_CONNECTOR__SELECTOR = eINSTANCE.getServiceConnector_Selector();

		/**
		 * The meta object literal for the '<em><b>Use Registry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_CONNECTOR__USE_REGISTRY = eINSTANCE.getServiceConnector_UseRegistry();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.RCAnnotationImpl <em>RC Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.RCAnnotationImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getRCAnnotation()
		 * @generated
		 */
		EClass RC_ANNOTATION = eINSTANCE.getRCAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RC_ANNOTATION__SOURCE = eINSTANCE.getRCAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RC_ANNOTATION__DETAILS = eINSTANCE.getRCAnnotation_Details();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.RCAnnotationDetailImpl <em>RC Annotation Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.RCAnnotationDetailImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getRCAnnotationDetail()
		 * @generated
		 */
		EClass RC_ANNOTATION_DETAIL = eINSTANCE.getRCAnnotationDetail();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RC_ANNOTATION_DETAIL__KEY = eINSTANCE.getRCAnnotationDetail_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RC_ANNOTATION_DETAIL__VALUE = eINSTANCE.getRCAnnotationDetail_Value();

	}

} //AppresourcesPackage
