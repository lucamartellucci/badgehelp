package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class Category implements Serializable {

	private static final long serialVersionUID = -4573082152802069375L;

	private String id;
	private String name;
	private String shortName;
	private String pluralName;
	private Icon icon;
	private String[] parents;
	private Boolean primary;
	private Category[] categories;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getPluralName() {
		return pluralName;
	}
	public void setPluralName(String pluralName) {
		this.pluralName = pluralName;
	}
	public Icon getIcon() {
		return icon;
	}
	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	public String[] getParents() {
		return parents;
	}
	public void setParents(String[] parents) {
		this.parents = parents;
	}
	public Boolean getPrimary() {
		return primary;
	}
	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}
	public Category[] getCategories() {
		return categories;
	}
	public void setCategories(Category[] categories) {
		this.categories = categories;
	}
	
	
}
