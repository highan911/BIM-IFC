package org.bimserver.tools.generators;

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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.ecore.EPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Charsets;

public class SServiceGeneratorWrapper {
	private static final Logger LOGGER = LoggerFactory.getLogger(SServiceGeneratorWrapper.class);
	private File sourceFolder = new File("../BimServer/generated");
	private File packageFolder = new File(sourceFolder, "org" + File.separator + "bimserver" + File.separator + "interfaces");

	public SServiceGeneratorWrapper() {
	}

	public void generate(Class<?> clazz, EPackage ePackage) {
		try {
			FileUtils.forceMkdir(packageFolder);
		} catch (IOException e) {
			LOGGER.error("", e);
		}
		SServiceGenerator converterGenerator = new SServiceGenerator();
		Object[] arguments = new Object[]{
			clazz,
			ePackage
		};
		String generated = converterGenerator.generate(arguments);
		File file = new File(packageFolder, "S" + clazz.getSimpleName() + "Service.java");
		try {
			OutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(generated.getBytes(Charsets.UTF_8));
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			LOGGER.error("", e);
		} catch (UnsupportedEncodingException e) {
			LOGGER.error("", e);
		} catch (IOException e) {
			LOGGER.error("", e);
		}
	}
}