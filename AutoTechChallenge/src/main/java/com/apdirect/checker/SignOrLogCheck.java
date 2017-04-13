package com.apdirect.checker;

import org.openqa.selenium.WebDriver;

import com.appdirect.pages.SignOrLog;

public class SignOrLogCheck {
	WebDriver driver;
	
	public  SignOrLogCheck(WebDriver driver) {
		this.driver=driver;
	}
	SignOrLog sign=new SignOrLog(driver);
	public WebDriver isSignPageNull()
	{
		if(sign==null)
		{
			throw new NullPointerException("Null Pointer Exeption");
		}
		else
		{
			System.out.println("Signin checked");
		}
        return driver;
	}

	

}
