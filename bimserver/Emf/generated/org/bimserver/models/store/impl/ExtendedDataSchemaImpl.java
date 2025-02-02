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
import org.bimserver.models.store.ExtendedData;
import org.bimserver.models.store.ExtendedDataSchema;
import org.bimserver.models.store.ExtendedDataSchemaType;
import org.bimserver.models.store.Settings;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Data Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataSchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataSchemaImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataSchemaImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataSchemaImpl#isValidate <em>Validate</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataSchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataSchemaImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataSchemaImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ExtendedDataSchemaImpl#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedDataSchemaImpl extends IdEObjectImpl implements ExtendedDataSchema {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedDataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.EXTENDED_DATA_SCHEMA;
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
	public String getName() {
		return (String) eGet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String) eGet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eSet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return (byte[]) eGet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		eSet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValidate() {
		return (Boolean) eGet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__VALIDATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidate(boolean newValidate) {
		eSet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__VALIDATE, newValidate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedDataSchemaType getType() {
		return (ExtendedDataSchemaType) eGet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ExtendedDataSchemaType newType) {
		eSet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settings getSettings() {
		return (Settings) eGet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__SETTINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(Settings newSettings) {
		eSet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__SETTINGS, newSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getUsers() {
		return (EList<User>) eGet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__USERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtendedData> getExtendedData() {
		return (EList<ExtendedData>) eGet(StorePackage.Literals.EXTENDED_DATA_SCHEMA__EXTENDED_DATA, true);
	}

} //ExtendedDataSchemaImpl
