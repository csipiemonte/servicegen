/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen.util;

import it.csi.mddtools.servicegen.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see it.csi.mddtools.servicegen.ServicegenPackage
 * @generated
 */
public class ServicegenSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicegenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicegenSwitch() {
		if (modelPackage == null) {
			modelPackage = ServicegenPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ServicegenPackage.SOABE_MODEL: {
				SOABEModel soabeModel = (SOABEModel)theEObject;
				T result = caseSOABEModel(soabeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.BASE_TYPES: {
				BaseTypes baseTypes = (BaseTypes)theEObject;
				T result = caseBaseTypes(baseTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.SERVICE_IMPL: {
				ServiceImpl serviceImpl = (ServiceImpl)theEObject;
				T result = caseServiceImpl(serviceImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.TARGET_PLATFORM: {
				TargetPlatform targetPlatform = (TargetPlatform)theEObject;
				T result = caseTargetPlatform(targetPlatform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.SERVICE_COMPONENT: {
				ServiceComponent serviceComponent = (ServiceComponent)theEObject;
				T result = caseServiceComponent(serviceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.SIMPLE_SC: {
				SimpleSC simpleSC = (SimpleSC)theEObject;
				T result = caseSimpleSC(simpleSC);
				if (result == null) result = caseServiceComponent(simpleSC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.COMPOSITE_SC: {
				CompositeSC compositeSC = (CompositeSC)theEObject;
				T result = caseCompositeSC(compositeSC);
				if (result == null) result = caseServiceComponent(compositeSC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.RESOURCE_BASED_SC: {
				ResourceBasedSC resourceBasedSC = (ResourceBasedSC)theEObject;
				T result = caseResourceBasedSC(resourceBasedSC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.RESOURCE_BASED_SIMPLE_SC: {
				ResourceBasedSimpleSC resourceBasedSimpleSC = (ResourceBasedSimpleSC)theEObject;
				T result = caseResourceBasedSimpleSC(resourceBasedSimpleSC);
				if (result == null) result = caseSimpleSC(resourceBasedSimpleSC);
				if (result == null) result = caseResourceBasedSC(resourceBasedSimpleSC);
				if (result == null) result = caseServiceComponent(resourceBasedSimpleSC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.ORCHESTRATION_FLOW_COMPOSITE_SC: {
				OrchestrationFlowCompositeSC orchestrationFlowCompositeSC = (OrchestrationFlowCompositeSC)theEObject;
				T result = caseOrchestrationFlowCompositeSC(orchestrationFlowCompositeSC);
				if (result == null) result = caseCompositeSC(orchestrationFlowCompositeSC);
				if (result == null) result = caseFlowBasedSC(orchestrationFlowCompositeSC);
				if (result == null) result = caseResourceBasedSC(orchestrationFlowCompositeSC);
				if (result == null) result = caseServiceComponent(orchestrationFlowCompositeSC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.FLOW_BASED_SC: {
				FlowBasedSC flowBasedSC = (FlowBasedSC)theEObject;
				T result = caseFlowBasedSC(flowBasedSC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.LOGIC_IMPL_CARTRIDGE: {
				LogicImplCartridge logicImplCartridge = (LogicImplCartridge)theEObject;
				T result = caseLogicImplCartridge(logicImplCartridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.MANUAL_IMPL_CARTRIDGE: {
				ManualImplCartridge manualImplCartridge = (ManualImplCartridge)theEObject;
				T result = caseManualImplCartridge(manualImplCartridge);
				if (result == null) result = caseLogicImplCartridge(manualImplCartridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.CUSTOM_TEMPLATE_BASED_IMPL_CARTRIDGE: {
				CustomTemplateBasedImplCartridge customTemplateBasedImplCartridge = (CustomTemplateBasedImplCartridge)theEObject;
				T result = caseCustomTemplateBasedImplCartridge(customTemplateBasedImplCartridge);
				if (result == null) result = caseLogicImplCartridge(customTemplateBasedImplCartridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.MODEL_BASED_IMPL_CARTRIDGE: {
				ModelBasedImplCartridge modelBasedImplCartridge = (ModelBasedImplCartridge)theEObject;
				T result = caseModelBasedImplCartridge(modelBasedImplCartridge);
				if (result == null) result = caseLogicImplCartridge(modelBasedImplCartridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicegenPackage.FLOW_MODEL_IMPL_CARTRIDGE: {
				FlowModelImplCartridge flowModelImplCartridge = (FlowModelImplCartridge)theEObject;
				T result = caseFlowModelImplCartridge(flowModelImplCartridge);
				if (result == null) result = caseModelBasedImplCartridge(flowModelImplCartridge);
				if (result == null) result = caseLogicImplCartridge(flowModelImplCartridge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOABE Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOABE Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOABEModel(SOABEModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseTypes(BaseTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceImpl(ServiceImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Platform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Platform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPlatform(TargetPlatform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceComponent(ServiceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple SC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple SC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSC(SimpleSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite SC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite SC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSC(CompositeSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Based SC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Based SC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceBasedSC(ResourceBasedSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Based Simple SC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Based Simple SC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceBasedSimpleSC(ResourceBasedSimpleSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orchestration Flow Composite SC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orchestration Flow Composite SC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrchestrationFlowCompositeSC(OrchestrationFlowCompositeSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Based SC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Based SC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowBasedSC(FlowBasedSC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logic Impl Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logic Impl Cartridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicImplCartridge(LogicImplCartridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual Impl Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual Impl Cartridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualImplCartridge(ManualImplCartridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Template Based Impl Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Template Based Impl Cartridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTemplateBasedImplCartridge(CustomTemplateBasedImplCartridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Based Impl Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Based Impl Cartridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelBasedImplCartridge(ModelBasedImplCartridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Model Impl Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Model Impl Cartridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowModelImplCartridge(FlowModelImplCartridge object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ServicegenSwitch
