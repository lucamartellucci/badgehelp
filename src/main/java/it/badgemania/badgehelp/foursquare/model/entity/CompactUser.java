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
 * Class representing User entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/user.html"
 *      target="_blank">https://developer.foursquare.com/docs/responses/user.html</a>
 * 
 * @author Antti Leppä
 */
public class CompactUser implements Serializable {

	private static final long serialVersionUID = 477096997911461087L;

	/**
	 * Returns user's id
	 * 
	 * @return user's id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Returns user's first name
	 * 
	 * @return user's first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Returns user's last name
	 * 
	 * @return user's last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Returns user's home city
	 * 
	 * @return user's home city
	 */
	public String getHomeCity() {
		return homeCity;
	}

	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	/**
	 * Returns male or female
	 * 
	 * @return male or female
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * The relationship of the acting user to this user. One of self, friend,
	 * pendingMe, pendingThem or followingThem
	 * 
	 * @return relationship of the acting user to this user
	 */
	public String getRelationship() {
		return relationship;
	}

	private String id;
	private String firstName;
	private String lastName;
	private String homeCity;
	private Photo photo;
	private String gender;
	private String relationship;
}
