package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC002_Login extends ProjectSpecificMethod{
@BeforeTest
	public void setData() {
excelFileName = "TC002";
}
@Test(dataProvider = "ArrayData")
public void runTC002(String uname, String pwd) {
	new LoginPage(driver).enterUsername(uname)
	.enterPassword(pwd).clickLogin();
}
}
