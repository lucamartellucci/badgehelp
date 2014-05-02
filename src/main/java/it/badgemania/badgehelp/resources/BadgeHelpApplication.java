package it.badgemania.badgehelp.resources;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.jackson.JacksonFeature;

@ApplicationPath("/api")
public class BadgeHelpApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
	    final Set<Class<?>> classes = new HashSet<>();
	    // register root resource
	    classes.add(VenuesResource.class);
	    // Add JacksonFeature.
        classes.add(JacksonFeature.class);
	    return classes;
	}

}
