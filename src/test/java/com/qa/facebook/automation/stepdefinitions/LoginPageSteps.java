package com.qa.facebook.automation.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.qa.facebook.automation.factory.DriverFactory;
import com.qa.facebook.automation.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	
	LoginPage loginPage =  new LoginPage(DriverFactory.getDriver());
	WebDriver driver;
	
	@Given("user is already on {string} page")
	public void user_is_already_on_page(String string) {		
		DriverFactory.getDriver().get(string);
		System.out.println("Navigated to the URL");
	   
	}


	@When("title of the facebook login page")
	public void title_of_the_facebook_login_page() {
	 
		String title = loginPage.getLoginPageTitle();
		System.out.println("Tiyel of the opage is "+title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
		
	}
	@Then("close the browser")
	public void close_the_browser() {
	 // driver.close();
		System.out.println("Closing the driver");
	}
	
	

}
