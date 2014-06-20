package it.badgemania.badgehelp.foursquare.rest.jersey;

import it.badgemania.badgehelp.foursquare.model.Result;

import java.net.HttpURLConnection;

import javax.inject.Inject;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;

public abstract class AbstractFoursquareRestClient {
	
	@Inject
	Logger logger;

	protected <T> T getForEntity(WebTarget target, String mediaType,GenericType<Result<T>> genericType) throws Exception {
		
		logger.info("Getting the resource at URI [{}[",target.getUri());
		try {

			Result<T> result;
			Response response = target.request(mediaType).buildGet().invoke();

			if (response.getStatus() == HttpURLConnection.HTTP_OK) {
				result = response.readEntity(genericType);
				if (result == null || ( result.getMeta() != null && result.getMeta().getCode() != HttpURLConnection.HTTP_OK)) {
					//TODO
					throw new Exception();
				} else {
					return result.getResponse();
				}
			} else {
				//TODO
				throw new Exception();
			}
			
		} catch (Exception e) {
			throw e;
		}

	}

}
