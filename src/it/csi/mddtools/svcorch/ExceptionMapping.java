/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.ExceptionMapping#getMsg <em>Msg</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.ExceptionMapping#getFrom <em>From</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.ExceptionMapping#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionMapping()
 * @model
 * @generated
 */
public interface ExceptionMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see #setMsg(String)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionMapping_Msg()
	 * @model
	 * @generated
	 */
	String getMsg();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ExceptionMapping#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(it.csi.mddtools.typedef.Exception)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionMapping_From()
	 * @model containment="true"
	 * @generated
	 */
	it.csi.mddtools.typedef.Exception getFrom();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ExceptionMapping#getFrom <em>From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(it.csi.mddtools.typedef.Exception value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(it.csi.mddtools.typedef.Exception)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionMapping_To()
	 * @model containment="true"
	 * @generated
	 */
	it.csi.mddtools.typedef.Exception getTo();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.ExceptionMapping#getTo <em>To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(it.csi.mddtools.typedef.Exception value);

} // ExceptionMapping
