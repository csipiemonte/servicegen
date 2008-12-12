/**
 * <copyright>
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
	 * The number of structural features of the '<em>Resource Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONNECTOR_FEATURE_COUNT = 1;

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
	int PDPA_SERVICE_CONNECTOR__CODE = RESOURCE_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDPA_SERVICE_CONNECTOR__SELECTOR = RESOURCE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PDPA Service Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PDPA_SERVICE_CONNECTOR_FEATURE_COUNT = RESOURCE_CONNECTOR_FEATURE_COUNT + 1;

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
	int RPC_WEB_SERVICE_CONNECTOR__CODE = RESOURCE_CONNECTOR__CODE;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR__SELECTOR = RESOURCE_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>RPC Web Service Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_WEB_SERVICE_CONNECTOR_FEATURE_COUNT = RESOURCE_CONNECTOR_FEATURE_COUNT + 1;

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
	 * Returns the meta object for class '{@link it.csi.mddtools.appresources.PDPAServiceConnector <em>PDPA Service Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PDPA Service Connector</em>'.
	 * @see it.csi.mddtools.appresources.PDPAServiceConnector
	 * @generated
	 */
	EClass getPDPAServiceConnector();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.appresources.PDPAServiceConnector#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see it.csi.mddtools.appresources.PDPAServiceConnector#getSelector()
	 * @see #getPDPAServiceConnector()
	 * @generated
	 */
	EReference getPDPAServiceConnector_Selector();

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
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.appresources.RPCWebServiceConnector#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Selector</em>'.
	 * @see it.csi.mddtools.appresources.RPCWebServiceConnector#getSelector()
	 * @see #getRPCWebServiceConnector()
	 * @generated
	 */
	EReference getRPCWebServiceConnector_Selector();

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
		 * The meta object literal for the '{@link it.csi.mddtools.appresources.impl.PDPAServiceConnectorImpl <em>PDPA Service Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.appresources.impl.PDPAServiceConnectorImpl
		 * @see it.csi.mddtools.appresources.impl.AppresourcesPackageImpl#getPDPAServiceConnector()
		 * @generated
		 */
		EClass PDPA_SERVICE_CONNECTOR = eINSTANCE.getPDPAServiceConnector();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PDPA_SERVICE_CONNECTOR__SELECTOR = eINSTANCE.getPDPAServiceConnector_Selector();

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
		 * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RPC_WEB_SERVICE_CONNECTOR__SELECTOR = eINSTANCE.getRPCWebServiceConnector_Selector();

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

	}

} //AppresourcesPackage
