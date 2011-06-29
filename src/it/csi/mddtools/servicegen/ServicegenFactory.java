/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.servicegen.ServicegenPackage
 * @generated
 */
public interface ServicegenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicegenFactory eINSTANCE = it.csi.mddtools.servicegen.impl.ServicegenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SOABE Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SOABE Model</em>'.
	 * @generated
	 */
	SOABEModel createSOABEModel();

	/**
	 * Returns a new object of class '<em>Base Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Types</em>'.
	 * @generated
	 */
	BaseTypes createBaseTypes();

	/**
	 * Returns a new object of class '<em>Service Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Impl</em>'.
	 * @generated
	 */
	ServiceImpl createServiceImpl();

	/**
	 * Returns a new object of class '<em>Target Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Platform</em>'.
	 * @generated
	 */
	TargetPlatform createTargetPlatform();

	/**
	 * Returns a new object of class '<em>Resource Based Simple SC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Based Simple SC</em>'.
	 * @generated
	 */
	ResourceBasedSimpleSC createResourceBasedSimpleSC();

	/**
	 * Returns a new object of class '<em>Orchestration Flow Composite SC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orchestration Flow Composite SC</em>'.
	 * @generated
	 */
	OrchestrationFlowCompositeSC createOrchestrationFlowCompositeSC();

	/**
	 * Returns a new object of class '<em>Manual Impl Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manual Impl Cartridge</em>'.
	 * @generated
	 */
	ManualImplCartridge createManualImplCartridge();

	/**
	 * Returns a new object of class '<em>Custom Template Based Impl Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Template Based Impl Cartridge</em>'.
	 * @generated
	 */
	CustomTemplateBasedImplCartridge createCustomTemplateBasedImplCartridge();

	/**
	 * Returns a new object of class '<em>Flow Model Impl Cartridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Model Impl Cartridge</em>'.
	 * @generated
	 */
	FlowModelImplCartridge createFlowModelImplCartridge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicegenPackage getServicegenPackage();

} //ServicegenFactory
