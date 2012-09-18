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
package it.csi.mddtools.servicegen.util;

import it.csi.mddtools.servicegen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.servicegen.ServicegenPackage
 * @generated
 */
public class ServicegenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicegenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicegenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServicegenPackage.eINSTANCE;
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
	protected ServicegenSwitch<Adapter> modelSwitch =
		new ServicegenSwitch<Adapter>() {
			@Override
			public Adapter caseSOABEModel(SOABEModel object) {
				return createSOABEModelAdapter();
			}
			@Override
			public Adapter caseBaseTypes(BaseTypes object) {
				return createBaseTypesAdapter();
			}
			@Override
			public Adapter caseServiceImpl(ServiceImpl object) {
				return createServiceImplAdapter();
			}
			@Override
			public Adapter caseTargetPlatform(TargetPlatform object) {
				return createTargetPlatformAdapter();
			}
			@Override
			public Adapter caseServiceComponent(ServiceComponent object) {
				return createServiceComponentAdapter();
			}
			@Override
			public Adapter caseSimpleSC(SimpleSC object) {
				return createSimpleSCAdapter();
			}
			@Override
			public Adapter caseCompositeSC(CompositeSC object) {
				return createCompositeSCAdapter();
			}
			@Override
			public Adapter caseResourceBasedSC(ResourceBasedSC object) {
				return createResourceBasedSCAdapter();
			}
			@Override
			public Adapter caseResourceBasedSimpleSC(ResourceBasedSimpleSC object) {
				return createResourceBasedSimpleSCAdapter();
			}
			@Override
			public Adapter caseOrchestrationFlowCompositeSC(OrchestrationFlowCompositeSC object) {
				return createOrchestrationFlowCompositeSCAdapter();
			}
			@Override
			public Adapter caseFlowBasedSC(FlowBasedSC object) {
				return createFlowBasedSCAdapter();
			}
			@Override
			public Adapter caseLogicImplCartridge(LogicImplCartridge object) {
				return createLogicImplCartridgeAdapter();
			}
			@Override
			public Adapter caseManualImplCartridge(ManualImplCartridge object) {
				return createManualImplCartridgeAdapter();
			}
			@Override
			public Adapter caseCustomTemplateBasedImplCartridge(CustomTemplateBasedImplCartridge object) {
				return createCustomTemplateBasedImplCartridgeAdapter();
			}
			@Override
			public Adapter caseModelBasedImplCartridge(ModelBasedImplCartridge object) {
				return createModelBasedImplCartridgeAdapter();
			}
			@Override
			public Adapter caseFlowModelImplCartridge(FlowModelImplCartridge object) {
				return createFlowModelImplCartridgeAdapter();
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
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.SOABEModel <em>SOABE Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.SOABEModel
	 * @generated
	 */
	public Adapter createSOABEModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.BaseTypes <em>Base Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.BaseTypes
	 * @generated
	 */
	public Adapter createBaseTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.ServiceImpl <em>Service Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.ServiceImpl
	 * @generated
	 */
	public Adapter createServiceImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.TargetPlatform <em>Target Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.TargetPlatform
	 * @generated
	 */
	public Adapter createTargetPlatformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.ServiceComponent <em>Service Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.ServiceComponent
	 * @generated
	 */
	public Adapter createServiceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.SimpleSC <em>Simple SC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.SimpleSC
	 * @generated
	 */
	public Adapter createSimpleSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.CompositeSC <em>Composite SC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.CompositeSC
	 * @generated
	 */
	public Adapter createCompositeSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.ResourceBasedSC <em>Resource Based SC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.ResourceBasedSC
	 * @generated
	 */
	public Adapter createResourceBasedSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.ResourceBasedSimpleSC <em>Resource Based Simple SC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.ResourceBasedSimpleSC
	 * @generated
	 */
	public Adapter createResourceBasedSimpleSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC <em>Orchestration Flow Composite SC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.OrchestrationFlowCompositeSC
	 * @generated
	 */
	public Adapter createOrchestrationFlowCompositeSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.FlowBasedSC <em>Flow Based SC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.FlowBasedSC
	 * @generated
	 */
	public Adapter createFlowBasedSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.LogicImplCartridge <em>Logic Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.LogicImplCartridge
	 * @generated
	 */
	public Adapter createLogicImplCartridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.ManualImplCartridge <em>Manual Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.ManualImplCartridge
	 * @generated
	 */
	public Adapter createManualImplCartridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.CustomTemplateBasedImplCartridge <em>Custom Template Based Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.CustomTemplateBasedImplCartridge
	 * @generated
	 */
	public Adapter createCustomTemplateBasedImplCartridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.ModelBasedImplCartridge <em>Model Based Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.ModelBasedImplCartridge
	 * @generated
	 */
	public Adapter createModelBasedImplCartridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.servicegen.FlowModelImplCartridge <em>Flow Model Impl Cartridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.servicegen.FlowModelImplCartridge
	 * @generated
	 */
	public Adapter createFlowModelImplCartridgeAdapter() {
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

} //ServicegenAdapterFactory
