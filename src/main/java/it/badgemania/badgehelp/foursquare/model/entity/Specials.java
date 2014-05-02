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


/**
 * Class representing CompleteSpecial entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/special.html"
 *      target="_blank">https://developer.foursquare.com/docs/responses/special.html</a>
 * 
 * @author Antti Leppä
 */
public class Specials extends Count {

	private static final long serialVersionUID = 3919231353933056022L;

	private CompleteSpecial[] items;

	public CompleteSpecial[] getItems() {
		return items;
	}

	public void setItems(CompleteSpecial[] items) {
		this.items = items;
	}

}
