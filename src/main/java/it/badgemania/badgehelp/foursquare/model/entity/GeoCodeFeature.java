package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class GeoCodeFeature implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cc;
	private String name;
	private String displayName;
	private String matchedName;
	private String highlightedName;
	private String woeType;
	private String slug;
	private String id;
	private Long longId;
	private GeoCodeGeometry geometry;
	
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getMatchedName() {
		return matchedName;
	}
	public void setMatchedName(String matchedName) {
		this.matchedName = matchedName;
	}
	public String getHighlightedName() {
		return highlightedName;
	}
	public void setHighlightedName(String highlightedName) {
		this.highlightedName = highlightedName;
	}
	public String getWoeType() {
		return woeType;
	}
	public void setWoeType(String woeType) {
		this.woeType = woeType;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getLongId() {
		return longId;
	}
	public void setLongId(Long longId) {
		this.longId = longId;
	}
	public GeoCodeGeometry getGeometry() {
		return geometry;
	}
	public void setGeometry(GeoCodeGeometry geometry) {
		this.geometry = geometry;
	}
	
}
