package com.qa.facebook.automation.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.facebook.automation.factory.DriverFactory;


public class ElementActions extends DriverFactory{
	
	public ElementActions(WebDriver driver){
		this.driver=driver;
	}
	
	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
		element = driver.findElement(locator);
		}catch (Exception e) {
			System.out.println("Some exception occur while creating webelement"+locator);
		}		
		return element;
	}
	//Implicitwait and Explicitwait
	//Explicit Wait
	public void waitForElementPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void waitForTitlePresent(String title) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public boolean elementIsDisplayed(By locator) {
		waitForElementPresent(locator);
		return getElement(locator).isDisplayed();
	}
	
	public void elementClick(By locator) {
		getElement(locator).click();
	}
	
	public void elementSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public String getPageTitle() {
		String title = null;
		try {
		title = driver.getTitle();
		}catch (Exception e) {
			System.out.println("Some exception occur while getting the title of the page"+title);
		}
		return title;
	}
	
	public String getNormalized(String testOfString) {
		
		String normalizedText = testOfString.replaceAll("[-,;|!\\s]", "").toLowerCase();
		
		return normalizedText;
	}
	
	public void selectByText(By locator,String visibleText) {
		
		WebElement ele = getElement(locator);
		
		Select select = new Select(ele);
		select.selectByVisibleText(visibleText);
	}
	
	//ScrollDown
	//getText 
	//multiplewindows
	//ALertPop
	
	
	
	
	
	

}
