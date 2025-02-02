package org.bimserver.unittests;

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

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.activation.DataHandler;
import javax.activation.DataSource;

import org.apache.commons.io.FileUtils;
import org.bimserver.BimServer;
import org.bimserver.client.BimServerClient;
import org.bimserver.client.ConnectionException;
import org.bimserver.client.factories.UsernamePasswordAuthenticationInfo;
import org.bimserver.combined.LocalDevBimCombinedServerStarter;
import org.bimserver.ifc.step.serializer.IfcStepSerializer;
import org.bimserver.interfaces.objects.SCheckinResult;
import org.bimserver.interfaces.objects.SProject;
import org.bimserver.plugins.serializers.IfcModelInterface;
import org.bimserver.shared.exceptions.ServiceException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClientEmfModelCheckin {
	private BimServerClient bimServerClient;
	private static BimServer bimServer;

	@BeforeClass
	public static void setup() {
		try {
			File home = new File("home");
			if (home.isDirectory()) {
				FileUtils.deleteDirectory(home);
			}

			LocalDevBimCombinedServerStarter localDevBimWebServerStarter = new LocalDevBimCombinedServerStarter();
			localDevBimWebServerStarter.start("localhost", 8082);
			bimServer = localDevBimWebServerStarter.getBimServer();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void shutdown() {
		// bimServer.stop();
	}

	private long createProject() {
		try {
			SProject project = bimServerClient.getServiceInterface().addProject("Project " + new Random().nextInt());
			return project.getOid();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Test
	public void test() {
		bimServerClient = new BimServerClient(bimServer.getPluginManager());
		try {
			UsernamePasswordAuthenticationInfo usernamePasswordAuthenticationInfo = new UsernamePasswordAuthenticationInfo("admin@bimserver.org", "admin");
			bimServerClient.setAuthentication(usernamePasswordAuthenticationInfo);
			bimServerClient.connectProtocolBuffers("localhost", 8020);
		} catch (ConnectionException e1) {
			e1.printStackTrace();
		}
		try {
			long poid = createProject();
			
			File file = new File("../TestData/data/AC11-FZK-Haus-IFC.ifc");
			DataSource dataSource = new org.bimserver.utils.FileDataSource(file);
			DataHandler dataHandler = new DataHandler(dataSource);
			Integer checkin = bimServerClient.getServiceInterface().checkin(poid, "lala", "IfcStepDeserializer", file.length(), dataHandler, false, true);
			SCheckinResult checkinState = bimServerClient.getServiceInterface().getCheckinState(checkin);
			
			IfcModelInterface model = bimServerClient.getModel(checkinState.getRevisionId());
			IfcStepSerializer serializer = new IfcStepSerializer();
			serializer.init(model, null, bimServer.getPluginManager(), null);
			File output = new File("output");
			if (!output.exists()) {
				output.mkdir();
			}
			serializer.writeToFile(new File(output, "test.ifc"));
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}