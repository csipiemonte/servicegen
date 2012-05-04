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
package it.csi.mddtools.typedef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tipo complesso costituito da 1 o piu' <b>feature</b> (campi).
 * Non è prevista la possibilità di definire gerarchie.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.Entity#getFeatures <em>Features</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.Entity#getVersionuid <em>Versionuid</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.typedef.TypedefPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.typedef.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Campi che costituiscono il tipo complesso. 
	 * Ciascuna feature può essere definita con un tipo semplice, array o complesso.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see it.csi.mddtools.typedef.TypedefPackage#getEntity_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Versionuid</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versionuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * campo opzionale che serve come marcatore di discontinuità dal punto
	 * di vista della retrocompatibilità.
	 * Tra due versioni differenti di uno stesso complex type la variazione
	 * del versionuid indica una non retrocompatibilità tra i due tipi.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versionuid</em>' attribute.
	 * @see #setVersionuid(int)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getEntity_Versionuid()
	 * @model default="1"
	 * @generated
	 */
	int getVersionuid();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.Entity#getVersionuid <em>Versionuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versionuid</em>' attribute.
	 * @see #getVersionuid()
	 * @generated
	 */
	void setVersionuid(int value);

} // Entity
