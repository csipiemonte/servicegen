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


import it.csi.mddtools.appresources.AppresourcesPackage;
import it.csi.mddtools.appresources.ServiceConnector;
import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.Param;
import it.csi.mddtools.servicedef.ServiceBinding;
import it.csi.mddtools.svcorch.InputParamBindings;
import it.csi.mddtools.svcorch.Orchestration;
import it.csi.mddtools.svcorch.ParamBinding;
import it.csi.mddtools.svcorch.SrvCall;
import it.csi.mddtools.svcorch.SvcorchPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
 * This is the item provider adapter for a {@link it.csi.mddtools.svcorch.ParamBinding} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParamBindingItemProvider
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
	public ParamBindingItemProvider(AdapterFactory adapterFactory) {
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

			addSlotPropertyDescriptor(object);
			addParamPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Slot feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlotPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParamBinding_slot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParamBinding_slot_feature", "_UI_ParamBinding_type"),
				 SvcorchPackage.Literals.PARAM_BINDING__SLOT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addParamPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_ParamBinding_param_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_ParamBinding_param_feature", "_UI_ParamBinding_type"),
//				 SvcorchPackage.Literals.PARAM_BINDING__PARAM,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_ParamBinding_param_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_ParamBinding_param_feature",
						"_UI_ParamBinding_type"),
				//GuigenPackage.eINSTANCE.getCommandOnWidgets_TargetWidgets(),
				SvcorchPackage.eINSTANCE.getParamBinding_Param(),
				true) {
			protected Collection getComboBoxObjects(Object object) {
				ParamBinding binding = (ParamBinding)object;
				
				ArrayList<Param> result = new ArrayList<Param>();
				Operation targetOp = null;
				if (binding.eContainer() instanceof InputParamBindings){
					// la targetOp è l'operazione dell'orchestrazione
					InputParamBindings bindings = (InputParamBindings)(binding.eContainer());
					Orchestration orch = (Orchestration)(bindings.eContainer());
					targetOp = orch.getOperation(); 
				}
				else if (binding.eContainer() instanceof SrvCall){
					// la targetOp è quella invocata
					SrvCall call = (SrvCall)(binding.eContainer());
					targetOp = call.getOperation();
				}
				if (targetOp!=null){
					// rendi selezionabili solo i param dell'operazione selezionata
					Iterator<Param> it_par = targetOp.getParams().iterator();
					while(it_par.hasNext()){
						Param currPar = it_par.next();
							result.add((Param)currPar);
					}
				}	
				return result;
			}
		});
	}

	/**
	 * This returns ParamBinding.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParamBinding"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		ParamBinding pb = (ParamBinding) object;
		String label = " ";
		label += (pb.getParam()!=null ? pb.getParam().getName():"<???>" )+
		"->"+( pb.getSlot()!=null? pb.getSlot().getName(): "<???>");
		return getString("_UI_ParamBinding_type") +label;
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

		switch (notification.getFeatureID(ParamBinding.class)) {
			case SvcorchPackage.PARAM_BINDING__SLOT:
			case SvcorchPackage.PARAM_BINDING__PARAM:
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
