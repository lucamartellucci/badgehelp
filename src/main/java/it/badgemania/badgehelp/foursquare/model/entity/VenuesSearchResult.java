package it.badgemania.badgehelp.foursquare.model.entity;

import java.io.Serializable;

public class VenuesSearchResult implements Serializable {

	private static final long serialVersionUID = -4811474739114637413L;

	private CompactVenue[] venues;
	private VenueGroup[] neighborhoods;
	private GeoCode geocode;
	private Boolean confident;
	
	
	public CompactVenue[] getVenues() {
		return venues;
	}
	public void setVenues(CompactVenue[] venues) {
		this.venues = venues;
	}
	public VenueGroup[] getNeighborhoods() {
		return neighborhoods;
	}
	public void setNeighborhoods(VenueGroup[] neighborhoods) {
		this.neighborhoods = neighborhoods;
	}
	public GeoCode getGeocode() {
		return geocode;
	}
	public void setGeocode(GeoCode geocode) {
		this.geocode = geocode;
	}
	public Boolean getConfident() {
		return confident;
	}
	public void setConfident(Boolean confident) {
		this.confident = confident;
	}
	
	
}
