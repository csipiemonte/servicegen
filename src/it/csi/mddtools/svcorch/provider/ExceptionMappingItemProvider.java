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
package it.csi.mddtools.svcorch.provider;


import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicegen.genutils.EditUtils;
import it.csi.mddtools.svcorch.ExceptionMapping;
import it.csi.mddtools.svcorch.ExceptionMappings;
import it.csi.mddtools.svcorch.Orchestration;
import it.csi.mddtools.svcorch.SrvCall;
import it.csi.mddtools.svcorch.SvcorchPackage;
import it.csi.mddtools.svcorch.genutils.GenUtils;

import it.csi.mddtools.typedef.TypedefFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.svcorch.ExceptionMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExceptionMappingItemProvider
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
	public ExceptionMappingItemProvider(AdapterFactory adapterFactory) {
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

			addMsgPropertyDescriptor(object);
			addFromPropertyDescriptor(object);
			addToPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Msg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMsgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExceptionMapping_msg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExceptionMapping_msg_feature", "_UI_ExceptionMapping_type"),
				 SvcorchPackage.Literals.EXCEPTION_MAPPING__MSG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFromPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_ExceptionMapping_from_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_ExceptionMapping_from_feature", "_UI_ExceptionMapping_type"),
//				 SvcorchPackage.Literals.EXCEPTION_MAPPING__FROM,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_ExceptionMapping_from_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ExceptionMapping_from_feature",
						"_UI_ExceptionMapping_type"),
				SvcorchPackage.eINSTANCE.getExceptionMapping_From(),
				true) {
			protected Collection getComboBoxObjects(Object object) {
				// ritorna solo le eccezioni dei metodi referenziati da un SrvCall
				ExceptionMapping em = (ExceptionMapping)object;
				ExceptionMappings mappings = (ExceptionMappings)em.eContainer();
				Orchestration orch = (Orchestration)mappings.eContainer();
				ArrayList<it.csi.mddtools.typedef.Exception> fromExceptions = GenUtils.getAllPossibleSourceExceptions(orch);
				return fromExceptions;
			}
		});

	}

	/**
	 * This adds a property descriptor for the To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addToPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_ExceptionMapping_to_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_ExceptionMapping_to_feature", "_UI_ExceptionMapping_type"),
//				 SvcorchPackage.Literals.EXCEPTION_MAPPING__TO,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_ExceptionMapping_to_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ExceptionMapping_to_feature",
						"_UI_ExceptionMapping_type"),
				SvcorchPackage.eINSTANCE.getExceptionMapping_To(),
				true) {
			protected Collection getComboBoxObjects(Object object) {
				// ritorna solo le eccezioni del metodo dell'orchestrazione
				ExceptionMapping em = (ExceptionMapping)object;
				ExceptionMappings mappings = (ExceptionMappings)em.eContainer();
				Orchestration orch = (Orchestration)mappings.eContainer();
				Operation op = orch.getOperation();
				if (op!=null){
					return op.getThrows();
				}
				else {
					ArrayList<Exception> result = new ArrayList<Exception>();
					return result;
				}
			}
		});
		
	}

	/**
	 * This returns ExceptionMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExceptionMapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		ExceptionMapping em = ((ExceptionMapping)object);
		String label = ""+
		(em.getFrom()!=null?EditUtils.formatTypeLabel(em.getFrom()):"???")+
		"->"+
		(em.getTo()!=null?EditUtils.formatTypeLabel(em.getTo()):"???")+
		": "+em.getMsg();
		return label == null || label.length() == 0 ?
			getString("_UI_ExceptionMapping_type") :
			getString("_UI_ExceptionMapping_type") + " " + label;
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

		switch (notification.getFeatureID(ExceptionMapping.class)) {
			case SvcorchPackage.EXCEPTION_MAPPING__MSG:
			case SvcorchPackage.EXCEPTION_MAPPING__FROM:
			case SvcorchPackage.EXCEPTION_MAPPING__TO:
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
		return SvcorchEditPlugin.INSTANCE;
	}

}
