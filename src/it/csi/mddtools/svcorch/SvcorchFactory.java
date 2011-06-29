/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.svcorch.SvcorchPackage
 * @generated
 */
public interface SvcorchFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SvcorchFactory eINSTANCE = it.csi.mddtools.svcorch.impl.SvcorchFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Orchestration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orchestration</em>'.
	 * @generated
	 */
	Orchestration createOrchestration();

	/**
	 * Returns a new object of class '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Node</em>'.
	 * @generated
	 */
	StartNode createStartNode();

	/**
	 * Returns a new object of class '<em>Stop Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Node</em>'.
	 * @generated
	 */
	StopNode createStopNode();

	/**
	 * Returns a new object of class '<em>PAPD Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PAPD Call</em>'.
	 * @generated
	 */
	PAPDCall createPAPDCall();

	/**
	 * Returns a new object of class '<em>WS Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WS Call</em>'.
	 * @generated
	 */
	WSCall createWSCall();

	/**
	 * Returns a new object of class '<em>Custom Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Transformation</em>'.
	 * @generated
	 */
	CustomTransformation createCustomTransformation();

	/**
	 * Returns a new object of class '<em>Declarative Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declarative Transformation</em>'.
	 * @generated
	 */
	DeclarativeTransformation createDeclarativeTransformation();

	/**
	 * Returns a new object of class '<em>Check Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Condition</em>'.
	 * @generated
	 */
	CheckCondition createCheckCondition();

	/**
	 * Returns a new object of class '<em>For Each</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For Each</em>'.
	 * @generated
	 */
	ForEach createForEach();

	/**
	 * Returns a new object of class '<em>Data Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Slot</em>'.
	 * @generated
	 */
	DataSlot createDataSlot();

	/**
	 * Returns a new object of class '<em>Nodes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nodes</em>'.
	 * @generated
	 */
	Nodes createNodes();

	/**
	 * Returns a new object of class '<em>Data Slots</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Slots</em>'.
	 * @generated
	 */
	DataSlots createDataSlots();

	/**
	 * Returns a new object of class '<em>Param Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Binding</em>'.
	 * @generated
	 */
	ParamBinding createParamBinding();

	/**
	 * Returns a new object of class '<em>Exception Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Handler</em>'.
	 * @generated
	 */
	ExceptionHandler createExceptionHandler();

	/**
	 * Returns a new object of class '<em>Input Param Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Param Bindings</em>'.
	 * @generated
	 */
	InputParamBindings createInputParamBindings();

	/**
	 * Returns a new object of class '<em>End Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Loop</em>'.
	 * @generated
	 */
	EndLoop createEndLoop();

	/**
	 * Returns a new object of class '<em>User Defined Op Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Defined Op Node</em>'.
	 * @generated
	 */
	UserDefinedOpNode createUserDefinedOpNode();

	/**
	 * Returns a new object of class '<em>Exception Mappings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Mappings</em>'.
	 * @generated
	 */
	ExceptionMappings createExceptionMappings();

	/**
	 * Returns a new object of class '<em>Exception Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Mapping</em>'.
	 * @generated
	 */
	ExceptionMapping createExceptionMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SvcorchPackage getSvcorchPackage();

} //SvcorchFactory
