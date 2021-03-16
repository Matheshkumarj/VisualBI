package org.com.selenium_base;

import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_base {
	
	public String browser() {
//	  	Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
	  	  System.setProperty("webdriver.chrome.driver", "./Webdriverchromedriver.exe");
	  	 
	  	//Setting the driver to chrome driver
	  	  driver = new ChromeDriver();
	  	  String url = "https://www.google.com";
	  	  driver.get(url);
	  	  //Capturing the title and validating if expected is equal to actual
	  	  String expectedTitle = "Google";
	  	  String actualTitle = "Google";
	}

}
