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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Constraint</b></em>'.
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
 *   <li>{@link it.csi.mddtools.servicedef.CustomConstraint#getCheckMethodName <em>Check Method Name</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getCustomConstraint()
 * @model
 * @generated
 */
public interface CustomConstraint extends SimpleValueConstraint {
	/**
	 * Returns the value of the '<em><b>Check Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Method Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Check Method Name</em>' attribute.
	 * @see #setCheckMethodName(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getCustomConstraint_CheckMethodName()
	 * @model
	 * @generated
	 */
	String getCheckMethodName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.CustomConstraint#getCheckMethodName <em>Check Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Method Name</em>' attribute.
	 * @see #getCheckMethodName()
	 * @generated
	 */
	void setCheckMethodName(String value);

} // CustomConstraint
