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

import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.BimserverLockConflictException;
import org.bimserver.database.query.conditions.AttributeCondition;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.literals.StringLiteral;
import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.store.Serializer;
import org.bimserver.models.store.StorePackage;
import org.bimserver.shared.exceptions.UserException;

public class GetSerializerByNameDatabaseAction extends BimDatabaseAction<Serializer> {

	private final String name;

	public GetSerializerByNameDatabaseAction(DatabaseSession databaseSession, AccessMethod accessMethod, String name) {
		super(databaseSession, accessMethod);
		this.name = name;
	}

	@Override
	public Serializer execute() throws UserException, BimserverLockConflictException, BimserverDatabaseException {
		Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getSerializer_Name(), new StringLiteral(name));
		return getDatabaseSession().querySingle(condition, Serializer.class, false, null);
	}
}