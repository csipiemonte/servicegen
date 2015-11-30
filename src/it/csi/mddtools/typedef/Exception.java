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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tipo eccezione. E' utilizzato nelle interfacce di servizio per la
 * dichiarazioen delle eccezioni previste dai vari metodi.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.Exception#getExceptionType <em>Exception Type</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.typedef.TypedefPackage#getException()
 * @model
 * @generated
 */
public interface Exception extends Type {
	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.typedef.CSIExceptionTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tipo di eccezioni (tra le tipologie previste dall'infrastruttura di cooperazione CSI)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Type</em>' attribute.
	 * @see it.csi.mddtools.typedef.CSIExceptionTypes
	 * @see #setExceptionType(CSIExceptionTypes)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getException_ExceptionType()
	 * @model
	 * @generated
	 */
	CSIExceptionTypes getExceptionType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.Exception#getExceptionType <em>Exception Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type</em>' attribute.
	 * @see it.csi.mddtools.typedef.CSIExceptionTypes
	 * @see #getExceptionType()
	 * @generated
	 */
	void setExceptionType(CSIExceptionTypes value);

} // Exception
