package com.appdirect.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.apdirect.checker.HomePageChecker;

import Utils.CommonMethods;
public class HomePage   {
	
	public  WebDriver driver;

	

	 public HomePage(WebDriver webDriver) {
		 this.driver = webDriver;
	}
	
	 public String url1;
	 String Login1;
	
	 
	public  void  AppdirectHomePage() throws IOException 
	{ String fileName="Properties/HomePageUtils.properties";

		
		CommonMethods common=new CommonMethods();
		Properties pr=common.FileRead(fileName);
		  url1=pr.getProperty("url");
		  Login1=pr.getProperty("Login");
		  
	}
	
	

	public HomePage openPage() throws IOException
	{
		AppdirectHomePage();
		
		driver.get(url1);
		return new HomePage(driver);
	}
	public HomePage isUrlCorrect() throws IOException
	{
		String title = driver.getTitle();

		System.out.println(title);
        Assert.assertTrue(title.contains("AppDirect"));
		return new HomePage(driver);
	}
	
	public HomePage  isloginButtonExist() throws IOException
	{
		AppdirectHomePage();
		Boolean val=driver.findElement(By.className(Login1)).isEnabled();
		if(val==true){
		Reporter.log("Button Exist",true);}
		else{
			Reporter.log("Button Dosent Exist",true);
		}
		return new HomePage(driver);
	}



	public HomePageChecker pressLogin() throws IOException
	{
		AppdirectHomePage();
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(Login1)));
		driver.findElement(By.className(Login1)).click();
		
		return new HomePageChecker(driver);
	}



	


}
