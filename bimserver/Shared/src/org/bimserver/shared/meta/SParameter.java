package org.bimserver.shared.meta;

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

import java.util.List;
import java.util.Set;

/******************************************************************************
 * Copyright (C) 2011 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

public class SParameter {

	private final String name;
	private final SClass type;
	private final SClass genericType;
	private final SMethod sMethod;

	public SParameter(SMethod sMethod, SClass type, SClass genericType, String name) {
		this.sMethod = sMethod;
		this.type = type;
		this.genericType = genericType;
		this.name = name;
	}

	public SClass getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public SClass getGenericType() {
		return genericType;
	}
	
	public SClass getBestType() {
		return genericType != null ? genericType : type;
	}

	public boolean isAggregate() {
		return type.getInstanceClass().isAssignableFrom(List.class) || type.getInstanceClass().isAssignableFrom(Set.class);
	}

	public boolean isLast() {
		return sMethod.getParameter(sMethod.getParameters().size() - 1) == this;
	}

	public String getPrintableName() {
		String r = getType().getPrintableName();
		if (getGenericType() != null) {
			r += "<" + getGenericType().getPrintableName() + ">";
		}
		return r;
	}
}