package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class GeoCodeGeoPt implements Serializable {

	private static final long serialVersionUID = -4137525658469489516L;
	
	public Double lat;
	public Double lng;
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	
}
