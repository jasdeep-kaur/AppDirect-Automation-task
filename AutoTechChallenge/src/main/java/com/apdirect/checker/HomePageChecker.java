package com.apdirect.checker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.appdirect.pages.HomePage;
import com.appdirect.pages.LoginPage;
import com.appdirect.pages.SignOrLog;

public class HomePageChecker 
{
	WebDriver driver;
	
	public HomePageChecker(WebDriver driver)
	{
		this.driver=driver;
	}

	public HomePage homePage = new HomePage(driver);

	public WebDriver isHomePageNull() {
		if (homePage == null) {
			System.out.println("Homepage null");

			throw new NullPointerException("Null Pointer Exeption");

		} else {
			System.out.println("Homepage checked");
		}
		return driver;
	}
	
	}
