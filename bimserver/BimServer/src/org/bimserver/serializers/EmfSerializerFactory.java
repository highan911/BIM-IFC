package org.bimserver.serializers;

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

import java.util.ArrayList;
import java.util.List;

import org.bimserver.database.BimDatabase;
import org.bimserver.database.BimserverDatabaseException;
import org.bimserver.database.DatabaseSession;
import org.bimserver.database.query.conditions.AttributeCondition;
import org.bimserver.database.query.conditions.Condition;
import org.bimserver.database.query.literals.StringLiteral;
import org.bimserver.interfaces.objects.SIfcEnginePluginDescriptor;
import org.bimserver.interfaces.objects.SSerializerPluginDescriptor;
import org.bimserver.longaction.DownloadParameters;
import org.bimserver.models.store.GeoTag;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Serializer;
import org.bimserver.models.store.StorePackage;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.ifcengine.IfcEngine;
import org.bimserver.plugins.ifcengine.IfcEnginePlugin;
import org.bimserver.plugins.serializers.EmfSerializer;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.plugins.serializers.SerializerPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmfSerializerFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmfSerializerFactory.class);
	private PluginManager pluginManager;
	private BimDatabase bimDatabase;

	public EmfSerializerFactory() {
	}

	public void init(PluginManager pluginManager, BimDatabase bimDatabase) {
		this.pluginManager = pluginManager;
		this.bimDatabase = bimDatabase;
	}

	public List<SSerializerPluginDescriptor> getAllSerializerPluginDescriptors() {
		List<SSerializerPluginDescriptor> descriptors = new ArrayList<SSerializerPluginDescriptor>();
		for (SerializerPlugin serializerPlugin : pluginManager.getAllSerializerPlugins(true)) {
			SSerializerPluginDescriptor descriptor = new SSerializerPluginDescriptor();
			descriptor.setDefaultContentType(serializerPlugin.getDefaultContentType());
			descriptor.setDefaultExtension(serializerPlugin.getDefaultExtension());
			descriptor.setDefaultName(serializerPlugin.getDefaultSerializerName());
			descriptor.setPluginClassName(serializerPlugin.getClass().getName());
			descriptors.add(descriptor);
		}
		return descriptors;
	}

	public EmfSerializer get(String name) {
		DatabaseSession session = bimDatabase.createSession();
		try {
			Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getSerializer_Name(), new StringLiteral(name));
			Serializer found = session.querySingle(condition, Serializer.class, false, null);
			if (found != null) {
				SerializerPlugin serializerPlugin = (SerializerPlugin) pluginManager.getPlugin(found.getClassName(), true);
				if (serializerPlugin != null) {
					return serializerPlugin.createSerializer();
				}
			}
		} catch (BimserverDatabaseException e) {
			LOGGER.error("", e);
		} finally {
			session.close();
		}
		return null;
	}
	
	public EmfSerializer create(Project project, String username, IfcModelInterface model, IfcEngine ifcEngine, DownloadParameters downloadParameters) throws SerializerException {
		EmfSerializer serializer = get(downloadParameters.getSerializerName());
		if (serializer != null) {
			try {
				ProjectInfo projectInfo = new ProjectInfo();
				projectInfo.setName(project.getName());
				projectInfo.setDescription(project.getDescription());
				GeoTag geoTag = project.getGeoTag();
				if (geoTag != null && geoTag.getEnabled()) {
					projectInfo.setX(geoTag.getX());
					projectInfo.setY(geoTag.getY());
					projectInfo.setZ(geoTag.getZ());
					projectInfo.setDirectionAngle(geoTag.getDirectionAngle());
				}
				projectInfo.setAuthorName(username);
				serializer.init(model, projectInfo, pluginManager, ifcEngine);
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
		return serializer;
	}

	public SSerializerPluginDescriptor getSerializerPluginDescriptor(String type) {
		for (SerializerPlugin serializerPlugin : pluginManager.getAllSerializerPlugins(true)) {
			if (serializerPlugin.getClass().getName().equals(type)) {
				SSerializerPluginDescriptor descriptor = new SSerializerPluginDescriptor();
				descriptor.setDefaultContentType(serializerPlugin.getDefaultContentType());
				descriptor.setDefaultExtension(serializerPlugin.getDefaultExtension());
				descriptor.setDefaultName(serializerPlugin.getDefaultSerializerName());
				descriptor.setPluginClassName(serializerPlugin.getClass().getName());
				return descriptor;
			}
		}
		return null;
	}

	public String getExtension(String serializerName) {
		DatabaseSession session = bimDatabase.createSession();
		try {
			Condition condition = new AttributeCondition(StorePackage.eINSTANCE.getSerializer_Name(), new StringLiteral(serializerName));
			Serializer found = session.querySingle(condition, Serializer.class, false, null);
			if (found != null) {
				return found.getExtension();
			}
		} catch (BimserverDatabaseException e) {
			LOGGER.error("", e);
		} finally {
			session.close();
		}
		return null;
	}

	public List<SIfcEnginePluginDescriptor> getAllIfcEnginePluginDescriptors() {
		List<SIfcEnginePluginDescriptor> descriptors = new ArrayList<SIfcEnginePluginDescriptor>();
		for (IfcEnginePlugin ifcEnginePlugin : pluginManager.getAllIfcEnginePlugins(true)) {
			SIfcEnginePluginDescriptor descriptor = new SIfcEnginePluginDescriptor();
			descriptor.setDefaultName(ifcEnginePlugin.getDefaultIfcEngineName());
			descriptor.setPluginClassName(ifcEnginePlugin.getClass().getName());
			descriptors.add(descriptor);
		}
		return descriptors;
	}
}