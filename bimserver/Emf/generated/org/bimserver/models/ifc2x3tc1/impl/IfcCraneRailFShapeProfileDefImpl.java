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
import org.bimserver.models.ifc2x3tc1.IfcCraneRailFShapeProfileDef;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Crane Rail FShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getOverallHeight <em>Overall Height</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getOverallHeightAsString <em>Overall Height As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getHeadWidth <em>Head Width</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getHeadWidthAsString <em>Head Width As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getRadiusAsString <em>Radius As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getHeadDepth2 <em>Head Depth2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getHeadDepth2AsString <em>Head Depth2 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getHeadDepth3 <em>Head Depth3</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getHeadDepth3AsString <em>Head Depth3 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getWebThicknessAsString <em>Web Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getBaseDepth1 <em>Base Depth1</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getBaseDepth1AsString <em>Base Depth1 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getBaseDepth2 <em>Base Depth2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getBaseDepth2AsString <em>Base Depth2 As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCraneRailFShapeProfileDefImpl#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCraneRailFShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcCraneRailFShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCraneRailFShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverallHeight() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__OVERALL_HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeight(double newOverallHeight) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__OVERALL_HEIGHT, newOverallHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverallHeightAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__OVERALL_HEIGHT_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallHeightAsString(String newOverallHeightAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__OVERALL_HEIGHT_AS_STRING, newOverallHeightAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeadWidth() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadWidth(double newHeadWidth) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_WIDTH, newHeadWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeadWidthAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_WIDTH_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadWidthAsString(String newHeadWidthAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_WIDTH_AS_STRING, newHeadWidthAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS, newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadius() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadius() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRadiusAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadiusAsString(String newRadiusAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS_AS_STRING, newRadiusAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadiusAsString() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadiusAsString() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__RADIUS_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeadDepth2() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth2(double newHeadDepth2) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH2, newHeadDepth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeadDepth2AsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH2_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth2AsString(String newHeadDepth2AsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH2_AS_STRING, newHeadDepth2AsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeadDepth3() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH3, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth3(double newHeadDepth3) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH3, newHeadDepth3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeadDepth3AsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH3_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadDepth3AsString(String newHeadDepth3AsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__HEAD_DEPTH3_AS_STRING, newHeadDepth3AsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWebThickness() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__WEB_THICKNESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(double newWebThickness) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__WEB_THICKNESS, newWebThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebThicknessAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThicknessAsString(String newWebThicknessAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING, newWebThicknessAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBaseDepth1() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth1(double newBaseDepth1) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH1, newBaseDepth1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseDepth1AsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH1_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth1AsString(String newBaseDepth1AsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH1_AS_STRING, newBaseDepth1AsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBaseDepth2() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth2(double newBaseDepth2) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH2, newBaseDepth2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseDepth2AsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH2_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseDepth2AsString(String newBaseDepth2AsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__BASE_DEPTH2_AS_STRING, newBaseDepth2AsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCentreOfGravityInY() {
		return (Double) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(double newCentreOfGravityInY) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, newCentreOfGravityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCentreOfGravityInYAsString() {
		return (String) eGet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInYAsString(String newCentreOfGravityInYAsString) {
		eSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, newCentreOfGravityInYAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInYAsString() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInYAsString() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_CRANE_RAIL_FSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING);
	}

} //IfcCraneRailFShapeProfileDefImpl
