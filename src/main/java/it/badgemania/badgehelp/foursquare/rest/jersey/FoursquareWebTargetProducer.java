package it.badgemania.badgehelp.foursquare.rest.jersey;

import it.badgemania.badgehelp.logging.MyRestClientLoggingFilter;
import it.badgemania.badgehelp.properties.PropertyValue;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.apache.commons.lang3.StringUtils;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnector;
import org.glassfish.jersey.client.ClientConfig;
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
	@Inject @PropertyValue("proxy.host")					private String proxyHost;
	@Inject @PropertyValue("proxy.port")					private String proxyPort;
	@Inject @PropertyValue("proxy.username")				private String proxyUsername;
	@Inject @PropertyValue("proxy.password")				private String proxyPassword;
	@Inject @PropertyValue("proxy.enable")					private Boolean proxyEnable;
	
	
	@Produces
	@FoursquareVenuesWebTarget
	WebTarget produceFoursquareVenuesWebTarget() {
		
		logger.info("Producing Foursquare Venues service...");
		logger.info("venuesEndpoint: {}, clientId: {}, clientSecret: {}, apiVersion: {}, redirectUri: {}",
				new Object[]{venuesEndpoint, clientId, clientSecret, apiVersion, redirectUri});

		ClientConfig clientConfig = new ClientConfig();
		
		// setup proxy
		logger.info("Enabling proxy: {}",proxyEnable);
		if (proxyEnable != null && proxyEnable.booleanValue()) {

			ClientConfig proxyConfig = new ClientConfig();
			final String proxyUri = String.format("http://%s:%s", proxyHost, proxyPort);
			logger.info("Proxy URI: {}",proxyUri);
			proxyConfig = proxyConfig.property(ApacheClientProperties.PROXY_URI, proxyUri);
			
			if (StringUtils.isNotEmpty(proxyUsername)) {
				logger.info("Proxy Username: {}",proxyUsername);
				proxyConfig = proxyConfig.property(ApacheClientProperties.PROXY_USERNAME, proxyUsername);
			}
			
			if(StringUtils.isNotEmpty(proxyPassword)) {
				logger.info("Proxy Password: {}",proxyPassword);
				proxyConfig = proxyConfig.property(ApacheClientProperties.PROXY_PASSWORD, proxyPassword);
			}
			
			clientConfig.connector(new ApacheConnector(proxyConfig));
		}
		
		WebTarget target = ClientBuilder.newClient(clientConfig)
				.register(JacksonFeature.class)
				.register(MyRestClientLoggingFilter.class)
				.target(venuesEndpoint)
				.queryParam("client_id", clientId)
				.queryParam("client_secret", clientSecret)
				.queryParam("v", apiVersion);
		
		return target;
	}

}
