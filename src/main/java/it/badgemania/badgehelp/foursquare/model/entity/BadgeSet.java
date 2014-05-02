package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class BadgeSet implements Serializable {

	private static final long serialVersionUID = 6647018689695570878L;

	private String type;
	private String name;
	private BadgeImage image;
	private String[] items;
	private BadgeSet[] groups;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BadgeImage getImage() {
		return image;
	}
	public void setImage(BadgeImage image) {
		this.image = image;
	}
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	public BadgeSet[] getGroups() {
		return groups;
	}
	public void setGroups(BadgeSet[] groups) {
		this.groups = groups;
	}
	
	
}