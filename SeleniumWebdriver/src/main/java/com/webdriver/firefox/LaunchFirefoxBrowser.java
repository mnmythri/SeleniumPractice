package com.webdriver.firefox;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\practice_eclipse\\Drivers\\geckodriver.exe");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("marionette", true); 
		FirefoxDriver driver = new FirefoxDriver();
		System.out.println(driver.toString());
		
		

	}

}
