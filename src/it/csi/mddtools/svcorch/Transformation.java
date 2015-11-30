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
package it.csi.mddtools.svcorch;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.csi.mddtools.svcorch.Transformation#getInput <em>Input</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Transformation#getOutput <em>Output</em>}</li>
 *   <li>{@link it.csi.mddtools.svcorch.Transformation#isInitOutSlot <em>Init Out Slot</em>}</li>
 * </ul>
 *
 * @see it.csi.mddtools.svcorch.SvcorchPackage#getTransformation()
 * @model abstract="true"
 * @generated
 */
public interface Transformation extends OpNode {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link it.csi.mddtools.svcorch.DataSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getTransformation_Input()
	 * @model
	 * @generated
	 */
	EList<DataSlot> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(DataSlot)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getTransformation_Output()
	 * @model
	 * @generated
	 */
	DataSlot getOutput();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Transformation#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(DataSlot value);

	/**
	 * Returns the value of the '<em><b>Init Out Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Out Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Out Slot</em>' attribute.
	 * @see #setInitOutSlot(boolean)
	 * @see it.csi.mddtools.svcorch.SvcorchPackage#getTransformation_InitOutSlot()
	 * @model
	 * @generated
	 */
	boolean isInitOutSlot();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.svcorch.Transformation#isInitOutSlot <em>Init Out Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Out Slot</em>' attribute.
	 * @see #isInitOutSlot()
	 * @generated
	 */
	void setInitOutSlot(boolean value);

} // Transformation
