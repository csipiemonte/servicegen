/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.typedef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Tipo base customizzabile. Permette di definire differenti <i>Typeset</i>.
 * In particolare &egrave; possibile definire anche un insieme di <i>language binding</i>
 * che permettono di indicare il tipo <i>language specific</i> a cui deve essere associato
 * il tipo modellato.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.PrimitiveType#getTypesetName <em>Typeset Name</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.PrimitiveType#isNillable <em>Nillable</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.PrimitiveType#getLanguageBindings <em>Language Bindings</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.typedef.TypedefPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends Type {
	/**
	 * Returns the value of the '<em><b>Typeset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nome del typeset, es.: <i>xsd</i>, <i>CSI</i>.
	 * Ha scopo tipicamente mnemonico, a meno che non sia referenziato 
	 * esplicitamente da qualche cartuccia di generazione. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Typeset Name</em>' attribute.
	 * @see #setTypesetName(String)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getPrimitiveType_TypesetName()
	 * @model
	 * @generated
	 */
	String getTypesetName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.PrimitiveType#getTypesetName <em>Typeset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typeset Name</em>' attribute.
	 * @see #getTypesetName()
	 * @generated
	 */
	void setTypesetName(String value);

	/**
	 * Returns the value of the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se impostato a <i>true</i> indica che il tipo prevede tra i valori possibili
	 * il valore nullo.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nillable</em>' attribute.
	 * @see #setNillable(boolean)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getPrimitiveType_Nillable()
	 * @model
	 * @generated
	 */
	boolean isNillable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.PrimitiveType#isNillable <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nillable</em>' attribute.
	 * @see #isNillable()
	 * @generated
	 */
	void setNillable(boolean value);

	/**
	 * Returns the value of the '<em><b>Language Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.typedef.TypeLanguageBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binding del tipo nei vari linguaggi. Ciascun binding permette di definire come
	 * deve essere trattato il tipo nel linguaggio specifico, ovvero a quale tipo effettivo
	 * dovr&agrave; essere associato e con che caratteristiche di dettaglio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Bindings</em>' containment reference list.
	 * @see it.csi.mddtools.typedef.TypedefPackage#getPrimitiveType_LanguageBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeLanguageBinding> getLanguageBindings();

} // PrimitiveType
