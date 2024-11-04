package com.demoWebShop.tests;

import org.testng.annotations.Test;

import com.demoWebShop.pages.HomePage;
import com.demoWebShop.pages.LoggedHomePage;
import com.demoWebShop.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void successfulLogin() throws Exception {
		openUrl();
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLogin();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterEmail(co.getEmail());
		lp.enterPassword(co.getPassword());
		
		lp.clickOnLogin();
		
		Thread.sleep(4000);
		
		LoggedHomePage lhp = new LoggedHomePage(driver);
		lhp.clickOnLogout();
		
	}
	
	@Test(priority = 2)
	public void failedLogin() throws Exception {
		openUrl();
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLogin();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterEmail("hgshhs");
		lp.enterPassword(co.getPassword());
		
		lp.clickOnLogin();
		
		Thread.sleep(4000);
		
		LoggedHomePage lhp = new LoggedHomePage(driver);
		lhp.clickOnLogout();
		
	}

}
