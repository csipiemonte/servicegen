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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceBinding#getCodBinding <em>Cod Binding</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceBinding#getChannelSecurityLevel <em>Channel Security Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceBinding()
 * @model abstract="true"
 * @generated
 */
public interface ServiceBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Cod Binding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Binding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Binding</em>' attribute.
	 * @see #setCodBinding(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceBinding_CodBinding()
	 * @model
	 * @generated
	 */
	String getCodBinding();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceBinding#getCodBinding <em>Cod Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Binding</em>' attribute.
	 * @see #getCodBinding()
	 * @generated
	 */
	void setCodBinding(String value);

	/**
	 * Returns the value of the '<em><b>Channel Security Level</b></em>' attribute.
	 * The default value is <code>"A0"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.servicedef.ChannelSecurityLevelEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>
	 * Livello di securizzazione di canale per il binding.
	 * <ul>
	 * <li>C0: il canale &egrave; in chiaro</li>
	 * <li>C1: il canale &egrave; cifrato, senza client authentication</li>
	 * <li>C2: il canale &egrave; cifrato, con client authentication</li>
	 * </ul>
	 * </p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Security Level</em>' attribute.
	 * @see it.csi.mddtools.servicedef.ChannelSecurityLevelEnum
	 * @see #setChannelSecurityLevel(ChannelSecurityLevelEnum)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceBinding_ChannelSecurityLevel()
	 * @model default="A0"
	 * @generated
	 */
	ChannelSecurityLevelEnum getChannelSecurityLevel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceBinding#getChannelSecurityLevel <em>Channel Security Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Security Level</em>' attribute.
	 * @see it.csi.mddtools.servicedef.ChannelSecurityLevelEnum
	 * @see #getChannelSecurityLevel()
	 * @generated
	 */
	void setChannelSecurityLevel(ChannelSecurityLevelEnum value);

} // ServiceBinding
