package org.bimserver.plugins.deserializers;

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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.bimserver.plugins.schema.SchemaDefinition;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class EmfDeserializer {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmfDeserializer.class);
	public abstract void init(SchemaDefinition schema);

	public abstract IfcModelInterface read(InputStream in, String filename, boolean setOids, long fileSize) throws DeserializeException;

	public IfcModelInterface read(File file, boolean setOids) throws DeserializeException {
		try {
			return read(new FileInputStream(file), file.getName(), setOids, file.length());
		} catch (FileNotFoundException e) {
			LOGGER.error("", e);
			return null;
		}
	}
}