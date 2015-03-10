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
package it.csi.mddtools.typedef.impl;

import it.csi.mddtools.typedef.CSIDatatype;
import it.csi.mddtools.typedef.CSIDatatypeCodes;
import it.csi.mddtools.typedef.CSIExceptionTypes;
import it.csi.mddtools.typedef.DocumentRoot;
import it.csi.mddtools.typedef.Entity;
import it.csi.mddtools.typedef.EnumLiteral;
import it.csi.mddtools.typedef.EnumVal;
import it.csi.mddtools.typedef.Feature;
import it.csi.mddtools.typedef.PrimitiveType;
import it.csi.mddtools.typedef.TDAnnotationDetail;
import it.csi.mddtools.typedef.TDDocumentation;
import it.csi.mddtools.typedef.Type;
import it.csi.mddtools.typedef.TypeAnnotation;
import it.csi.mddtools.typedef.TypeLanguageBinding;
import it.csi.mddtools.typedef.TypedArray;
import it.csi.mddtools.typedef.TypedefFactory;
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
public class TypedefPackageImpl extends EPackageImpl implements TypedefPackage {
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
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csiDatatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdAnnotationDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeLanguageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum csiDatatypeCodesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum csiExceptionTypesEEnum = null;

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
	 * @see it.csi.mddtools.typedef.TypedefPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypedefPackageImpl() {
		super(eNS_URI, TypedefFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypedefPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypedefPackage init() {
		if (isInited) return (TypedefPackage)EPackage.Registry.INSTANCE.getEPackage(TypedefPackage.eNS_URI);

		// Obtain or create and register package
		TypedefPackageImpl theTypedefPackage = (TypedefPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypedefPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypedefPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTypedefPackage.createPackageContents();

		// Initialize created meta-data
		theTypedefPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypedefPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypedefPackage.eNS_URI, theTypedefPackage);
		return theTypedefPackage;
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
	public EReference getDocumentRoot_Types() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Annotations() {
		return (EReference)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Documentation() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSIDatatype() {
		return csiDatatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSIDatatype_Code() {
		return (EAttribute)csiDatatypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSIDatatype_Nillable() {
		return (EAttribute)csiDatatypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Features() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntity_Versionuid() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Type() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Documentation() {
		return (EReference)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedArray() {
		return typedArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedArray_ComponentType() {
		return (EReference)typedArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getException() {
		return exceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getException_ExceptionType() {
		return (EAttribute)exceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeAnnotation() {
		return typeAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeAnnotation_Source() {
		return (EAttribute)typeAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeAnnotation_Details() {
		return (EReference)typeAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDAnnotationDetail() {
		return tdAnnotationDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDAnnotationDetail_Key() {
		return (EAttribute)tdAnnotationDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDAnnotationDetail_Value() {
		return (EAttribute)tdAnnotationDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveType_TypesetName() {
		return (EAttribute)primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveType_Nillable() {
		return (EAttribute)primitiveTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveType_LanguageBindings() {
		return (EReference)primitiveTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeLanguageBinding() {
		return typeLanguageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeLanguageBinding_Lang() {
		return (EAttribute)typeLanguageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeLanguageBinding_LangSpecificType() {
		return (EAttribute)typeLanguageBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeLanguageBinding_LangSpecificNS() {
		return (EAttribute)typeLanguageBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeLanguageBinding_DefaultInitValue() {
		return (EAttribute)typeLanguageBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeLanguageBinding_NullValueLiteral() {
		return (EAttribute)typeLanguageBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumVal() {
		return enumValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumVal_ValueType() {
		return (EReference)enumValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumVal_Literals() {
		return (EReference)enumValEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumLiteral() {
		return enumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteral_Name() {
		return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumLiteral_Value() {
		return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumLiteral_Documentation() {
		return (EReference)enumLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTDDocumentation() {
		return tdDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTDDocumentation_Doc() {
		return (EAttribute)tdDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSIDatatypeCodes() {
		return csiDatatypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCSIExceptionTypes() {
		return csiExceptionTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedefFactory getTypedefFactory() {
		return (TypedefFactory)getEFactoryInstance();
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
		createEReference(documentRootEClass, DOCUMENT_ROOT__TYPES);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__NAME);
		createEReference(typeEClass, TYPE__ANNOTATIONS);
		createEReference(typeEClass, TYPE__DOCUMENTATION);

		csiDatatypeEClass = createEClass(CSI_DATATYPE);
		createEAttribute(csiDatatypeEClass, CSI_DATATYPE__CODE);
		createEAttribute(csiDatatypeEClass, CSI_DATATYPE__NILLABLE);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__FEATURES);
		createEAttribute(entityEClass, ENTITY__VERSIONUID);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEReference(featureEClass, FEATURE__TYPE);
		createEReference(featureEClass, FEATURE__DOCUMENTATION);

		typedArrayEClass = createEClass(TYPED_ARRAY);
		createEReference(typedArrayEClass, TYPED_ARRAY__COMPONENT_TYPE);

		exceptionEClass = createEClass(EXCEPTION);
		createEAttribute(exceptionEClass, EXCEPTION__EXCEPTION_TYPE);

		typeAnnotationEClass = createEClass(TYPE_ANNOTATION);
		createEAttribute(typeAnnotationEClass, TYPE_ANNOTATION__SOURCE);
		createEReference(typeAnnotationEClass, TYPE_ANNOTATION__DETAILS);

		tdAnnotationDetailEClass = createEClass(TD_ANNOTATION_DETAIL);
		createEAttribute(tdAnnotationDetailEClass, TD_ANNOTATION_DETAIL__KEY);
		createEAttribute(tdAnnotationDetailEClass, TD_ANNOTATION_DETAIL__VALUE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__TYPESET_NAME);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__NILLABLE);
		createEReference(primitiveTypeEClass, PRIMITIVE_TYPE__LANGUAGE_BINDINGS);

		typeLanguageBindingEClass = createEClass(TYPE_LANGUAGE_BINDING);
		createEAttribute(typeLanguageBindingEClass, TYPE_LANGUAGE_BINDING__LANG);
		createEAttribute(typeLanguageBindingEClass, TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE);
		createEAttribute(typeLanguageBindingEClass, TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS);
		createEAttribute(typeLanguageBindingEClass, TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE);
		createEAttribute(typeLanguageBindingEClass, TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL);

		enumValEClass = createEClass(ENUM_VAL);
		createEReference(enumValEClass, ENUM_VAL__VALUE_TYPE);
		createEReference(enumValEClass, ENUM_VAL__LITERALS);

		enumLiteralEClass = createEClass(ENUM_LITERAL);
		createEAttribute(enumLiteralEClass, ENUM_LITERAL__NAME);
		createEAttribute(enumLiteralEClass, ENUM_LITERAL__VALUE);
		createEReference(enumLiteralEClass, ENUM_LITERAL__DOCUMENTATION);

		tdDocumentationEClass = createEClass(TD_DOCUMENTATION);
		createEAttribute(tdDocumentationEClass, TD_DOCUMENTATION__DOC);

		// Create enums
		csiDatatypeCodesEEnum = createEEnum(CSI_DATATYPE_CODES);
		csiExceptionTypesEEnum = createEEnum(CSI_EXCEPTION_TYPES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		csiDatatypeEClass.getESuperTypes().add(this.getType());
		entityEClass.getESuperTypes().add(this.getType());
		typedArrayEClass.getESuperTypes().add(this.getType());
		exceptionEClass.getESuperTypes().add(this.getType());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		enumValEClass.getESuperTypes().add(this.getType());

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentRoot_Types(), this.getType(), null, "types", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Annotations(), this.getTypeAnnotation(), null, "annotations", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Documentation(), this.getTDDocumentation(), null, "documentation", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csiDatatypeEClass, CSIDatatype.class, "CSIDatatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSIDatatype_Code(), this.getCSIDatatypeCodes(), "code", null, 0, 1, CSIDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSIDatatype_Nillable(), ecorePackage.getEBoolean(), "nillable", null, 0, 1, CSIDatatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Features(), this.getFeature(), null, "features", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Versionuid(), ecorePackage.getEInt(), "versionuid", "1", 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Type(), this.getType(), null, "type", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Documentation(), this.getTDDocumentation(), null, "documentation", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedArrayEClass, TypedArray.class, "TypedArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedArray_ComponentType(), this.getType(), null, "componentType", null, 0, 1, TypedArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exceptionEClass, it.csi.mddtools.typedef.Exception.class, "Exception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getException_ExceptionType(), this.getCSIExceptionTypes(), "exceptionType", null, 0, 1, it.csi.mddtools.typedef.Exception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeAnnotationEClass, TypeAnnotation.class, "TypeAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeAnnotation_Source(), ecorePackage.getEString(), "source", null, 0, 1, TypeAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeAnnotation_Details(), this.getTDAnnotationDetail(), null, "details", null, 0, -1, TypeAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tdAnnotationDetailEClass, TDAnnotationDetail.class, "TDAnnotationDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTDAnnotationDetail_Key(), ecorePackage.getEString(), "key", null, 0, 1, TDAnnotationDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDAnnotationDetail_Value(), ecorePackage.getEString(), "value", null, 0, 1, TDAnnotationDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_TypesetName(), ecorePackage.getEString(), "typesetName", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimitiveType_Nillable(), ecorePackage.getEBoolean(), "nillable", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveType_LanguageBindings(), this.getTypeLanguageBinding(), null, "languageBindings", null, 0, -1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeLanguageBindingEClass, TypeLanguageBinding.class, "TypeLanguageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeLanguageBinding_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, TypeLanguageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeLanguageBinding_LangSpecificType(), ecorePackage.getEString(), "langSpecificType", null, 0, 1, TypeLanguageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeLanguageBinding_LangSpecificNS(), ecorePackage.getEString(), "langSpecificNS", null, 0, 1, TypeLanguageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeLanguageBinding_DefaultInitValue(), ecorePackage.getEString(), "defaultInitValue", null, 0, 1, TypeLanguageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeLanguageBinding_NullValueLiteral(), ecorePackage.getEString(), "nullValueLiteral", null, 0, 1, TypeLanguageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValEClass, EnumVal.class, "EnumVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumVal_ValueType(), this.getType(), null, "valueType", null, 0, 1, EnumVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumVal_Literals(), this.getEnumLiteral(), null, "literals", null, 0, -1, EnumVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnumLiteral_Documentation(), this.getTDDocumentation(), null, "documentation", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tdDocumentationEClass, TDDocumentation.class, "TDDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTDDocumentation_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, TDDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(csiDatatypeCodesEEnum, CSIDatatypeCodes.class, "CSIDatatypeCodes");
		addEEnumLiteral(csiDatatypeCodesEEnum, CSIDatatypeCodes.CSI_INTEGER);
		addEEnumLiteral(csiDatatypeCodesEEnum, CSIDatatypeCodes.CSI_STRING);
		addEEnumLiteral(csiDatatypeCodesEEnum, CSIDatatypeCodes.CSI_FLOAT);
		addEEnumLiteral(csiDatatypeCodesEEnum, CSIDatatypeCodes.CSI_DOUBLE);
		addEEnumLiteral(csiDatatypeCodesEEnum, CSIDatatypeCodes.CSI_BOOLEAN);
		addEEnumLiteral(csiDatatypeCodesEEnum, CSIDatatypeCodes.CSI_DATE);
		addEEnumLiteral(csiDatatypeCodesEEnum, CSIDatatypeCodes.CSI_BYTE);
		addEEnumLiteral(csiDatatypeCodesEEnum, CSIDatatypeCodes.CSI_LONG);

		initEEnum(csiExceptionTypesEEnum, CSIExceptionTypes.class, "CSIExceptionTypes");
		addEEnumLiteral(csiExceptionTypesEEnum, CSIExceptionTypes.USER);
		addEEnumLiteral(csiExceptionTypesEEnum, CSIExceptionTypes.SYSTEM);
		addEEnumLiteral(csiExceptionTypesEEnum, CSIExceptionTypes.UNRECOVERABLE);

		// Create resource
		createResource(eNS_URI);
	}

} //TypedefPackageImpl
