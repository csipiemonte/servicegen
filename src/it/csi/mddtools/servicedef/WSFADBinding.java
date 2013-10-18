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
 * A representation of the model object '<em><b>WSFAD Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.WSFADBinding#isUseLiteral <em>Use Literal</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.WSFADBinding#isStyleWrapped <em>Style Wrapped</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.WSFADBinding#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSFADBinding()
 * @model
 * @generated
 */
public interface WSFADBinding extends ServiceBinding {

	/**
	 * Returns the value of the '<em><b>Use Literal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Literal</em>' attribute.
	 * @see #setUseLiteral(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSFADBinding_UseLiteral()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseLiteral();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.WSFADBinding#isUseLiteral <em>Use Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Literal</em>' attribute.
	 * @see #isUseLiteral()
	 * @generated
	 */
	void setUseLiteral(boolean value);

	/**
	 * Returns the value of the '<em><b>Style Wrapped</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Wrapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Wrapped</em>' attribute.
	 * @see #setStyleWrapped(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSFADBinding_StyleWrapped()
	 * @model default="false"
	 * @generated
	 */
	boolean isStyleWrapped();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.WSFADBinding#isStyleWrapped <em>Style Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Wrapped</em>' attribute.
	 * @see #isStyleWrapped()
	 * @generated
	 */
	void setStyleWrapped(boolean value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSFADBinding_Namespace()
	 * @model
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.WSFADBinding#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);
} // WSFADBinding
