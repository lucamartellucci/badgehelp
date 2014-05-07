package it.badgemania.badgehelp.properties;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;

public class ConfigLocationProducer {
	
	private static final String PROPERTY_FOLDER = "badgehelp/config";

	@Produces
	@ConfigLocation
	public String getConfigLocation() {
		return new StringBuilder(System.getProperty("CONFDIR")).append("/").append(PROPERTY_FOLDER).toString();
	}
	
	
	@Produces
	@ConfigLocation
	@Alternative
	public String getConfigLocationTest() {
		return "src/test/resources/properties/";
	}

}
