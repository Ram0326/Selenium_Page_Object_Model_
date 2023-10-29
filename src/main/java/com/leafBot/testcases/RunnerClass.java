package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/main/java/features/Login.feature",glue="com.leafBot.pages", monochrome=true)
public class RunnerClass extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {

		testCaseName = "Login and Logout";
		testDescription = "Test login and logout";
		authors = "Hari";
		category = "Smoke";
		dataSheetName = "TC001";

	}
	
	
	

}
