package org.bimserver.shared.comparators;

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

import java.util.Comparator;

import org.bimserver.interfaces.objects.SRevision;

public class SRevisionIdComparator implements Comparator<SRevision> {
	private final boolean ascending;

	public SRevisionIdComparator(boolean ascending) {
		this.ascending = ascending;
	}
	
	@Override
	public int compare(SRevision r1, SRevision r2) {
		return (r1.getId() - r2.getId()) * (ascending ? 1 : -1);
	}
}