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
import org.bimserver.models.ifc2x3tc1.IfcPropertySingleValue;
import org.bimserver.models.ifc2x3tc1.IfcUnit;
import org.bimserver.models.ifc2x3tc1.IfcValue;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Single Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcPropertySingleValueImpl#getNominalValue <em>Nominal Value</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcPropertySingleValueImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertySingleValueImpl extends IfcSimplePropertyImpl implements IfcPropertySingleValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertySingleValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_PROPERTY_SINGLE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcValue getNominalValue() {
		return (IfcValue) eGet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalValue(IfcValue newNominalValue) {
		eSet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE, newNominalValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalValue() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalValue() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_SINGLE_VALUE__NOMINAL_VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnit getUnit() {
		return (IfcUnit) eGet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_SINGLE_VALUE__UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(IfcUnit newUnit) {
		eSet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_SINGLE_VALUE__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_PROPERTY_SINGLE_VALUE__UNIT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_PROPERTY_SINGLE_VALUE__UNIT);
	}

} //IfcPropertySingleValueImpl
