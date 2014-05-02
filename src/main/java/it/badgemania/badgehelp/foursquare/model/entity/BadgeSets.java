/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Leppä / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */
package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

/**
 * Class representing BadgeSets
 * 
 * @see <a href="" target="_blank"></a>
 * 
 * @author Antti Leppä
 */
public class BadgeSets implements Serializable {

	private static final long serialVersionUID = -538891009716828719L;

	/**
	 * Returns groups
	 * 
	 * @return groups
	 */
	public BadgeSet[] getGroups() {
		return groups;
	}

	private BadgeSet[] groups;
}
