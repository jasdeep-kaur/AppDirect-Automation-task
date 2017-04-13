package com.appdirect.pages;


import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.apdirect.checker.SignOrLogCheck;

import Utils.CommonMethods;

public class SignOrLog   {
	public WebDriver driver;
	public static String emailId;
CommonMethods common=new CommonMethods();
	public SignOrLog(WebDriver driver2) {
		this.driver = driver2;
	}
	String signUpButton;
	  String email1;
	String sendButton1;
	public Object SignOrLog;

	public SignOrLog SignUpPage() throws IOException {
		String fileName="Properties/SignOrLogUtils.properties";
		CommonMethods common=new CommonMethods();
		Properties pr=common.FileRead(fileName);
		
		email1 = pr.getProperty("email");
		sendButton1 = pr.getProperty("sendButton");
		
		
		return new SignOrLog(driver);
	}

	public SignOrLog fillEmail(String emailId) throws IOException {
//		 emailId= "username" + common.getUniqueUniqueRandom() + "@yopmail.com";
//		 driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String fileName="Properties/SignOrLogUtils.properties";
		CommonMethods common=new CommonMethods();
		Properties pr=common.FileRead(fileName);
		
		email1 = pr.getProperty("email");
		driver.findElement(By.xpath(email1)).sendKeys(emailId);
		return new SignOrLog(driver);

	}




	public WebDriver clickSendButton() throws IOException {
		SignUpPage();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Boolean s=driver.findElement(By.name(sendButton1)).isEnabled();
		driver.findElement(By.name(sendButton1)).click();
		System.out.println(s);
		
		return driver;
        }
	
	public SignOrLogCheck ifEmailisNotvalid(String email)
	{
		boolean element=driver.findElement(By.xpath("//*[@id='id10']/div/section")).isDisplayed();
		if(element==true)
		{
			  driver.navigate().back();
	            driver.findElement(By.xpath("//*[@id='id5']/fieldset/div[3]/menu/a")).click();
	            Random randomGenerator = new Random();
	            int randomInt = randomGenerator.nextInt(1000);
	    	    driver.findElement(By.xpath("//*[@id='id13']/fieldset/div[2]/div/input")).sendKeys(email);
	            driver.findElement(By.xpath("//*[@id='id14']")).click();
		}
		
		return new SignOrLogCheck(driver);
		
	}
	public SignOrLog ifEmailValid()
	{
		boolean element=driver.findElement(By.xpath("//*[@id='id10']/div/section")).isDisplayed();
		if(element==true){
			System.out.println("valid");
			
			}
		return new SignOrLog(driver);
	}
    }




