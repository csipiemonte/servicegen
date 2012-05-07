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

import it.csi.mddtools.servicedef.ServiceBinding;
import it.csi.mddtools.servicedef.ServiceDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Connettore (astratto) per risorse di tipo "servizio"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.ServiceConnector#getServiceDef <em>Service Def</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ServiceConnector#getBinding <em>Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ServiceConnector#getSelector <em>Selector</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.ServiceConnector#isUseRegistry <em>Use Registry</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceConnector()
 * @model abstract="true"
 * @generated
 */
public interface ServiceConnector extends ResourceConnector {
	/**
	 * Returns the value of the '<em><b>Service Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * L'interfaccia logica del servizio associato al connettore
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Def</em>' reference.
	 * @see #setServiceDef(ServiceDef)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceConnector_ServiceDef()
	 * @model
	 * @generated
	 */
	ServiceDef getServiceDef();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceConnector#getServiceDef <em>Service Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Def</em>' reference.
	 * @see #getServiceDef()
	 * @generated
	 */
	void setServiceDef(ServiceDef value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il binding del servizio associato al connettore
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(ServiceBinding)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceConnector_Binding()
	 * @model
	 * @generated
	 */
	ServiceBinding getBinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceConnector#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(ServiceBinding value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il selettore del servizio associato al connettore
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference.
	 * @see #setSelector(ServiceSelector)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceConnector_Selector()
	 * @model containment="true"
	 * @generated
	 */
	ServiceSelector getSelector();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceConnector#getSelector <em>Selector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' containment reference.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(ServiceSelector value);

	/**
	 * Returns the value of the '<em><b>Use Registry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Registry</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * indica se il servizio è indirizzato tramite registry o con configurazione
	 * locale al fruitore
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Registry</em>' attribute.
	 * @see #setUseRegistry(boolean)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getServiceConnector_UseRegistry()
	 * @model
	 * @generated
	 */
	boolean isUseRegistry();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.ServiceConnector#isUseRegistry <em>Use Registry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Registry</em>' attribute.
	 * @see #isUseRegistry()
	 * @generated
	 */
	void setUseRegistry(boolean value);

} // ServiceConnector
