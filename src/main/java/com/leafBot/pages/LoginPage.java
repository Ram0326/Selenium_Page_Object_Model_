package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Given;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBys({@FindBy(how = How.ID,using="username"),@FindBy(how = How.NAME,using="USERNAME")})
	WebElement eleUsername;
	
	@CacheLookup
	@FindAll({@FindBy(how = How.ID,using="password"),@FindBy(how = How.NAME,using = "PASSWORD")})
	WebElement elePassword;
	
	@Given("Enter the username as (.*)")
	public LoginPage enterUserName(String data) {	
		clearAndType(eleUsername, data);
		return this;
	}	

	@Given("Enter the Password as (.*)")
	public LoginPage enterPassword(String data) {
		clearAndType(elePassword, data);
		return this;
	}	
	
	@Given("Click on the Login")
	public HomePage clickLogin() {
		click(locateElement("class", "decorativeSubmit"));
		return new HomePage(driver,node);		
	}
	
	public LoginPage clickLogInForFailer() {
		click(locateElement("class", "decorativeSubmit"));
		return this;		
	}
	
	@Given("Verify the error message (.*)")
	public LoginPage verifyErrorMsg(String data) {
		verifyPartialText(locateElement("id", "errorDiv"), data);
		return this;
	}
	
	
}
