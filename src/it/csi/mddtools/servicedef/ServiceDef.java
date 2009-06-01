/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.servicedef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [[ TODO - add documentation here ]]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getCodServizio <em>Cod Servizio</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getBindings <em>Bindings</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#isMonitorable <em>Monitorable</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#isDiagEnabled <em>Diag Enabled</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getOperations <em>Operations</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getVersione <em>Versione</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getTypes <em>Types</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#isTraceEnabled <em>Trace Enabled</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getAuthLevel <em>Auth Level</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getRoles <em>Roles</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getCodProdotto <em>Cod Prodotto</em>}</li>
 *   <li>{@link it.csi.mddtools.servicedef.ServiceDef#getCodComponente <em>Cod Componente</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef()
 * @model
 * @generated
 */
public interface ServiceDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Cod Servizio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cod Servizio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Servizio</em>' attribute.
	 * @see #setCodServizio(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_CodServizio()
	 * @model
	 * @generated
	 */
	String getCodServizio();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getCodServizio <em>Cod Servizio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Servizio</em>' attribute.
	 * @see #getCodServizio()
	 * @generated
	 */
	void setCodServizio(String value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.ServiceBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceBinding> getBindings();

	/**
	 * Returns the value of the '<em><b>Monitorable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitorable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitorable</em>' attribute.
	 * @see #setMonitorable(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Monitorable()
	 * @model
	 * @generated
	 */
	boolean isMonitorable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#isMonitorable <em>Monitorable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitorable</em>' attribute.
	 * @see #isMonitorable()
	 * @generated
	 */
	void setMonitorable(boolean value);

	/**
	 * Returns the value of the '<em><b>Diag Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diag Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diag Enabled</em>' attribute.
	 * @see #setDiagEnabled(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_DiagEnabled()
	 * @model
	 * @generated
	 */
	boolean isDiagEnabled();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#isDiagEnabled <em>Diag Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diag Enabled</em>' attribute.
	 * @see #isDiagEnabled()
	 * @generated
	 */
	void setDiagEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * Returns the value of the '<em><b>Versione</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versione</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versione</em>' attribute.
	 * @see #setVersione(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Versione()
	 * @model
	 * @generated
	 */
	String getVersione();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getVersione <em>Versione</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versione</em>' attribute.
	 * @see #getVersione()
	 * @generated
	 */
	void setVersione(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(Types)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Types()
	 * @model containment="true"
	 * @generated
	 */
	Types getTypes();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(Types value);

	/**
	 * Returns the value of the '<em><b>Trace Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Enabled</em>' attribute.
	 * @see #setTraceEnabled(boolean)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_TraceEnabled()
	 * @model
	 * @generated
	 */
	boolean isTraceEnabled();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#isTraceEnabled <em>Trace Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace Enabled</em>' attribute.
	 * @see #isTraceEnabled()
	 * @generated
	 */
	void setTraceEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Service Type</b></em>' attribute.
	 * The default value is <code>"appl"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.servicedef.SrvTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Type</em>' attribute.
	 * @see it.csi.mddtools.servicedef.SrvTypeEnum
	 * @see #setServiceType(SrvTypeEnum)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_ServiceType()
	 * @model default="appl"
	 * @generated
	 */
	SrvTypeEnum getServiceType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getServiceType <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Type</em>' attribute.
	 * @see it.csi.mddtools.servicedef.SrvTypeEnum
	 * @see #getServiceType()
	 * @generated
	 */
	void setServiceType(SrvTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Auth Level</b></em>' attribute.
	 * The default value is <code>"A0"</code>.
	 * The literals are from the enumeration {@link it.csi.mddtools.servicedef.AuthLevelEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auth Level</em>' attribute.
	 * @see it.csi.mddtools.servicedef.AuthLevelEnum
	 * @see #setAuthLevel(AuthLevelEnum)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_AuthLevel()
	 * @model default="A0"
	 * @generated
	 */
	AuthLevelEnum getAuthLevel();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getAuthLevel <em>Auth Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Level</em>' attribute.
	 * @see it.csi.mddtools.servicedef.AuthLevelEnum
	 * @see #getAuthLevel()
	 * @generated
	 */
	void setAuthLevel(AuthLevelEnum value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.servicedef.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Cod Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Prodotto</em>' attribute.
	 * @see #setCodProdotto(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_CodProdotto()
	 * @model
	 * @generated
	 */
	String getCodProdotto();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getCodProdotto <em>Cod Prodotto</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * [[ TODO - add documentation here ]]
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cod Componente</em>' attribute.
	 * @see #setCodComponente(String)
	 * @see it.csi.mddtools.servicedef.ServicedefPackage#getServiceDef_CodComponente()
	 * @model
	 * @generated
	 */
	String getCodComponente();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.servicedef.ServiceDef#getCodComponente <em>Cod Componente</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cod Componente</em>' attribute.
	 * @see #getCodComponente()
	 * @generated
	 */
	void setCodComponente(String value);

} // ServiceDef
