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
import org.bimserver.models.store.ObjectState;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.bimserver.models.store.UserType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getHasRightsOn <em>Has Rights On</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getState <em>State</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getUserType <em>User Type</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getLastSeen <em>Last Seen</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getValidationToken <em>Validation Token</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getValidationTokenCreated <em>Validation Token Created</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getNotificationUrl <em>Notification Url</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.UserImpl#getExtendedData <em>Extended Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends IdEObjectImpl implements User {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.USER;
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
		return (String) eGet(StorePackage.Literals.USER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(StorePackage.Literals.USER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return (String) eGet(StorePackage.Literals.USER__PASSWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		eSet(StorePackage.Literals.USER__PASSWORD, newPassword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Project> getHasRightsOn() {
		return (EList<Project>) eGet(StorePackage.Literals.USER__HAS_RIGHTS_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Revision> getRevisions() {
		return (EList<Revision>) eGet(StorePackage.Literals.USER__REVISIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectState getState() {
		return (ObjectState) eGet(StorePackage.Literals.USER__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ObjectState newState) {
		eSet(StorePackage.Literals.USER__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedOn() {
		return (Date) eGet(StorePackage.Literals.USER__CREATED_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedOn(Date newCreatedOn) {
		eSet(StorePackage.Literals.USER__CREATED_ON, newCreatedOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getCreatedBy() {
		return (User) eGet(StorePackage.Literals.USER__CREATED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(User newCreatedBy) {
		eSet(StorePackage.Literals.USER__CREATED_BY, newCreatedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType getUserType() {
		return (UserType) eGet(StorePackage.Literals.USER__USER_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserType(UserType newUserType) {
		eSet(StorePackage.Literals.USER__USER_TYPE, newUserType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return (String) eGet(StorePackage.Literals.USER__USERNAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		eSet(StorePackage.Literals.USER__USERNAME, newUsername);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastSeen() {
		return (Date) eGet(StorePackage.Literals.USER__LAST_SEEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSeen(Date newLastSeen) {
		eSet(StorePackage.Literals.USER__LAST_SEEN, newLastSeen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValidationToken() {
		return (String) eGet(StorePackage.Literals.USER__VALIDATION_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationToken(String newValidationToken) {
		eSet(StorePackage.Literals.USER__VALIDATION_TOKEN, newValidationToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidationTokenCreated() {
		return (Date) eGet(StorePackage.Literals.USER__VALIDATION_TOKEN_CREATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationTokenCreated(Date newValidationTokenCreated) {
		eSet(StorePackage.Literals.USER__VALIDATION_TOKEN_CREATED, newValidationTokenCreated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotificationUrl() {
		return (String) eGet(StorePackage.Literals.USER__NOTIFICATION_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationUrl(String newNotificationUrl) {
		eSet(StorePackage.Literals.USER__NOTIFICATION_URL, newNotificationUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtendedDataSchema> getSchemas() {
		return (EList<ExtendedDataSchema>) eGet(StorePackage.Literals.USER__SCHEMAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ExtendedData> getExtendedData() {
		return (EList<ExtendedData>) eGet(StorePackage.Literals.USER__EXTENDED_DATA, true);
	}

} //UserImpl
