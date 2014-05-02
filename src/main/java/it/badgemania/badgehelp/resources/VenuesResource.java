package it.badgemania.badgehelp.resources;

import it.badgemania.badgehelp.service.venues.VenuesException;
import it.badgemania.badgehelp.service.venues.VenuesService;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;


@ManagedBean
@Path("/venues")
//@Api(value = "/pet", description = "Operations about pets")
@Produces({"application/json"})
public class VenuesResource {

	@Inject
	private VenuesService venuesService;

	@GET
	@Path("/near")
//	@ApiOperation(value = "Finds Pets by status", notes = "Multiple status values can be provided with comma seperated strings", response = Pet.class, responseContainer = "List")
//	@ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid status value") })
	public Response findVenuesNearPlace(
//			@ApiParam(value = "Status values that need to be considered for filter", required = true, defaultValue = "available", allowableValues = "available,pending,sold", allowMultiple = true) 
			@QueryParam("place") String place) {
		
		List<String> foundVenues = new ArrayList<>();
		try {
			foundVenues = venuesService.findVenuesNearPlace(place);
		} catch (VenuesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.ok(foundVenues).build();
	}

}
