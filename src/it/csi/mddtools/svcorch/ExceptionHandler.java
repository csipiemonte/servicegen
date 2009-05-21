/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.ExceptionHandler#getHandledException <em>Handled Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Handled Exception</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.typedef.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handled Exception</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handled Exception</em>' reference list.
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getExceptionHandler_HandledException()
	 * @model
	 * @generated
	 */
	EList<it.csi.mddtools.typedef.Exception> getHandledException();

} // ExceptionHandler
