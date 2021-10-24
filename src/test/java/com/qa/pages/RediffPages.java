package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffPages {
	
	

	WebDriver driver;
	
	
	@FindBy(linkText="Sign in")
	WebElement SignInLink;
	
	public WebElement getSignInLink() {
		return SignInLink;
	}
	
	@FindBy(id="login1")
	WebElement UNameTxtField;
	
	public WebElement getUNameTxtField() {
		return UNameTxtField;
	}
	
	
	@FindBy(id="password")
	WebElement PwdTxtField;
	
	public WebElement getPwdTxtField() {
		return PwdTxtField;
	}
	
	
	@FindBy(id="remember")
	WebElement rememberMeChkBox;
	
	public WebElement getrememberMeChkBox() {
		return rememberMeChkBox;
	}
	
	@FindBy(linkText="Create Account")
	WebElement CreateAccountLnk;
	
	public WebElement getCreateAccountLnk() {
		return CreateAccountLnk;
	}
	
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/input[1]")
	WebElement FirstNameTxtField;
	
	public WebElement getFirstNameTxtField() {
		return FirstNameTxtField;
	}
	
	@FindBy(xpath="//tbody/tr[7]/td[3]/input[1]")
	WebElement EmailIDTxtField;
	
	public WebElement getEmailIDTxtField() {
		return EmailIDTxtField;
	}
	
	public RediffPages(WebDriver rDriver) {
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	
}
