package org.bimserver.ifc.xsltserializer;

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

import java.io.OutputStream;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.ifcengine.IfcEngine;
import org.bimserver.plugins.serializers.EmfSerializer;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.plugins.serializers.SerializerPlugin;

public class XsltSerializer extends EmfSerializer {

	private URL xsltUrl;
	private Set<XsltParameter> parameters = new HashSet<XsltParameter>();

	@Override
	public void init(IfcModelInterface model, ProjectInfo projectInfo, PluginManager pluginManager, IfcEngine ifcEngine) throws SerializerException {
		super.init(model, projectInfo, pluginManager, ifcEngine);
	}

	public void setXsltUrl(URL url) {
		xsltUrl = url;
	}

	@Override
	protected void reset() {
		setMode(Mode.BODY);
	}

	@Override
	protected boolean write(OutputStream outputStream) throws SerializerException {
		switch (getMode()) {
		case BODY:
			SerializerPlugin plugin = (SerializerPlugin) getPluginManager().getPlugin("org.bimserver.ifc.xml.serializer.IfcXmlSerializerPlugin", true);
			EmfSerializer ifcXmlSerializer = plugin.createSerializer();
			ifcXmlSerializer.init(model, null, getPluginManager(), null);
			TransformerFactory factory = TransformerFactory.newInstance();
			try {
				StreamSource xslStream = new StreamSource(xsltUrl.openStream());
				try {
					Transformer transformer = factory.newTransformer(xslStream);
					for (XsltParameter xsltParameter : parameters) {
						transformer.setParameter(xsltParameter.getKey(), xsltParameter.getValue());
					}
//					transformer.setErrorListener(new ErrorListener() {
//
//						@Override
//						public void warning(TransformerException e) throws TransformerException {
//						}
//
//						@Override
//						public void fatalError(TransformerException e) throws TransformerException {
//							LOGGER.warn("", e);
//						}
//
//						@Override
//						public void error(TransformerException e) throws TransformerException {
//							LOGGER.warn("", e);
//						}
//					});

					StreamSource in = new StreamSource(ifcXmlSerializer.getInputStream());
					StreamResult out = new StreamResult(outputStream);
					transformer.transform(in, out);
					outputStream.flush();
				} catch (TransformerConfigurationException e) {
					throw new SerializerException(e);
				} catch (TransformerException e) {
					throw new SerializerException(e);
				}
			} catch (Throwable e) {
				throw new SerializerException(e);
			}
			setMode(Mode.FINISHED);
			return true;
		case FINISHED:
			return false;
		}
		return false;
	}

	public void addParameter(XsltParameter xsltParameter) {
		parameters.add(xsltParameter);
	}
}