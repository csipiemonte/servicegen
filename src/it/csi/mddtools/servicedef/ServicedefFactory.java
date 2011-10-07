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
package it.csi.mddtools.servicedef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.servicedef.ServicedefPackage
 * @generated
 */
public interface ServicedefFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicedefFactory eINSTANCE = it.csi.mddtools.servicedef.impl.ServicedefFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Service Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Def</em>'.
	 * @generated
	 */
	ServiceDef createServiceDef();

	/**
	 * Returns a new object of class '<em>EJBPA Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EJBPA Binding</em>'.
	 * @generated
	 */
	EJBPABinding createEJBPABinding();

	/**
	 * Returns a new object of class '<em>SOAPPABR Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SOAPPABR Binding</em>'.
	 * @generated
	 */
	SOAPPABRBinding createSOAPPABRBinding();

	/**
	 * Returns a new object of class '<em>WSFAD Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WSFAD Binding</em>'.
	 * @generated
	 */
	WSFADBinding createWSFADBinding();

	/**
	 * Returns a new object of class '<em>WS Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WS Binding</em>'.
	 * @generated
	 */
	WSBinding createWSBinding();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param</em>'.
	 * @generated
	 */
	Param createParam();

	/**
	 * Returns a new object of class '<em>Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Types</em>'.
	 * @generated
	 */
	Types createTypes();

	/**
	 * Returns a new object of class '<em>Base Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Types</em>'.
	 * @generated
	 */
	BaseTypes createBaseTypes();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Input Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Validator</em>'.
	 * @generated
	 */
	InputValidator createInputValidator();

	/**
	 * Returns a new object of class '<em>Param Validator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Validator</em>'.
	 * @generated
	 */
	ParamValidator createParamValidator();

	/**
	 * Returns a new object of class '<em>Value Valorization Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Valorization Constraint</em>'.
	 * @generated
	 */
	ValueValorizationConstraint createValueValorizationConstraint();

	/**
	 * Returns a new object of class '<em>Custom Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Constraint</em>'.
	 * @generated
	 */
	CustomConstraint createCustomConstraint();

	/**
	 * Returns a new object of class '<em>Relative Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relative Constraint</em>'.
	 * @generated
	 */
	RelativeConstraint createRelativeConstraint();

	/**
	 * Returns a new object of class '<em>Simple Param Coinstraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Param Coinstraint</em>'.
	 * @generated
	 */
	SimpleParamCoinstraint createSimpleParamCoinstraint();

	/**
	 * Returns a new object of class '<em>AND Param Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND Param Constraint</em>'.
	 * @generated
	 */
	ANDParamConstraint createANDParamConstraint();

	/**
	 * Returns a new object of class '<em>OR Param Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR Param Constraint</em>'.
	 * @generated
	 */
	ORParamConstraint createORParamConstraint();

	/**
	 * Returns a new object of class '<em>NOT Param Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NOT Param Constraint</em>'.
	 * @generated
	 */
	NOTParamConstraint createNOTParamConstraint();

	/**
	 * Returns a new object of class '<em>AND Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND Value Constraint</em>'.
	 * @generated
	 */
	ANDValueConstraint createANDValueConstraint();

	/**
	 * Returns a new object of class '<em>OR Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR Value Constraint</em>'.
	 * @generated
	 */
	ORValueConstraint createORValueConstraint();

	/**
	 * Returns a new object of class '<em>NOT Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NOT Value Constraint</em>'.
	 * @generated
	 */
	NOTValueConstraint createNOTValueConstraint();

	/**
	 * Returns a new object of class '<em>Continuous Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuous Range Constraint</em>'.
	 * @generated
	 */
	ContinuousRangeConstraint createContinuousRangeConstraint();

	/**
	 * Returns a new object of class '<em>Discrete Range Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discrete Range Constraint</em>'.
	 * @generated
	 */
	DiscreteRangeConstraint createDiscreteRangeConstraint();

	/**
	 * Returns a new object of class '<em>Simple Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Feature Constraint</em>'.
	 * @generated
	 */
	SimpleFeatureConstraint createSimpleFeatureConstraint();

	/**
	 * Returns a new object of class '<em>AND Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND Feature Constraint</em>'.
	 * @generated
	 */
	ANDFeatureConstraint createANDFeatureConstraint();

	/**
	 * Returns a new object of class '<em>OR Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR Feature Constraint</em>'.
	 * @generated
	 */
	ORFeatureConstraint createORFeatureConstraint();

	/**
	 * Returns a new object of class '<em>NOT Feature Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NOT Feature Constraint</em>'.
	 * @generated
	 */
	NOTFeatureConstraint createNOTFeatureConstraint();

	/**
	 * Returns a new object of class '<em>Service Def Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Def Annotation</em>'.
	 * @generated
	 */
	ServiceDefAnnotation createServiceDefAnnotation();

	/**
	 * Returns a new object of class '<em>SD Annotation Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SD Annotation Detail</em>'.
	 * @generated
	 */
	SDAnnotationDetail createSDAnnotationDetail();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicedefPackage getServicedefPackage();

} //ServicedefFactory
