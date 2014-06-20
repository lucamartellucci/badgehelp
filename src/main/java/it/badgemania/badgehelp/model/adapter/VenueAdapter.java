package it.badgemania.badgehelp.model.adapter;

import java.util.ArrayList;
import java.util.List;

import it.badgemania.badgehelp.foursquare.model.entity.CompactVenue;
import it.badgemania.badgehelp.model.Category;
import it.badgemania.badgehelp.model.Location;
import it.badgemania.badgehelp.model.Venue;

public class VenueAdapter {

	public Venue from4SQVenueToVenue(CompactVenue compactVenue) {
		if (compactVenue == null) {
			return null;
		} 
		
		Venue venue = new Venue();
		venue.setId(compactVenue.getId());
		venue.setName(compactVenue.getName());
		venue.setReferralId(compactVenue.getReferralId());
		venue.setUrl(compactVenue.getUrl());
		venue.setCategories(from4SQCategoriesToCategories(compactVenue.getCategories()));
		venue.setLocation(from4SQLocationToLocation(compactVenue.getLocation()));
		return venue;
	}

	private Location from4SQLocationToLocation(it.badgemania.badgehelp.foursquare.model.entity.Location location) {
		if (location == null) {
			return null;
		} 
		
		Location result = new Location();
		result.setAddress(location.getAddress());
		result.setCc(location.getCc());
		result.setCity(location.getCity());
		result.setCountry(location.getCountry());
		result.setCrossStreet(location.getCrossStreet());
		result.setDistance(location.getDistance());
		result.setLatitude(location.getLat());
		result.setLongitude(location.getLng());
		result.setName(location.getName());
		result.setPostalCode(location.getPostalCode());
		result.setState(result.getState());
		
		return result;
	}

	private List<Category> from4SQCategoriesToCategories(it.badgemania.badgehelp.foursquare.model.entity.Category[] categories) {
		if (categories == null) {
			return null;
		} 
		List<Category> categoryList = new ArrayList<Category>();
		for (it.badgemania.badgehelp.foursquare.model.entity.Category category : categories) {
			categoryList.add(from4SQCategoryToCategory(category));
		}
		return categoryList;
	}

	private Category from4SQCategoryToCategory(it.badgemania.badgehelp.foursquare.model.entity.Category category) {
		if (category == null) {
			return null;
		} 
		
		Category result = new Category();
		if (category.getIcon() != null) {
			result.setIcon(String.format("%s%s", category.getIcon().getPrefix(), category.getIcon().getSuffix()));
		}
		
		result.setId(category.getId());
		result.setName(category.getName());
		result.setPrimary(category.getPrimary());
		result.setShortName(category.getShortName());
		return result;
	}

}
