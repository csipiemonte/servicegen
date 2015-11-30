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
package it.csi.mddtools.servicedef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getCodServizio <em>Cod Servizio</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getBindings <em>Bindings</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#isMonitorable <em>Monitorable</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#isDiagEnabled <em>Diag Enabled</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getVersione <em>Versione</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getTypes <em>Types</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#isTraceEnabled <em>Trace Enabled</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getAuthLevel <em>Auth Level</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getRoles <em>Roles</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getCodComponente <em>Cod Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef()
 * @model
 * @generated
 */
public interface ServiceDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Cod Servizio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Servizio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Codice del servizio. pu&ograve; assumere un valore alfanumerico ed &egrave;
	 * ammesso il separatore &quot;_&quot;.  
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Servizio</em>' attribute.
	 * @see #setCodServizio(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_CodServizio()
	 * @model
	 * @generated
	 */
	String getCodServizio();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getCodServizio <em>Cod Servizio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Servizio</em>' attribute.
	 * @see #getCodServizio()
	 * @generated
	 */
	void setCodServizio(String value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.ServiceBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Elenco dei binding (canali) su cui &egrave; esposto il servizio.
	 * A seconda delle cartucce di generazione saranno o meno disponibili solo alcune
	 * tipologie di binding. 
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitorable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Se valorizzato a <i>true</i> il servizio &egrave; predisposto per il monotoraggio.
	 * La funzione pu&ograve; non essere prevista per tutte le cartucce.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitorable</em>' attribute.
	 * @see #setMonitorable(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Monitorable()
	 * @model
	 * @generated
	 */
	boolean isMonitorable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#isMonitorable <em>Monitorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitorable</em>' attribute.
	 * @see #isMonitorable()
	 * @generated
	 */
	void setMonitorable(boolean value);

	/**
	 * Returns the value of the '<em><b>Diag Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diag Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Se valorizzato a <i>true</i> il servizio &egrave; predisposto per le funzioni di 
	 * diagnostica.
	 * La funzione pu&ograve; non essere prevista per tutte le cartucce.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diag Enabled</em>' attribute.
	 * @see #setDiagEnabled(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_DiagEnabled()
	 * @model
	 * @generated
	 */
	boolean isDiagEnabled();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#isDiagEnabled <em>Diag Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diag Enabled</em>' attribute.
	 * @see #isDiagEnabled()
	 * @generated
	 */
	void setDiagEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Elenco delle operazioni esposte dal servizio</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Versione</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versione</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Versione dell'interfaccia di sevizio.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versione</em>' attribute.
	 * @see #setVersione(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Versione()
	 * @model
	 * @generated
	 */
	String getVersione();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getVersione <em>Versione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versione</em>' attribute.
	 * @see #getVersione()
	 * @generated
	 */
	void setVersione(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Elenco dei tipi (<b>Entity</b> ed <b>Exception</b>) definiti per il servizio</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(Types)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Types()
	 * @model containment="true"
	 * @generated
	 */
	Types getTypes();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(Types value);

	/**
	 * Returns the value of the '<em><b>Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Se valorizzato a <i>true</i> il servizio &egrave; predisposto per il tracing delle chiamate.
	 * La funzione pu&ograve; non essere prevista per tutte le cartucce.
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Enabled</em>' attribute.
	 * @see #setTraceEnabled(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_TraceEnabled()
	 * @model
	 * @generated
	 */
	boolean isTraceEnabled();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#isTraceEnabled <em>Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Enabled</em>' attribute.
	 * @see #isTraceEnabled()
	 * @generated
	 */
	void setTraceEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * The default value is <code>"appl"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.servicedef.SrvTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Tipologia di servizio.
	 * Un servizio pu&ograve; essere:
	 * <ul>
	 * <li>applicativo</li>
	 * <li>di orchestrazione</li>
	 * <li>(infrastrutturale)</li>
	 * </ul>
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see it.csi.mddtools.servicedef.SrvTypeEnum
	 * @see #setServiceType(SrvTypeEnum)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_ServiceType()
	 * @model default="appl"
	 * @generated
	 */
	SrvTypeEnum getServiceType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see it.csi.mddtools.servicedef.SrvTypeEnum
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(SrvTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Auth Level</b></em>' attribute.
	 * The default value is <code>"A0"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.servicedef.AuthLevelEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Livello di autenticazione/autorizzazione richiesta dal servizio. 
	 * Pu&ograve; valere:
	 * <ul>
	 * <li>A0: servizio pubblico anonimo</li>
	 * <li>A1: il sistema fruitore del servizio si deve autenticare e vi&egrave; una 
	 *        autorizzazione Role-Based all'utilizzo dei singoli metodi</li>
	 * <li>A2: come A1, ma con in aggiunta la possibilit&agrave; di tracciare l'utente
	 *       fisico che sta utilizzando il sistema fruitore.</li>
	 * </ul>
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auth Level</em>' attribute.
	 * @see it.csi.mddtools.servicedef.AuthLevelEnum
	 * @see #setAuthLevel(AuthLevelEnum)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_AuthLevel()
	 * @model default="A0"
	 * @generated
	 */
	AuthLevelEnum getAuthLevel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getAuthLevel <em>Auth Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Level</em>' attribute.
	 * @see it.csi.mddtools.servicedef.AuthLevelEnum
	 * @see #getAuthLevel()
	 * @generated
	 */
	void setAuthLevel(AuthLevelEnum value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * I ruoli previsti per l'autorizzazione del servizio
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Cod Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Prodotto</em>' attribute.
	 * @see #setCodProdotto(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_CodProdotto()
	 * @model
	 * @generated
	 */
	String getCodProdotto();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getCodProdotto <em>Cod Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Prodotto</em>' attribute.
	 * @see #getCodProdotto()
	 * @generated
	 */
	void setCodProdotto(String value);

	/**
	 * Returns the value of the '<em><b>Cod Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Componente</em>' attribute.
	 * @see #setCodComponente(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_CodComponente()
	 * @model
	 * @generated
	 */
	String getCodComponente();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getCodComponente <em>Cod Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Componente</em>' attribute.
	 * @see #getCodComponente()
	 * @generated
	 */
	void setCodComponente(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.ServiceDefAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Annotations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceDefAnnotation> getAnnotations();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(SDDocumentation)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	SDDocumentation getDocumentation();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(SDDocumentation value);

} // ServiceDef
