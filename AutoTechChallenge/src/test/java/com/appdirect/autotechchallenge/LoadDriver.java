package com.appdirect.autotechchallenge;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.apdirect.checker.BrowserCheck;

import Utils.CommonMethods;

public class LoadDriver {

	public static WebDriver webDriver;
	CommonMethods commonMethods=new CommonMethods();
	
	
	@BeforeClass
	public void loadDriver() throws Exception{
		Reporter.log("Starting The Browser");
		
		Browser browser=new Browser();
		webDriver=(WebDriver) browser.getDriver();
		BrowserCheck browsercheck=new BrowserCheck();
		browsercheck.check(browser);
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
	@AfterClass
	public void destroyDriver() throws InterruptedException{
		Reporter.log("Closing the App");
//		webDriver.close();
	}
}
