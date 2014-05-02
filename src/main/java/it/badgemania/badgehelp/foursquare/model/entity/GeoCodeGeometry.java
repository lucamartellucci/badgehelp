package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;


public class GeoCodeGeometry implements Serializable {

	private static final long serialVersionUID = -2738451613022734596L;

	private GeoCodeGeoPt center;
	private GeoCodeBounds bounds;
	
	public GeoCodeGeoPt getCenter() {
		return center;
	}

	public void setCenter(GeoCodeGeoPt center) {
		this.center = center;
	}

	public GeoCodeBounds getBounds() {
		return bounds;
	}

	public void setBounds(GeoCodeBounds bounds) {
		this.bounds = bounds;
	}
	
}
