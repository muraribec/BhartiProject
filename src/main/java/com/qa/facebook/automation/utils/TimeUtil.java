package com.qa.facebook.automation.utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.facebook.automation.factory.DriverFactory;


public class TimeUtil extends DriverFactory{
	
	WebDriver driver;
	//To handle the synechronization problem
	
	//1]static wait
	//2]Implicitwait
	//3]Explicitwait ---> wait for some specific element --> 20sec --> 2sec 
	//4]FluentWait
	
	public static void shortwait() {
		try {
			Thread.sleep(5000);  //5sec
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void mediumWait() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void longWait() {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
//	public void explicitWait(WebElement ele) {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(ele));
//	}
	
	//Fluentwait --> polling 
//	  Wait<WebDriver> wait = new FluentWait<>(driver)
//            .withTimeout(Duration.ofSeconds(40))
//            .pollingEvery(Duration.ofSeconds(3))
//            .ignoring(TimeoutException.class);
//	  wait.until(ExpectedConditions.visibilityOfElementLocated(ele));

 
                
	
	
	

}
