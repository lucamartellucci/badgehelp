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
 * Class representing Category entity
 * 
 * @author Antti Leppä
 */
public class Category implements Serializable {

	private static final long serialVersionUID = -4573082152802069375L;

	/**
	 * Returns category id
	 * 
	 * @return category id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Returns category name
	 * 
	 * @return category name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Return plural name
	 * 
	 * @return plural name
	 */
	public String getPluralName() {
		return pluralName;
	}

	

	/**
	 * Returns parents as array of Strings
	 * 
	 * @return parents as array of Strings
	 */
	public String[] getParents() {
		return parents;
	}

	/**
	 * Returns if this is a primary category
	 * 
	 * @return is this a primary category
	 */
	public Boolean getPrimary() {
		return primary;
	}

	/**
	 * Returns sub categories
	 * 
	 * @return sub categories
	 */
	public Category[] getCategories() {
		return categories;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}





	private String id;
	private String name;
	private String shortName;
	private String pluralName;
	private Icon icon;
	private String[] parents;
	private Boolean primary;
	private Category[] categories;
}
