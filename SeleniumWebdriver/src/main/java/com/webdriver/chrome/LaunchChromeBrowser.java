package com.webdriver.chrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\practice_eclipse\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // driver will launch the chrome browser 
		System.out.println(driver.toString());

	}

}
