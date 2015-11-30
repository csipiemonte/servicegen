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
package it.csi.mddtools.servicedef.impl;

import it.csi.mddtools.servicedef.ServicedefPackage;
import it.csi.mddtools.servicedef.ValueRangeConstraint;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ValueRangeConstraintImpl extends SimpleValueConstraintImpl implements ValueRangeConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueRangeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicedefPackage.Literals.VALUE_RANGE_CONSTRAINT;
	}

} //ValueRangeConstraintImpl
