package com.pom.base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.pom.config.Configuration;

public class TestBase {
	
	public static RemoteWebDriver driver;            //to create only one object
	public Configuration config;
	
	 public static RemoteWebDriver getDriver() {      //static for wait class
		return driver;
	} 
	@Parameters("browser-name")
	@BeforeMethod 
	public RemoteWebDriver setUpMethod(@Optional String browserName ) throws Exception {
		config= new Configuration();
		
		if(browserName==null)
		{
		browserName="Chrome";
		
		}
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
			else if (browserName.equalsIgnoreCase("InternetExplorer"))
			{
				driver = new InternetExplorerDriver();
			
		}else if (browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("Safari"))
		{
			driver=new SafariDriver();
		}else
		{
			System.out.println("Invalid Browser Name:"+ browserName);
		}
		driver.get(config.getAppUrl());
		driver.manage().window().maximize();
	    return driver ;
	}
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		
	}
		
	}


