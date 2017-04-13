package com.appdirect.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.apdirect.checker.SignOrLogCheck;

public class EmailValid {
	WebDriver driver;
	public SignOrLogCheck ifEmailInValid()
	 {
	 boolean element=driver.findElement(By.xpath("//*[@id='id13']/fieldset/div[2]/div/span/div")).isDisplayed();
	 if(element==true){
	 System.out.println("Invalid");
	 }
	 else{
		 System.out.println("Invalid");
	 }
	
	 return new SignOrLogCheck(driver);
	 }
}
