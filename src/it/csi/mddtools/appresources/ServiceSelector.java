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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Selettore del servizio cosi' come previsto dalle specifiche del servizio
 * di naming CSIRegistry
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.ServiceSelector#getCodProd <em>Cod Prod</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ServiceSelector#getCodServ <em>Cod Serv</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ServiceSelector#getVerServ <em>Ver Serv</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ServiceSelector#getCodEnte <em>Cod Ente</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ServiceSelector#getIstanza <em>Istanza</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ServiceSelector#getAmbiente <em>Ambiente</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ServiceSelector#getCodBinding <em>Cod Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceSelector()
 * @model
 * @generated
 */
public interface ServiceSelector extends EObject {
	/**
	 * Returns the value of the '<em><b>Cod Prod</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Prod</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Prod</em>' attribute.
	 * @see #setCodProd(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceSelector_CodProd()
	 * @model
	 * @generated
	 */
	String getCodProd();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceSelector#getCodProd <em>Cod Prod</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Prod</em>' attribute.
	 * @see #getCodProd()
	 * @generated
	 */
	void setCodProd(String value);

	/**
	 * Returns the value of the '<em><b>Cod Serv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Serv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Serv</em>' attribute.
	 * @see #setCodServ(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceSelector_CodServ()
	 * @model
	 * @generated
	 */
	String getCodServ();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceSelector#getCodServ <em>Cod Serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Serv</em>' attribute.
	 * @see #getCodServ()
	 * @generated
	 */
	void setCodServ(String value);

	/**
	 * Returns the value of the '<em><b>Ver Serv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ver Serv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ver Serv</em>' attribute.
	 * @see #setVerServ(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceSelector_VerServ()
	 * @model
	 * @generated
	 */
	String getVerServ();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceSelector#getVerServ <em>Ver Serv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ver Serv</em>' attribute.
	 * @see #getVerServ()
	 * @generated
	 */
	void setVerServ(String value);

	/**
	 * Returns the value of the '<em><b>Cod Ente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Ente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Ente</em>' attribute.
	 * @see #setCodEnte(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceSelector_CodEnte()
	 * @model
	 * @generated
	 */
	String getCodEnte();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceSelector#getCodEnte <em>Cod Ente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Ente</em>' attribute.
	 * @see #getCodEnte()
	 * @generated
	 */
	void setCodEnte(String value);

	/**
	 * Returns the value of the '<em><b>Istanza</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Istanza</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Istanza</em>' attribute.
	 * @see #setIstanza(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceSelector_Istanza()
	 * @model
	 * @generated
	 */
	String getIstanza();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceSelector#getIstanza <em>Istanza</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Istanza</em>' attribute.
	 * @see #getIstanza()
	 * @generated
	 */
	void setIstanza(String value);

	/**
	 * Returns the value of the '<em><b>Ambiente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ambiente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ambiente</em>' attribute.
	 * @see #setAmbiente(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceSelector_Ambiente()
	 * @model
	 * @generated
	 */
	String getAmbiente();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceSelector#getAmbiente <em>Ambiente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ambiente</em>' attribute.
	 * @see #getAmbiente()
	 * @generated
	 */
	void setAmbiente(String value);

	/**
	 * Returns the value of the '<em><b>Cod Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Binding</em>' attribute.
	 * @see #setCodBinding(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceSelector_CodBinding()
	 * @model
	 * @generated
	 */
	String getCodBinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceSelector#getCodBinding <em>Cod Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Binding</em>' attribute.
	 * @see #getCodBinding()
	 * @generated
	 */
	void setCodBinding(String value);

} // ServiceSelector
