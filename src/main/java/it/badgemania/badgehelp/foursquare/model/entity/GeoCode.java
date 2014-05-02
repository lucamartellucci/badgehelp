package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class GeoCode implements Serializable {

	private static final long serialVersionUID = 2673015081507846654L;

	private GeoCodeFeature feature;
	private String what;
	private String where;
	private String[] parents;
	
	public String[] getParents() {
		return parents;
	}
	public void setParents(String[] parents) {
		this.parents = parents;
	}
	public GeoCodeFeature getFeature() {
		return feature;
	}
	public void setFeature(GeoCodeFeature feature) {
		this.feature = feature;
	}
	public String getWhat() {
		return what;
	}
	public void setWhat(String what) {
		this.what = what;
	}
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	
	

}
