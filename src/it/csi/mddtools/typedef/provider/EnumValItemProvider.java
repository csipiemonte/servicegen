/**
 */
package it.csi.mddtools.typedef.provider;


import it.csi.mddtools.servicedef.Operation;
import it.csi.mddtools.svcorch.SrvCall;
import it.csi.mddtools.svcorch.SvcorchPackage;
import it.csi.mddtools.typedef.CSIDatatype;
import it.csi.mddtools.typedef.CSIDatatypeCodes;
import it.csi.mddtools.typedef.EnumVal;
import it.csi.mddtools.typedef.Type;
import it.csi.mddtools.typedef.TypedefFactory;
import it.csi.mddtools.typedef.TypedefPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.typedef.EnumVal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumValItemProvider extends TypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValItemProvider(AdapterFactory adapterFactory) {
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

			addValueTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addValueTypePropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_EnumVal_valueType_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_EnumVal_valueType_feature", "_UI_EnumVal_type"),
//				 TypedefPackage.Literals.ENUM_VAL__VALUE_TYPE,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		
		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_EnumVal_valueType_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_EnumVal_valueType_feature",
						"_UI_EnumVal_type"),
				
				TypedefPackage.eINSTANCE.getEnumVal_ValueType(),
				true) {
			protected Collection getComboBoxObjects(Object object) {
				Collection<Type> allTypes = (Collection<Type>)super.getComboBoxObjects(object);
				List<Type> acceptedTypes = new ArrayList<Type>();
				Iterator<Type> it_t = allTypes.iterator();
				while (it_t.hasNext()) {
					Type currType = it_t.next();
					if (currType instanceof CSIDatatype){
						// attualmente accetto solo CSIInteger, CSIWrappedInteger e CSIString
						if (((CSIDatatype)currType).getCode() == CSIDatatypeCodes.CSI_INTEGER || 
								((CSIDatatype)currType).getCode() == CSIDatatypeCodes.CSI_STRING){
							acceptedTypes.add(currType);
						}
					}
				}
				return acceptedTypes;
			}
		});
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
			childrenFeatures.add(TypedefPackage.Literals.ENUM_VAL__LITERALS);
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
	 * This returns EnumVal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EnumVal"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EnumVal)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EnumVal_type") :
			getString("_UI_EnumVal_type") + " " + label;
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

		switch (notification.getFeatureID(EnumVal.class)) {
			case TypedefPackage.ENUM_VAL__LITERALS:
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
				(TypedefPackage.Literals.ENUM_VAL__LITERALS,
				 TypedefFactory.eINSTANCE.createEnumLiteral()));
	}

}
