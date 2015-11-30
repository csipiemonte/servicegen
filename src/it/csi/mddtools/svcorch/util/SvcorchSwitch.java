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
package it.csi.mddtools.svcorch.util;

import it.csi.mddtools.svcorch.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.svcorch.SvcorchPackage
 * @generated
 */
public class SvcorchSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SvcorchPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvcorchSwitch() {
		if (modelPackage == null) {
			modelPackage = SvcorchPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SvcorchPackage.ORCHESTRATION: {
				Orchestration orchestration = (Orchestration)theEObject;
				T result = caseOrchestration(orchestration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.OP_NODE: {
				OpNode opNode = (OpNode)theEObject;
				T result = caseOpNode(opNode);
				if (result == null) result = caseNode(opNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.FLOW_NODE: {
				FlowNode flowNode = (FlowNode)theEObject;
				T result = caseFlowNode(flowNode);
				if (result == null) result = caseNode(flowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.START_NODE: {
				StartNode startNode = (StartNode)theEObject;
				T result = caseStartNode(startNode);
				if (result == null) result = caseFlowNode(startNode);
				if (result == null) result = caseNode(startNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.STOP_NODE: {
				StopNode stopNode = (StopNode)theEObject;
				T result = caseStopNode(stopNode);
				if (result == null) result = caseFlowNode(stopNode);
				if (result == null) result = caseNode(stopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.SRV_CALL: {
				SrvCall srvCall = (SrvCall)theEObject;
				T result = caseSrvCall(srvCall);
				if (result == null) result = caseOpNode(srvCall);
				if (result == null) result = caseNode(srvCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.PAPD_CALL: {
				PAPDCall papdCall = (PAPDCall)theEObject;
				T result = casePAPDCall(papdCall);
				if (result == null) result = caseSrvCall(papdCall);
				if (result == null) result = caseOpNode(papdCall);
				if (result == null) result = caseNode(papdCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.WS_CALL: {
				WSCall wsCall = (WSCall)theEObject;
				T result = caseWSCall(wsCall);
				if (result == null) result = caseSrvCall(wsCall);
				if (result == null) result = caseOpNode(wsCall);
				if (result == null) result = caseNode(wsCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = caseOpNode(transformation);
				if (result == null) result = caseNode(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.CUSTOM_TRANSFORMATION: {
				CustomTransformation customTransformation = (CustomTransformation)theEObject;
				T result = caseCustomTransformation(customTransformation);
				if (result == null) result = caseTransformation(customTransformation);
				if (result == null) result = caseOpNode(customTransformation);
				if (result == null) result = caseNode(customTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.DECLARATIVE_TRANSFORMATION: {
				DeclarativeTransformation declarativeTransformation = (DeclarativeTransformation)theEObject;
				T result = caseDeclarativeTransformation(declarativeTransformation);
				if (result == null) result = caseTransformation(declarativeTransformation);
				if (result == null) result = caseOpNode(declarativeTransformation);
				if (result == null) result = caseNode(declarativeTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.CHECK_CONDITION: {
				CheckCondition checkCondition = (CheckCondition)theEObject;
				T result = caseCheckCondition(checkCondition);
				if (result == null) result = caseFlowNode(checkCondition);
				if (result == null) result = caseNode(checkCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.FOR_EACH: {
				ForEach forEach = (ForEach)theEObject;
				T result = caseForEach(forEach);
				if (result == null) result = caseFlowNode(forEach);
				if (result == null) result = caseNode(forEach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.DATA_SLOT: {
				DataSlot dataSlot = (DataSlot)theEObject;
				T result = caseDataSlot(dataSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.NODES: {
				Nodes nodes = (Nodes)theEObject;
				T result = caseNodes(nodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.DATA_SLOTS: {
				DataSlots dataSlots = (DataSlots)theEObject;
				T result = caseDataSlots(dataSlots);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.PARAM_BINDING: {
				ParamBinding paramBinding = (ParamBinding)theEObject;
				T result = caseParamBinding(paramBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.EXCEPTION_HANDLER: {
				ExceptionHandler exceptionHandler = (ExceptionHandler)theEObject;
				T result = caseExceptionHandler(exceptionHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.INPUT_PARAM_BINDINGS: {
				InputParamBindings inputParamBindings = (InputParamBindings)theEObject;
				T result = caseInputParamBindings(inputParamBindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.END_LOOP: {
				EndLoop endLoop = (EndLoop)theEObject;
				T result = caseEndLoop(endLoop);
				if (result == null) result = caseFlowNode(endLoop);
				if (result == null) result = caseNode(endLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.USER_DEFINED_OP_NODE: {
				UserDefinedOpNode userDefinedOpNode = (UserDefinedOpNode)theEObject;
				T result = caseUserDefinedOpNode(userDefinedOpNode);
				if (result == null) result = caseOpNode(userDefinedOpNode);
				if (result == null) result = caseNode(userDefinedOpNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.EXCEPTION_MAPPINGS: {
				ExceptionMappings exceptionMappings = (ExceptionMappings)theEObject;
				T result = caseExceptionMappings(exceptionMappings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvcorchPackage.EXCEPTION_MAPPING: {
				ExceptionMapping exceptionMapping = (ExceptionMapping)theEObject;
				T result = caseExceptionMapping(exceptionMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orchestration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orchestration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrchestration(Orchestration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Op Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Op Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpNode(OpNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNode(FlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartNode(StartNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopNode(StopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Srv Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Srv Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrvCall(SrvCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PAPD Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PAPD Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePAPDCall(PAPDCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WS Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WS Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSCall(WSCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTransformation(CustomTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declarative Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declarative Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarativeTransformation(DeclarativeTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckCondition(CheckCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Each</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForEach(ForEach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSlot(DataSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodes(Nodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Slots</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Slots</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSlots(DataSlots object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamBinding(ParamBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionHandler(ExceptionHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Param Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Param Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputParamBindings(InputParamBindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndLoop(EndLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Op Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Op Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedOpNode(UserDefinedOpNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Mappings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionMappings(ExceptionMappings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionMapping(ExceptionMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SvcorchSwitch
