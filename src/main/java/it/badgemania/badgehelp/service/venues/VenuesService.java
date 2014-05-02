package it.badgemania.badgehelp.service.venues;

import java.util.List;

public interface VenuesService {
	
	public List<String> findVenuesAroundMe(Double latitude, Double longitude) throws VenuesException;
	
	public List<String> findVenuesNearPlace(String place) throws VenuesException;

}
