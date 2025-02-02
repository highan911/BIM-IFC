package org.bimserver.database.actions;

/******************************************************************************
 * Copyright (C) 2009-2012  BIMserver.org
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
 *****************************************************************************/

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.bimserver.BimServer;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.IfcModelSet;
import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.ConcreteRevision;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.User;
import org.bimserver.plugins.objectidms.ObjectIDM;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.exceptions.UserException;
import org.eclipse.emf.ecore.EClass;

public class DownloadByTypesDatabaseAction extends BimDatabaseAction<IfcModelInterface> {

	private final Set<String> classNames;
	private final Set<Long> roids;
	private final long actingUoid;
	private int progress;
	private final BimServer bimServer;
	private final ObjectIDM objectIDM;
	private final boolean includeAllSubtypes;

	public DownloadByTypesDatabaseAction(BimServer bimServer, DatabaseSession databaseSession, AccessMethod accessMethod, Set<Long> roids, Set<String> classNames, boolean includeAllSubtypes, long actingUoid, ObjectIDM objectIDM) {
		super(databaseSession, accessMethod);
		this.bimServer = bimServer;
		this.roids = roids;
		this.includeAllSubtypes = includeAllSubtypes;
		this.actingUoid = actingUoid;
		this.classNames = classNames;
		this.objectIDM = objectIDM;
	}

	@Override
	public IfcModelInterface execute() throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		IfcModelSet ifcModelSet = new IfcModelSet();
		User user = getUserByUoid(actingUoid);
		Project project = null;
		Set<EClass> eClasses = new HashSet<EClass>();
//		eClasses.add(getDatabaseSession().getEClassForName("IfcProject"));
//		eClasses.add(getDatabaseSession().getEClassForName("IfcUnitAssignment"));
//		eClasses.add(getDatabaseSession().getEClassForName("IfcSIUnit"));
		for (String className : classNames) {
			eClasses.add(getDatabaseSession().getEClassForName(className));
			if (includeAllSubtypes) {
				eClasses.addAll(bimServer.getDatabase().getMetaDataManager().getAllSubClasses((EClass)Ifc2x3tc1Package.eINSTANCE.getEClassifier(className)));
			}
		}
		String name = "";
		for (Long roid : roids) {
			Revision virtualRevision = getVirtualRevision(roid);
			project = virtualRevision.getProject();
			name += project.getName() + "-" + virtualRevision.getId() + "-";
			if (!RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, project)) {
				throw new UserException("User has insufficient rights to download revisions from this project");
			}
			if (!RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, project)) {
				throw new UserException("User has insufficient rights to download revisions from this project");
			}
			for (ConcreteRevision concreteRevision : virtualRevision.getConcreteRevisions()) {
				IfcModel subModel = getDatabaseSession().getAllOfTypes(eClasses, concreteRevision.getProject().getId(), concreteRevision.getId(), true, objectIDM);
				subModel.setDate(concreteRevision.getDate());
				ifcModelSet.add(subModel);
			}
			IfcModelInterface ifcModel = bimServer.getMergerFactory().createMerger().merge(project, ifcModelSet, bimServer.getSettingsManager().getSettings().getIntelligentMerging());
			ifcModel.setName("Unknown");
			ifcModel.setRevisionNr(project.getRevisions().indexOf(virtualRevision) + 1);
			ifcModel.setAuthorizedUser(getUserByUoid(actingUoid).getName());
			ifcModel.setDate(virtualRevision.getDate());
		}
		IfcModelInterface ifcModel = bimServer.getMergerFactory().createMerger().merge(project, ifcModelSet, bimServer.getSettingsManager().getSettings().getIntelligentMerging());
		if (name.endsWith("-")) {
			name = name.substring(0, name.length()-1);
		}
		ifcModel.setName(name);
		ifcModel.setRevisionNr(1);
		ifcModel.setAuthorizedUser(getUserByUoid(actingUoid).getName());
		ifcModel.setDate(new Date());
		return ifcModel;
	}
	
	public int getProgress() {
		return progress;
	}
}