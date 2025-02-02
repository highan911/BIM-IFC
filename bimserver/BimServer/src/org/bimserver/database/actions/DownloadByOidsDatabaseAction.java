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
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import org.bimserver.BimServer;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.ifc.IfcModel;
import org.bimserver.ifc.IfcModelChangeListener;
import org.bimserver.ifc.IfcModelSet;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.ConcreteRevision;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.User;
import org.bimserver.plugins.objectidms.ObjectIDM;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.exceptions.UserException;

public class DownloadByOidsDatabaseAction extends BimDatabaseAction<IfcModelInterface> {

	private final long actingUoid;
	private final Set<Long> oids;
	private final Set<Long> roids;
	private int progress;
	private final BimServer bimServer;
	private final ObjectIDM objectIDM;

	public DownloadByOidsDatabaseAction(BimServer bimServer, DatabaseSession databaseSession, AccessMethod accessMethod, Set<Long> roids, Set<Long> oids, long actingUoid, ObjectIDM objectIDM) {
		super(databaseSession, accessMethod);
		this.bimServer = bimServer;
		this.roids = roids;
		this.oids = oids;
		this.actingUoid = actingUoid;
		this.objectIDM = objectIDM;
	}

	@Override
	public IfcModelInterface execute() throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		User user = getUserByUoid(actingUoid);
		IfcModelSet ifcModelSet = new IfcModelSet();
		Project project = null;
		long incrSize = 0L;
		for (Long roid : roids) {
			Revision virtualRevision = getVirtualRevision(roid);
			project = virtualRevision.getProject();
			if (!RightsManager.hasRightsOnProjectOrSuperProjectsOrSubProjects(user, project)) {
				throw new UserException("User has insufficient rights to download revisions from this project");
			}
			incrSize += virtualRevision.getConcreteRevisions().size();
			final long totalSize = incrSize;
			final AtomicLong total = new AtomicLong();
			for (ConcreteRevision concreteRevision : virtualRevision.getConcreteRevisions()) {
				IfcModel subModel = new IfcModel();
				subModel.addChangeListener(new IfcModelChangeListener() {
					@Override
					public void objectAdded() {
						total.incrementAndGet();
						progress = Math.round(100L * total.get() / totalSize);
					}
				});
				getDatabaseSession().getMapWithOids(subModel, concreteRevision.getProject().getId(), concreteRevision.getId(), oids, true, objectIDM);
				subModel.setDate(concreteRevision.getDate());
				ifcModelSet.add(subModel);
				// for (Long oid : oids) {
				// IfcModel subModel =
				// databaseSession.getMapWithOids(concreteRevision.getProject().getId(),
				// concreteRevision.getId(), oid);
				// subModel.setDate(concreteRevision.getDate());
				// ifcModels.add(subModel);
				// }
			}
		}
		IfcModelInterface ifcModel = bimServer.getMergerFactory().createMerger().merge(project, ifcModelSet, bimServer.getSettingsManager().getSettings().getIntelligentMerging());
		ifcModel.setName("query");
		ifcModel.setRevisionNr(1);
		ifcModel.setAuthorizedUser(getUserByUoid(actingUoid).getName());
		ifcModel.setDate(new Date());
		return ifcModel;
	}
	
	public int getProgress() {
		return progress;
	}
}