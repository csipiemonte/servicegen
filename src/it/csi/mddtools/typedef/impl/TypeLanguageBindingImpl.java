/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.typedef.impl;

import it.csi.mddtools.typedef.TypeLanguageBinding;
import it.csi.mddtools.typedef.TypedefPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Language Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.typedef.impl.TypeLanguageBindingImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.impl.TypeLanguageBindingImpl#getLangSpecificType <em>Lang Specific Type</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.impl.TypeLanguageBindingImpl#getLangSpecificNS <em>Lang Specific NS</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.impl.TypeLanguageBindingImpl#getDefaultInitValue <em>Default Init Value</em>}</li>
 *   <li>{@link it.csi.mddtools.typedef.impl.TypeLanguageBindingImpl#getNullValueLiteral <em>Null Value Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeLanguageBindingImpl extends EObjectImpl implements TypeLanguageBinding {
	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangSpecificType() <em>Lang Specific Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangSpecificType()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_SPECIFIC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangSpecificType() <em>Lang Specific Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangSpecificType()
	 * @generated
	 * @ordered
	 */
	protected String langSpecificType = LANG_SPECIFIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangSpecificNS() <em>Lang Specific NS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangSpecificNS()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_SPECIFIC_NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangSpecificNS() <em>Lang Specific NS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangSpecificNS()
	 * @generated
	 * @ordered
	 */
	protected String langSpecificNS = LANG_SPECIFIC_NS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultInitValue() <em>Default Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInitValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_INIT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultInitValue() <em>Default Init Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultInitValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultInitValue = DEFAULT_INIT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullValueLiteral() <em>Null Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String NULL_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullValueLiteral() <em>Null Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String nullValueLiteral = NULL_VALUE_LITERAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLanguageBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypedefPackage.Literals.TYPE_LANGUAGE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypedefPackage.TYPE_LANGUAGE_BINDING__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangSpecificType() {
		return langSpecificType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangSpecificType(String newLangSpecificType) {
		String oldLangSpecificType = langSpecificType;
		langSpecificType = newLangSpecificType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE, oldLangSpecificType, langSpecificType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangSpecificNS() {
		return langSpecificNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangSpecificNS(String newLangSpecificNS) {
		String oldLangSpecificNS = langSpecificNS;
		langSpecificNS = newLangSpecificNS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS, oldLangSpecificNS, langSpecificNS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultInitValue() {
		return defaultInitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultInitValue(String newDefaultInitValue) {
		String oldDefaultInitValue = defaultInitValue;
		defaultInitValue = newDefaultInitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypedefPackage.TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE, oldDefaultInitValue, defaultInitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNullValueLiteral() {
		return nullValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullValueLiteral(String newNullValueLiteral) {
		String oldNullValueLiteral = nullValueLiteral;
		nullValueLiteral = newNullValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypedefPackage.TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL, oldNullValueLiteral, nullValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG:
				return getLang();
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE:
				return getLangSpecificType();
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS:
				return getLangSpecificNS();
			case TypedefPackage.TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE:
				return getDefaultInitValue();
			case TypedefPackage.TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL:
				return getNullValueLiteral();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG:
				setLang((String)newValue);
				return;
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE:
				setLangSpecificType((String)newValue);
				return;
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS:
				setLangSpecificNS((String)newValue);
				return;
			case TypedefPackage.TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE:
				setDefaultInitValue((String)newValue);
				return;
			case TypedefPackage.TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL:
				setNullValueLiteral((String)newValue);
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
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE:
				setLangSpecificType(LANG_SPECIFIC_TYPE_EDEFAULT);
				return;
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS:
				setLangSpecificNS(LANG_SPECIFIC_NS_EDEFAULT);
				return;
			case TypedefPackage.TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE:
				setDefaultInitValue(DEFAULT_INIT_VALUE_EDEFAULT);
				return;
			case TypedefPackage.TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL:
				setNullValueLiteral(NULL_VALUE_LITERAL_EDEFAULT);
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
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE:
				return LANG_SPECIFIC_TYPE_EDEFAULT == null ? langSpecificType != null : !LANG_SPECIFIC_TYPE_EDEFAULT.equals(langSpecificType);
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS:
				return LANG_SPECIFIC_NS_EDEFAULT == null ? langSpecificNS != null : !LANG_SPECIFIC_NS_EDEFAULT.equals(langSpecificNS);
			case TypedefPackage.TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE:
				return DEFAULT_INIT_VALUE_EDEFAULT == null ? defaultInitValue != null : !DEFAULT_INIT_VALUE_EDEFAULT.equals(defaultInitValue);
			case TypedefPackage.TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL:
				return NULL_VALUE_LITERAL_EDEFAULT == null ? nullValueLiteral != null : !NULL_VALUE_LITERAL_EDEFAULT.equals(nullValueLiteral);
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
		result.append(" (lang: ");
		result.append(lang);
		result.append(", langSpecificType: ");
		result.append(langSpecificType);
		result.append(", langSpecificNS: ");
		result.append(langSpecificNS);
		result.append(", defaultInitValue: ");
		result.append(defaultInitValue);
		result.append(", nullValueLiteral: ");
		result.append(nullValueLiteral);
		result.append(')');
		return result.toString();
	}

} //TypeLanguageBindingImpl
