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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.appresources.AppresourcesPackage
 * @generated
 */
public interface AppresourcesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppresourcesFactory eINSTANCE = it.csi.mddtools.appresources.impl.AppresourcesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>PDPA Service Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PDPA Service Connector</em>'.
	 * @generated
	 */
	PDPAServiceConnector createPDPAServiceConnector();

	/**
	 * Returns a new object of class '<em>File System Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File System Connector</em>'.
	 * @generated
	 */
	FileSystemConnector createFileSystemConnector();

	/**
	 * Returns a new object of class '<em>JDBC Data Source Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JDBC Data Source Connector</em>'.
	 * @generated
	 */
	JDBCDataSourceConnector createJDBCDataSourceConnector();

	/**
	 * Returns a new object of class '<em>Ldap Jndi Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ldap Jndi Connector</em>'.
	 * @generated
	 */
	LdapJndiConnector createLdapJndiConnector();

	/**
	 * Returns a new object of class '<em>RPC Web Service Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPC Web Service Connector</em>'.
	 * @generated
	 */
	RPCWebServiceConnector createRPCWebServiceConnector();

	/**
	 * Returns a new object of class '<em>Service Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Selector</em>'.
	 * @generated
	 */
	ServiceSelector createServiceSelector();

	/**
	 * Returns a new object of class '<em>Resource Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Set</em>'.
	 * @generated
	 */
	ResourceSet createResourceSet();

	/**
	 * Returns a new object of class '<em>RC Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RC Annotation</em>'.
	 * @generated
	 */
	RCAnnotation createRCAnnotation();

	/**
	 * Returns a new object of class '<em>RC Annotation Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RC Annotation Detail</em>'.
	 * @generated
	 */
	RCAnnotationDetail createRCAnnotationDetail();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AppresourcesPackage getAppresourcesPackage();

} //AppresourcesFactory
