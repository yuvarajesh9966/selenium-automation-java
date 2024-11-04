package com.demoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedHomePage extends BasePage {
	
	@FindBy(linkText = "Log out") private WebElement logout;

	public LoggedHomePage(WebDriver ldriver) {
		super(ldriver);
	}
	
	public void clickOnLogout() {
		logout.click();
	}
	
	

}
