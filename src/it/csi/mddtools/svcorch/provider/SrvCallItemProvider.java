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
import it.csi.mddtools.servicedef.ServiceBinding;
import it.csi.mddtools.svcorch.SrvCall;
import it.csi.mddtools.svcorch.SvcorchFactory;
import it.csi.mddtools.svcorch.SvcorchPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.svcorch.SrvCall} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SrvCallItemProvider
	extends OpNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrvCallItemProvider(AdapterFactory adapterFactory) {
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

			addOperationPropertyDescriptor(object);
			addServiceConnectorPropertyDescriptor(object);
			addOutputSlotPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addOperationPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_SrvCall_operation_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_SrvCall_operation_feature", "_UI_SrvCall_type"),
//				 SvcorchPackage.Literals.SRV_CALL__OPERATION,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_SrvCall_operation_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_SrvCall_operation_feature",
						"_UI_SrvCall_type"),
				//GuigenPackage.eINSTANCE.getCommandOnWidgets_TargetWidgets(),
				SvcorchPackage.eINSTANCE.getSrvCall_Operation(),
				true) {
			protected Collection getComboBoxObjects(Object object) {
				SrvCall call = (SrvCall)object;
				
				ArrayList<Operation> result = new ArrayList<Operation>();
				if (call.getServiceConnector()!=null && call.getServiceConnector().getServiceDef()!=null){
					// rendi selezionabili solo le operazioni del servizio selezionato
					Iterator<Operation> it_op = call.getServiceConnector().getServiceDef().getOperations().iterator();
					while(it_op.hasNext()){
						Operation currOP = it_op.next();
							result.add((Operation)currOP);
					}
				}	
				return result;
			}
		});
	}

	/**
	 * This adds a property descriptor for the Service Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SrvCall_serviceConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SrvCall_serviceConnector_feature", "_UI_SrvCall_type"),
				 SvcorchPackage.Literals.SRV_CALL__SERVICE_CONNECTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output Slot feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputSlotPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SrvCall_outputSlot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SrvCall_outputSlot_feature", "_UI_SrvCall_type"),
				 SvcorchPackage.Literals.SRV_CALL__OUTPUT_SLOT,
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
			childrenFeatures.add(SvcorchPackage.Literals.SRV_CALL__PARAM_BINDINGS);
			childrenFeatures.add(SvcorchPackage.Literals.SRV_CALL__ON_EXCEPTION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SrvCall)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SrvCall_type") :
			getString("_UI_SrvCall_type") + " " + label;
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

		switch (notification.getFeatureID(SrvCall.class)) {
			case SvcorchPackage.SRV_CALL__OPERATION:
			case SvcorchPackage.SRV_CALL__SERVICE_CONNECTOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SvcorchPackage.SRV_CALL__PARAM_BINDINGS:
			case SvcorchPackage.SRV_CALL__ON_EXCEPTION:
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
				(SvcorchPackage.Literals.SRV_CALL__PARAM_BINDINGS,
				 SvcorchFactory.eINSTANCE.createParamBinding()));

		newChildDescriptors.add
			(createChildParameter
				(SvcorchPackage.Literals.SRV_CALL__ON_EXCEPTION,
				 SvcorchFactory.eINSTANCE.createExceptionHandler()));
	}

}
