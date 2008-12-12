/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.appresources.impl;

import it.csi.mddtools.appresources.*;

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
public class AppresourcesFactoryImpl extends EFactoryImpl implements AppresourcesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppresourcesFactory init() {
		try {
			AppresourcesFactory theAppresourcesFactory = (AppresourcesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.csi.it/mddtools/appresources"); 
			if (theAppresourcesFactory != null) {
				return theAppresourcesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AppresourcesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppresourcesFactoryImpl() {
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
			case AppresourcesPackage.PDPA_SERVICE_CONNECTOR: return createPDPAServiceConnector();
			case AppresourcesPackage.FILE_SYSTEM_CONNECTOR: return createFileSystemConnector();
			case AppresourcesPackage.JDBC_DATA_SOURCE_CONNECTOR: return createJDBCDataSourceConnector();
			case AppresourcesPackage.LDAP_JNDI_CONNECTOR: return createLdapJndiConnector();
			case AppresourcesPackage.RPC_WEB_SERVICE_CONNECTOR: return createRPCWebServiceConnector();
			case AppresourcesPackage.SERVICE_SELECTOR: return createServiceSelector();
			case AppresourcesPackage.RESOURCE_SET: return createResourceSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDPAServiceConnector createPDPAServiceConnector() {
		PDPAServiceConnectorImpl pdpaServiceConnector = new PDPAServiceConnectorImpl();
		return pdpaServiceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSystemConnector createFileSystemConnector() {
		FileSystemConnectorImpl fileSystemConnector = new FileSystemConnectorImpl();
		return fileSystemConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JDBCDataSourceConnector createJDBCDataSourceConnector() {
		JDBCDataSourceConnectorImpl jdbcDataSourceConnector = new JDBCDataSourceConnectorImpl();
		return jdbcDataSourceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LdapJndiConnector createLdapJndiConnector() {
		LdapJndiConnectorImpl ldapJndiConnector = new LdapJndiConnectorImpl();
		return ldapJndiConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPCWebServiceConnector createRPCWebServiceConnector() {
		RPCWebServiceConnectorImpl rpcWebServiceConnector = new RPCWebServiceConnectorImpl();
		return rpcWebServiceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSelector createServiceSelector() {
		ServiceSelectorImpl serviceSelector = new ServiceSelectorImpl();
		return serviceSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSet createResourceSet() {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		return resourceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppresourcesPackage getAppresourcesPackage() {
		return (AppresourcesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AppresourcesPackage getPackage() {
		return AppresourcesPackage.eINSTANCE;
	}

} //AppresourcesFactoryImpl
