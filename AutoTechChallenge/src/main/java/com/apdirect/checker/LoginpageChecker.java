package com.apdirect.checker;

import org.openqa.selenium.WebDriver;

import com.appdirect.pages.LoginPage;

public class LoginpageChecker {
	WebDriver driver;

	public LoginpageChecker(WebDriver driver) {
		this.driver = driver;
	}

	LoginPage login = new LoginPage(driver);

	public WebDriver isLoginPageNull() {
		if (login == null) {
			throw new NullPointerException("Null Pointer Exeption");
		} else {
			System.out.println("LoginPage checked");

		}
		return driver;
	}

}
