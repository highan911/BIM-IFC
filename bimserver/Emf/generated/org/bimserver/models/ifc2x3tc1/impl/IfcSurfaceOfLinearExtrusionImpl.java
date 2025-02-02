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
import org.bimserver.models.ifc2x3tc1.IfcDirection;
import org.bimserver.models.ifc2x3tc1.IfcSurfaceOfLinearExtrusion;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Of Linear Extrusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSurfaceOfLinearExtrusionImpl#getExtrudedDirection <em>Extruded Direction</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSurfaceOfLinearExtrusionImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcSurfaceOfLinearExtrusionImpl#getDepthAsString <em>Depth As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceOfLinearExtrusionImpl extends IfcSweptSurfaceImpl implements IfcSurfaceOfLinearExtrusion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceOfLinearExtrusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_SURFACE_OF_LINEAR_EXTRUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getExtrudedDirection() {
		return (IfcDirection) eGet(Ifc2x3tc1Package.Literals.IFC_SURFACE_OF_LINEAR_EXTRUSION__EXTRUDED_DIRECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrudedDirection(IfcDirection newExtrudedDirection) {
		eSet(Ifc2x3tc1Package.Literals.IFC_SURFACE_OF_LINEAR_EXTRUSION__EXTRUDED_DIRECTION, newExtrudedDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepth() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_SURFACE_OF_LINEAR_EXTRUSION__DEPTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(double newDepth) {
		eSet(Ifc2x3tc1Package.Literals.IFC_SURFACE_OF_LINEAR_EXTRUSION__DEPTH, newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepthAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_SURFACE_OF_LINEAR_EXTRUSION__DEPTH_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepthAsString(String newDepthAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_SURFACE_OF_LINEAR_EXTRUSION__DEPTH_AS_STRING, newDepthAsString);
	}

} //IfcSurfaceOfLinearExtrusionImpl
