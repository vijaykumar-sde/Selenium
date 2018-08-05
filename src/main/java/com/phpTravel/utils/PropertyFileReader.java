package com.phpTravel.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {

	private static String configFile = "./Config.properties";

	public PropertyFileReader() {

	}

	public static String getPropertyConfig(String propFile, String property) {
		try {
			Properties prop = new Properties();
			FileInputStream fileInputStream = new FileInputStream(propFile);
			prop.load(fileInputStream);
			return prop.getProperty(property);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	public static String getProperty(String property) {
		return getPropertyConfig(configFile, property);
	}	
}
