package it.badgemania.badgehelp.service.venues;

import it.badgemania.badgehelp.model.Venue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoursquareServlet
 */
@WebServlet("/venues")
public class VenuesServlet extends HttpServlet {
	
	@Inject
	VenuesService venuesService;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VenuesServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			String longitude = request.getParameter("longitude");
			String latitude = request.getParameter("latitude");
			String near = request.getParameter("near");
			List<Venue> places = new ArrayList<>();
			if (longitude != null && latitude != null) {
				places = venuesService.findVenuesAroundMe(Double.parseDouble(latitude),Double.parseDouble(longitude));
			} else if (near != null) {
				places = venuesService.findVenuesNearPlace(near);
			}
			String output = "No Places Found";
			if (places != null && places.size() > 0) {
				StringBuffer placeList = new StringBuffer();
				for (Venue place : places) {
					placeList.append(place.getName()).append("\n");
				}
				output = placeList.toString();
			} 
			response.getWriter().write(output);
		} catch (VenuesException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
