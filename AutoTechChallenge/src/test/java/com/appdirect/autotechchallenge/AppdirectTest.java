package com.appdirect.autotechchallenge;

import java.io.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.appdirect.pages.HomePage;
import com.appdirect.pages.LoginPage;
import com.appdirect.pages.SignOrLog;

import Utils.CommonMethods;

public class AppdirectTest extends LoadDriver {
	CommonMethods common=new CommonMethods();
	@Test
	public void homePageTest() throws IOException {
		Reporter.log("Opening the Appdirect HomePage",true);
		webDriver = (WebDriver) new HomePage(webDriver)
				.openPage()
				.isUrlCorrect()
				.isloginButtonExist()
				.pressLogin()
				.isHomePageNull();
	}

	@Test(dependsOnMethods = { "homePageTest" })
	public void loginPageTest() throws IOException {
	webDriver = (WebDriver) new LoginPage(webDriver)
				.AppdirectLoginPage()
				.isLoginPageNull();
	}

	@Test(dependsOnMethods = { "loginPageTest" })
	public void signUpPageTest() throws IOException {
		
	String emailId= "username" + common.getUniqueUniqueRandom() + "@yopmail.com";
		 
		webDriver = (WebDriver) new SignOrLog(webDriver)
				.fillEmail(emailId)
				.clickSendButton();

	}

	@Test(dependsOnMethods = { "signUpPageTest" })
	public void CheckIfSuccessFulOrNot() throws IOException {
		webDriver = (WebDriver) new SignOrLog(webDriver)
				.ifEmailValid()
				.ifEmailisNotvalid("jasdeep.kaur@appdirect.com")
				.isSignPageNull();
	}

	
	
}
