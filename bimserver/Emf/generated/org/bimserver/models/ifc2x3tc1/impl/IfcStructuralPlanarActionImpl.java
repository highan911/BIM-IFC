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
import org.bimserver.models.ifc2x3tc1.IfcProjectedOrTrueLengthEnum;
import org.bimserver.models.ifc2x3tc1.IfcStructuralPlanarAction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Planar Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcStructuralPlanarActionImpl#getProjectedOrTrue <em>Projected Or True</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralPlanarActionImpl extends IfcStructuralActionImpl implements IfcStructuralPlanarAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralPlanarActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_STRUCTURAL_PLANAR_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProjectedOrTrueLengthEnum getProjectedOrTrue() {
		return (IfcProjectedOrTrueLengthEnum) eGet(Ifc2x3tc1Package.Literals.IFC_STRUCTURAL_PLANAR_ACTION__PROJECTED_OR_TRUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectedOrTrue(IfcProjectedOrTrueLengthEnum newProjectedOrTrue) {
		eSet(Ifc2x3tc1Package.Literals.IFC_STRUCTURAL_PLANAR_ACTION__PROJECTED_OR_TRUE, newProjectedOrTrue);
	}

} //IfcStructuralPlanarActionImpl
