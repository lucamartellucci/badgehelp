package it.badgemania.badgehelp.logging;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Application Lifecycle Listener implementation class LogbackListener
 *
 */
@WebListener
public class LogbackWebListener implements ServletContextListener {
	
	
	private final static String LOGBACK_CONFIG_PATH = "badgehelp/config/logback-config.xml";

    /**
     * Default constructor. 
     */
    public LogbackWebListener() {
    }

    private static final Logger logger = LoggerFactory.getLogger(LogbackWebListener.class);
    
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		/*
		 * Search into the servlet context and into the environment properties
		 */
		String configLocation = sce.getServletContext().getInitParameter("CONFDIR");
		if(StringUtils.isEmpty(configLocation)){
			configLocation = System.getProperty("CONFDIR"); 
		}
		
		if(StringUtils.isNotEmpty(configLocation)){
			String logbackFullConfigPath = new StringBuilder(configLocation).append("/").append(LOGBACK_CONFIG_PATH).toString();
			logger.info(new StringBuilder("Logback config path: ").append(logbackFullConfigPath).toString());
			
			try{
				new LogBackConfigLoader(logbackFullConfigPath);
			}catch(Exception e){
				logger.error("Unable to read config file", e);
			}
		} else {
			logger.error("Logback not configured. Unable to find the logback config file in [{}]", configLocation);
		}
		
	}

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce) {
    }
	
}
