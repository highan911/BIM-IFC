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
public class SObjectModified extends SCompareItem implements SBase
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
		SObjectModified.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("dataObject")) {
			return getDataObject();
		}
		if (sField.getName().equals("fieldName")) {
			return getFieldName();
		}
		if (sField.getName().equals("oldValue")) {
			return getOldValue();
		}
		if (sField.getName().equals("newValue")) {
			return getNewValue();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("dataObject")) {
			setDataObject((SDataObject)val);
			return;
		}
		if (sField.getName().equals("fieldName")) {
			setFieldName((String)val);
			return;
		}
		if (sField.getName().equals("oldValue")) {
			setOldValue((String)val);
			return;
		}
		if (sField.getName().equals("newValue")) {
			setNewValue((String)val);
			return;
		}
		if (sField.getName().equals("oid")) {
			setOid((Long)val);
			return;
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	private java.lang.String fieldName;
	private java.lang.String oldValue;
	private java.lang.String newValue;
	public java.lang.String getFieldName() {
		return fieldName;
	}

	public void setFieldName(java.lang.String fieldName) {
		this.fieldName = fieldName;
	}
	public java.lang.String getOldValue() {
		return oldValue;
	}

	public void setOldValue(java.lang.String oldValue) {
		this.oldValue = oldValue;
	}
	public java.lang.String getNewValue() {
		return newValue;
	}

	public void setNewValue(java.lang.String newValue) {
		this.newValue = newValue;
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
		SObjectModified other = (SObjectModified) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}