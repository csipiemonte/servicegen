/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicegen.provider;


import it.csi.mddtools.servicedef.ServicedefFactory;
import it.csi.mddtools.servicegen.SOABEModel;
import it.csi.mddtools.servicegen.ServicegenFactory;
import it.csi.mddtools.servicegen.ServicegenPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adapter for a {@link it.csi.mddtools.servicegen.SOABEModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SOABEModelItemProvider
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
	public SOABEModelItemProvider(AdapterFactory adapterFactory) {
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

			addCodProdottoPropertyDescriptor(object);
			addCodComponentePropertyDescriptor(object);
			addVersioneProdottoPropertyDescriptor(object);
			addVersioneComponentePropertyDescriptor(object);
			addResourceSetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cod Prodotto feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodProdottoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SOABEModel_codProdotto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SOABEModel_codProdotto_feature", "_UI_SOABEModel_type"),
				 ServicegenPackage.Literals.SOABE_MODEL__COD_PRODOTTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cod Componente feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodComponentePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SOABEModel_codComponente_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SOABEModel_codComponente_feature", "_UI_SOABEModel_type"),
				 ServicegenPackage.Literals.SOABE_MODEL__COD_COMPONENTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Versione Prodotto feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersioneProdottoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SOABEModel_versioneProdotto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SOABEModel_versioneProdotto_feature", "_UI_SOABEModel_type"),
				 ServicegenPackage.Literals.SOABE_MODEL__VERSIONE_PRODOTTO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Versione Componente feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersioneComponentePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SOABEModel_versioneComponente_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SOABEModel_versioneComponente_feature", "_UI_SOABEModel_type"),
				 ServicegenPackage.Literals.SOABE_MODEL__VERSIONE_COMPONENTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourceSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SOABEModel_resourceSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SOABEModel_resourceSet_feature", "_UI_SOABEModel_type"),
				 ServicegenPackage.Literals.SOABE_MODEL__RESOURCE_SET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ServicegenPackage.Literals.SOABE_MODEL__BASE_TYPES);
			childrenFeatures.add(ServicegenPackage.Literals.SOABE_MODEL__SERVICEIMPLEMENTATIONS);
			childrenFeatures.add(ServicegenPackage.Literals.SOABE_MODEL__SERVICE_DEFS);
			childrenFeatures.add(ServicegenPackage.Literals.SOABE_MODEL__TARGET_PLATFORM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SOABEModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SOABEModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		SOABEModel mdl = (SOABEModel)object;
		String label = "prod: "+
		(mdl.getCodProdotto()!=null? mdl.getCodProdotto():"<???>")+
		" v."+(mdl.getVersioneProdotto()!=null? mdl.getVersioneProdotto():"?.?")+
		", comp: "+(mdl.getCodComponente()!=null? mdl.getCodComponente():"<???>")+
		" v."+(mdl.getVersioneComponente()!=null? mdl.getVersioneComponente():"?.?");
		return label == null || label.length() == 0 ?
			getString("_UI_SOABEModel_type") :
			getString("_UI_SOABEModel_type") + " " + label;
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

		switch (notification.getFeatureID(SOABEModel.class)) {
			case ServicegenPackage.SOABE_MODEL__COD_PRODOTTO:
			case ServicegenPackage.SOABE_MODEL__COD_COMPONENTE:
			case ServicegenPackage.SOABE_MODEL__VERSIONE_PRODOTTO:
			case ServicegenPackage.SOABE_MODEL__VERSIONE_COMPONENTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicegenPackage.SOABE_MODEL__BASE_TYPES:
			case ServicegenPackage.SOABE_MODEL__SERVICEIMPLEMENTATIONS:
			case ServicegenPackage.SOABE_MODEL__SERVICE_DEFS:
			case ServicegenPackage.SOABE_MODEL__TARGET_PLATFORM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ServicegenPackage.Literals.SOABE_MODEL__BASE_TYPES,
				 ServicegenFactory.eINSTANCE.createBaseTypes()));

		newChildDescriptors.add
			(createChildParameter
				(ServicegenPackage.Literals.SOABE_MODEL__SERVICEIMPLEMENTATIONS,
				 ServicegenFactory.eINSTANCE.createServiceImpl()));

		newChildDescriptors.add
			(createChildParameter
				(ServicegenPackage.Literals.SOABE_MODEL__SERVICE_DEFS,
				 ServicedefFactory.eINSTANCE.createServiceDef()));

		newChildDescriptors.add
			(createChildParameter
				(ServicegenPackage.Literals.SOABE_MODEL__TARGET_PLATFORM,
				 ServicegenFactory.eINSTANCE.createTargetPlatform()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Servicegen_metamodelEditPlugin.INSTANCE;
	}

}
