package org.bimserver.interfaces.objects;

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
import javax.xml.bind.annotation.XmlTransient;
import org.bimserver.shared.meta.*;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class SSerializer implements SBase
{
	private long oid = -1;
	@XmlTransient
	private static SClass sClass;
	
	public long getOid() {
		return oid;
	}
	
	public void setOid(long oid) {
		this.oid = oid;
	}
	
	@XmlTransient
	public SClass getSClass() {
		return sClass;
	}
	
	public static void setSClass(SClass sClass) {
		SSerializer.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("name")) {
			return getName();
		}
		if (sField.getName().equals("description")) {
			return getDescription();
		}
		if (sField.getName().equals("extension")) {
			return getExtension();
		}
		if (sField.getName().equals("contentType")) {
			return getContentType();
		}
		if (sField.getName().equals("className")) {
			return getClassName();
		}
		if (sField.getName().equals("enabled")) {
			return getEnabled();
		}
		if (sField.getName().equals("defaultSerializer")) {
			return getDefaultSerializer();
		}
		if (sField.getName().equals("objectIDMId")) {
			return getObjectIDMId();
		}
		if (sField.getName().equals("settingsId")) {
			return getSettingsId();
		}
		if (sField.getName().equals("ifcEngineId")) {
			return getIfcEngineId();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("name")) {
			setName((String)val);
			return;
		}
		if (sField.getName().equals("description")) {
			setDescription((String)val);
			return;
		}
		if (sField.getName().equals("extension")) {
			setExtension((String)val);
			return;
		}
		if (sField.getName().equals("contentType")) {
			setContentType((String)val);
			return;
		}
		if (sField.getName().equals("className")) {
			setClassName((String)val);
			return;
		}
		if (sField.getName().equals("enabled")) {
			setEnabled((Boolean)val);
			return;
		}
		if (sField.getName().equals("defaultSerializer")) {
			setDefaultSerializer((Boolean)val);
			return;
		}
		if (sField.getName().equals("objectIDMId")) {
			setObjectIDMId((Long)val);
			return;
		}
		if (sField.getName().equals("settingsId")) {
			setSettingsId((Long)val);
			return;
		}
		if (sField.getName().equals("ifcEngineId")) {
			setIfcEngineId((Long)val);
			return;
		}
		if (sField.getName().equals("oid")) {
			setOid((Long)val);
			return;
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	private java.lang.String name;
	private java.lang.String description;
	private java.lang.String extension;
	private java.lang.String contentType;
	private java.lang.String className;
	private java.lang.Boolean enabled;
	private java.lang.Boolean defaultSerializer;
	private long objectIDMId;
	private long settingsId;
	private long ifcEngineId;
	public java.lang.String getName() {
		return name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
	public java.lang.String getDescription() {
		return description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	public java.lang.String getExtension() {
		return extension;
	}

	public void setExtension(java.lang.String extension) {
		this.extension = extension;
	}
	public java.lang.String getContentType() {
		return contentType;
	}

	public void setContentType(java.lang.String contentType) {
		this.contentType = contentType;
	}
	public java.lang.String getClassName() {
		return className;
	}

	public void setClassName(java.lang.String className) {
		this.className = className;
	}
	public java.lang.Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(java.lang.Boolean enabled) {
		this.enabled = enabled;
	}
	public java.lang.Boolean getDefaultSerializer() {
		return defaultSerializer;
	}

	public void setDefaultSerializer(java.lang.Boolean defaultSerializer) {
		this.defaultSerializer = defaultSerializer;
	}
	public long getObjectIDMId() {
		return objectIDMId;
	}

	public void setObjectIDMId(long objectIDMId) {
		this.objectIDMId = objectIDMId;
	}
	
	public long getSettingsId() {
		return settingsId;
	}

	public void setSettingsId(long settingsId) {
		this.settingsId = settingsId;
	}
	
	public long getIfcEngineId() {
		return ifcEngineId;
	}

	public void setIfcEngineId(long ifcEngineId) {
		this.ifcEngineId = ifcEngineId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (oid ^ (oid >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SSerializer other = (SSerializer) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}