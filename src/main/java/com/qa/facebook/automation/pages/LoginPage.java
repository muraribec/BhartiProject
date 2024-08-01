package com.qa.facebook.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.facebook.automation.factory.DriverFactory;

public class LoginPage extends DriverFactory{
	

	
	//1] PageObject locators
		@FindBy(id="email")
		WebElement emailTextBox;
		
		@FindBy(id="pass")
		WebElement passwordtextBox;
		
		@FindBy(name="login")
		WebElement loginBtn;
		
		@FindBy(xpath="")
		WebElement eleName;
		
		//2] single argumented cons
		public LoginPage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		//3]Member Function
		public void doLogin(String userName,String pwd) {
			emailTextBox.sendKeys(userName);
			passwordtextBox.sendKeys(pwd);
			loginBtn.click();
		}
		
		public String getLoginPageTitle() {
			return driver.getTitle();
		}
	
		public void doLogin(String userName) {
			emailTextBox.sendKeys(userName);
			passwordtextBox.sendKeys("nhdgjhdjghjd");
			loginBtn.click();
		}
		public void doLogin() {
			emailTextBox.sendKeys("dgdg");
			passwordtextBox.sendKeys("4545454");
			loginBtn.click();
		}
	
	

}
