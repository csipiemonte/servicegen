/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import it.csi.mddtools.svcorch.Orchestration;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestration Flow Composite SC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC#getOrchestrations <em>Orchestrations</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getOrchestrationFlowCompositeSC()
 * @model
 * @generated
 */
public interface OrchestrationFlowCompositeSC extends CompositeSC, FlowBasedSC, ResourceBasedSC {

	/**
	 * Returns the value of the '<em><b>Orchestrations</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.svcorch.Orchestration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orchestrations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orchestrations</em>' reference list.
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getOrchestrationFlowCompositeSC_Orchestrations()
	 * @model
	 * @generated
	 */
	EList<Orchestration> getOrchestrations();
} // OrchestrationFlowCompositeSC
