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
 * Class representing Stats entity
 * 
 * @author Antti Leppä
 */
public class Stats implements Serializable {

	private static final long serialVersionUID = 1191621361079941540L;

	/**
	 * Returns checkins count
	 * 
	 * @return checkins count
	 */
	public Integer getCheckinsCount() {
		return checkinsCount;
	}

	/**
	 * Returns users count
	 * 
	 * @return users count
	 */
	public Integer getUsersCount() {
		return usersCount;
	}

	public Integer getTipCount() {
		return tipCount;
	}

	public void setTipCount(Integer tipCount) {
		this.tipCount = tipCount;
	}

	private Integer checkinsCount;
	private Integer usersCount;
	private Integer tipCount;

}
