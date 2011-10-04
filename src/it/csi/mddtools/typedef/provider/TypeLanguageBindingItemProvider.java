/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.typedef.provider;


import it.csi.mddtools.typedef.TypeLanguageBinding;
import it.csi.mddtools.typedef.TypedefPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.typedef.TypeLanguageBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeLanguageBindingItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLanguageBindingItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLangPropertyDescriptor(object);
			addLangSpecificTypePropertyDescriptor(object);
			addLangSpecificNSPropertyDescriptor(object);
			addDefaultInitValuePropertyDescriptor(object);
			addNullValueLiteralPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Lang feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeLanguageBinding_lang_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeLanguageBinding_lang_feature", "_UI_TypeLanguageBinding_type"),
				 TypedefPackage.Literals.TYPE_LANGUAGE_BINDING__LANG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lang Specific Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangSpecificTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeLanguageBinding_langSpecificType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeLanguageBinding_langSpecificType_feature", "_UI_TypeLanguageBinding_type"),
				 TypedefPackage.Literals.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lang Specific NS feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangSpecificNSPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeLanguageBinding_langSpecificNS_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeLanguageBinding_langSpecificNS_feature", "_UI_TypeLanguageBinding_type"),
				 TypedefPackage.Literals.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Init Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultInitValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeLanguageBinding_defaultInitValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeLanguageBinding_defaultInitValue_feature", "_UI_TypeLanguageBinding_type"),
				 TypedefPackage.Literals.TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Null Value Literal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNullValueLiteralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypeLanguageBinding_nullValueLiteral_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypeLanguageBinding_nullValueLiteral_feature", "_UI_TypeLanguageBinding_type"),
				 TypedefPackage.Literals.TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TypeLanguageBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypeLanguageBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		TypeLanguageBinding tlb = ((TypeLanguageBinding)object);
		String label = " "+(tlb.getLang()!=null? tlb.getLang():"<undefined language>");
		label += "->"+(tlb.getLangSpecificNS()!=null?tlb.getLangSpecificNS():"");
		label += (tlb.getLangSpecificType()!=null ? tlb.getLangSpecificType():"<undefined type>");
		label += ", null value:"+(tlb.getNullValueLiteral()!=null?"["+tlb.getNullValueLiteral()+"]":"<undefined>");
		label += ", default value:"+(tlb.getDefaultInitValue()!=null?"["+tlb.getDefaultInitValue()+"]":"<undefined>");
		return label == null || label.length() == 0 ?
			getString("_UI_TypeLanguageBinding_type") :
			getString("_UI_TypeLanguageBinding_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TypeLanguageBinding.class)) {
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG:
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_TYPE:
			case TypedefPackage.TYPE_LANGUAGE_BINDING__LANG_SPECIFIC_NS:
			case TypedefPackage.TYPE_LANGUAGE_BINDING__DEFAULT_INIT_VALUE:
			case TypedefPackage.TYPE_LANGUAGE_BINDING__NULL_VALUE_LITERAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Typedef_metamodelEditPlugin.INSTANCE;
	}

}
