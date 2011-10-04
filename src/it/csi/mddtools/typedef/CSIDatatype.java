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
 * A representation of the model object '<em><b>CSI Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tipo base previsto dall'infrastruttura di cooperazione CSI.
 * Normalmente un insieme di tipi predefiniti è incluso come risorsa nei vari
 * modelli (definizione servizi, orchestrazioni, ...) e dunque in ogni insieme
 * di risorse (modelli) interconnesse è opportuno che vi sia una sola istanza
 * di <b>CSIDatatype</b> per ogni tipo semplice previsto.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.CSIDatatype#getCode <em>Code</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.CSIDatatype#isNillable <em>Nillable</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.typedef.TypedefPackage#getCSIDatatype()
 * @model
 * @generated
 */
public interface CSIDatatype extends Type {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link it.csi.mddtools.typedef.CSIDatatypeCodes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codice che determina il reale tipo. Vedere la documentazione della 
	 * enumeration <b>CSIDatatypeCodes</b> perl'elenco dei tipi supportati.
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.typedef.CSIDatatypeCodes
	 * @see #setCode(CSIDatatypeCodes)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getCSIDatatype_Code()
	 * @model
	 * @generated
	 */
	CSIDatatypeCodes getCode();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.CSIDatatype#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see it.csi.mddtools.typedef.CSIDatatypeCodes
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CSIDatatypeCodes value);

	/**
	 * Returns the value of the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nillable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Qualificatore di tipo che defiisce se il tipo è un tipo che può assumere valore
	 * nullo oppure no.
	 * Es: 
	 * <ul>
	 * <li> code==CSIInteger & nillable == false: tipo intero non annullabile (es. java int)
	 * <li> code==CSIInteger & nillable == true: tipo intero annullabile (es. java Integer)
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nillable</em>' attribute.
	 * @see #setNillable(boolean)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getCSIDatatype_Nillable()
	 * @model
	 * @generated
	 */
	boolean isNillable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.CSIDatatype#isNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nillable</em>' attribute.
	 * @see #isNillable()
	 * @generated
	 */
	void setNillable(boolean value);

} // CSIDatatype
