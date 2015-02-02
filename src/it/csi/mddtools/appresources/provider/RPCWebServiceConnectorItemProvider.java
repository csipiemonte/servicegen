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
package it.csi.mddtools.appresources.provider;


import it.csi.mddtools.appresources.AppresourcesPackage;
import it.csi.mddtools.appresources.RPCWebServiceConnector;
import it.csi.mddtools.appresources.ServiceConnector;
import it.csi.mddtools.servicedef.ServiceBinding;
import it.csi.mddtools.servicedef.WSBinding;
import it.csi.mddtools.servicedef.WSEndpoint;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link it.csi.mddtools.appresources.RPCWebServiceConnector} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RPCWebServiceConnectorItemProvider
	extends ServiceConnectorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPCWebServiceConnectorItemProvider(AdapterFactory adapterFactory) {
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

			addEndpointPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Endpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addEndpointPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_RPCWebServiceConnector_endpoint_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_RPCWebServiceConnector_endpoint_feature", "_UI_RPCWebServiceConnector_type"),
//				 AppresourcesPackage.Literals.RPC_WEB_SERVICE_CONNECTOR__ENDPOINT,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getString("_UI_RPCWebServiceConnector_endpoint_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_RPCWebServiceConnector_endpoint_feature",
						"_UI_RPCWebServiceConnector_type"),
				//GuigenPackage.eINSTANCE.getCommandOnWidgets_TargetWidgets(),
				AppresourcesPackage.eINSTANCE.getRPCWebServiceConnector_Endpoint(),
				true) {
			protected Collection getComboBoxObjects(Object object) {
				RPCWebServiceConnector sconn = (RPCWebServiceConnector)object;
				
				ArrayList<WSEndpoint> result = new ArrayList<WSEndpoint>();
				if (sconn.getBinding()!=null){
					// rendi selezionabili solo i binding del serviizo selezionato
					ServiceBinding srvbind= sconn.getBinding();
				    if(srvbind instanceof WSBinding){
				    	WSBinding wsbind = (WSBinding) srvbind;
						Iterator<WSEndpoint> it_sb = wsbind.getEndpoints().iterator();
						while(it_sb.hasNext()){
							WSEndpoint currSB = it_sb.next();
								result.add((WSEndpoint)currSB);
						}
				    	
				    }
				
				}	
				return result;
			}
		});
	}

	/**
	 * This returns RPCWebServiceConnector.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RPCWebServiceConnector"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RPCWebServiceConnector)object).getCode();
		return label == null || label.length() == 0 ?
			getString("_UI_RPCWebServiceConnector_type") :
			getString("_UI_RPCWebServiceConnector_type") + " " + label;
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

}
