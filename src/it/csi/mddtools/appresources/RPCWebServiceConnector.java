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

import it.csi.mddtools.servicedef.WSEndpoint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPC Web Service Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connettore per web-service di tipo RPC
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.RPCWebServiceConnector#getEndpoint <em>Endpoint</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRPCWebServiceConnector()
 * @model
 * @generated
 */
public interface RPCWebServiceConnector extends ServiceConnector {

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * L'eventuale endpoint del servizio associato al connettore
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Endpoint</em>' reference.
	 * @see #setEndpoint(WSEndpoint)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRPCWebServiceConnector_Endpoint()
	 * @model
	 * @generated
	 */
	WSEndpoint getEndpoint();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.RPCWebServiceConnector#getEndpoint <em>Endpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(WSEndpoint value);

} // RPCWebServiceConnector
