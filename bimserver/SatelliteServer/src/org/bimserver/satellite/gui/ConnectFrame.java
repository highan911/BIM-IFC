package org.bimserver.satellite.gui;

/******************************************************************************
 * Copyright (C) 2009-2012  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SpringLayout;
import javax.swing.WindowConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.bimserver.satellite.SatelliteSettings;
import org.bimserver.utils.AutoSelectTextField;
import org.bimserver.utils.SpringUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectFrame extends JDialog {
	private static final long serialVersionUID = -3385875607460570310L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ConnectFrame.class);

	public ConnectFrame(final SatelliteGui satelliteGui, SatelliteSettings settings) {
		setIconImage(satelliteGui.getIconImage());
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setModal(true);
		setTitle("Connect");
		getContentPane().setLayout(new SpringLayout());
		JLabel usernameLabel = new JLabel("Username");
		getContentPane().add(usernameLabel);
		final AutoSelectTextField usernameField = new AutoSelectTextField(settings.getUsername(), 20);
		getContentPane().add(usernameField);
		
		JLabel passwordLabel = new JLabel("Password");
		getContentPane().add(passwordLabel);
		final AutoSelectTextField passwordField = new AutoSelectTextField(settings.getPassword(), 20);
		getContentPane().add(passwordField);
		
		JLabel serverLabel = new JLabel("Server address");
		getContentPane().add(serverLabel);
		final AutoSelectTextField serverField = new AutoSelectTextField(settings.getAddress(), 25);
		getContentPane().add(serverField);

		JLabel portLabel = new JLabel("Port");
		getContentPane().add(portLabel);
		final AutoSelectTextField portField = new AutoSelectTextField("" + settings.getPort(), 5);
		getContentPane().add(portField);
		
		JLabel autoConnectLabel = new JLabel("Auto connect");
		getContentPane().add(autoConnectLabel);
		final JCheckBox autoConnectBox = new JCheckBox();
		autoConnectBox.setSelected(settings.isAutoConnect());
		getContentPane().add(autoConnectBox);

		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}});
		getContentPane().add(cancel);
		
		JButton save = new JButton("Connect");
		save.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				setCursor(new Cursor(Cursor.WAIT_CURSOR));
				try {
					SatelliteSettings settings = new SatelliteSettings();
					settings.setAddress(serverField.getText());
					settings.setPort(Integer.parseInt(portField.getText()));
					settings.setUsername(usernameField.getText());
					settings.setPassword(passwordField.getText());
					settings.setAutoConnect(autoConnectBox.isSelected());
					satelliteGui.connect(settings);
					JAXBContext jaxbContext = JAXBContext.newInstance(SatelliteSettings.class);
					Marshaller marshaller = jaxbContext.createMarshaller();
					marshaller.marshal(settings, new File("settings.xml"));
					setVisible(false);
				} catch (Exception ex) {
					LOGGER.error("", ex);
					JOptionPane.showMessageDialog(satelliteGui, ex.getMessage(), "Error connecting", JOptionPane.ERROR_MESSAGE);
				}
				setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}});
		getContentPane().add(save);
		getRootPane().setDefaultButton(save);

		KeyStroke escapeKeyStroke = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0, false);
		Action escapeAction = new AbstractAction() {
			private static final long serialVersionUID = 8237515446053964032L;

			public void actionPerformed(ActionEvent e) {
		        dispose();
		    }
		}; 
		getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(escapeKeyStroke, "ESCAPE");
		getRootPane().getActionMap().put("ESCAPE", escapeAction);
		
		SpringUtilities.makeCompactGrid(getContentPane(),
                6, 2, //rows, cols
                6, 6,        //initX, initY
                6, 6);       //xPad, yPad
		pack();
		setLocationRelativeTo(satelliteGui);
	}
}