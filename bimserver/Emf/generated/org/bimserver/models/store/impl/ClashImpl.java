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
package org.bimserver.models.store.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.store.Clash;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.StorePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clash</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.store.impl.ClashImpl#getName1 <em>Name1</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ClashImpl#getName2 <em>Name2</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ClashImpl#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ClashImpl#getType2 <em>Type2</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ClashImpl#getRevision1 <em>Revision1</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ClashImpl#getRevision2 <em>Revision2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClashImpl extends IdEObjectImpl implements Clash {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClashImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.CLASH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName1() {
		return (String) eGet(StorePackage.Literals.CLASH__NAME1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName1(String newName1) {
		eSet(StorePackage.Literals.CLASH__NAME1, newName1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName2() {
		return (String) eGet(StorePackage.Literals.CLASH__NAME2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName2(String newName2) {
		eSet(StorePackage.Literals.CLASH__NAME2, newName2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType1() {
		return (String) eGet(StorePackage.Literals.CLASH__TYPE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType1(String newType1) {
		eSet(StorePackage.Literals.CLASH__TYPE1, newType1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType2() {
		return (String) eGet(StorePackage.Literals.CLASH__TYPE2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType2(String newType2) {
		eSet(StorePackage.Literals.CLASH__TYPE2, newType2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getRevision1() {
		return (Revision) eGet(StorePackage.Literals.CLASH__REVISION1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision1(Revision newRevision1) {
		eSet(StorePackage.Literals.CLASH__REVISION1, newRevision1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getRevision2() {
		return (Revision) eGet(StorePackage.Literals.CLASH__REVISION2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision2(Revision newRevision2) {
		eSet(StorePackage.Literals.CLASH__REVISION2, newRevision2);
	}

} //ClashImpl
