package com.demoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	@FindBy(linkText = "Register") private WebElement registerLink;
	@FindBy(linkText = "Log in") private WebElement homePageLogin;
	@FindBy(linkText = "Shopping cart") private WebElement shoppingCart;
	@FindBy(linkText = "Wishlist") private WebElement wishlist;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnRegister() {
		registerLink.click();
	}
	
	public void clickOnLogin() {
		homePageLogin.click();
	}
	
	public void clickOnShoppingCart() {
		shoppingCart.click();
	}
	
	public void clickOnWishlist() {
		wishlist.click();
	}

}
