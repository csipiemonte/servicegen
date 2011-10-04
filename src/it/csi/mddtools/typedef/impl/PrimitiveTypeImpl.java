/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.typedef.impl;

import it.csi.mddtools.typedef.PrimitiveType;
import it.csi.mddtools.typedef.TypeLanguageBinding;
import it.csi.mddtools.typedef.TypedefPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.impl.PrimitiveTypeImpl#getTypesetName <em>Typeset Name</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.impl.PrimitiveTypeImpl#isNillable <em>Nillable</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.impl.PrimitiveTypeImpl#getLanguageBindings <em>Language Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveTypeImpl extends TypeImpl implements PrimitiveType {
	/**
	 * The default value of the '{@link #getTypesetName() <em>Typeset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesetName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPESET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypesetName() <em>Typeset Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesetName()
	 * @generated
	 * @ordered
	 */
	protected String typesetName = TYPESET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NILLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNillable() <em>Nillable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNillable()
	 * @generated
	 * @ordered
	 */
	protected boolean nillable = NILLABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLanguageBindings() <em>Language Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeLanguageBinding> languageBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypedefPackage.Literals.PRIMITIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypesetName() {
		return typesetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypesetName(String newTypesetName) {
		String oldTypesetName = typesetName;
		typesetName = newTypesetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypedefPackage.PRIMITIVE_TYPE__TYPESET_NAME, oldTypesetName, typesetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNillable() {
		return nillable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNillable(boolean newNillable) {
		boolean oldNillable = nillable;
		nillable = newNillable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypedefPackage.PRIMITIVE_TYPE__NILLABLE, oldNillable, nillable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLanguageBinding> getLanguageBindings() {
		if (languageBindings == null) {
			languageBindings = new EObjectContainmentEList<TypeLanguageBinding>(TypeLanguageBinding.class, this, TypedefPackage.PRIMITIVE_TYPE__LANGUAGE_BINDINGS);
		}
		return languageBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypedefPackage.PRIMITIVE_TYPE__LANGUAGE_BINDINGS:
				return ((InternalEList<?>)getLanguageBindings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypedefPackage.PRIMITIVE_TYPE__TYPESET_NAME:
				return getTypesetName();
			case TypedefPackage.PRIMITIVE_TYPE__NILLABLE:
				return isNillable();
			case TypedefPackage.PRIMITIVE_TYPE__LANGUAGE_BINDINGS:
				return getLanguageBindings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypedefPackage.PRIMITIVE_TYPE__TYPESET_NAME:
				setTypesetName((String)newValue);
				return;
			case TypedefPackage.PRIMITIVE_TYPE__NILLABLE:
				setNillable((Boolean)newValue);
				return;
			case TypedefPackage.PRIMITIVE_TYPE__LANGUAGE_BINDINGS:
				getLanguageBindings().clear();
				getLanguageBindings().addAll((Collection<? extends TypeLanguageBinding>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypedefPackage.PRIMITIVE_TYPE__TYPESET_NAME:
				setTypesetName(TYPESET_NAME_EDEFAULT);
				return;
			case TypedefPackage.PRIMITIVE_TYPE__NILLABLE:
				setNillable(NILLABLE_EDEFAULT);
				return;
			case TypedefPackage.PRIMITIVE_TYPE__LANGUAGE_BINDINGS:
				getLanguageBindings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypedefPackage.PRIMITIVE_TYPE__TYPESET_NAME:
				return TYPESET_NAME_EDEFAULT == null ? typesetName != null : !TYPESET_NAME_EDEFAULT.equals(typesetName);
			case TypedefPackage.PRIMITIVE_TYPE__NILLABLE:
				return nillable != NILLABLE_EDEFAULT;
			case TypedefPackage.PRIMITIVE_TYPE__LANGUAGE_BINDINGS:
				return languageBindings != null && !languageBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typesetName: ");
		result.append(typesetName);
		result.append(", nillable: ");
		result.append(nillable);
		result.append(')');
		return result.toString();
	}

} //PrimitiveTypeImpl
