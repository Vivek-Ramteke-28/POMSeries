package com.qa.hubspot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.hubspot.base.BasePage;

public class LoginPage extends BasePage {

	private WebDriver driver;

	// 1. By locators: Object Repository

	private By emailID = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.id("loginBtn");
	private By signUpLink = By.linkText("Sign up");

	// 2. Constructor of the page class

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. Page Actions: Feature of the page::: Methods
	
	public String getLoginPageTitle()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return driver.getTitle();
	}
	
	public boolean isSignUpLinkExist()
	{
		return driver.findElement(signUpLink).isDisplayed();
		
	}
	
	public void doLogin(String un, String pwd)
	{
		System.out.println("Login with : " + un + " and "+ pwd );
		driver.findElement(emailID).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}
	
	
	
	
}
