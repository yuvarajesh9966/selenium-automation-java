package com.demoWebShop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	
	@FindBy(id =  "gender-male") private WebElement genderMale;
	@FindBy(id =  "gender-female") private WebElement genderFemale;
	
	@FindBy(id = "FirstName") private WebElement firstName;
	@FindBy(id = "LastName") private WebElement lastName;
	@FindBy(id = "Email") private WebElement email;
	@FindBy(id = "Password") private WebElement password;
	@FindBy(id = "ConfirmPassword") private WebElement confirmPassword;
	
	@FindBy(id = "register-button") private WebElement registerButton;
	
	

	public RegisterPage(WebDriver ldriver) {
		super(ldriver);
	}
	
	public void clickOnGenderMale() {
		genderMale.click();
	}
	
	public void clickOnGenderFemale() {
		genderFemale.click();
	}
	
	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterConfirmPassword(String cpass) {
		confirmPassword.sendKeys(cpass);
	}
	
	public void clickOnRegistrButton() {
		registerButton.click();
	}

}
