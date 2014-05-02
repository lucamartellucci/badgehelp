package it.badgemania.badgehelp.foursquare.rest;

import it.badgemania.badgehelp.logging.MyRestClientLoggingFilter;
import it.badgemania.badgehelp.properties.PropertyValue;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.slf4j.Logger;


public class FoursquareWebTargetProducer {
	
	@Inject
	private Logger logger;
	
	@Inject @PropertyValue("foursquare.venues.endpoint") 	private String venuesEndpoint;
	@Inject @PropertyValue("foursquare.client.id") 			private String clientId;
	@Inject @PropertyValue("foursquare.client.secret")		private String clientSecret;
	@Inject @PropertyValue("foursquare.api.version")		private String apiVersion;
	@Inject @PropertyValue("foursquare.redirect.uri")		private String redirectUri;
	
	
	@Produces
	@FoursquareVenuesWebTarget
	WebTarget produceFoursquarePlaceWebTarget() {
		
		logger.info("Producing Foursquare Venues service...");
		logger.info("venuesEndpoint: [{}], clientId: [{}], clientSecret: [{}], apiVersion: [{}], redirectUri: [{}]",
				new Object[]{venuesEndpoint, clientId, clientSecret, apiVersion, redirectUri});

		WebTarget target = ClientBuilder.newClient()
				.register(JacksonFeature.class)
				.register(MyRestClientLoggingFilter.class)
				.target(venuesEndpoint)
				.queryParam("client_id", clientId)
				.queryParam("client_secret", clientSecret)
				.queryParam("v", apiVersion);
		
		return target;
	}

}
