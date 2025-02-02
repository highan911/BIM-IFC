package org.bimserver.client.channels;

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

import java.io.IOException;
import java.net.InetSocketAddress;

import org.bimserver.pb.ServiceInterfaceReflectorImpl;
import org.bimserver.shared.ConnectDisconnectListener;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.shared.meta.SService;
import org.bimserver.shared.pb.ProtocolBuffersMetaData;
import org.bimserver.shared.pb.Reflector;
import org.bimserver.shared.pb.SocketChannel;

public class ProtocolBuffersChannel extends Channel implements ConnectDisconnectListener {

	private SocketChannel channel;
	private final ProtocolBuffersMetaData protocolBuffersMetaData;

	public ProtocolBuffersChannel(ProtocolBuffersMetaData protocolBuffersMetaData) {
		this.protocolBuffersMetaData = protocolBuffersMetaData;
	}
	
	public void connect(String address, int port) throws IOException {
		channel = new SocketChannel();
		channel.registerConnectDisconnectListener(this);
		Reflector reflector = new Reflector(protocolBuffersMetaData, new SService(ServiceInterface.class), channel);
		setServiceInterface(new ServiceInterfaceReflectorImpl(reflector));
		channel.connect(new InetSocketAddress(address, port));
	}

	@Override
	public void connected() {
		notifyOfConnect();
	}

	@Override
	public void disconnected() {
		notifyOfDisconnect();
	}

	@Override
	public void disconnect() {
		channel.disconnect();
	}
}