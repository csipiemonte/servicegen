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
package it.csi.mddtools.servicegen;

import it.csi.mddtools.appresources.ResourceSet;
import it.csi.mddtools.servicedef.ServiceDef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SOABE Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.servicegen.SOABEModel#getBaseTypes <em>Base Types</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.SOABEModel#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.SOABEModel#getCodComponente <em>Cod Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.SOABEModel#getVersioneProdotto <em>Versione Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.SOABEModel#getVersioneComponente <em>Versione Componente</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.SOABEModel#getServiceimplementations <em>Serviceimplementations</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.SOABEModel#getServiceDefs <em>Service Defs</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.SOABEModel#getTargetPlatform <em>Target Platform</em>}</li>
 *   <li>{@link it.csi.mddtools.servicegen.SOABEModel#getResourceSet <em>Resource Set</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel()
 * @model
 * @generated
 */
public interface SOABEModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Types</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicegen.BaseTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Types</em>' containment reference list.
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel_BaseTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseTypes> getBaseTypes();

	/**
	 * Returns the value of the '<em><b>Cod Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Prodotto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Prodotto</em>' attribute.
	 * @see #setCodProdotto(String)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel_CodProdotto()
	 * @model
	 * @generated
	 */
	String getCodProdotto();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.SOABEModel#getCodProdotto <em>Cod Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Prodotto</em>' attribute.
	 * @see #getCodProdotto()
	 * @generated
	 */
	void setCodProdotto(String value);

	/**
	 * Returns the value of the '<em><b>Cod Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Componente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Componente</em>' attribute.
	 * @see #setCodComponente(String)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel_CodComponente()
	 * @model
	 * @generated
	 */
	String getCodComponente();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.SOABEModel#getCodComponente <em>Cod Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Componente</em>' attribute.
	 * @see #getCodComponente()
	 * @generated
	 */
	void setCodComponente(String value);

	/**
	 * Returns the value of the '<em><b>Versione Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versione Prodotto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versione Prodotto</em>' attribute.
	 * @see #setVersioneProdotto(String)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel_VersioneProdotto()
	 * @model
	 * @generated
	 */
	String getVersioneProdotto();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.SOABEModel#getVersioneProdotto <em>Versione Prodotto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versione Prodotto</em>' attribute.
	 * @see #getVersioneProdotto()
	 * @generated
	 */
	void setVersioneProdotto(String value);

	/**
	 * Returns the value of the '<em><b>Versione Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versione Componente</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versione Componente</em>' attribute.
	 * @see #setVersioneComponente(String)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel_VersioneComponente()
	 * @model
	 * @generated
	 */
	String getVersioneComponente();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.SOABEModel#getVersioneComponente <em>Versione Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versione Componente</em>' attribute.
	 * @see #getVersioneComponente()
	 * @generated
	 */
	void setVersioneComponente(String value);

	/**
	 * Returns the value of the '<em><b>Serviceimplementations</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicegen.ServiceImpl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviceimplementations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serviceimplementations</em>' containment reference list.
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel_Serviceimplementations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceImpl> getServiceimplementations();

	/**
	 * Returns the value of the '<em><b>Service Defs</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.ServiceDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Defs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Defs</em>' containment reference list.
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel_ServiceDefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceDef> getServiceDefs();

	/**
	 * Returns the value of the '<em><b>Target Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Platform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Platform</em>' containment reference.
	 * @see #setTargetPlatform(TargetPlatform)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel_TargetPlatform()
	 * @model containment="true"
	 * @generated
	 */
	TargetPlatform getTargetPlatform();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.SOABEModel#getTargetPlatform <em>Target Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Platform</em>' containment reference.
	 * @see #getTargetPlatform()
	 * @generated
	 */
	void setTargetPlatform(TargetPlatform value);

	/**
	 * Returns the value of the '<em><b>Resource Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Set</em>' reference.
	 * @see #setResourceSet(ResourceSet)
	 * @see it.csi.mddtools.servicegen.ServicegenPackage#getSOABEModel_ResourceSet()
	 * @model
	 * @generated
	 */
	ResourceSet getResourceSet();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicegen.SOABEModel#getResourceSet <em>Resource Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Set</em>' reference.
	 * @see #getResourceSet()
	 * @generated
	 */
	void setResourceSet(ResourceSet value);

} // SOABEModel
