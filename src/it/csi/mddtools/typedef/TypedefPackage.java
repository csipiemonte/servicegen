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
package it.csi.mddtools.typedef;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Questo package contiene le metaclassi necessarie per modellare i tipi
 * (di base e definiti da utente) utilizzati nelle interfacce dei servizi.
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.typedef.TypedefFactory
 * @model kind="package"
 * @generated
 */
public interface TypedefPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "typedef";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.csi.it/mddtools/typedef";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "typedef";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypedefPackage eINSTANCE = it.csi.mddtools.typedef.impl.TypedefPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.DocumentRootImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.TypeImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = 1;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.CSIDatatypeImpl <em>CSI Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.CSIDatatypeImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getCSIDatatype()
	 * @generated
	 */
	int CSI_DATATYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSI_DATATYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSI_DATATYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSI_DATATYPE__CODE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSI_DATATYPE__NILLABLE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CSI Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSI_DATATYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.EntityImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FEATURES = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Versionuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VERSIONUID = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.FeatureImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.TypedArrayImpl <em>Typed Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.TypedArrayImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getTypedArray()
	 * @generated
	 */
	int TYPED_ARRAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY__COMPONENT_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ARRAY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.ExceptionImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Exception Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__EXCEPTION_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.TypeAnnotationImpl <em>Type Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.TypeAnnotationImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getTypeAnnotation()
	 * @generated
	 */
	int TYPE_ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION__DETAILS = 1;

	/**
	 * The number of structural features of the '<em>Type Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.TDAnnotationDetailImpl <em>TD Annotation Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.TDAnnotationDetailImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getTDAnnotationDetail()
	 * @generated
	 */
	int TD_ANNOTATION_DETAIL = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_ANNOTATION_DETAIL__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_ANNOTATION_DETAIL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>TD Annotation Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_ANNOTATION_DETAIL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.PrimitiveTypeImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Typeset Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPESET_NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nillable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NILLABLE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__LANGUAGE_BINDINGS = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.impl.TypeLanguageBindingImpl <em>Type Language Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.impl.TypeLanguageBindingImpl
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getTypeLanguageBinding()
	 * @generated
	 */
	int TYPE_LANGUAGE_BINDING = 10;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LANGUAGE_BINDING__LANG = 0;

	/**
	 * The feature id for the '<em><b>Lang Specific Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Lang Specific NS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS = 2;

	/**
	 * The feature id for the '<em><b>Default Init Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Null Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL = 4;

	/**
	 * The number of structural features of the '<em>Type Language Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LANGUAGE_BINDING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.CSIDatatypeCodes <em>CSI Datatype Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.CSIDatatypeCodes
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getCSIDatatypeCodes()
	 * @generated
	 */
	int CSI_DATATYPE_CODES = 11;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.typedef.CSIExceptionTypes <em>CSI Exception Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.typedef.CSIExceptionTypes
	 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getCSIExceptionTypes()
	 * @generated
	 */
	int CSI_EXCEPTION_TYPES = 12;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see it.csi.mddtools.typedef.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.typedef.DocumentRoot#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see it.csi.mddtools.typedef.DocumentRoot#getTypes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Types();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see it.csi.mddtools.typedef.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.typedef.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.typedef.Type#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see it.csi.mddtools.typedef.Type#getAnnotations()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Annotations();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.CSIDatatype <em>CSI Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSI Datatype</em>'.
	 * @see it.csi.mddtools.typedef.CSIDatatype
	 * @generated
	 */
	EClass getCSIDatatype();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.CSIDatatype#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see it.csi.mddtools.typedef.CSIDatatype#getCode()
	 * @see #getCSIDatatype()
	 * @generated
	 */
	EAttribute getCSIDatatype_Code();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.CSIDatatype#isNillable <em>Nillable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nillable</em>'.
	 * @see it.csi.mddtools.typedef.CSIDatatype#isNillable()
	 * @see #getCSIDatatype()
	 * @generated
	 */
	EAttribute getCSIDatatype_Nillable();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see it.csi.mddtools.typedef.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.typedef.Entity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see it.csi.mddtools.typedef.Entity#getFeatures()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Features();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.Entity#getVersionuid <em>Versionuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versionuid</em>'.
	 * @see it.csi.mddtools.typedef.Entity#getVersionuid()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Versionuid();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see it.csi.mddtools.typedef.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.typedef.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.typedef.Feature#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see it.csi.mddtools.typedef.Feature#getType()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Type();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.TypedArray <em>Typed Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Array</em>'.
	 * @see it.csi.mddtools.typedef.TypedArray
	 * @generated
	 */
	EClass getTypedArray();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.typedef.TypedArray#getComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Type</em>'.
	 * @see it.csi.mddtools.typedef.TypedArray#getComponentType()
	 * @see #getTypedArray()
	 * @generated
	 */
	EReference getTypedArray_ComponentType();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see it.csi.mddtools.typedef.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.Exception#getExceptionType <em>Exception Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exception Type</em>'.
	 * @see it.csi.mddtools.typedef.Exception#getExceptionType()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_ExceptionType();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.TypeAnnotation <em>Type Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Annotation</em>'.
	 * @see it.csi.mddtools.typedef.TypeAnnotation
	 * @generated
	 */
	EClass getTypeAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.TypeAnnotation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see it.csi.mddtools.typedef.TypeAnnotation#getSource()
	 * @see #getTypeAnnotation()
	 * @generated
	 */
	EAttribute getTypeAnnotation_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.typedef.TypeAnnotation#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details</em>'.
	 * @see it.csi.mddtools.typedef.TypeAnnotation#getDetails()
	 * @see #getTypeAnnotation()
	 * @generated
	 */
	EReference getTypeAnnotation_Details();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.TDAnnotationDetail <em>TD Annotation Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TD Annotation Detail</em>'.
	 * @see it.csi.mddtools.typedef.TDAnnotationDetail
	 * @generated
	 */
	EClass getTDAnnotationDetail();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.TDAnnotationDetail#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see it.csi.mddtools.typedef.TDAnnotationDetail#getKey()
	 * @see #getTDAnnotationDetail()
	 * @generated
	 */
	EAttribute getTDAnnotationDetail_Key();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.TDAnnotationDetail#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.csi.mddtools.typedef.TDAnnotationDetail#getValue()
	 * @see #getTDAnnotationDetail()
	 * @generated
	 */
	EAttribute getTDAnnotationDetail_Value();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see it.csi.mddtools.typedef.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.PrimitiveType#getTypesetName <em>Typeset Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typeset Name</em>'.
	 * @see it.csi.mddtools.typedef.PrimitiveType#getTypesetName()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_TypesetName();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.PrimitiveType#isNillable <em>Nillable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nillable</em>'.
	 * @see it.csi.mddtools.typedef.PrimitiveType#isNillable()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Nillable();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.typedef.PrimitiveType#getLanguageBindings <em>Language Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language Bindings</em>'.
	 * @see it.csi.mddtools.typedef.PrimitiveType#getLanguageBindings()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EReference getPrimitiveType_LanguageBindings();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.typedef.TypeLanguageBinding <em>Type Language Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Language Binding</em>'.
	 * @see it.csi.mddtools.typedef.TypeLanguageBinding
	 * @generated
	 */
	EClass getTypeLanguageBinding();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see it.csi.mddtools.typedef.TypeLanguageBinding#getLang()
	 * @see #getTypeLanguageBinding()
	 * @generated
	 */
	EAttribute getTypeLanguageBinding_Lang();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getLangSpecificType <em>Lang Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Specific Type</em>'.
	 * @see it.csi.mddtools.typedef.TypeLanguageBinding#getLangSpecificType()
	 * @see #getTypeLanguageBinding()
	 * @generated
	 */
	EAttribute getTypeLanguageBinding_LangSpecificType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getLangSpecificNS <em>Lang Specific NS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Specific NS</em>'.
	 * @see it.csi.mddtools.typedef.TypeLanguageBinding#getLangSpecificNS()
	 * @see #getTypeLanguageBinding()
	 * @generated
	 */
	EAttribute getTypeLanguageBinding_LangSpecificNS();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getDefaultInitValue <em>Default Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Init Value</em>'.
	 * @see it.csi.mddtools.typedef.TypeLanguageBinding#getDefaultInitValue()
	 * @see #getTypeLanguageBinding()
	 * @generated
	 */
	EAttribute getTypeLanguageBinding_DefaultInitValue();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.typedef.TypeLanguageBinding#getNullValueLiteral <em>Null Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Value Literal</em>'.
	 * @see it.csi.mddtools.typedef.TypeLanguageBinding#getNullValueLiteral()
	 * @see #getTypeLanguageBinding()
	 * @generated
	 */
	EAttribute getTypeLanguageBinding_NullValueLiteral();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.typedef.CSIDatatypeCodes <em>CSI Datatype Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSI Datatype Codes</em>'.
	 * @see it.csi.mddtools.typedef.CSIDatatypeCodes
	 * @generated
	 */
	EEnum getCSIDatatypeCodes();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.typedef.CSIExceptionTypes <em>CSI Exception Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CSI Exception Types</em>'.
	 * @see it.csi.mddtools.typedef.CSIExceptionTypes
	 * @generated
	 */
	EEnum getCSIExceptionTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypedefFactory getTypedefFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.DocumentRootImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPES = eINSTANCE.getDocumentRoot_Types();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.TypeImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ANNOTATIONS = eINSTANCE.getType_Annotations();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.CSIDatatypeImpl <em>CSI Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.CSIDatatypeImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getCSIDatatype()
		 * @generated
		 */
		EClass CSI_DATATYPE = eINSTANCE.getCSIDatatype();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSI_DATATYPE__CODE = eINSTANCE.getCSIDatatype_Code();

		/**
		 * The meta object literal for the '<em><b>Nillable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSI_DATATYPE__NILLABLE = eINSTANCE.getCSIDatatype_Nillable();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.EntityImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FEATURES = eINSTANCE.getEntity_Features();

		/**
		 * The meta object literal for the '<em><b>Versionuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__VERSIONUID = eINSTANCE.getEntity_Versionuid();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.FeatureImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__TYPE = eINSTANCE.getFeature_Type();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.TypedArrayImpl <em>Typed Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.TypedArrayImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getTypedArray()
		 * @generated
		 */
		EClass TYPED_ARRAY = eINSTANCE.getTypedArray();

		/**
		 * The meta object literal for the '<em><b>Component Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED_ARRAY__COMPONENT_TYPE = eINSTANCE.getTypedArray_ComponentType();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.ExceptionImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Exception Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__EXCEPTION_TYPE = eINSTANCE.getException_ExceptionType();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.TypeAnnotationImpl <em>Type Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.TypeAnnotationImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getTypeAnnotation()
		 * @generated
		 */
		EClass TYPE_ANNOTATION = eINSTANCE.getTypeAnnotation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ANNOTATION__SOURCE = eINSTANCE.getTypeAnnotation_Source();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_ANNOTATION__DETAILS = eINSTANCE.getTypeAnnotation_Details();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.TDAnnotationDetailImpl <em>TD Annotation Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.TDAnnotationDetailImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getTDAnnotationDetail()
		 * @generated
		 */
		EClass TD_ANNOTATION_DETAIL = eINSTANCE.getTDAnnotationDetail();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_ANNOTATION_DETAIL__KEY = eINSTANCE.getTDAnnotationDetail_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_ANNOTATION_DETAIL__VALUE = eINSTANCE.getTDAnnotationDetail_Value();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.PrimitiveTypeImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Typeset Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPESET_NAME = eINSTANCE.getPrimitiveType_TypesetName();

		/**
		 * The meta object literal for the '<em><b>Nillable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__NILLABLE = eINSTANCE.getPrimitiveType_Nillable();

		/**
		 * The meta object literal for the '<em><b>Language Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE__LANGUAGE_BINDINGS = eINSTANCE.getPrimitiveType_LanguageBindings();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.impl.TypeLanguageBindingImpl <em>Type Language Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.impl.TypeLanguageBindingImpl
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getTypeLanguageBinding()
		 * @generated
		 */
		EClass TYPE_LANGUAGE_BINDING = eINSTANCE.getTypeLanguageBinding();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_LANGUAGE_BINDING__LANG = eINSTANCE.getTypeLanguageBinding_Lang();

		/**
		 * The meta object literal for the '<em><b>Lang Specific Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE = eINSTANCE.getTypeLanguageBinding_LangSpecificType();

		/**
		 * The meta object literal for the '<em><b>Lang Specific NS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS = eINSTANCE.getTypeLanguageBinding_LangSpecificNS();

		/**
		 * The meta object literal for the '<em><b>Default Init Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE = eINSTANCE.getTypeLanguageBinding_DefaultInitValue();

		/**
		 * The meta object literal for the '<em><b>Null Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL = eINSTANCE.getTypeLanguageBinding_NullValueLiteral();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.CSIDatatypeCodes <em>CSI Datatype Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.CSIDatatypeCodes
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getCSIDatatypeCodes()
		 * @generated
		 */
		EEnum CSI_DATATYPE_CODES = eINSTANCE.getCSIDatatypeCodes();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.typedef.CSIExceptionTypes <em>CSI Exception Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.typedef.CSIExceptionTypes
		 * @see it.csi.mddtools.typedef.impl.TypedefPackageImpl#getCSIExceptionTypes()
		 * @generated
		 */
		EEnum CSI_EXCEPTION_TYPES = eINSTANCE.getCSIExceptionTypes();

	}

} //TypedefPackage
