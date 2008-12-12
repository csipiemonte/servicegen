/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.appresources.util;

import it.csi.mddtools.appresources.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.appresources.AppresourcesPackage
 * @generated
 */
public class AppresourcesSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppresourcesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppresourcesSwitch() {
		if (modelPackage == null) {
			modelPackage = AppresourcesPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AppresourcesPackage.RESOURCE_CONNECTOR: {
				ResourceConnector resourceConnector = (ResourceConnector)theEObject;
				T result = caseResourceConnector(resourceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppresourcesPackage.PDPA_SERVICE_CONNECTOR: {
				PDPAServiceConnector pdpaServiceConnector = (PDPAServiceConnector)theEObject;
				T result = casePDPAServiceConnector(pdpaServiceConnector);
				if (result == null) result = caseResourceConnector(pdpaServiceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppresourcesPackage.FILE_SYSTEM_CONNECTOR: {
				FileSystemConnector fileSystemConnector = (FileSystemConnector)theEObject;
				T result = caseFileSystemConnector(fileSystemConnector);
				if (result == null) result = caseResourceConnector(fileSystemConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppresourcesPackage.JDBC_DATA_SOURCE_CONNECTOR: {
				JDBCDataSourceConnector jdbcDataSourceConnector = (JDBCDataSourceConnector)theEObject;
				T result = caseJDBCDataSourceConnector(jdbcDataSourceConnector);
				if (result == null) result = caseResourceConnector(jdbcDataSourceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppresourcesPackage.LDAP_JNDI_CONNECTOR: {
				LdapJndiConnector ldapJndiConnector = (LdapJndiConnector)theEObject;
				T result = caseLdapJndiConnector(ldapJndiConnector);
				if (result == null) result = caseResourceConnector(ldapJndiConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppresourcesPackage.RPC_WEB_SERVICE_CONNECTOR: {
				RPCWebServiceConnector rpcWebServiceConnector = (RPCWebServiceConnector)theEObject;
				T result = caseRPCWebServiceConnector(rpcWebServiceConnector);
				if (result == null) result = caseResourceConnector(rpcWebServiceConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppresourcesPackage.SERVICE_SELECTOR: {
				ServiceSelector serviceSelector = (ServiceSelector)theEObject;
				T result = caseServiceSelector(serviceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppresourcesPackage.RESOURCE_SET: {
				ResourceSet resourceSet = (ResourceSet)theEObject;
				T result = caseResourceSet(resourceSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceConnector(ResourceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PDPA Service Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PDPA Service Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePDPAServiceConnector(PDPAServiceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystemConnector(FileSystemConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JDBC Data Source Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JDBC Data Source Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJDBCDataSourceConnector(JDBCDataSourceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ldap Jndi Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ldap Jndi Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLdapJndiConnector(LdapJndiConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPC Web Service Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPC Web Service Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPCWebServiceConnector(RPCWebServiceConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceSelector(ServiceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceSet(ResourceSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //AppresourcesSwitch
