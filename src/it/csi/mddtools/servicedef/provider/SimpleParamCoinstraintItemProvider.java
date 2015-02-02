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
package it.csi.mddtools.servicedef.provider;


import it.csi.mddtools.servicedef.Param;
import it.csi.mddtools.servicedef.ServicedefFactory;
import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.SimpleParamCoinstraint;

import java.util.Collection;
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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.servicedef.SimpleParamCoinstraint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleParamCoinstraintItemProvider
	extends ParamConstraintItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParamCoinstraintItemProvider(AdapterFactory adapterFactory) {
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

			addParamPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleParamCoinstraint_param_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleParamCoinstraint_param_feature", "_UI_SimpleParamCoinstraint_type"),
				 ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__PARAM,
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
			childrenFeatures.add(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT);
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
	 * This returns SimpleParamCoinstraint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleParamCoinstraint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String s="on param ";
		SimpleParamCoinstraint ctr = (SimpleParamCoinstraint)object;
		Param par = ctr.getParam();
		if (par != null)
			s+="["+par.getName()+"]";
		else
			s+="<<undefined>>";
		//return getString("_UI_SimpleParamCoinstraint_type");
		return s;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SimpleParamCoinstraint.class)) {
//			case ServicedefPackage.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT:
//				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
//				return;
			case ServicedefPackage.SIMPLE_PARAM_COINSTRAINT__PARAM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, true));
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
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createValueValorizationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createCustomConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createRelativeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createANDValueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createORValueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createNOTValueConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createContinuousRangeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createDiscreteRangeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createSimpleFeatureConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createANDFeatureConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createORFeatureConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ServicedefPackage.Literals.SIMPLE_PARAM_COINSTRAINT__CONSTRAINT,
				 ServicedefFactory.eINSTANCE.createNOTFeatureConstraint()));
	}

}
