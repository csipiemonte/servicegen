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
package it.csi.mddtools.servicegen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manual Impl Cartridge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * L'implementazione dei servizi &egrave; manuale.
 * A seconda del valore dell'attributo <i>useInjectedPojo</i> sar&agrave;
 * possibile utilizzare un meccanismo di <i>inverse injection</i>, tipo <b>spring>/b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.ManualImplCartridge#isUseInjectedPojo <em>Use Injected Pojo</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getManualImplCartridge()
 * @model
 * @generated
 */
public interface ManualImplCartridge extends LogicImplCartridge {

	/**
	 * Returns the value of the '<em><b>Use Injected Pojo</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se valorizzata a <i>true</i> il servizio verr&agrave; predisposto con un meccanismo
	 * di <i>inverse injection</i>, quale <b>spring</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Injected Pojo</em>' attribute.
	 * @see #setUseInjectedPojo(boolean)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getManualImplCartridge_UseInjectedPojo()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseInjectedPojo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.ManualImplCartridge#isUseInjectedPojo <em>Use Injected Pojo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Injected Pojo</em>' attribute.
	 * @see #isUseInjectedPojo()
	 * @generated
	 */
	void setUseInjectedPojo(boolean value);
} // ManualImplCartridge
