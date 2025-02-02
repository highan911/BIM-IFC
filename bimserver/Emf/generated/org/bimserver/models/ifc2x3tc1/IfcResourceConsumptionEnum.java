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
package org.bimserver.models.ifc2x3tc1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ifc Resource Consumption Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcResourceConsumptionEnum()
 * @model
 * @generated
 */
public enum IfcResourceConsumptionEnum implements Enumerator {
	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(0, "NULL", "NULL"),

	/**
	 * The '<em><b>CONSUMED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSUMED_VALUE
	 * @generated
	 * @ordered
	 */
	CONSUMED(1, "CONSUMED", "CONSUMED"),

	/**
	 * The '<em><b>NOTCONSUMED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTCONSUMED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTCONSUMED(2, "NOTCONSUMED", "NOTCONSUMED"),

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTDEFINED(3, "NOTDEFINED", "NOTDEFINED"),

	/**
	 * The '<em><b>PARTIALLYCONSUMED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYCONSUMED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLYCONSUMED(4, "PARTIALLYCONSUMED", "PARTIALLYCONSUMED"),

	/**
	 * The '<em><b>OCCUPIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPIED_VALUE
	 * @generated
	 * @ordered
	 */
	OCCUPIED(5, "OCCUPIED", "OCCUPIED"),

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	USERDEFINED(6, "USERDEFINED", "USERDEFINED"),

	/**
	 * The '<em><b>NOTOCCUPIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTOCCUPIED_VALUE
	 * @generated
	 * @ordered
	 */
	NOTOCCUPIED(7, "NOTOCCUPIED", "NOTOCCUPIED"),

	/**
	 * The '<em><b>PARTIALLYOCCUPIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYOCCUPIED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLYOCCUPIED(8, "PARTIALLYOCCUPIED", "PARTIALLYOCCUPIED");

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 0;

	/**
	 * The '<em><b>CONSUMED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSUMED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSUMED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSUMED_VALUE = 1;

	/**
	 * The '<em><b>NOTCONSUMED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTCONSUMED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTCONSUMED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTCONSUMED_VALUE = 2;

	/**
	 * The '<em><b>NOTDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTDEFINED_VALUE = 3;

	/**
	 * The '<em><b>PARTIALLYCONSUMED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTIALLYCONSUMED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYCONSUMED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLYCONSUMED_VALUE = 4;

	/**
	 * The '<em><b>OCCUPIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCCUPIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCUPIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCCUPIED_VALUE = 5;

	/**
	 * The '<em><b>USERDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USERDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USERDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USERDEFINED_VALUE = 6;

	/**
	 * The '<em><b>NOTOCCUPIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTOCCUPIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTOCCUPIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOTOCCUPIED_VALUE = 7;

	/**
	 * The '<em><b>PARTIALLYOCCUPIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARTIALLYOCCUPIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTIALLYOCCUPIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLYOCCUPIED_VALUE = 8;

	/**
	 * An array of all the '<em><b>Ifc Resource Consumption Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IfcResourceConsumptionEnum[] VALUES_ARRAY = new IfcResourceConsumptionEnum[] { NULL, CONSUMED, NOTCONSUMED, NOTDEFINED, PARTIALLYCONSUMED, OCCUPIED,
			USERDEFINED, NOTOCCUPIED, PARTIALLYOCCUPIED, };

	/**
	 * A public read-only list of all the '<em><b>Ifc Resource Consumption Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IfcResourceConsumptionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ifc Resource Consumption Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcResourceConsumptionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcResourceConsumptionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Resource Consumption Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcResourceConsumptionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IfcResourceConsumptionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ifc Resource Consumption Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IfcResourceConsumptionEnum get(int value) {
		switch (value) {
		case NULL_VALUE:
			return NULL;
		case CONSUMED_VALUE:
			return CONSUMED;
		case NOTCONSUMED_VALUE:
			return NOTCONSUMED;
		case NOTDEFINED_VALUE:
			return NOTDEFINED;
		case PARTIALLYCONSUMED_VALUE:
			return PARTIALLYCONSUMED;
		case OCCUPIED_VALUE:
			return OCCUPIED;
		case USERDEFINED_VALUE:
			return USERDEFINED;
		case NOTOCCUPIED_VALUE:
			return NOTOCCUPIED;
		case PARTIALLYOCCUPIED_VALUE:
			return PARTIALLYOCCUPIED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IfcResourceConsumptionEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //IfcResourceConsumptionEnum
