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
 * A representation of the model object '<em><b>RC Annotation Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dettaglio dell'annotazione.
 * Al momento le annotazioni previste variano a seconda del tipo di connettore e sono:
 * <ul>
 * <li>per il connettore <b>PDPAServiceConnector</b>:
 * 	<ul>
 * 		<li>source=appresources
 * 		  <ul>
 * 			<li>per tutti i tipi di binding:
 * 			<ul>
 * 				<li>key="repart-position": value="[org]/[prod]/[ver]", es: csipiemonte/iridev2/2.0.0;
 * 					Serve per permettere al generatore di generare le direttive di scaricamento da repart delle librerie client del servizio fruito</li>
 * 				<li>key="repart-artifact": value=nome dell'artifact delle librerie client del servizio (senza estensione jar, assunta di default), es: "iridev2-pep-intf-2.0.0";
 * 					Serve per permettere al generatore di generare le direttive di scaricamento da repart delle librerie client</li>
 * 			</ul>
 * 			</li>
 *                      <li>per i binding di tipo PAPD:
 * 			<ul>
 * 				<li>key="csi-pd-cache": value="true" o "false";
 * 					Serve per indicare se la PD deve essere mantenuta in cache o meno</li>
 * 			</ul>
 * 			</li>
 * 			<li>per i binding EJB:
 * 			<ul>
 * 				<li>key="csi-pd-plugin": value="ejb-1" o "ejb-2";
 * 					Serve per indicare che la PD (di tipo EJB) utilizza la versione deprecata di plugin (ejb invece che ejb20)</li>
 * 				<li>key="csi-ejbpa-jndiname": value=il nome jndi completo su cui ascolta la PA del servizio;
 * 					Serve per gestire casi legacy o non standard in cui non sia rispettato il nuovo standard di naming jndi</li>
 * 				<li>key="csi-pa-platform": value="WLS92" o "JBoss43";
 * 					Serve per configurare correttamente la pd in modo che possa parlare con un servizio EJB ospitato da un server Weblogic piuttosto che JBoss</li>
 * 				<li>key="repart-position": value="[org]/[prod]/[ver]", es: csipiemonte/iridev2/2.0.0;
 * 					Serve per permettere al generatore di generare le direttive di scaricamento da repart delle librerie client del servizio fruito</li>
 * 				<li>key="repart-artifact": value=nome dell'artifact delle librerie client del servizio (senza estensione jar, assunta di default), es: "iridev2-pep-intf-2.0.0";
 * 					Serve per permettere al generatore di generare le direttive di scaricamento da repart delle librerie client</li>
 * 			</ul>
 * 			</li>
 * 			<li>per i binding SOAP:
 * 			<ul>
 * 				<li>key="csi-soappabr-endpoint": 
 * 					Serve per indicare l'url dell'endpoint del soap bridge in caso non sia standard (esclusa la pate iniziale contenente l'hostname)</li>
 * 				<li>key="csi-soappabr-uri": 
 * 					Serve per indicare il nome del servizio registrato su apache soap, se non standard (equivale al name del plugin soap nella PD)</li>
 * 			</ul>
 * 			</li>
 * 		  </ul>
 * 		</li>
 * 	</ul>
 * </li>
 * </ul>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.appresources.RCAnnotationDetail#getKey <em>Key</em>}</li>
 *   <li>{@link it.csi.mddtools.appresources.RCAnnotationDetail#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRCAnnotationDetail()
 * @model
 * @generated
 */
public interface RCAnnotationDetail extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRCAnnotationDetail_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.RCAnnotationDetail#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see it.csi.mddtools.appresources.AppresourcesPackage#getRCAnnotationDetail_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.appresources.RCAnnotationDetail#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // RCAnnotationDetail
