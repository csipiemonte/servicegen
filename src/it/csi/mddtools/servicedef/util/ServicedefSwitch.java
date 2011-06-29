/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.util;

import it.csi.mddtools.servicedef.*;

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
 * @see it.csi.mddtools.servicedef.ServicedefPackage
 * @generated
 */
public class ServicedefSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicedefPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicedefSwitch() {
		if (modelPackage == null) {
			modelPackage = ServicedefPackage.eINSTANCE;
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
			case ServicedefPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.SERVICE_DEF: {
				ServiceDef serviceDef = (ServiceDef)theEObject;
				T result = caseServiceDef(serviceDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.SERVICE_BINDING: {
				ServiceBinding serviceBinding = (ServiceBinding)theEObject;
				T result = caseServiceBinding(serviceBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.EJBPA_BINDING: {
				EJBPABinding ejbpaBinding = (EJBPABinding)theEObject;
				T result = caseEJBPABinding(ejbpaBinding);
				if (result == null) result = caseServiceBinding(ejbpaBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.SOAPPABR_BINDING: {
				SOAPPABRBinding soappabrBinding = (SOAPPABRBinding)theEObject;
				T result = caseSOAPPABRBinding(soappabrBinding);
				if (result == null) result = caseServiceBinding(soappabrBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.WSFAD_BINDING: {
				WSFADBinding wsfadBinding = (WSFADBinding)theEObject;
				T result = caseWSFADBinding(wsfadBinding);
				if (result == null) result = caseServiceBinding(wsfadBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.PARAM: {
				Param param = (Param)theEObject;
				T result = caseParam(param);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.TYPES: {
				Types types = (Types)theEObject;
				T result = caseTypes(types);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.BASE_TYPES: {
				BaseTypes baseTypes = (BaseTypes)theEObject;
				T result = caseBaseTypes(baseTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.INPUT_VALIDATOR: {
				InputValidator inputValidator = (InputValidator)theEObject;
				T result = caseInputValidator(inputValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.PARAM_VALIDATOR: {
				ParamValidator paramValidator = (ParamValidator)theEObject;
				T result = caseParamValidator(paramValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.VALUE_RANGE_CONSTRAINT: {
				ValueRangeConstraint valueRangeConstraint = (ValueRangeConstraint)theEObject;
				T result = caseValueRangeConstraint(valueRangeConstraint);
				if (result == null) result = caseSimpleValueConstraint(valueRangeConstraint);
				if (result == null) result = caseValueConstraint(valueRangeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.VALUE_VALORIZATION_CONSTRAINT: {
				ValueValorizationConstraint valueValorizationConstraint = (ValueValorizationConstraint)theEObject;
				T result = caseValueValorizationConstraint(valueValorizationConstraint);
				if (result == null) result = caseSimpleValueConstraint(valueValorizationConstraint);
				if (result == null) result = caseValueConstraint(valueValorizationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.CUSTOM_CONSTRAINT: {
				CustomConstraint customConstraint = (CustomConstraint)theEObject;
				T result = caseCustomConstraint(customConstraint);
				if (result == null) result = caseSimpleValueConstraint(customConstraint);
				if (result == null) result = caseValueConstraint(customConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.RELATIVE_CONSTRAINT: {
				RelativeConstraint relativeConstraint = (RelativeConstraint)theEObject;
				T result = caseRelativeConstraint(relativeConstraint);
				if (result == null) result = caseSimpleValueConstraint(relativeConstraint);
				if (result == null) result = caseValueConstraint(relativeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.VALUE_CONSTRAINT: {
				ValueConstraint valueConstraint = (ValueConstraint)theEObject;
				T result = caseValueConstraint(valueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.SIMPLE_PARAM_COINSTRAINT: {
				SimpleParamCoinstraint simpleParamCoinstraint = (SimpleParamCoinstraint)theEObject;
				T result = caseSimpleParamCoinstraint(simpleParamCoinstraint);
				if (result == null) result = caseParamConstraint(simpleParamCoinstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.COMPOSITE_PARAM_CONSTRAINT: {
				CompositeParamConstraint compositeParamConstraint = (CompositeParamConstraint)theEObject;
				T result = caseCompositeParamConstraint(compositeParamConstraint);
				if (result == null) result = caseParamConstraint(compositeParamConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.AND_PARAM_CONSTRAINT: {
				ANDParamConstraint andParamConstraint = (ANDParamConstraint)theEObject;
				T result = caseANDParamConstraint(andParamConstraint);
				if (result == null) result = caseCompositeParamConstraint(andParamConstraint);
				if (result == null) result = caseParamConstraint(andParamConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.OR_PARAM_CONSTRAINT: {
				ORParamConstraint orParamConstraint = (ORParamConstraint)theEObject;
				T result = caseORParamConstraint(orParamConstraint);
				if (result == null) result = caseCompositeParamConstraint(orParamConstraint);
				if (result == null) result = caseParamConstraint(orParamConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.PARAM_CONSTRAINT: {
				ParamConstraint paramConstraint = (ParamConstraint)theEObject;
				T result = caseParamConstraint(paramConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.NOT_PARAM_CONSTRAINT: {
				NOTParamConstraint notParamConstraint = (NOTParamConstraint)theEObject;
				T result = caseNOTParamConstraint(notParamConstraint);
				if (result == null) result = caseCompositeParamConstraint(notParamConstraint);
				if (result == null) result = caseParamConstraint(notParamConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.COMPOSITE_VALUE_CONSTRAINT: {
				CompositeValueConstraint compositeValueConstraint = (CompositeValueConstraint)theEObject;
				T result = caseCompositeValueConstraint(compositeValueConstraint);
				if (result == null) result = caseValueConstraint(compositeValueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.AND_VALUE_CONSTRAINT: {
				ANDValueConstraint andValueConstraint = (ANDValueConstraint)theEObject;
				T result = caseANDValueConstraint(andValueConstraint);
				if (result == null) result = caseCompositeValueConstraint(andValueConstraint);
				if (result == null) result = caseValueConstraint(andValueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.OR_VALUE_CONSTRAINT: {
				ORValueConstraint orValueConstraint = (ORValueConstraint)theEObject;
				T result = caseORValueConstraint(orValueConstraint);
				if (result == null) result = caseCompositeValueConstraint(orValueConstraint);
				if (result == null) result = caseValueConstraint(orValueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.NOT_VALUE_CONSTRAINT: {
				NOTValueConstraint notValueConstraint = (NOTValueConstraint)theEObject;
				T result = caseNOTValueConstraint(notValueConstraint);
				if (result == null) result = caseCompositeValueConstraint(notValueConstraint);
				if (result == null) result = caseValueConstraint(notValueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.SIMPLE_VALUE_CONSTRAINT: {
				SimpleValueConstraint simpleValueConstraint = (SimpleValueConstraint)theEObject;
				T result = caseSimpleValueConstraint(simpleValueConstraint);
				if (result == null) result = caseValueConstraint(simpleValueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.CONTINUOUS_RANGE_CONSTRAINT: {
				ContinuousRangeConstraint continuousRangeConstraint = (ContinuousRangeConstraint)theEObject;
				T result = caseContinuousRangeConstraint(continuousRangeConstraint);
				if (result == null) result = caseValueRangeConstraint(continuousRangeConstraint);
				if (result == null) result = caseSimpleValueConstraint(continuousRangeConstraint);
				if (result == null) result = caseValueConstraint(continuousRangeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.DISCRETE_RANGE_CONSTRAINT: {
				DiscreteRangeConstraint discreteRangeConstraint = (DiscreteRangeConstraint)theEObject;
				T result = caseDiscreteRangeConstraint(discreteRangeConstraint);
				if (result == null) result = caseValueRangeConstraint(discreteRangeConstraint);
				if (result == null) result = caseSimpleValueConstraint(discreteRangeConstraint);
				if (result == null) result = caseValueConstraint(discreteRangeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.FEATURE_CONSTRAINT: {
				FeatureConstraint featureConstraint = (FeatureConstraint)theEObject;
				T result = caseFeatureConstraint(featureConstraint);
				if (result == null) result = caseValueConstraint(featureConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.COMPOSITE_FEATURE_CONSTRAINT: {
				CompositeFeatureConstraint compositeFeatureConstraint = (CompositeFeatureConstraint)theEObject;
				T result = caseCompositeFeatureConstraint(compositeFeatureConstraint);
				if (result == null) result = caseFeatureConstraint(compositeFeatureConstraint);
				if (result == null) result = caseValueConstraint(compositeFeatureConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.SIMPLE_FEATURE_CONSTRAINT: {
				SimpleFeatureConstraint simpleFeatureConstraint = (SimpleFeatureConstraint)theEObject;
				T result = caseSimpleFeatureConstraint(simpleFeatureConstraint);
				if (result == null) result = caseFeatureConstraint(simpleFeatureConstraint);
				if (result == null) result = caseValueConstraint(simpleFeatureConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.AND_FEATURE_CONSTRAINT: {
				ANDFeatureConstraint andFeatureConstraint = (ANDFeatureConstraint)theEObject;
				T result = caseANDFeatureConstraint(andFeatureConstraint);
				if (result == null) result = caseCompositeFeatureConstraint(andFeatureConstraint);
				if (result == null) result = caseFeatureConstraint(andFeatureConstraint);
				if (result == null) result = caseValueConstraint(andFeatureConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.OR_FEATURE_CONSTRAINT: {
				ORFeatureConstraint orFeatureConstraint = (ORFeatureConstraint)theEObject;
				T result = caseORFeatureConstraint(orFeatureConstraint);
				if (result == null) result = caseCompositeFeatureConstraint(orFeatureConstraint);
				if (result == null) result = caseFeatureConstraint(orFeatureConstraint);
				if (result == null) result = caseValueConstraint(orFeatureConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.NOT_FEATURE_CONSTRAINT: {
				NOTFeatureConstraint notFeatureConstraint = (NOTFeatureConstraint)theEObject;
				T result = caseNOTFeatureConstraint(notFeatureConstraint);
				if (result == null) result = caseCompositeFeatureConstraint(notFeatureConstraint);
				if (result == null) result = caseFeatureConstraint(notFeatureConstraint);
				if (result == null) result = caseValueConstraint(notFeatureConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.SERVICE_DEF_ANNOTATION: {
				ServiceDefAnnotation serviceDefAnnotation = (ServiceDefAnnotation)theEObject;
				T result = caseServiceDefAnnotation(serviceDefAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicedefPackage.SD_ANNOTATION_DETAIL: {
				SDAnnotationDetail sdAnnotationDetail = (SDAnnotationDetail)theEObject;
				T result = caseSDAnnotationDetail(sdAnnotationDetail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDef(ServiceDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceBinding(ServiceBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EJBPA Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EJBPA Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEJBPABinding(EJBPABinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOAPPABR Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOAPPABR Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOAPPABRBinding(SOAPPABRBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WSFAD Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WSFAD Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWSFADBinding(WSFADBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParam(Param object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypes(Types object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputValidator(InputValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamValidator(ParamValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Range Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRangeConstraint(ValueRangeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Valorization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Valorization Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueValorizationConstraint(ValueValorizationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomConstraint(CustomConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeConstraint(RelativeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueConstraint(ValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Param Coinstraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Param Coinstraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleParamCoinstraint(SimpleParamCoinstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Param Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Param Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeParamConstraint(CompositeParamConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Param Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Param Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDParamConstraint(ANDParamConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR Param Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR Param Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORParamConstraint(ORParamConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamConstraint(ParamConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOT Param Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOT Param Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOTParamConstraint(NOTParamConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeValueConstraint(CompositeValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDValueConstraint(ANDValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORValueConstraint(ORValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOT Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOT Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOTValueConstraint(NOTValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleValueConstraint(SimpleValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuous Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuous Range Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousRangeConstraint(ContinuousRangeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Range Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteRangeConstraint(DiscreteRangeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureConstraint(FeatureConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Feature Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeFeatureConstraint(CompositeFeatureConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Feature Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleFeatureConstraint(SimpleFeatureConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Feature Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDFeatureConstraint(ANDFeatureConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR Feature Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORFeatureConstraint(ORFeatureConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOT Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOT Feature Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOTFeatureConstraint(NOTFeatureConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Def Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Def Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDefAnnotation(ServiceDefAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SD Annotation Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SD Annotation Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSDAnnotationDetail(SDAnnotationDetail object) {
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

} //ServicedefSwitch
