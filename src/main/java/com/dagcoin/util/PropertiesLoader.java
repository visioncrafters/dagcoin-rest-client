package com.dagcoin.util;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dagcoin.exception.DagCoinRestClientException;

/**
 * Loads properties from config file
 * present at src/main/resources
 * 
 * @author shubhrapahwa
 *
 */
public class PropertiesLoader {
	
	private static final Logger log = LoggerFactory.getLogger(PropertiesLoader.class.getName());
	private static final Properties prop = new Properties();

	/**
	 * Loads the properties file
	 */
	static {
		try {
			prop.load(PropertiesLoader.class.getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			log.error("Error in loading properties loader - " + e.getMessage());
		}
	}
	
	/**
	 * Returns the value of property
	 * 
	 * @param propertyName - name of the property to be retrieved
	 * @return property value
	 * @throws DagCoinRestClientException - if property is not found
	 */
	public static String getProperty(String propertyName) throws DagCoinRestClientException {
		return prop.getProperty(propertyName);
	}

}
