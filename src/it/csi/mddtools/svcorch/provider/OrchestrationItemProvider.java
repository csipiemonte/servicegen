/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.svcorch.provider;



import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.servicedef.ServiceDef;
import it.csi.mddtools.servicedef.SrvTypeEnum;
import it.csi.mddtools.svcorch.Orchestration;
import it.csi.mddtools.svcorch.SvcorchFactory;
import it.csi.mddtools.svcorch.SvcorchPackage;

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
 * This is the item provider adapter for a {@link it.csi.mddtools.svcorch.Orchestration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OrchestrationItemProvider
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
	public OrchestrationItemProvider(AdapterFactory adapterFactory) {
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

			addServicePropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
			addReturnSlotPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addServicePropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_Orchestration_service_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_Orchestration_service_feature", "_UI_Orchestration_type"),
//				 SvcorchPackage.Literals.ORCHESTRATION__SERVICE,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_Orchestration_service_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Orchestration_service_feature",
						"_UI_Orchestration_type"),
				//GuigenPackage.eINSTANCE.getCommandOnWidgets_TargetWidgets(),
				SvcorchPackage.eINSTANCE.getOrchestration_Service(),
				true) {
			protected Collection getComboBoxObjects(Object object) {

				//ContentPanel containerOfAction = GenUtils.findParentContentPanel((Command)object);
				List<ServiceDef> allSrv = (List<ServiceDef>)(super.getComboBoxObjects(object)); 
				ArrayList<ServiceDef> result = new ArrayList<ServiceDef>();
				Iterator<ServiceDef> it_sd = allSrv.iterator(); 
				while(it_sd.hasNext()){
					ServiceDef currSD = it_sd.next();
					if (currSD!=null){
						if (currSD.getServiceType().equals(SrvTypeEnum.ORCH))
							result.add(currSD);
					}
				}
				return result;
			}
		});
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
//				 getString("_UI_Orchestration_operation_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_Orchestration_operation_feature", "_UI_Orchestration_type"),
//				 SvcorchPackage.Literals.ORCHESTRATION__OPERATION,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_Orchestration_operation_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_Orchestration_operation_feature",
						"_UI_Orchestration_type"),
				//GuigenPackage.eINSTANCE.getCommandOnWidgets_TargetWidgets(),
				SvcorchPackage.eINSTANCE.getOrchestration_Operation(),
				true) {
			protected Collection getComboBoxObjects(Object object) {
				Orchestration orch = (Orchestration)object;
				
				ArrayList<Operation> result = new ArrayList<Operation>();
				if (orch.getService()!=null){
					// rendi selezionabili solo le operazioni del serviizo selezionato
					Iterator<Operation> it_op = orch.getService().getOperations().iterator();
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
	 * This adds a property descriptor for the Return Slot feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnSlotPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Orchestration_returnSlot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Orchestration_returnSlot_feature", "_UI_Orchestration_type"),
				 SvcorchPackage.Literals.ORCHESTRATION__RETURN_SLOT,
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
			childrenFeatures.add(SvcorchPackage.Literals.ORCHESTRATION__NODES);
			childrenFeatures.add(SvcorchPackage.Literals.ORCHESTRATION__GLOBAL_SLOTS);
			childrenFeatures.add(SvcorchPackage.Literals.ORCHESTRATION__INPUT_PARAM_BINDINGS);
			childrenFeatures.add(SvcorchPackage.Literals.ORCHESTRATION__EXCEPTION_MAPPINGS);
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
	 * This returns Orchestration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Orchestration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Orchestration o = (Orchestration)object;
		String label = " [" + (o.getService()!=null?o.getService().getCodServizio() : "<???>")+
		"."+(o.getOperation()!=null? o.getOperation().getName(): "<???>")+"]";
		return getString("_UI_Orchestration_type")+label;
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

		switch (notification.getFeatureID(Orchestration.class)) {
			case SvcorchPackage.ORCHESTRATION__SERVICE:
			case SvcorchPackage.ORCHESTRATION__OPERATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SvcorchPackage.ORCHESTRATION__NODES:
			case SvcorchPackage.ORCHESTRATION__GLOBAL_SLOTS:
			case SvcorchPackage.ORCHESTRATION__INPUT_PARAM_BINDINGS:
			case SvcorchPackage.ORCHESTRATION__EXCEPTION_MAPPINGS:
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
				(SvcorchPackage.Literals.ORCHESTRATION__NODES,
				 SvcorchFactory.eINSTANCE.createNodes()));

		newChildDescriptors.add
			(createChildParameter
				(SvcorchPackage.Literals.ORCHESTRATION__GLOBAL_SLOTS,
				 SvcorchFactory.eINSTANCE.createDataSlots()));

		newChildDescriptors.add
			(createChildParameter
				(SvcorchPackage.Literals.ORCHESTRATION__INPUT_PARAM_BINDINGS,
				 SvcorchFactory.eINSTANCE.createInputParamBindings()));

		newChildDescriptors.add
			(createChildParameter
				(SvcorchPackage.Literals.ORCHESTRATION__EXCEPTION_MAPPINGS,
				 SvcorchFactory.eINSTANCE.createExceptionMappings()));
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
