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
package org.bimserver.models.store;

import org.bimserver.emf.IdEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clash Detection Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.store.ClashDetectionSettings#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.bimserver.models.store.ClashDetectionSettings#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.bimserver.models.store.ClashDetectionSettings#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.bimserver.models.store.ClashDetectionSettings#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bimserver.models.store.ClashDetectionSettings#getIgnoredClasses <em>Ignored Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.store.StorePackage#getClashDetectionSettings()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface ClashDetectionSettings extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(Boolean)
	 * @see org.bimserver.models.store.StorePackage#getClashDetectionSettings_Enabled()
	 * @model
	 * @generated
	 */
	Boolean getEnabled();

	/**
	 * Sets the value of the '{@link org.bimserver.models.store.ClashDetectionSettings#getEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #getEnabled()
	 * @generated
	 */
	void setEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.store.Project}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.store.Project#getClashDetectionSettings <em>Clash Detection Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see org.bimserver.models.store.StorePackage#getClashDetectionSettings_Projects()
	 * @see org.bimserver.models.store.Project#getClashDetectionSettings
	 * @model opposite="clashDetectionSettings"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' attribute.
	 * @see #setMargin(Double)
	 * @see org.bimserver.models.store.StorePackage#getClashDetectionSettings_Margin()
	 * @model
	 * @generated
	 */
	Double getMargin();

	/**
	 * Sets the value of the '{@link org.bimserver.models.store.ClashDetectionSettings#getMargin <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' attribute.
	 * @see #getMargin()
	 * @generated
	 */
	void setMargin(Double value);

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.store.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' reference list.
	 * @see org.bimserver.models.store.StorePackage#getClashDetectionSettings_Revisions()
	 * @model
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Ignored Classes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignored Classes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignored Classes</em>' attribute list.
	 * @see org.bimserver.models.store.StorePackage#getClashDetectionSettings_IgnoredClasses()
	 * @model
	 * @generated
	 */
	EList<String> getIgnoredClasses();

} // ClashDetectionSettings
