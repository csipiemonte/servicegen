/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.util;

import it.csi.mddtools.servicedef.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.servicedef.ServicedefPackage
 * @generated
 */
public class ServicedefAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicedefPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicedefAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicedefPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicedefSwitch<Adapter> modelSwitch =
		new ServicedefSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseServiceDef(ServiceDef object) {
				return createServiceDefAdapter();
			}
			@Override
			public Adapter caseServiceBinding(ServiceBinding object) {
				return createServiceBindingAdapter();
			}
			@Override
			public Adapter caseEJBPABinding(EJBPABinding object) {
				return createEJBPABindingAdapter();
			}
			@Override
			public Adapter caseSOAPPABRBinding(SOAPPABRBinding object) {
				return createSOAPPABRBindingAdapter();
			}
			@Override
			public Adapter caseWSFADBinding(WSFADBinding object) {
				return createWSFADBindingAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseParam(Param object) {
				return createParamAdapter();
			}
			@Override
			public Adapter caseTypes(Types object) {
				return createTypesAdapter();
			}
			@Override
			public Adapter caseBaseTypes(BaseTypes object) {
				return createBaseTypesAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseInputValidator(InputValidator object) {
				return createInputValidatorAdapter();
			}
			@Override
			public Adapter caseParamValidator(ParamValidator object) {
				return createParamValidatorAdapter();
			}
			@Override
			public Adapter caseValueRangeConstraint(ValueRangeConstraint object) {
				return createValueRangeConstraintAdapter();
			}
			@Override
			public Adapter caseValueValorizationConstraint(ValueValorizationConstraint object) {
				return createValueValorizationConstraintAdapter();
			}
			@Override
			public Adapter caseCustomConstraint(CustomConstraint object) {
				return createCustomConstraintAdapter();
			}
			@Override
			public Adapter caseRelativeConstraint(RelativeConstraint object) {
				return createRelativeConstraintAdapter();
			}
			@Override
			public Adapter caseValueConstraint(ValueConstraint object) {
				return createValueConstraintAdapter();
			}
			@Override
			public Adapter caseSimpleParamCoinstraint(SimpleParamCoinstraint object) {
				return createSimpleParamCoinstraintAdapter();
			}
			@Override
			public Adapter caseCompositeParamConstraint(CompositeParamConstraint object) {
				return createCompositeParamConstraintAdapter();
			}
			@Override
			public Adapter caseANDParamConstraint(ANDParamConstraint object) {
				return createANDParamConstraintAdapter();
			}
			@Override
			public Adapter caseORParamConstraint(ORParamConstraint object) {
				return createORParamConstraintAdapter();
			}
			@Override
			public Adapter caseParamConstraint(ParamConstraint object) {
				return createParamConstraintAdapter();
			}
			@Override
			public Adapter caseNOTParamConstraint(NOTParamConstraint object) {
				return createNOTParamConstraintAdapter();
			}
			@Override
			public Adapter caseCompositeValueConstraint(CompositeValueConstraint object) {
				return createCompositeValueConstraintAdapter();
			}
			@Override
			public Adapter caseANDValueConstraint(ANDValueConstraint object) {
				return createANDValueConstraintAdapter();
			}
			@Override
			public Adapter caseORValueConstraint(ORValueConstraint object) {
				return createORValueConstraintAdapter();
			}
			@Override
			public Adapter caseNOTValueConstraint(NOTValueConstraint object) {
				return createNOTValueConstraintAdapter();
			}
			@Override
			public Adapter caseSimpleValueConstraint(SimpleValueConstraint object) {
				return createSimpleValueConstraintAdapter();
			}
			@Override
			public Adapter caseContinuousRangeConstraint(ContinuousRangeConstraint object) {
				return createContinuousRangeConstraintAdapter();
			}
			@Override
			public Adapter caseDiscreteRangeConstraint(DiscreteRangeConstraint object) {
				return createDiscreteRangeConstraintAdapter();
			}
			@Override
			public Adapter caseFeatureConstraint(FeatureConstraint object) {
				return createFeatureConstraintAdapter();
			}
			@Override
			public Adapter caseCompositeFeatureConstraint(CompositeFeatureConstraint object) {
				return createCompositeFeatureConstraintAdapter();
			}
			@Override
			public Adapter caseSimpleFeatureConstraint(SimpleFeatureConstraint object) {
				return createSimpleFeatureConstraintAdapter();
			}
			@Override
			public Adapter caseANDFeatureConstraint(ANDFeatureConstraint object) {
				return createANDFeatureConstraintAdapter();
			}
			@Override
			public Adapter caseORFeatureConstraint(ORFeatureConstraint object) {
				return createORFeatureConstraintAdapter();
			}
			@Override
			public Adapter caseNOTFeatureConstraint(NOTFeatureConstraint object) {
				return createNOTFeatureConstraintAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ServiceDef <em>Service Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ServiceDef
	 * @generated
	 */
	public Adapter createServiceDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ServiceBinding <em>Service Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ServiceBinding
	 * @generated
	 */
	public Adapter createServiceBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.EJBPABinding <em>EJBPA Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.EJBPABinding
	 * @generated
	 */
	public Adapter createEJBPABindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.SOAPPABRBinding <em>SOAPPABR Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.SOAPPABRBinding
	 * @generated
	 */
	public Adapter createSOAPPABRBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.WSFADBinding <em>WSFAD Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.WSFADBinding
	 * @generated
	 */
	public Adapter createWSFADBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.Param <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.Param
	 * @generated
	 */
	public Adapter createParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.Types
	 * @generated
	 */
	public Adapter createTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.BaseTypes <em>Base Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.BaseTypes
	 * @generated
	 */
	public Adapter createBaseTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.InputValidator <em>Input Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.InputValidator
	 * @generated
	 */
	public Adapter createInputValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ParamValidator <em>Param Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ParamValidator
	 * @generated
	 */
	public Adapter createParamValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ValueRangeConstraint <em>Value Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ValueRangeConstraint
	 * @generated
	 */
	public Adapter createValueRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ValueValorizationConstraint <em>Value Valorization Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ValueValorizationConstraint
	 * @generated
	 */
	public Adapter createValueValorizationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.CustomConstraint <em>Custom Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.CustomConstraint
	 * @generated
	 */
	public Adapter createCustomConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.RelativeConstraint <em>Relative Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.RelativeConstraint
	 * @generated
	 */
	public Adapter createRelativeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ValueConstraint <em>Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ValueConstraint
	 * @generated
	 */
	public Adapter createValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.SimpleParamCoinstraint <em>Simple Param Coinstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.SimpleParamCoinstraint
	 * @generated
	 */
	public Adapter createSimpleParamCoinstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.CompositeParamConstraint <em>Composite Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.CompositeParamConstraint
	 * @generated
	 */
	public Adapter createCompositeParamConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ANDParamConstraint <em>AND Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ANDParamConstraint
	 * @generated
	 */
	public Adapter createANDParamConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ORParamConstraint <em>OR Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ORParamConstraint
	 * @generated
	 */
	public Adapter createORParamConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ParamConstraint <em>Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ParamConstraint
	 * @generated
	 */
	public Adapter createParamConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.NOTParamConstraint <em>NOT Param Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.NOTParamConstraint
	 * @generated
	 */
	public Adapter createNOTParamConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.CompositeValueConstraint <em>Composite Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.CompositeValueConstraint
	 * @generated
	 */
	public Adapter createCompositeValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ANDValueConstraint <em>AND Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ANDValueConstraint
	 * @generated
	 */
	public Adapter createANDValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ORValueConstraint <em>OR Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ORValueConstraint
	 * @generated
	 */
	public Adapter createORValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.NOTValueConstraint <em>NOT Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.NOTValueConstraint
	 * @generated
	 */
	public Adapter createNOTValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.SimpleValueConstraint <em>Simple Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.SimpleValueConstraint
	 * @generated
	 */
	public Adapter createSimpleValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ContinuousRangeConstraint <em>Continuous Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ContinuousRangeConstraint
	 * @generated
	 */
	public Adapter createContinuousRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.DiscreteRangeConstraint <em>Discrete Range Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.DiscreteRangeConstraint
	 * @generated
	 */
	public Adapter createDiscreteRangeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.FeatureConstraint <em>Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.FeatureConstraint
	 * @generated
	 */
	public Adapter createFeatureConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.CompositeFeatureConstraint <em>Composite Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.CompositeFeatureConstraint
	 * @generated
	 */
	public Adapter createCompositeFeatureConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.SimpleFeatureConstraint <em>Simple Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.SimpleFeatureConstraint
	 * @generated
	 */
	public Adapter createSimpleFeatureConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ANDFeatureConstraint <em>AND Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ANDFeatureConstraint
	 * @generated
	 */
	public Adapter createANDFeatureConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.ORFeatureConstraint <em>OR Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.ORFeatureConstraint
	 * @generated
	 */
	public Adapter createORFeatureConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicedef.NOTFeatureConstraint <em>NOT Feature Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicedef.NOTFeatureConstraint
	 * @generated
	 */
	public Adapter createNOTFeatureConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ServicedefAdapterFactory
