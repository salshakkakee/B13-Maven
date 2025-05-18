package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Object Repository: We will store page elements here
	@FindBy(name = "username")
	WebElement usernameField;

	@FindBy(name = "password")
	WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	// Page Constructor:
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// FirstName Field Entering a value
	public void enterUsername(String userName) {
		usernameField.sendKeys(userName);
	}

	// lastName Field Entering a value
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	

	public void clickLogin() {
		loginBtn.click();
	}

}
