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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.store.StorePackage
 * @generated
 */
public interface StoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoreFactory eINSTANCE = org.bimserver.models.store.impl.StoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Clash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clash</em>'.
	 * @generated
	 */
	Clash createClash();

	/**
	 * Returns a new object of class '<em>Eid Clash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eid Clash</em>'.
	 * @generated
	 */
	EidClash createEidClash();

	/**
	 * Returns a new object of class '<em>Guid Clash</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guid Clash</em>'.
	 * @generated
	 */
	GuidClash createGuidClash();

	/**
	 * Returns a new object of class '<em>Clash Detection Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clash Detection Settings</em>'.
	 * @generated
	 */
	ClashDetectionSettings createClashDetectionSettings();

	/**
	 * Returns a new object of class '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision</em>'.
	 * @generated
	 */
	Revision createRevision();

	/**
	 * Returns a new object of class '<em>Concrete Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Revision</em>'.
	 * @generated
	 */
	ConcreteRevision createConcreteRevision();

	/**
	 * Returns a new object of class '<em>Geo Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geo Tag</em>'.
	 * @generated
	 */
	GeoTag createGeoTag();

	/**
	 * Returns a new object of class '<em>Checkout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkout</em>'.
	 * @generated
	 */
	Checkout createCheckout();

	/**
	 * Returns a new object of class '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings</em>'.
	 * @generated
	 */
	Settings createSettings();

	/**
	 * Returns a new object of class '<em>Serializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serializer</em>'.
	 * @generated
	 */
	Serializer createSerializer();

	/**
	 * Returns a new object of class '<em>Object IDM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object IDM</em>'.
	 * @generated
	 */
	ObjectIDM createObjectIDM();

	/**
	 * Returns a new object of class '<em>Ifc Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ifc Engine</em>'.
	 * @generated
	 */
	IfcEngine createIfcEngine();

	/**
	 * Returns a new object of class '<em>Plugin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin</em>'.
	 * @generated
	 */
	Plugin createPlugin();

	/**
	 * Returns a new object of class '<em>Deserializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deserializer</em>'.
	 * @generated
	 */
	Deserializer createDeserializer();

	/**
	 * Returns a new object of class '<em>Checkin Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkin Result</em>'.
	 * @generated
	 */
	CheckinResult createCheckinResult();

	/**
	 * Returns a new object of class '<em>Download Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Download Result</em>'.
	 * @generated
	 */
	DownloadResult createDownloadResult();

	/**
	 * Returns a new object of class '<em>Checkout Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Checkout Result</em>'.
	 * @generated
	 */
	CheckoutResult createCheckoutResult();

	/**
	 * Returns a new object of class '<em>Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Value</em>'.
	 * @generated
	 */
	DataValue createDataValue();

	/**
	 * Returns a new object of class '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Object</em>'.
	 * @generated
	 */
	DataObject createDataObject();

	/**
	 * Returns a new object of class '<em>User Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Session</em>'.
	 * @generated
	 */
	UserSession createUserSession();

	/**
	 * Returns a new object of class '<em>Migration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Migration</em>'.
	 * @generated
	 */
	Migration createMigration();

	/**
	 * Returns a new object of class '<em>Reference Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Data Value</em>'.
	 * @generated
	 */
	ReferenceDataValue createReferenceDataValue();

	/**
	 * Returns a new object of class '<em>List Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Data Value</em>'.
	 * @generated
	 */
	ListDataValue createListDataValue();

	/**
	 * Returns a new object of class '<em>Simple Data Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Data Value</em>'.
	 * @generated
	 */
	SimpleDataValue createSimpleDataValue();

	/**
	 * Returns a new object of class '<em>Database Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Information Item</em>'.
	 * @generated
	 */
	DatabaseInformationItem createDatabaseInformationItem();

	/**
	 * Returns a new object of class '<em>Database Information Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Information Category</em>'.
	 * @generated
	 */
	DatabaseInformationCategory createDatabaseInformationCategory();

	/**
	 * Returns a new object of class '<em>Database Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Database Information</em>'.
	 * @generated
	 */
	DatabaseInformation createDatabaseInformation();

	/**
	 * Returns a new object of class '<em>Serializer Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serializer Plugin Descriptor</em>'.
	 * @generated
	 */
	SerializerPluginDescriptor createSerializerPluginDescriptor();

	/**
	 * Returns a new object of class '<em>Deserializer Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deserializer Plugin Descriptor</em>'.
	 * @generated
	 */
	DeserializerPluginDescriptor createDeserializerPluginDescriptor();

	/**
	 * Returns a new object of class '<em>Revision Summary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Summary Type</em>'.
	 * @generated
	 */
	RevisionSummaryType createRevisionSummaryType();

	/**
	 * Returns a new object of class '<em>Revision Summary Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Summary Container</em>'.
	 * @generated
	 */
	RevisionSummaryContainer createRevisionSummaryContainer();

	/**
	 * Returns a new object of class '<em>Revision Summary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision Summary</em>'.
	 * @generated
	 */
	RevisionSummary createRevisionSummary();

	/**
	 * Returns a new object of class '<em>Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plugin Descriptor</em>'.
	 * @generated
	 */
	PluginDescriptor createPluginDescriptor();

	/**
	 * Returns a new object of class '<em>Long Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Action</em>'.
	 * @generated
	 */
	LongAction createLongAction();

	/**
	 * Returns a new object of class '<em>Long Checkin Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Checkin Action</em>'.
	 * @generated
	 */
	LongCheckinAction createLongCheckinAction();

	/**
	 * Returns a new object of class '<em>Object IDM Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object IDM Plugin Descriptor</em>'.
	 * @generated
	 */
	ObjectIDMPluginDescriptor createObjectIDMPluginDescriptor();

	/**
	 * Returns a new object of class '<em>Compare Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Item</em>'.
	 * @generated
	 */
	CompareItem createCompareItem();

	/**
	 * Returns a new object of class '<em>Object Added</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Added</em>'.
	 * @generated
	 */
	ObjectAdded createObjectAdded();

	/**
	 * Returns a new object of class '<em>Object Removed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Removed</em>'.
	 * @generated
	 */
	ObjectRemoved createObjectRemoved();

	/**
	 * Returns a new object of class '<em>Object Modified</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Modified</em>'.
	 * @generated
	 */
	ObjectModified createObjectModified();

	/**
	 * Returns a new object of class '<em>Compare Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Container</em>'.
	 * @generated
	 */
	CompareContainer createCompareContainer();

	/**
	 * Returns a new object of class '<em>Compare Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare Result</em>'.
	 * @generated
	 */
	CompareResult createCompareResult();

	/**
	 * Returns a new object of class '<em>Long Action State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Long Action State</em>'.
	 * @generated
	 */
	LongActionState createLongActionState();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns a new object of class '<em>New Project Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Project Notification</em>'.
	 * @generated
	 */
	NewProjectNotification createNewProjectNotification();

	/**
	 * Returns a new object of class '<em>New Revision Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Revision Notification</em>'.
	 * @generated
	 */
	NewRevisionNotification createNewRevisionNotification();

	/**
	 * Returns a new object of class '<em>Compile Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compile Result</em>'.
	 * @generated
	 */
	CompileResult createCompileResult();

	/**
	 * Returns a new object of class '<em>Run Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Result</em>'.
	 * @generated
	 */
	RunResult createRunResult();

	/**
	 * Returns a new object of class '<em>Server Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server Info</em>'.
	 * @generated
	 */
	ServerInfo createServerInfo();

	/**
	 * Returns a new object of class '<em>Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Ifc Engine Plugin Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ifc Engine Plugin Descriptor</em>'.
	 * @generated
	 */
	IfcEnginePluginDescriptor createIfcEnginePluginDescriptor();

	/**
	 * Returns a new object of class '<em>Extended Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Data Schema</em>'.
	 * @generated
	 */
	ExtendedDataSchema createExtendedDataSchema();

	/**
	 * Returns a new object of class '<em>Extended Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Data</em>'.
	 * @generated
	 */
	ExtendedData createExtendedData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StorePackage getStorePackage();

} //StoreFactory
