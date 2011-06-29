/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
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
import it.csi.mddtools.typedef.Feature;
import it.csi.mddtools.typedef.TDAnnotationDetail;
import it.csi.mddtools.typedef.TypeAnnotation;
import it.csi.mddtools.typedef.TypedArray;
import it.csi.mddtools.typedef.TypedefFactory;
import it.csi.mddtools.typedef.TypedefPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypedefFactoryImpl extends EFactoryImpl implements TypedefFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypedefFactory init() {
		try {
			TypedefFactory theTypedefFactory = (TypedefFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.csi.it/mddtools/typedef"); 
			if (theTypedefFactory != null) {
				return theTypedefFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypedefFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedefFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TypedefPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TypedefPackage.CSI_DATATYPE: return createCSIDatatype();
			case TypedefPackage.ENTITY: return createEntity();
			case TypedefPackage.FEATURE: return createFeature();
			case TypedefPackage.TYPED_ARRAY: return createTypedArray();
			case TypedefPackage.EXCEPTION: return createException();
			case TypedefPackage.TYPE_ANNOTATION: return createTypeAnnotation();
			case TypedefPackage.TD_ANNOTATION_DETAIL: return createTDAnnotationDetail();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TypedefPackage.CSI_DATATYPE_CODES:
				return createCSIDatatypeCodesFromString(eDataType, initialValue);
			case TypedefPackage.CSI_EXCEPTION_TYPES:
				return createCSIExceptionTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TypedefPackage.CSI_DATATYPE_CODES:
				return convertCSIDatatypeCodesToString(eDataType, instanceValue);
			case TypedefPackage.CSI_EXCEPTION_TYPES:
				return convertCSIExceptionTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSIDatatype createCSIDatatype() {
		CSIDatatypeImpl csiDatatype = new CSIDatatypeImpl();
		return csiDatatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedArray createTypedArray() {
		TypedArrayImpl typedArray = new TypedArrayImpl();
		return typedArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public it.csi.mddtools.typedef.Exception createException() {
		ExceptionImpl exception = new ExceptionImpl();
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAnnotation createTypeAnnotation() {
		TypeAnnotationImpl typeAnnotation = new TypeAnnotationImpl();
		return typeAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDAnnotationDetail createTDAnnotationDetail() {
		TDAnnotationDetailImpl tdAnnotationDetail = new TDAnnotationDetailImpl();
		return tdAnnotationDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSIDatatypeCodes createCSIDatatypeCodesFromString(EDataType eDataType, String initialValue) {
		CSIDatatypeCodes result = CSIDatatypeCodes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCSIDatatypeCodesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSIExceptionTypes createCSIExceptionTypesFromString(EDataType eDataType, String initialValue) {
		CSIExceptionTypes result = CSIExceptionTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCSIExceptionTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedefPackage getTypedefPackage() {
		return (TypedefPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypedefPackage getPackage() {
		return TypedefPackage.eINSTANCE;
	}

} //TypedefFactoryImpl
