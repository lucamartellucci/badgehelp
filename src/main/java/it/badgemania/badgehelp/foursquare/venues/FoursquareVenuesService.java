package it.badgemania.badgehelp.foursquare.venues;

import it.badgemania.badgehelp.foursquare.model.Result;
import it.badgemania.badgehelp.foursquare.model.entity.CompactVenue;
import it.badgemania.badgehelp.foursquare.model.entity.VenuesSearchResult;
import it.badgemania.badgehelp.foursquare.rest.AbstractFoursquareRestClient;
import it.badgemania.badgehelp.foursquare.rest.FoursquareVenuesWebTarget;
import it.badgemania.badgehelp.venues.VenuesException;
import it.badgemania.badgehelp.venues.VenuesService;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;

@RequestScoped
public class FoursquareVenuesService extends AbstractFoursquareRestClient implements VenuesService {
	
	@Inject
	private Logger logger;
	
	@Inject
	@FoursquareVenuesWebTarget
	private WebTarget venuesWebTarget;
	
	@Override
	public List<String> findVenuesAroundMe(Double latitude, Double longitude) throws VenuesException {
		
		final String llParam = new StringBuffer().append(latitude).append(",").append(longitude).toString();
		logger.debug("Searching venues around ll [{}]", llParam);
		
		return findVenues(venuesWebTarget.queryParam("ll", llParam));
	}

	@Override
	public List<String> findVenuesNearPlace(String place) throws VenuesException {
		logger.debug("Searching venues near place [{}]", place);
		return findVenues(venuesWebTarget.queryParam("near", place));
	}
	
	
	protected List<String> findVenues(WebTarget target) throws VenuesException {
		List<String> result = new ArrayList<>();
		
		try {
			VenuesSearchResult venuesResponse = this.getForEntity(target, MediaType.APPLICATION_JSON,new GenericType<Result<VenuesSearchResult>>(){});
			if (venuesResponse != null) {
				for (CompactVenue venue : venuesResponse.getVenues()) {
					result.add(venue.getName());
				}
			}
		} catch (Exception e) {
			throw new VenuesException("Unable to find venues",e);
		}
				
		logger.info("Found venues are: {}", result);
		return result;
	}


}
