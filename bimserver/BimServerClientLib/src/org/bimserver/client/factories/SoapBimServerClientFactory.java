package org.bimserver.client.factories;

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

import org.bimserver.client.BimServerClient;
import org.bimserver.client.ConnectionException;
import org.bimserver.plugins.PluginManager;
import org.bimserver.shared.exceptions.ServiceException;

public class SoapBimServerClientFactory implements BimServerClientFactory {

	private final PluginManager pluginManager;
	private final String address;

	public SoapBimServerClientFactory(String address) {
		this.address = address;
		pluginManager = new PluginManager();
		pluginManager.loadPluginsFromCurrentClassloader();
	}

	public SoapBimServerClientFactory(String address, PluginManager pluginManager) {
		this.address = address;
		this.pluginManager = pluginManager;
	}

	@Override
	public BimServerClient create(AuthenticationInfo authenticationInfo, String remoteAddress) throws ServiceException, ConnectionException {
		BimServerClient bimServerClient = new BimServerClient(pluginManager);
		bimServerClient.setAuthentication(authenticationInfo);
		bimServerClient.connectSoap(address, false);
		return bimServerClient;
	}
}