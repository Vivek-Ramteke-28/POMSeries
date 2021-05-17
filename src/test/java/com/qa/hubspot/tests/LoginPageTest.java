package com.qa.hubspot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.base.BaseTest;
import com.qa.hubspot.utils.Constants;

public class LoginPageTest extends BaseTest {

	@Test
	public void verifyLoginPageTitleTest() {
		String title = loginPage.getLoginPageTitle();
		System.out.println("LoginPage title is :: " + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
