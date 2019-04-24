package com.ideafactory.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class AppProperties {
	private static final String propertiesFile = Thread.currentThread()
				.getContextClassLoader().getResource("").getPath() + "app.properties";

	private static HashMap<String, String> properties = new HashMap<String, String>();
	
	public static void readProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(AppProperties.propertiesFile));
			AppProperties.properties.put("server", properties.getProperty("server"));
			AppProperties.properties.put("port", properties.getProperty("port"));
			AppProperties.properties.put("host", properties.getProperty("host"));
			AppProperties.properties.put("user", properties.getProperty("user"));
			AppProperties.properties.put("password", properties.getProperty("password"));
			AppProperties.properties.put("database", properties.getProperty("database"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static HashMap<String, String> getProperties()
	{
		return AppProperties.properties;
	}
}
