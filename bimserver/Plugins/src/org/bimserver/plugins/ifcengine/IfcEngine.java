package org.bimserver.plugins.ifcengine;

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
import java.io.InputStream;

public interface IfcEngine {
	IfcEngineModel openModel(File ifcFile) throws IfcEngineException;
	IfcEngineModel openModel(InputStream inputStream, int size) throws IfcEngineException;
	IfcEngineModel openModel(byte[] bytes) throws IfcEngineException;
	void close();
	void init() throws IfcEngineException;
}