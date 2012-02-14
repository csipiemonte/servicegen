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
package it.csi.mddtools.svcorch;

import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.ServiceDef;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orchestration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.Orchestration#getNodes <em>Nodes</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Orchestration#getGlobalSlots <em>Global Slots</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Orchestration#getService <em>Service</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Orchestration#getOperation <em>Operation</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Orchestration#getInputParamBindings <em>Input Param Bindings</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Orchestration#getReturnSlot <em>Return Slot</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Orchestration#getExceptionMappings <em>Exception Mappings</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Orchestration#getPrincipalNameSlot <em>Principal Name Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOrchestration()
 * @model
 * @generated
 */
public interface Orchestration extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference.
	 * @see #setNodes(Nodes)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOrchestration_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	Nodes getNodes();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Orchestration#getNodes <em>Nodes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' containment reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(Nodes value);

	/**
	 * Returns the value of the '<em><b>Global Slots</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Slots</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Slots</em>' containment reference.
	 * @see #setGlobalSlots(DataSlots)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOrchestration_GlobalSlots()
	 * @model containment="true"
	 * @generated
	 */
	DataSlots getGlobalSlots();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Orchestration#getGlobalSlots <em>Global Slots</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Slots</em>' containment reference.
	 * @see #getGlobalSlots()
	 * @generated
	 */
	void setGlobalSlots(DataSlots value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(ServiceDef)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOrchestration_Service()
	 * @model
	 * @generated
	 */
	ServiceDef getService();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Orchestration#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceDef value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOrchestration_Operation()
	 * @model
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Orchestration#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>Input Param Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Param Bindings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Param Bindings</em>' containment reference.
	 * @see #setInputParamBindings(InputParamBindings)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOrchestration_InputParamBindings()
	 * @model containment="true"
	 * @generated
	 */
	InputParamBindings getInputParamBindings();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Orchestration#getInputParamBindings <em>Input Param Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Param Bindings</em>' containment reference.
	 * @see #getInputParamBindings()
	 * @generated
	 */
	void setInputParamBindings(InputParamBindings value);

	/**
	 * Returns the value of the '<em><b>Return Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Slot</em>' reference.
	 * @see #setReturnSlot(DataSlot)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOrchestration_ReturnSlot()
	 * @model
	 * @generated
	 */
	DataSlot getReturnSlot();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Orchestration#getReturnSlot <em>Return Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Slot</em>' reference.
	 * @see #getReturnSlot()
	 * @generated
	 */
	void setReturnSlot(DataSlot value);

	/**
	 * Returns the value of the '<em><b>Exception Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Mappings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Mappings</em>' containment reference.
	 * @see #setExceptionMappings(ExceptionMappings)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOrchestration_ExceptionMappings()
	 * @model containment="true"
	 * @generated
	 */
	ExceptionMappings getExceptionMappings();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Orchestration#getExceptionMappings <em>Exception Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Mappings</em>' containment reference.
	 * @see #getExceptionMappings()
	 * @generated
	 */
	void setExceptionMappings(ExceptionMappings value);

	/**
	 * Returns the value of the '<em><b>Principal Name Slot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Principal Name Slot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Principal Name Slot</em>' reference.
	 * @see #setPrincipalNameSlot(DataSlot)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getOrchestration_PrincipalNameSlot()
	 * @model
	 * @generated
	 */
	DataSlot getPrincipalNameSlot();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Orchestration#getPrincipalNameSlot <em>Principal Name Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Principal Name Slot</em>' reference.
	 * @see #getPrincipalNameSlot()
	 * @generated
	 */
	void setPrincipalNameSlot(DataSlot value);

} // Orchestration
