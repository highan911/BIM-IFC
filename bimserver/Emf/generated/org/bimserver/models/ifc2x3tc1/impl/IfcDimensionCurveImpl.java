/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcDimensionCurve;
import org.bimserver.models.ifc2x3tc1.IfcTerminatorSymbol;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Dimension Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcDimensionCurveImpl#getAnnotatedBySymbols <em>Annotated By Symbols</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDimensionCurveImpl extends IfcAnnotationCurveOccurrenceImpl implements IfcDimensionCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDimensionCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_DIMENSION_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcTerminatorSymbol> getAnnotatedBySymbols() {
		return (EList<IfcTerminatorSymbol>) eGet(Ifc2x3tc1Package.Literals.IFC_DIMENSION_CURVE__ANNOTATED_BY_SYMBOLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnnotatedBySymbols() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_DIMENSION_CURVE__ANNOTATED_BY_SYMBOLS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotatedBySymbols() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_DIMENSION_CURVE__ANNOTATED_BY_SYMBOLS);
	}

} //IfcDimensionCurveImpl
