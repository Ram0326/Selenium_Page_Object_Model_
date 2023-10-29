package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.Then;

public class HomePage extends ProjectSpecificMethods{

	public HomePage(RemoteWebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
		PageFactory.initElements(driver, this);
	}

	
	@Then("(.*) should be displayed in HomePage")
	public HomePage verifyLoggedName(String data) {
		verifyPartialText(locateElement("xpath", "//h2[text()[contains(.,'Demo')]]"), data);
		return this;
	}
	
	

	
	public LoginPage clickLogout() {
		click(locateElement("class", "decorativeSubmit"));
		return new LoginPage(driver,node);

	}
	
	

}










