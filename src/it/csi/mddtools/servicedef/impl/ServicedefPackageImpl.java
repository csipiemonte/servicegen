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
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.ANDFeatureConstraint;
import it.csi.mddtools.servicedef.ANDParamConstraint;
import it.csi.mddtools.servicedef.ANDValueConstraint;
import it.csi.mddtools.servicedef.AuthLevelEnum;
import it.csi.mddtools.servicedef.BaseTypes;
import it.csi.mddtools.servicedef.ChannelSecurityLevelEnum;
import it.csi.mddtools.servicedef.CompositeFeatureConstraint;
import it.csi.mddtools.servicedef.CompositeParamConstraint;
import it.csi.mddtools.servicedef.CompositeValueConstraint;
import it.csi.mddtools.servicedef.ContinuousRangeConstraint;
import it.csi.mddtools.servicedef.CustomConstraint;
import it.csi.mddtools.servicedef.DiscreteRangeConstraint;
import it.csi.mddtools.servicedef.DocumentRoot;
import it.csi.mddtools.servicedef.EJBPABinding;
import it.csi.mddtools.servicedef.FeatureConstraint;
import it.csi.mddtools.servicedef.InputValidator;
import it.csi.mddtools.servicedef.NOTFeatureConstraint;
import it.csi.mddtools.servicedef.NOTParamConstraint;
import it.csi.mddtools.servicedef.NOTValueConstraint;
import it.csi.mddtools.servicedef.ORFeatureConstraint;
import it.csi.mddtools.servicedef.ORParamConstraint;
import it.csi.mddtools.servicedef.ORValueConstraint;
import it.csi.mddtools.servicedef.OpTypeEnum;
import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.Param;
import it.csi.mddtools.servicedef.ParamConstraint;
import it.csi.mddtools.servicedef.ParamValidator;
import it.csi.mddtools.servicedef.RelativeConstraint;
import it.csi.mddtools.servicedef.Role;
import it.csi.mddtools.servicedef.SDAnnotationDetail;
import it.csi.mddtools.servicedef.SDDocumentation;
import it.csi.mddtools.servicedef.SOAPPABRBinding;
import it.csi.mddtools.servicedef.ServiceBinding;
import it.csi.mddtools.servicedef.ServiceDef;
import it.csi.mddtools.servicedef.ServiceDefAnnotation;
import it.csi.mddtools.servicedef.ServicedefFactory;
import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.SimpleFeatureConstraint;
import it.csi.mddtools.servicedef.SimpleParamCoinstraint;
import it.csi.mddtools.servicedef.SimpleValueConstraint;
import it.csi.mddtools.servicedef.SrvTypeEnum;
import it.csi.mddtools.servicedef.TXTypeEnum;
import it.csi.mddtools.servicedef.Types;
import it.csi.mddtools.servicedef.ValueConstraint;
import it.csi.mddtools.servicedef.ValueRangeConstraint;
import it.csi.mddtools.servicedef.ValueValorizationConstraint;
import it.csi.mddtools.servicedef.WSBinding;
import it.csi.mddtools.servicedef.WSEncrypt;
import it.csi.mddtools.servicedef.WSEndpoint;
import it.csi.mddtools.servicedef.WSEndpointChannel;
import it.csi.mddtools.servicedef.WSFADBinding;

