package com.demoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	protected WebDriver driver;
	
	public BasePage(WebDriver ldriver) {
		
		driver = ldriver;
		PageFactory.initElements(driver, this);
		
	}

}
