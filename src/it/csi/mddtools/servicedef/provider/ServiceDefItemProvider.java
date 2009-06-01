/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef.provider;


import it.csi.mddtools.servicedef.ServiceDef;
import it.csi.mddtools.servicedef.ServicedefFactory;
import it.csi.mddtools.servicedef.ServicedefPackage;

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
 * This is the item provider adapter for a {@link it.csi.mddtools.servicedef.ServiceDef} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDefItemProvider
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
	public ServiceDefItemProvider(AdapterFactory adapterFactory) {
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

			addCodServizioPropertyDescriptor(object);
			addMonitorablePropertyDescriptor(object);
			addDiagEnabledPropertyDescriptor(object);
			addVersionePropertyDescriptor(object);
			addTraceEnabledPropertyDescriptor(object);
			addServiceTypePropertyDescriptor(object);
			addAuthLevelPropertyDescriptor(object);
			addCodProdottoPropertyDescriptor(object);
			addCodComponentePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cod Servizio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodServizioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceDef_codServizio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDef_codServizio_feature", "_UI_ServiceDef_type"),
				 ServicedefPackage.Literals.SERVICE_DEF__COD_SERVIZIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Monitorable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMonitorablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceDef_monitorable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDef_monitorable_feature", "_UI_ServiceDef_type"),
				 ServicedefPackage.Literals.SERVICE_DEF__MONITORABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diag Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceDef_diagEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDef_diagEnabled_feature", "_UI_ServiceDef_type"),
				 ServicedefPackage.Literals.SERVICE_DEF__DIAG_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Versione feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceDef_versione_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDef_versione_feature", "_UI_ServiceDef_type"),
				 ServicedefPackage.Literals.SERVICE_DEF__VERSIONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trace Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraceEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceDef_traceEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDef_traceEnabled_feature", "_UI_ServiceDef_type"),
				 ServicedefPackage.Literals.SERVICE_DEF__TRACE_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceDef_serviceType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDef_serviceType_feature", "_UI_ServiceDef_type"),
				 ServicedefPackage.Literals.SERVICE_DEF__SERVICE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Auth Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceDef_authLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDef_authLevel_feature", "_UI_ServiceDef_type"),
				 ServicedefPackage.Literals.SERVICE_DEF__AUTH_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_ServiceDef_codProdotto_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDef_codProdotto_feature", "_UI_ServiceDef_type"),
				 ServicedefPackage.Literals.SERVICE_DEF__COD_PRODOTTO,
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
				 getString("_UI_ServiceDef_codComponente_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceDef_codComponente_feature", "_UI_ServiceDef_type"),
				 ServicedefPackage.Literals.SERVICE_DEF__COD_COMPONENTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ServicedefPackage.Literals.SERVICE_DEF__BINDINGS);
			childrenFeatures.add(ServicedefPackage.Literals.SERVICE_DEF__OPERATIONS);
			childrenFeatures.add(ServicedefPackage.Literals.SERVICE_DEF__TYPES);
			childrenFeatures.add(ServicedefPackage.Literals.SERVICE_DEF__ROLES);
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
	 * This returns ServiceDef.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceDef"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		ServiceDef sd = (ServiceDef)object;
		String label = ""+
		(sd.getCodServizio()!=null?sd.getCodServizio():"<???>")+
		" v."+(sd.getVersione()!=null? sd.getVersione():"?.?")+
		" ["+(sd.getServiceType().getLiteral())+"]"; 
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceDef_type") :
			getString("_UI_ServiceDef_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceDef.class)) {
			case ServicedefPackage.SERVICE_DEF__COD_SERVIZIO:
			case ServicedefPackage.SERVICE_DEF__MONITORABLE:
			case ServicedefPackage.SERVICE_DEF__DIAG_ENABLED:
			case ServicedefPackage.SERVICE_DEF__VERSIONE:
			case ServicedefPackage.SERVICE_DEF__TRACE_ENABLED:
			case ServicedefPackage.SERVICE_DEF__SERVICE_TYPE:
			case ServicedefPackage.SERVICE_DEF__AUTH_LEVEL:
			case ServicedefPackage.SERVICE_DEF__COD_PRODOTTO:
			case ServicedefPackage.SERVICE_DEF__COD_COMPONENTE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ServicedefPackage.SERVICE_DEF__BINDINGS:
			case ServicedefPackage.SERVICE_DEF__OPERATIONS:
			case ServicedefPackage.SERVICE_DEF__TYPES:
			case ServicedefPackage.SERVICE_DEF__ROLES:
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
				(ServicedefPackage.Literals.SERVICE_DEF__BINDINGS,
				 ServicedefFactory.eINSTANCE.createEJBPABinding()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SERVICE_DEF__BINDINGS,
				 ServicedefFactory.eINSTANCE.createSOAPPABRBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SERVICE_DEF__BINDINGS,
				 ServicedefFactory.eINSTANCE.createWSFADBinding()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SERVICE_DEF__OPERATIONS,
				 ServicedefFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SERVICE_DEF__TYPES,
				 ServicedefFactory.eINSTANCE.createTypes()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SERVICE_DEF__ROLES,
				 ServicedefFactory.eINSTANCE.createRole()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Servicedef_metamodelEditPlugin.INSTANCE;
	}

}
