/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.typedef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Language Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.TypeLanguageBinding#getLang <em>Lang</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.TypeLanguageBinding#getLangSpecificType <em>Lang Specific Type</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.TypeLanguageBinding#getLangSpecificNS <em>Lang Specific NS</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.TypeLanguageBinding#getDefaultInitValue <em>Default Init Value</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.TypeLanguageBinding#getNullValueLiteral <em>Null Value Literal</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.typedef.TypedefPackage#getTypeLanguageBinding()
 * @model
 * @generated
 */
public interface TypeLanguageBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * codice del linguaggio.
	 * 
	 * E' un codice mnemonico eventualmente utilizzato dalle cartucce di generazione, pertanto
	 * non vi sono vincoli a priori sulla codifica da utilizzare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getTypeLanguageBinding_Lang()
	 * @model
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Lang Specific Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indica il nome del tipo del linguaggio target, privo dell'eventuale namespace.
	 * L'unione di <i>langSpecificNS</i> e <i>langSpecificType</i> rappresenta il
	 * <i>full qualified name</i> del tipo.
	 * 
	 * Es, per java:
	 * <ul>
	 * <li>int (namespace: nessuno)</li>
	 * <li>String (namespace: java.lang.</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Specific Type</em>' attribute.
	 * @see #setLangSpecificType(String)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getTypeLanguageBinding_LangSpecificType()
	 * @model
	 * @generated
	 */
	String getLangSpecificType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getLangSpecificType <em>Lang Specific Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Specific Type</em>' attribute.
	 * @see #getLangSpecificType()
	 * @generated
	 */
	void setLangSpecificType(String value);

	/**
	 * Returns the value of the '<em><b>Lang Specific NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indica il nome del namespace (pacakge) che contiene il tipo del linguaggio 
	 * target. N.B: comprende anche un eventuale carattere separatore da anteporre al nome del tipo.
	 * L'unione di <i>langSpecificNS</i> e <i>langSpecificType</i> rappresenta il
	 * <i>full qualified name</i> del tipo.
	 * 
	 * Es, per java:
	 * <ul>
	 * <li>int (namespace: nessuno)</li>
	 * <li>String (namespace: java.lang.</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Specific NS</em>' attribute.
	 * @see #setLangSpecificNS(String)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getTypeLanguageBinding_LangSpecificNS()
	 * @model
	 * @generated
	 */
	String getLangSpecificNS();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getLangSpecificNS <em>Lang Specific NS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Specific NS</em>' attribute.
	 * @see #getLangSpecificNS()
	 * @generated
	 */
	void setLangSpecificNS(String value);

	/**
	 * Returns the value of the '<em><b>Default Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indica il valore iniziale che deve essere impostato nel codice rleativo al
	 * linguaggio in oggetto, nelle dichiarazioni di variabili
	 * che coinvolgono il <b>PrimitiveType</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Init Value</em>' attribute.
	 * @see #setDefaultInitValue(String)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getTypeLanguageBinding_DefaultInitValue()
	 * @model
	 * @generated
	 */
	String getDefaultInitValue();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getDefaultInitValue <em>Default Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Init Value</em>' attribute.
	 * @see #getDefaultInitValue()
	 * @generated
	 */
	void setDefaultInitValue(String value);

	/**
	 * Returns the value of the '<em><b>Null Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Utilizzato in congiunzione con <i>nillable==true</i> sull'elemento
	 * padre <b>PrimitiveType</p>. 
	 * Permette di impostare il valore nullo da utilizzare per il linguaggio in oggetto.
	 * Es. per java: <code>nullValueLiteral=null</code> 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Value Literal</em>' attribute.
	 * @see #setNullValueLiteral(String)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getTypeLanguageBinding_NullValueLiteral()
	 * @model
	 * @generated
	 */
	String getNullValueLiteral();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getNullValueLiteral <em>Null Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Value Literal</em>' attribute.
	 * @see #getNullValueLiteral()
	 * @generated
	 */
	void setNullValueLiteral(String value);

} // TypeLanguageBinding
