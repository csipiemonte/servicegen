/**
 */
package it.csi.mddtools.typedef;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.EnumVal#getValueType <em>Value Type</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.EnumVal#getLiterals <em>Literals</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.typedef.TypedefPackage#getEnumVal()
 * @model
 * @generated
 */
public interface EnumVal extends Type {
	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' containment reference.
	 * @see #setValueType(Type)
	 * @see it.csi.mddtools.typedef.TypedefPackage#getEnumVal_ValueType()
	 * @model containment="true"
	 * @generated
	 */
	Type getValueType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.typedef.EnumVal#getValueType <em>Value Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' containment reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(Type value);

	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.typedef.EnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see it.csi.mddtools.typedef.TypedefPackage#getEnumVal_Literals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumLiteral> getLiterals();

} // EnumVal
