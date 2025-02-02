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
import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import org.bimserver.shared.meta.*;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlSeeAlso(value={SCheckoutResult.class})
public class SDownloadResult implements SBase
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
		SDownloadResult.sClass = sClass;
	}

	public Object sGet(SField sField) {
		if (sField.getName().equals("projectName")) {
			return getProjectName();
		}
		if (sField.getName().equals("revisionNr")) {
			return getRevisionNr();
		}
		if (sField.getName().equals("file")) {
			return getFile();
		}
		if (sField.getName().equals("oid")) {
			return getOid();
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	public void sSet(SField sField, Object val) {
		if (sField.getName().equals("projectName")) {
			setProjectName((String)val);
			return;
		}
		if (sField.getName().equals("revisionNr")) {
			setRevisionNr((Integer)val);
			return;
		}
		if (sField.getName().equals("file")) {
			setFile((DataHandler)val);
			return;
		}
		if (sField.getName().equals("oid")) {
			setOid((Long)val);
			return;
		}
		throw new RuntimeException("Field " + sField.getName() + " not found");
	}
	
	private java.lang.String projectName;
	private java.lang.Integer revisionNr;
	private javax.activation.DataHandler file;
	public java.lang.String getProjectName() {
		return projectName;
	}

	public void setProjectName(java.lang.String projectName) {
		this.projectName = projectName;
	}
	public java.lang.Integer getRevisionNr() {
		return revisionNr;
	}

	public void setRevisionNr(java.lang.Integer revisionNr) {
		this.revisionNr = revisionNr;
	}
	public javax.activation.DataHandler getFile() {
		return file;
	}

	public void setFile(javax.activation.DataHandler file) {
		this.file = file;
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
		SDownloadResult other = (SDownloadResult) obj;
		if (oid != other.oid)
			return false;
		return true;
	}
}