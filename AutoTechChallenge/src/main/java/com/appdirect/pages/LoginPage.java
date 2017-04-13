package com.appdirect.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.apdirect.checker.LoginpageChecker;

import Utils.CommonMethods;

public class LoginPage {
	public WebDriver driver;
	public  LoginPage(WebDriver driver2)
	{
		this.driver=driver2;
	}

	String signUpButton1;
	public LoginpageChecker AppdirectLoginPage() throws IOException
	{
		String fileName="Properties/SignOrLogUtils.properties";
	CommonMethods common=new CommonMethods();
	Properties pr=common.FileRead(fileName);
	
	
   	 
   	signUpButton1=pr.getProperty("signUpButton");
   	clickSignUp();
   	 return new LoginpageChecker(driver);
	}
	
    public void clickSignUp()
    {	WebDriverWait wait = new WebDriverWait(driver, 40);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(signUpButton1)));
    	driver.findElement(By.xpath(signUpButton1)).click();
    	
        
    }

}
