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
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javax.xml.bind.annotation.XmlTransient;
import org.bimserver.shared.meta.*;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class SConcreteRevision implements SBase
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
		SConcreteRevision.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("id")) {
			return getId();
		}
		if (sField.getName().equals("projectId")) {
			return getProjectId();
		}
		if (sField.getName().equals("checksum")) {
			return getChecksum();
		}
		if (sField.getName().equals("revisions")) {
			return getRevisions();
		}
		if (sField.getName().equals("size")) {
			return getSize();
		}
		if (sField.getName().equals("date")) {
			return getDate();
		}
		if (sField.getName().equals("lastError")) {
			return getLastError();
		}
		if (sField.getName().equals("userId")) {
			return getUserId();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	@SuppressWarnings("unchecked")
	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("id")) {
			setId((Integer)val);
			return;
		}
		if (sField.getName().equals("projectId")) {
			setProjectId((Long)val);
			return;
		}
		if (sField.getName().equals("checksum")) {
			setChecksum((byte[])val);
			return;
		}
		if (sField.getName().equals("revisions")) {
			setRevisions((List<Long>)val);
			return;
		}
		if (sField.getName().equals("size")) {
			setSize((Long)val);
			return;
		}
		if (sField.getName().equals("date")) {
			setDate((Date)val);
			return;
		}
		if (sField.getName().equals("lastError")) {
			setLastError((String)val);
			return;
		}
		if (sField.getName().equals("userId")) {
			setUserId((Long)val);
			return;
		}
		if (sField.getName().equals("oid")) {
			setOid((Long)val);
			return;
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	private java.lang.Integer id;
	private long projectId;
	private byte[] checksum;
	private List<Long> revisions = new ArrayList<Long>();
	private java.lang.Long size;
	private java.util.Date date;
	private java.lang.String lastError;
	private long userId;
	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}
	
	public byte[] getChecksum() {
		return checksum;
	}

	public void setChecksum(byte[] checksum) {
		this.checksum = checksum;
	}
	public List<Long> getRevisions() {
		return revisions;
	}

	public void setRevisions(List<Long> revisions) {
		this.revisions = revisions;
	}
	public java.lang.Long getSize() {
		return size;
	}

	public void setSize(java.lang.Long size) {
		this.size = size;
	}
	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public java.lang.String getLastError() {
		return lastError;
	}

	public void setLastError(java.lang.String lastError) {
		this.lastError = lastError;
	}
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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
		SConcreteRevision other = (SConcreteRevision) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}