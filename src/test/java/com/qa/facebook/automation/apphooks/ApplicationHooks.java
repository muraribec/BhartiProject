package com.qa.facebook.automation.apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.facebook.automation.factory.DriverFactory;
import com.qa.facebook.automation.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		 prop = configReader.init_prop();
	}
	
	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("broswer");		
		driverFactory = new DriverFactory();
		driver = driverFactory.init_Driver(browserName);	
	}
	
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		
		if(scenario.isFailed())
		{
		//takeScreenShot::
		String screenshotName = scenario.getName().replaceAll(" ", "_");
			
		byte[] sorcePath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			
		scenario.attach(sorcePath, "image/png",screenshotName);
		}
	}
	
	
	
	
}
