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

import java.util.Date;

import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.models.store.ExtendedData;
import org.bimserver.models.store.ExtendedDataSchema;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedDataImpl extends IdEObjectImpl implements ExtendedData {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.EXTENDED_DATA;
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
	public String getUrl() {
		return (String) eGet(StorePackage.Literals.EXTENDED_DATA__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eSet(StorePackage.Literals.EXTENDED_DATA__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return (byte[]) eGet(StorePackage.Literals.EXTENDED_DATA__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		eSet(StorePackage.Literals.EXTENDED_DATA__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String) eGet(StorePackage.Literals.EXTENDED_DATA__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(StorePackage.Literals.EXTENDED_DATA__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAdded() {
		return (Date) eGet(StorePackage.Literals.EXTENDED_DATA__ADDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdded(Date newAdded) {
		eSet(StorePackage.Literals.EXTENDED_DATA__ADDED, newAdded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUser() {
		return (User) eGet(StorePackage.Literals.EXTENDED_DATA__USER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(User newUser) {
		eSet(StorePackage.Literals.EXTENDED_DATA__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchema getSchema() {
		return (ExtendedDataSchema) eGet(StorePackage.Literals.EXTENDED_DATA__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(ExtendedDataSchema newSchema) {
		eSet(StorePackage.Literals.EXTENDED_DATA__SCHEMA, newSchema);
	}

} //ExtendedDataImpl
