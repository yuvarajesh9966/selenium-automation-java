package com.demoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	@FindBy(id =  "Email") private WebElement email;
	@FindBy(id = "Password") private WebElement password;
	@FindBy(id = "RememberMe") private WebElement rememberMe;
	
	@FindBy(linkText = "Forgot password?") private WebElement forgotPassword;
	@FindBy(xpath = "//div[@class = \"buttons\"]/input[@value=\"Log in\"]") private WebElement loginPageLogIn;

	public LoginPage(WebDriver ldriver) {
		super(ldriver);
	}
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		loginPageLogIn.click();
	}

}
