package com.qa.facebook.automation.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	
	public WebDriver driver;
	DesiredCapabilities chromeCapabilities = null;
	
	public static ThreadLocal tlDriver= new ThreadLocal();
	
	/**
	 * This method is used to initialize the threadlocal driver on the basis of the 
	 * given driver
	 * @param browser
	 * @return this will return the tlDriver
	 */
	public WebDriver init_Driver(String browser) {
		
		System.out.println("Browser name is"+ browser);
		
		if(browser.equals("chrome")) {			
			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--start-maximized");
//			options.addArguments("--disable-extensions");
//			options.addArguments("--disable-notifications");
//			options.addArguments("--headless=new");				
			tlDriver.set(new ChromeDriver(options));			
		}else if (browser.equals("FF")) {
			tlDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Please check the browser value"+browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/**
	 * this is used to get the driver with ThreadLocal
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return (WebDriver) tlDriver.get();
	}
	
	
	
	
	
	
	
	
	

}
