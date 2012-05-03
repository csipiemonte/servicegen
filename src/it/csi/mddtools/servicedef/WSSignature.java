/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WS Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.WSSignature#isInputMustBeSigned <em>Input Must Be Signed</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.WSSignature#isSignOutput <em>Sign Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSSignature()
 * @model
 * @generated
 */
public interface WSSignature extends WSSecuritySpec {
	/**
	 * Returns the value of the '<em><b>Input Must Be Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Must Be Signed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Must Be Signed</em>' attribute.
	 * @see #setInputMustBeSigned(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSSignature_InputMustBeSigned()
	 * @model
	 * @generated
	 */
	boolean isInputMustBeSigned();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.WSSignature#isInputMustBeSigned <em>Input Must Be Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Must Be Signed</em>' attribute.
	 * @see #isInputMustBeSigned()
	 * @generated
	 */
	void setInputMustBeSigned(boolean value);

	/**
	 * Returns the value of the '<em><b>Sign Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign Output</em>' attribute.
	 * @see #setSignOutput(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getWSSignature_SignOutput()
	 * @model
	 * @generated
	 */
	boolean isSignOutput();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.WSSignature#isSignOutput <em>Sign Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign Output</em>' attribute.
	 * @see #isSignOutput()
	 * @generated
	 */
	void setSignOutput(boolean value);

} // WSSignature
