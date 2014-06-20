package it.badgemania.badgehelp.service.venues;

import it.badgemania.badgehelp.model.Venue;

import java.util.List;

public interface VenuesService {
	
	public List<Venue> findVenuesAroundMe(Double latitude, Double longitude) throws VenuesException;
	
	public List<Venue> findVenuesNearPlace(String place) throws VenuesException;

}
