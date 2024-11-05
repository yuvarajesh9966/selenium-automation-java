package com.demoWebShop.tests;

import org.testng.annotations.Test;

import com.demoWebShop.pages.HomePage;
import com.demoWebShop.pages.RegisterPage;
import com.demoWebShop.utilites.StoreRandomData;

public class RegisterTest extends BaseTest {
	
	
	
	@Test
	public void register() throws Exception {
		
		openUrl();
		HomePage hp =  new HomePage(driver);
		hp.clickOnRegister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.clickOnGenderMale();
		
		StoreRandomData srd = new StoreRandomData();
		rp.enterFirstName(srd.getFirstName());
		rp.enterLastName(srd.getLastName());
		rp.enterEmail(srd.getEmail());
		
		rp.enterPassword(srd.getPassword());
		rp.enterConfirmPassword(srd.getPassword());
		
		rp.clickOnRegistrButton();
		
		
	}

}
