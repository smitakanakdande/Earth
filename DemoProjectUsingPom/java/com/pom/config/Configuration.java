package com.pom.config;

import java.io.FileNotFoundException;

import com.pom.utilities.FileUtil;

public class Configuration {

	public String getAppUrl() throws FileNotFoundException {
		
		FileUtil file = new FileUtil();
		return file.getProperty("/src/main/resources/Config.properties", "app.url");
	}

}
