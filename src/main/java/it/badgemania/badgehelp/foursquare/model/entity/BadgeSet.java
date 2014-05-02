package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

/**
 * Class representing BadgeSet
 * 
 * @author Antti Leppä
 */
public class BadgeSet implements Serializable {

	private static final long serialVersionUID = 6647018689695570878L;

	/**
	 * Returns badge set type
	 * 
	 * @return badge set type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Returns badge set name
	 * 
	 * @return badge set name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns badge image
	 * 
	 * @return badge image
	 */
	public BadgeImage getImage() {
		return image;
	}

	/**
	 * Returns badge's items as string array
	 * 
	 * @return badge's items as string array
	 */
	public String[] getItems() {
		return items;
	}

	/**
	 * Returns badge groups
	 * 
	 * @return badge groups
	 */
	public BadgeSet[] getGroups() {
		return groups;
	}

	private String type;
	private String name;
	private BadgeImage image;
	private String[] items;
	private BadgeSet[] groups;
}