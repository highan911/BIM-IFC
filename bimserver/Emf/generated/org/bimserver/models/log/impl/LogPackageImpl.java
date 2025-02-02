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
package org.bimserver.models.log.impl;

import java.io.IOException;

import java.net.URL;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;

import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1PackageImpl;

import org.bimserver.models.log.LogFactory;
import org.bimserver.models.log.LogPackage;

import org.bimserver.models.store.StorePackage;

import org.bimserver.models.store.impl.StorePackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogPackageImpl extends EPackageImpl implements LogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "log.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newUserAddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newProjectAddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionBranchedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newRevisionAddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newCheckoutAddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingsSavedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAddedToProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newObjectIDMUploadedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRemovedFromProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectDeletedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDeletedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseCreatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverStartedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectUpdatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userUndeletedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectUndeletedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionUpdatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoTagUpdatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clashDetectionSettingsUpdatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordChangedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userChangedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessMethodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.bimserver.models.log.LogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogPackageImpl() {
		super(eNS_URI, LogFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static LogPackage init() {
		if (isInited)
			return (LogPackage) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI);

		// Obtain or create and register package
		LogPackageImpl theLogPackage = (LogPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
				: new LogPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StorePackageImpl theStorePackage = (StorePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI) instanceof StorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StorePackage.eNS_URI) : StorePackage.eINSTANCE);
		Ifc2x3tc1PackageImpl theIfc2x3tc1Package = (Ifc2x3tc1PackageImpl) (EPackage.Registry.INSTANCE.getEPackage(Ifc2x3tc1Package.eNS_URI) instanceof Ifc2x3tc1PackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Ifc2x3tc1Package.eNS_URI) : Ifc2x3tc1Package.eINSTANCE);

		// Load packages
		theLogPackage.loadPackage();
		theStorePackage.loadPackage();
		theIfc2x3tc1Package.loadPackage();

		// Fix loaded packages
		theLogPackage.fixPackageContents();
		theStorePackage.fixPackageContents();
		theIfc2x3tc1Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogPackage.eNS_URI, theLogPackage);
		return theLogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogAction() {
		if (logActionEClass == null) {
			logActionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(1);
		}
		return logActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogAction_Date() {
		return (EAttribute) getLogAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogAction_Executor() {
		return (EReference) getLogAction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogAction_AccessMethod() {
		return (EAttribute) getLogAction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerLog() {
		if (serverLogEClass == null) {
			serverLogEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(2);
		}
		return serverLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServerLog_Actions() {
		return (EReference) getServerLog().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewUserAdded() {
		if (newUserAddedEClass == null) {
			newUserAddedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(3);
		}
		return newUserAddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewUserAdded_User() {
		return (EReference) getNewUserAdded().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewProjectAdded() {
		if (newProjectAddedEClass == null) {
			newProjectAddedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(4);
		}
		return newProjectAddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewProjectAdded_Project() {
		return (EReference) getNewProjectAdded().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewProjectAdded_ParentProject() {
		return (EReference) getNewProjectAdded().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevisionBranched() {
		if (revisionBranchedEClass == null) {
			revisionBranchedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(5);
		}
		return revisionBranchedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionBranched_Oldrevision() {
		return (EReference) getRevisionBranched().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionBranched_Newrevision() {
		return (EReference) getRevisionBranched().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewRevisionAdded() {
		if (newRevisionAddedEClass == null) {
			newRevisionAddedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(6);
		}
		return newRevisionAddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewRevisionAdded_Revision() {
		return (EReference) getNewRevisionAdded().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewCheckoutAdded() {
		if (newCheckoutAddedEClass == null) {
			newCheckoutAddedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(7);
		}
		return newCheckoutAddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewCheckoutAdded_Checkout() {
		return (EReference) getNewCheckoutAdded().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettingsSaved() {
		if (settingsSavedEClass == null) {
			settingsSavedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(8);
		}
		return settingsSavedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserAddedToProject() {
		if (userAddedToProjectEClass == null) {
			userAddedToProjectEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(9);
		}
		return userAddedToProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserAddedToProject_User() {
		return (EReference) getUserAddedToProject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserAddedToProject_Project() {
		return (EReference) getUserAddedToProject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewObjectIDMUploaded() {
		if (newObjectIDMUploadedEClass == null) {
			newObjectIDMUploadedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(10);
		}
		return newObjectIDMUploadedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDownload() {
		if (downloadEClass == null) {
			downloadEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(11);
		}
		return downloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRemovedFromProject() {
		if (userRemovedFromProjectEClass == null) {
			userRemovedFromProjectEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(12);
		}
		return userRemovedFromProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserRemovedFromProject_User() {
		return (EReference) getUserRemovedFromProject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserRemovedFromProject_Project() {
		return (EReference) getUserRemovedFromProject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectDeleted() {
		if (projectDeletedEClass == null) {
			projectDeletedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(13);
		}
		return projectDeletedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectDeleted_Project() {
		return (EReference) getProjectDeleted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDeleted() {
		if (userDeletedEClass == null) {
			userDeletedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(14);
		}
		return userDeletedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserDeleted_User() {
		return (EReference) getUserDeleted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPasswordReset() {
		if (passwordResetEClass == null) {
			passwordResetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(15);
		}
		return passwordResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPasswordReset_User() {
		return (EReference) getPasswordReset().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseCreated() {
		if (databaseCreatedEClass == null) {
			databaseCreatedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(16);
		}
		return databaseCreatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseCreated_Path() {
		return (EAttribute) getDatabaseCreated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseCreated_Version() {
		return (EAttribute) getDatabaseCreated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServerStarted() {
		if (serverStartedEClass == null) {
			serverStartedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(17);
		}
		return serverStartedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectUpdated() {
		if (projectUpdatedEClass == null) {
			projectUpdatedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(18);
		}
		return projectUpdatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectUpdated_Project() {
		return (EReference) getProjectUpdated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserUndeleted() {
		if (userUndeletedEClass == null) {
			userUndeletedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(19);
		}
		return userUndeletedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserUndeleted_User() {
		return (EReference) getUserUndeleted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectUndeleted() {
		if (projectUndeletedEClass == null) {
			projectUndeletedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(20);
		}
		return projectUndeletedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectUndeleted_Project() {
		return (EReference) getProjectUndeleted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevisionUpdated() {
		if (revisionUpdatedEClass == null) {
			revisionUpdatedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(21);
		}
		return revisionUpdatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionUpdated_Revision() {
		return (EReference) getRevisionUpdated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeoTagUpdated() {
		if (geoTagUpdatedEClass == null) {
			geoTagUpdatedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(22);
		}
		return geoTagUpdatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeoTagUpdated_GeoTag() {
		return (EReference) getGeoTagUpdated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClashDetectionSettingsUpdated() {
		if (clashDetectionSettingsUpdatedEClass == null) {
			clashDetectionSettingsUpdatedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(23);
		}
		return clashDetectionSettingsUpdatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClashDetectionSettingsUpdated_ClashDetectionSettings() {
		return (EReference) getClashDetectionSettingsUpdated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPasswordChanged() {
		if (passwordChangedEClass == null) {
			passwordChangedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(24);
		}
		return passwordChangedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPasswordChanged_User() {
		return (EReference) getPasswordChanged().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserChanged() {
		if (userChangedEClass == null) {
			userChangedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(25);
		}
		return userChangedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserChanged_User() {
		return (EReference) getUserChanged().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessMethod() {
		if (accessMethodEEnum == null) {
			accessMethodEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI).getEClassifiers().get(0);
		}
		return accessMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogFactory getLogFactory() {
		return (LogFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.bimserver.models.log." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //LogPackageImpl