import it.csi.mddtools.servicedef.WSSecuritySpec;
import it.csi.mddtools.servicedef.WSSignature;
import it.csi.mddtools.servicedef.WSTimestamp;
import it.csi.mddtools.servicedef.WSUsernameTokenAuth;
import it.csi.mddtools.typedef.TypedefPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicedefPackageImpl extends EPackageImpl implements ServicedefPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbpaBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soappabrBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsfadBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueValorizationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleParamCoinstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeParamConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andParamConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orParamConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notParamConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousRangeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteRangeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeFeatureConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFeatureConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andFeatureConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orFeatureConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notFeatureConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDefAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdAnnotationDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsEndpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsSecuritySpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsUsernameTokenAuthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsTimestampEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsEncryptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wsEndpointChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelSecurityLevelEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum opTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum txTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum srvTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authLevelEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicedefPackageImpl() {
		super(eNS_URI, ServicedefFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ServicedefPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicedefPackage init() {
		if (isInited) return (ServicedefPackage)EPackage.Registry.INSTANCE.getEPackage(ServicedefPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredServicedefPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ServicedefPackageImpl theServicedefPackage = registeredServicedefPackage instanceof ServicedefPackageImpl ? (ServicedefPackageImpl)registeredServicedefPackage : new ServicedefPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		TypedefPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServicedefPackage.createPackageContents();

		// Initialize created meta-data
		theServicedefPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicedefPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicedefPackage.eNS_URI, theServicedefPackage);
		return theServicedefPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Service() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDef() {
		return serviceDefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDef_CodServizio() {
		return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDef_Bindings() {
		return (EReference)serviceDefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDef_Monitorable() {
		return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDef_DiagEnabled() {
		return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDef_Operations() {
		return (EReference)serviceDefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDef_Versione() {
		return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDef_Types() {
		return (EReference)serviceDefEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDef_TraceEnabled() {
		return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDef_ServiceType() {
		return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDef_AuthLevel() {
		return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDef_Roles() {
		return (EReference)serviceDefEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDef_CodProdotto() {
		return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDef_CodComponente() {
		return (EAttribute)serviceDefEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDef_Annotations() {
		return (EReference)serviceDefEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDef_Documentation() {
		return (EReference)serviceDefEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceBinding() {
		return serviceBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBinding_CodBinding() {
		return (EAttribute)serviceBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceBinding_ChannelSecurityLevel() {
		return (EAttribute)serviceBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEJBPABinding() {
		return ejbpaBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOAPPABRBinding() {
		return soappabrBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSFADBinding() {
		return wsfadBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWSFADBinding_UseLiteral() {
		return (EAttribute)wsfadBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWSFADBinding_StyleWrapped() {
		return (EAttribute)wsfadBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWSFADBinding_Namespace() {
		return (EAttribute)wsfadBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSBinding() {
		return wsBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWSBinding_Endpoints() {
		return (EReference)wsBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Name() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Params() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_OpType() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_ReturnType() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Throws() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_TxType() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Since() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_AuthorizedRoles() {
		return (EReference)operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Validator() {
		return (EReference)operationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Documentation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParam() {
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_Name() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParam_Type() {
		return (EReference)paramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParam_Validator() {
		return (EReference)paramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParam_Constraint() {
		return (EReference)paramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParam_InHeader() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParam_Documentation() {
		return (EReference)paramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypes() {
		return typesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypes_Types() {
		return (EReference)typesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseTypes() {
		return baseTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseTypes_BaseTypes() {
		return (EReference)baseTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputValidator() {
		return inputValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputValidator_Constraint() {
		return (EReference)inputValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamValidator() {
		return paramValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamValidator_Constraint() {
		return (EReference)paramValidatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRangeConstraint() {
		return valueRangeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueValorizationConstraint() {
		return valueValorizationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueValorizationConstraint_MustNotBeNull() {
		return (EAttribute)valueValorizationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomConstraint() {
		return customConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConstraint_CheckMethodName() {
		return (EAttribute)customConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeConstraint() {
		return relativeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConstraint() {
		return valueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleParamCoinstraint() {
		return simpleParamCoinstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParamCoinstraint_Param() {
		return (EReference)simpleParamCoinstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParamCoinstraint_Constraint() {
		return (EReference)simpleParamCoinstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeParamConstraint() {
		return compositeParamConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeParamConstraint_Component() {
		return (EReference)compositeParamConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANDParamConstraint() {
		return andParamConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORParamConstraint() {
		return orParamConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamConstraint() {
		return paramConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOTParamConstraint() {
		return notParamConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeValueConstraint() {
		return compositeValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeValueConstraint_Component() {
		return (EReference)compositeValueConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANDValueConstraint() {
		return andValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORValueConstraint() {
		return orValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOTValueConstraint() {
		return notValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleValueConstraint() {
		return simpleValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuousRangeConstraint() {
		return continuousRangeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousRangeConstraint_Lowerbound() {
		return (EAttribute)continuousRangeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuousRangeConstraint_Upperbound() {
		return (EAttribute)continuousRangeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscreteRangeConstraint() {
		return discreteRangeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscreteRangeConstraint_Literals() {
		return (EAttribute)discreteRangeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureConstraint() {
		return featureConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeFeatureConstraint() {
		return compositeFeatureConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleFeatureConstraint() {
		return simpleFeatureConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleFeatureConstraint_Constraint() {
		return (EReference)simpleFeatureConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleFeatureConstraint_Entity() {
		return (EReference)simpleFeatureConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleFeatureConstraint_Feature() {
		return (EReference)simpleFeatureConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANDFeatureConstraint() {
		return andFeatureConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORFeatureConstraint() {
		return orFeatureConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNOTFeatureConstraint() {
		return notFeatureConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDefAnnotation() {
		return serviceDefAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDefAnnotation_Source() {
		return (EAttribute)serviceDefAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceDefAnnotation_Details() {
		return (EReference)serviceDefAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDAnnotationDetail() {
		return sdAnnotationDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDAnnotationDetail_Key() {
		return (EAttribute)sdAnnotationDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDAnnotationDetail_Value() {
		return (EAttribute)sdAnnotationDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSEndpoint() {
		return wsEndpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWSEndpoint_Code() {
		return (EAttribute)wsEndpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWSEndpoint_InChannel() {
		return (EReference)wsEndpointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWSEndpoint_OutChannel() {
		return (EReference)wsEndpointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSSecuritySpec() {
		return wsSecuritySpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSUsernameTokenAuth() {
		return wsUsernameTokenAuthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSSignature() {
		return wsSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSTimestamp() {
		return wsTimestampEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSEncrypt() {
		return wsEncryptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWSEndpointChannel() {
		return wsEndpointChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWSEndpointChannel_WsSecurity() {
		return (EReference)wsEndpointChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDDocumentation() {
		return sdDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSDDocumentation_Doc() {
		return (EAttribute)sdDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannelSecurityLevelEnum() {
		return channelSecurityLevelEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOpTypeEnum() {
		return opTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTXTypeEnum() {
		return txTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSrvTypeEnum() {
		return srvTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthLevelEnum() {
		return authLevelEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicedefFactory getServicedefFactory() {
		return (ServicedefFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SERVICE);

		serviceDefEClass = createEClass(SERVICE_DEF);
		createEAttribute(serviceDefEClass, SERVICE_DEF__COD_SERVIZIO);
		createEReference(serviceDefEClass, SERVICE_DEF__BINDINGS);
		createEAttribute(serviceDefEClass, SERVICE_DEF__MONITORABLE);
		createEAttribute(serviceDefEClass, SERVICE_DEF__DIAG_ENABLED);
		createEReference(serviceDefEClass, SERVICE_DEF__OPERATIONS);
		createEAttribute(serviceDefEClass, SERVICE_DEF__VERSIONE);
		createEReference(serviceDefEClass, SERVICE_DEF__TYPES);
		createEAttribute(serviceDefEClass, SERVICE_DEF__TRACE_ENABLED);
		createEAttribute(serviceDefEClass, SERVICE_DEF__SERVICE_TYPE);
		createEAttribute(serviceDefEClass, SERVICE_DEF__AUTH_LEVEL);
		createEReference(serviceDefEClass, SERVICE_DEF__ROLES);
		createEAttribute(serviceDefEClass, SERVICE_DEF__COD_PRODOTTO);
		createEAttribute(serviceDefEClass, SERVICE_DEF__COD_COMPONENTE);
		createEReference(serviceDefEClass, SERVICE_DEF__ANNOTATIONS);
		createEReference(serviceDefEClass, SERVICE_DEF__DOCUMENTATION);

		serviceBindingEClass = createEClass(SERVICE_BINDING);
		createEAttribute(serviceBindingEClass, SERVICE_BINDING__COD_BINDING);
		createEAttribute(serviceBindingEClass, SERVICE_BINDING__CHANNEL_SECURITY_LEVEL);

		ejbpaBindingEClass = createEClass(EJBPA_BINDING);

		soappabrBindingEClass = createEClass(SOAPPABR_BINDING);

		wsfadBindingEClass = createEClass(WSFAD_BINDING);
		createEAttribute(wsfadBindingEClass, WSFAD_BINDING__USE_LITERAL);
		createEAttribute(wsfadBindingEClass, WSFAD_BINDING__STYLE_WRAPPED);
		createEAttribute(wsfadBindingEClass, WSFAD_BINDING__NAMESPACE);

		wsBindingEClass = createEClass(WS_BINDING);
		createEReference(wsBindingEClass, WS_BINDING__ENDPOINTS);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__NAME);
		createEReference(operationEClass, OPERATION__PARAMS);
		createEAttribute(operationEClass, OPERATION__OP_TYPE);
		createEReference(operationEClass, OPERATION__RETURN_TYPE);
		createEReference(operationEClass, OPERATION__THROWS);
		createEAttribute(operationEClass, OPERATION__TX_TYPE);
		createEAttribute(operationEClass, OPERATION__SINCE);
		createEReference(operationEClass, OPERATION__AUTHORIZED_ROLES);
		createEReference(operationEClass, OPERATION__VALIDATOR);
		createEReference(operationEClass, OPERATION__DOCUMENTATION);

		paramEClass = createEClass(PARAM);
		createEAttribute(paramEClass, PARAM__NAME);
		createEReference(paramEClass, PARAM__TYPE);
		createEReference(paramEClass, PARAM__VALIDATOR);
		createEReference(paramEClass, PARAM__CONSTRAINT);
		createEAttribute(paramEClass, PARAM__IN_HEADER);
		createEReference(paramEClass, PARAM__DOCUMENTATION);

		typesEClass = createEClass(TYPES);
		createEReference(typesEClass, TYPES__TYPES);

		baseTypesEClass = createEClass(BASE_TYPES);
		createEReference(baseTypesEClass, BASE_TYPES__BASE_TYPES);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);

		inputValidatorEClass = createEClass(INPUT_VALIDATOR);
		createEReference(inputValidatorEClass, INPUT_VALIDATOR__CONSTRAINT);

		paramValidatorEClass = createEClass(PARAM_VALIDATOR);
		createEReference(paramValidatorEClass, PARAM_VALIDATOR__CONSTRAINT);

		valueRangeConstraintEClass = createEClass(VALUE_RANGE_CONSTRAINT);

		valueValorizationConstraintEClass = createEClass(VALUE_VALORIZATION_CONSTRAINT);
		createEAttribute(valueValorizationConstraintEClass, VALUE_VALORIZATION_CONSTRAINT__MUST_NOT_BE_NULL);

		customConstraintEClass = createEClass(CUSTOM_CONSTRAINT);
		createEAttribute(customConstraintEClass, CUSTOM_CONSTRAINT__CHECK_METHOD_NAME);

		relativeConstraintEClass = createEClass(RELATIVE_CONSTRAINT);

		valueConstraintEClass = createEClass(VALUE_CONSTRAINT);

		simpleParamCoinstraintEClass = createEClass(SIMPLE_PARAM_COINSTRAINT);
		createEReference(simpleParamCoinstraintEClass, SIMPLE_PARAM_COINSTRAINT__PARAM);
		createEReference(simpleParamCoinstraintEClass, SIMPLE_PARAM_COINSTRAINT__CONSTRAINT);

		compositeParamConstraintEClass = createEClass(COMPOSITE_PARAM_CONSTRAINT);
		createEReference(compositeParamConstraintEClass, COMPOSITE_PARAM_CONSTRAINT__COMPONENT);

		andParamConstraintEClass = createEClass(AND_PARAM_CONSTRAINT);

		orParamConstraintEClass = createEClass(OR_PARAM_CONSTRAINT);

		paramConstraintEClass = createEClass(PARAM_CONSTRAINT);

		notParamConstraintEClass = createEClass(NOT_PARAM_CONSTRAINT);

		compositeValueConstraintEClass = createEClass(COMPOSITE_VALUE_CONSTRAINT);
		createEReference(compositeValueConstraintEClass, COMPOSITE_VALUE_CONSTRAINT__COMPONENT);

		andValueConstraintEClass = createEClass(AND_VALUE_CONSTRAINT);

		orValueConstraintEClass = createEClass(OR_VALUE_CONSTRAINT);

		notValueConstraintEClass = createEClass(NOT_VALUE_CONSTRAINT);

		simpleValueConstraintEClass = createEClass(SIMPLE_VALUE_CONSTRAINT);

		continuousRangeConstraintEClass = createEClass(CONTINUOUS_RANGE_CONSTRAINT);
		createEAttribute(continuousRangeConstraintEClass, CONTINUOUS_RANGE_CONSTRAINT__LOWERBOUND);
		createEAttribute(continuousRangeConstraintEClass, CONTINUOUS_RANGE_CONSTRAINT__UPPERBOUND);

		discreteRangeConstraintEClass = createEClass(DISCRETE_RANGE_CONSTRAINT);
		createEAttribute(discreteRangeConstraintEClass, DISCRETE_RANGE_CONSTRAINT__LITERALS);

		featureConstraintEClass = createEClass(FEATURE_CONSTRAINT);

		compositeFeatureConstraintEClass = createEClass(COMPOSITE_FEATURE_CONSTRAINT);

		simpleFeatureConstraintEClass = createEClass(SIMPLE_FEATURE_CONSTRAINT);
		createEReference(simpleFeatureConstraintEClass, SIMPLE_FEATURE_CONSTRAINT__CONSTRAINT);
		createEReference(simpleFeatureConstraintEClass, SIMPLE_FEATURE_CONSTRAINT__ENTITY);
		createEReference(simpleFeatureConstraintEClass, SIMPLE_FEATURE_CONSTRAINT__FEATURE);

		andFeatureConstraintEClass = createEClass(AND_FEATURE_CONSTRAINT);

		orFeatureConstraintEClass = createEClass(OR_FEATURE_CONSTRAINT);

		notFeatureConstraintEClass = createEClass(NOT_FEATURE_CONSTRAINT);

		serviceDefAnnotationEClass = createEClass(SERVICE_DEF_ANNOTATION);
		createEAttribute(serviceDefAnnotationEClass, SERVICE_DEF_ANNOTATION__SOURCE);
		createEReference(serviceDefAnnotationEClass, SERVICE_DEF_ANNOTATION__DETAILS);

		sdAnnotationDetailEClass = createEClass(SD_ANNOTATION_DETAIL);
		createEAttribute(sdAnnotationDetailEClass, SD_ANNOTATION_DETAIL__KEY);
		createEAttribute(sdAnnotationDetailEClass, SD_ANNOTATION_DETAIL__VALUE);

		wsEndpointEClass = createEClass(WS_ENDPOINT);
		createEAttribute(wsEndpointEClass, WS_ENDPOINT__CODE);
		createEReference(wsEndpointEClass, WS_ENDPOINT__IN_CHANNEL);
		createEReference(wsEndpointEClass, WS_ENDPOINT__OUT_CHANNEL);

		wsSecuritySpecEClass = createEClass(WS_SECURITY_SPEC);

		wsUsernameTokenAuthEClass = createEClass(WS_USERNAME_TOKEN_AUTH);

		wsSignatureEClass = createEClass(WS_SIGNATURE);

		wsTimestampEClass = createEClass(WS_TIMESTAMP);

		wsEncryptEClass = createEClass(WS_ENCRYPT);

		wsEndpointChannelEClass = createEClass(WS_ENDPOINT_CHANNEL);
		createEReference(wsEndpointChannelEClass, WS_ENDPOINT_CHANNEL__WS_SECURITY);

		sdDocumentationEClass = createEClass(SD_DOCUMENTATION);
		createEAttribute(sdDocumentationEClass, SD_DOCUMENTATION__DOC);

		// Create enums
		channelSecurityLevelEnumEEnum = createEEnum(CHANNEL_SECURITY_LEVEL_ENUM);
		opTypeEnumEEnum = createEEnum(OP_TYPE_ENUM);
		txTypeEnumEEnum = createEEnum(TX_TYPE_ENUM);
		srvTypeEnumEEnum = createEEnum(SRV_TYPE_ENUM);
		authLevelEnumEEnum = createEEnum(AUTH_LEVEL_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypedefPackage theTypedefPackage = (TypedefPackage)EPackage.Registry.INSTANCE.getEPackage(TypedefPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ejbpaBindingEClass.getESuperTypes().add(this.getServiceBinding());
		soappabrBindingEClass.getESuperTypes().add(this.getServiceBinding());
		wsfadBindingEClass.getESuperTypes().add(this.getServiceBinding());
		wsBindingEClass.getESuperTypes().add(this.getServiceBinding());
		valueRangeConstraintEClass.getESuperTypes().add(this.getSimpleValueConstraint());
		valueValorizationConstraintEClass.getESuperTypes().add(this.getSimpleValueConstraint());
		customConstraintEClass.getESuperTypes().add(this.getSimpleValueConstraint());
		relativeConstraintEClass.getESuperTypes().add(this.getSimpleValueConstraint());
		simpleParamCoinstraintEClass.getESuperTypes().add(this.getParamConstraint());
		compositeParamConstraintEClass.getESuperTypes().add(this.getParamConstraint());
		andParamConstraintEClass.getESuperTypes().add(this.getCompositeParamConstraint());
		orParamConstraintEClass.getESuperTypes().add(this.getCompositeParamConstraint());
		notParamConstraintEClass.getESuperTypes().add(this.getCompositeParamConstraint());
		compositeValueConstraintEClass.getESuperTypes().add(this.getValueConstraint());
		andValueConstraintEClass.getESuperTypes().add(this.getCompositeValueConstraint());
		orValueConstraintEClass.getESuperTypes().add(this.getCompositeValueConstraint());
		notValueConstraintEClass.getESuperTypes().add(this.getCompositeValueConstraint());
		simpleValueConstraintEClass.getESuperTypes().add(this.getValueConstraint());
		continuousRangeConstraintEClass.getESuperTypes().add(this.getValueRangeConstraint());
		discreteRangeConstraintEClass.getESuperTypes().add(this.getValueRangeConstraint());
		featureConstraintEClass.getESuperTypes().add(this.getValueConstraint());
		compositeFeatureConstraintEClass.getESuperTypes().add(this.getFeatureConstraint());
		simpleFeatureConstraintEClass.getESuperTypes().add(this.getFeatureConstraint());
		andFeatureConstraintEClass.getESuperTypes().add(this.getCompositeFeatureConstraint());
		orFeatureConstraintEClass.getESuperTypes().add(this.getCompositeFeatureConstraint());
		notFeatureConstraintEClass.getESuperTypes().add(this.getCompositeFeatureConstraint());
		wsUsernameTokenAuthEClass.getESuperTypes().add(this.getWSSecuritySpec());
		wsSignatureEClass.getESuperTypes().add(this.getWSSecuritySpec());
		wsTimestampEClass.getESuperTypes().add(this.getWSSecuritySpec());
		wsEncryptEClass.getESuperTypes().add(this.getWSSecuritySpec());

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentRoot_Service(), this.getServiceDef(), null, "service", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDefEClass, ServiceDef.class, "ServiceDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDef_CodServizio(), ecorePackage.getEString(), "codServizio", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDef_Bindings(), this.getServiceBinding(), null, "bindings", null, 0, -1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDef_Monitorable(), ecorePackage.getEBoolean(), "monitorable", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDef_DiagEnabled(), ecorePackage.getEBoolean(), "diagEnabled", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDef_Operations(), this.getOperation(), null, "operations", null, 0, -1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDef_Versione(), ecorePackage.getEString(), "versione", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDef_Types(), this.getTypes(), null, "types", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDef_TraceEnabled(), ecorePackage.getEBoolean(), "traceEnabled", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDef_ServiceType(), this.getSrvTypeEnum(), "serviceType", "appl", 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDef_AuthLevel(), this.getAuthLevelEnum(), "authLevel", "A0", 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDef_Roles(), this.getRole(), null, "roles", null, 0, -1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDef_CodProdotto(), ecorePackage.getEString(), "codProdotto", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDef_CodComponente(), ecorePackage.getEString(), "codComponente", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDef_Annotations(), this.getServiceDefAnnotation(), null, "annotations", null, 0, -1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDef_Documentation(), this.getSDDocumentation(), null, "documentation", null, 0, 1, ServiceDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceBindingEClass, ServiceBinding.class, "ServiceBinding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceBinding_CodBinding(), ecorePackage.getEString(), "codBinding", null, 0, 1, ServiceBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceBinding_ChannelSecurityLevel(), this.getChannelSecurityLevelEnum(), "channelSecurityLevel", "A0", 0, 1, ServiceBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ejbpaBindingEClass, EJBPABinding.class, "EJBPABinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soappabrBindingEClass, SOAPPABRBinding.class, "SOAPPABRBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsfadBindingEClass, WSFADBinding.class, "WSFADBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWSFADBinding_UseLiteral(), ecorePackage.getEBoolean(), "useLiteral", "false", 0, 1, WSFADBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWSFADBinding_StyleWrapped(), ecorePackage.getEBoolean(), "styleWrapped", "false", 0, 1, WSFADBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWSFADBinding_Namespace(), ecorePackage.getEString(), "namespace", null, 0, 1, WSFADBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsBindingEClass, WSBinding.class, "WSBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWSBinding_Endpoints(), this.getWSEndpoint(), null, "endpoints", null, 0, -1, WSBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Params(), this.getParam(), null, "params", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_OpType(), this.getOpTypeEnum(), "opType", "synch", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_ReturnType(), theTypedefPackage.getType(), null, "returnType", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Throws(), theTypedefPackage.getException(), null, "throws", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_TxType(), this.getTXTypeEnum(), "txType", "noTX", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Since(), ecorePackage.getEString(), "since", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_AuthorizedRoles(), this.getRole(), null, "authorizedRoles", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Validator(), this.getInputValidator(), null, "validator", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Documentation(), this.getSDDocumentation(), null, "documentation", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramEClass, Param.class, "Param", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParam_Type(), theTypedefPackage.getType(), null, "type", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParam_Validator(), this.getParamValidator(), null, "validator", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParam_Constraint(), this.getValueConstraint(), null, "constraint", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParam_InHeader(), ecorePackage.getEBoolean(), "inHeader", "false", 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParam_Documentation(), this.getSDDocumentation(), null, "documentation", null, 0, 1, Param.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typesEClass, Types.class, "Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypes_Types(), theTypedefPackage.getType(), null, "types", null, 0, -1, Types.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseTypesEClass, BaseTypes.class, "BaseTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBaseTypes_BaseTypes(), theTypedefPackage.getType(), null, "baseTypes", null, 0, -1, BaseTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputValidatorEClass, InputValidator.class, "InputValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputValidator_Constraint(), this.getParamConstraint(), null, "constraint", null, 0, 1, InputValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramValidatorEClass, ParamValidator.class, "ParamValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamValidator_Constraint(), this.getValueConstraint(), null, "constraint", null, 0, 1, ParamValidator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueRangeConstraintEClass, ValueRangeConstraint.class, "ValueRangeConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueValorizationConstraintEClass, ValueValorizationConstraint.class, "ValueValorizationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueValorizationConstraint_MustNotBeNull(), ecorePackage.getEBoolean(), "mustNotBeNull", null, 0, 1, ValueValorizationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customConstraintEClass, CustomConstraint.class, "CustomConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomConstraint_CheckMethodName(), ecorePackage.getEString(), "checkMethodName", null, 0, 1, CustomConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeConstraintEClass, RelativeConstraint.class, "RelativeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueConstraintEClass, ValueConstraint.class, "ValueConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleParamCoinstraintEClass, SimpleParamCoinstraint.class, "SimpleParamCoinstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleParamCoinstraint_Param(), this.getParam(), null, "param", null, 0, 1, SimpleParamCoinstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleParamCoinstraint_Constraint(), this.getValueConstraint(), null, "constraint", null, 0, 1, SimpleParamCoinstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeParamConstraintEClass, CompositeParamConstraint.class, "CompositeParamConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeParamConstraint_Component(), this.getParamConstraint(), null, "component", null, 0, -1, CompositeParamConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andParamConstraintEClass, ANDParamConstraint.class, "ANDParamConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orParamConstraintEClass, ORParamConstraint.class, "ORParamConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paramConstraintEClass, ParamConstraint.class, "ParamConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notParamConstraintEClass, NOTParamConstraint.class, "NOTParamConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeValueConstraintEClass, CompositeValueConstraint.class, "CompositeValueConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeValueConstraint_Component(), this.getValueConstraint(), null, "component", null, 0, -1, CompositeValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andValueConstraintEClass, ANDValueConstraint.class, "ANDValueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orValueConstraintEClass, ORValueConstraint.class, "ORValueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notValueConstraintEClass, NOTValueConstraint.class, "NOTValueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleValueConstraintEClass, SimpleValueConstraint.class, "SimpleValueConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousRangeConstraintEClass, ContinuousRangeConstraint.class, "ContinuousRangeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuousRangeConstraint_Lowerbound(), ecorePackage.getEString(), "lowerbound", null, 0, 1, ContinuousRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContinuousRangeConstraint_Upperbound(), ecorePackage.getEString(), "upperbound", null, 0, 1, ContinuousRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discreteRangeConstraintEClass, DiscreteRangeConstraint.class, "DiscreteRangeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteRangeConstraint_Literals(), ecorePackage.getEString(), "literals", null, 0, -1, DiscreteRangeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureConstraintEClass, FeatureConstraint.class, "FeatureConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeFeatureConstraintEClass, CompositeFeatureConstraint.class, "CompositeFeatureConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleFeatureConstraintEClass, SimpleFeatureConstraint.class, "SimpleFeatureConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleFeatureConstraint_Constraint(), this.getValueConstraint(), null, "constraint", null, 0, 1, SimpleFeatureConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleFeatureConstraint_Entity(), theTypedefPackage.getEntity(), null, "entity", null, 0, 1, SimpleFeatureConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleFeatureConstraint_Feature(), theTypedefPackage.getFeature(), null, "feature", null, 0, 1, SimpleFeatureConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andFeatureConstraintEClass, ANDFeatureConstraint.class, "ANDFeatureConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orFeatureConstraintEClass, ORFeatureConstraint.class, "ORFeatureConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notFeatureConstraintEClass, NOTFeatureConstraint.class, "NOTFeatureConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceDefAnnotationEClass, ServiceDefAnnotation.class, "ServiceDefAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDefAnnotation_Source(), ecorePackage.getEString(), "source", null, 0, 1, ServiceDefAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDefAnnotation_Details(), this.getSDAnnotationDetail(), null, "details", null, 0, -1, ServiceDefAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdAnnotationDetailEClass, SDAnnotationDetail.class, "SDAnnotationDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSDAnnotationDetail_Key(), ecorePackage.getEString(), "key", null, 0, 1, SDAnnotationDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSDAnnotationDetail_Value(), ecorePackage.getEString(), "value", null, 0, 1, SDAnnotationDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsEndpointEClass, WSEndpoint.class, "WSEndpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWSEndpoint_Code(), ecorePackage.getEString(), "code", null, 0, 1, WSEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWSEndpoint_InChannel(), this.getWSEndpointChannel(), null, "inChannel", null, 0, 1, WSEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWSEndpoint_OutChannel(), this.getWSEndpointChannel(), null, "outChannel", null, 0, 1, WSEndpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wsSecuritySpecEClass, WSSecuritySpec.class, "WSSecuritySpec", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsUsernameTokenAuthEClass, WSUsernameTokenAuth.class, "WSUsernameTokenAuth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsSignatureEClass, WSSignature.class, "WSSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsTimestampEClass, WSTimestamp.class, "WSTimestamp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsEncryptEClass, WSEncrypt.class, "WSEncrypt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wsEndpointChannelEClass, WSEndpointChannel.class, "WSEndpointChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWSEndpointChannel_WsSecurity(), this.getWSSecuritySpec(), null, "wsSecurity", null, 0, -1, WSEndpointChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdDocumentationEClass, SDDocumentation.class, "SDDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSDDocumentation_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, SDDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(channelSecurityLevelEnumEEnum, ChannelSecurityLevelEnum.class, "ChannelSecurityLevelEnum");
		addEEnumLiteral(channelSecurityLevelEnumEEnum, ChannelSecurityLevelEnum.C0);
		addEEnumLiteral(channelSecurityLevelEnumEEnum, ChannelSecurityLevelEnum.C1);
		addEEnumLiteral(channelSecurityLevelEnumEEnum, ChannelSecurityLevelEnum.C2);

		initEEnum(opTypeEnumEEnum, OpTypeEnum.class, "OpTypeEnum");
		addEEnumLiteral(opTypeEnumEEnum, OpTypeEnum.SYNCH);
		addEEnumLiteral(opTypeEnumEEnum, OpTypeEnum.ASYNCH);
		addEEnumLiteral(opTypeEnumEEnum, OpTypeEnum.NOTIFY);

		initEEnum(txTypeEnumEEnum, TXTypeEnum.class, "TXTypeEnum");
		addEEnumLiteral(txTypeEnumEEnum, TXTypeEnum.NO_TX);
		addEEnumLiteral(txTypeEnumEEnum, TXTypeEnum.NEW_LOCAL_TX);

		initEEnum(srvTypeEnumEEnum, SrvTypeEnum.class, "SrvTypeEnum");
		addEEnumLiteral(srvTypeEnumEEnum, SrvTypeEnum.INFR);
		addEEnumLiteral(srvTypeEnumEEnum, SrvTypeEnum.APPL);
		addEEnumLiteral(srvTypeEnumEEnum, SrvTypeEnum.ORCH);

		initEEnum(authLevelEnumEEnum, AuthLevelEnum.class, "AuthLevelEnum");
		addEEnumLiteral(authLevelEnumEEnum, AuthLevelEnum.A0);
		addEEnumLiteral(authLevelEnumEEnum, AuthLevelEnum.A1);
		addEEnumLiteral(authLevelEnumEEnum, AuthLevelEnum.A2);
		addEEnumLiteral(authLevelEnumEEnum, AuthLevelEnum.A3);

		// Create resource
		createResource(eNS_URI);
	}

} //ServicedefPackageImpl
