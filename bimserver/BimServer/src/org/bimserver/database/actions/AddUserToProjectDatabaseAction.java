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

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.log.LogFactory;
import org.bimserver.models.log.UserAddedToProject;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.User;
import org.bimserver.rights.RightsManager;
import org.bimserver.shared.exceptions.UserException;

public class AddUserToProjectDatabaseAction extends BimDatabaseAction<Boolean> {

	private final long uoid;
	private final long poid;
	private final long actingUoid;

	public AddUserToProjectDatabaseAction(DatabaseSession databaseSession, AccessMethod accessMethod, long actingUoid, long uoid,
			long poid) {
		super(databaseSession, accessMethod);
		this.actingUoid = actingUoid;
		this.uoid = uoid;
		this.poid = poid;
	}

	@Override
	public Boolean execute() throws UserException, BimserverDatabaseException, BimserverLockConflictException {
		final Project project = getProjectByPoid(poid);
		User actingUser = getUserByUoid(actingUoid);
		if (RightsManager.hasRightsOnProject(actingUser, project)) {
			User user = getUserByUoid(uoid);
			project.getHasAuthorizedUsers().add(user);
			UserAddedToProject userAddedToProject = LogFactory.eINSTANCE.createUserAddedToProject();
			userAddedToProject.setExecutor(actingUser);
			userAddedToProject.setDate(new Date());
			userAddedToProject.setAccessMethod(getAccessMethod());
			userAddedToProject.setUser(user);
			userAddedToProject.setProject(project);
			getDatabaseSession().store(user);
			getDatabaseSession().store(project);
			getDatabaseSession().store(userAddedToProject);
			return true;
		} else {
			throw new UserException("User has no rights to grant permission on '" + project.getName() + "'");
		}
	}
}