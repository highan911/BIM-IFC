package org.bimserver.database.migrations.steps;

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

import org.bimserver.database.migrations.Migration;
import org.bimserver.database.migrations.Schema;
import org.bimserver.database.migrations.Schema.Multiplicity;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EcorePackage;

public class Step0006 extends Migration {

	@Override
	public String getDescription() {
		return "New mergeIdentifier and cacheOutputFiles settings";
	}

	@Override
	public void migrate(Schema schema) {
		EEnum mergeIdentifierEnum = schema.createEEnum(schema.getEPackage("store"), "MergeIdentifier");
		schema.createEEnumLiteral(mergeIdentifierEnum, "NAME");
		schema.createEEnumLiteral(mergeIdentifierEnum, "GUID");
		
		EClass settingsClass = schema.getEClass("store", "Settings");
		schema.createEAttribute(settingsClass, "mergeIdentifier", mergeIdentifierEnum, Multiplicity.SINGLE);
		schema.createEAttribute(settingsClass, "cacheOutputFiles", EcorePackage.eINSTANCE.getEBooleanObject(), Multiplicity.SINGLE);
	}
}