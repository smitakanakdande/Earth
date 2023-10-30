package com.pom.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtil {
	
	public String getProperty (String filePath,String key) throws FileNotFoundException {
		String baseDir = System.getProperty("user.dir");

		// Read properties file code

		FileInputStream fis = null;
				fis= new FileInputStream(baseDir + filePath);
		Properties prop = new Properties();
		String value = "";
		try {
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return value;

	}
	public String getLocator(String locatorName) throws FileNotFoundException {
		return getProperty("src/main/resources/Locators.properties", locatorName);
	

	
}}


