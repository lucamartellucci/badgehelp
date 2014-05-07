package it.badgemania.badgehelp.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;

@Singleton
public class PropertyResolver {
	
	@Inject
	private Logger logger;
	
	@Inject
	@ConfigLocation
	private String configLocation;

	private Map<String, Object> properties = new HashMap<>();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostConstruct
	private void init() {
		logger.info("Init the property resolver...");
		List<File> propertyFiles = getPropertyFiles(configLocation);
		
		try {
			for (File file : propertyFiles) {
				Properties p = new Properties();
				p.load(new FileInputStream(file));
				
				properties.putAll(new HashMap<String, Object>((Map) p));
			}
		} catch (Exception e) {
			logger.error("Unable to init the property resolver",e);
		}

	}

	private List<File> getPropertyFiles(String configLocation) {
		logger.info("Loading property files from the configuration folder: {}", configLocation);

		List<File> propertyFiles;
		File confDir = new File(configLocation);
		File[] listFiles = confDir.listFiles(new PropertyFileFilter());
		
		if (listFiles != null && listFiles.length > 0) {
			propertyFiles = Arrays.asList(listFiles);
			logger.info("Found {} property files: {}",propertyFiles.size(), propertyFiles);
		} else {
			propertyFiles = new ArrayList<>();
			logger.info("No property file found");
		}

		return propertyFiles;
	}

	/**
	 * Returns property held under specified <code>key</code>. If the value is
	 * supposed to be of any other type than {@link String}, it's up to the
	 * client to do appropriate casting.
	 *
	 * @param key
	 * @return value for specified <code>key</code> or null if not defined.
	 */
	public String getValue(String key) {
		Object value = properties.get(key);
		return (value != null) ? String.valueOf(value) : null;
	}
}
