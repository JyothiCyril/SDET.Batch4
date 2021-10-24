package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPages {

	WebDriver driver;

	// Create the variable that can accomodate the locator and its value
	// Create the methods that can return webelement, which can be called into test case / test scripts
	// Create a constructor to call the class members of this class into an other object in a test case.

	
	@FindAll(@FindBy(tagName="a"))
	List<WebElement> AllLinks;
	
	public List<WebElement> getAllLinks(){
		return AllLinks;
	}
	
	
	@FindBy(linkText="About Us")
	WebElement AboutusLink;
	
	public WebElement getAboutusLink() {
		return AboutusLink;
	}
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchTxtField;

	public WebElement getSearchTxtField() {
		return SearchTxtField;
	}
	
	
	@FindBy(id="nav-logo-sprites")
	WebElement AmazonLogo;
	
	public WebElement getAmazonLogo() {
		return AmazonLogo;
	}

	@FindBy(id="nav-search-submit-button")
	WebElement MagnifierBtn;

	public WebElement getMagnifierBtn() {
		return MagnifierBtn;
	}


	@FindBy(id="searchDropdownBox")
	WebElement Category;

	public Select getCategory() {		
		Select selCategory = new Select(Category);		
		return selCategory;
	}

	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
	List<WebElement> ItemNames;

	public List<WebElement> getItemNames(){
		return ItemNames;
	}

	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement AccountandList;

	public WebElement getAccountandList() {
		return AccountandList;
	}

	@FindBy(linkText="Start here.")
	WebElement RegistrationLink;

	public WebElement getRegistrationLink() {
		return RegistrationLink;
	}



	@FindBy(id="ap_customer_name")
	WebElement CustomerNameTxtField;

	public WebElement getCustomerNameTxtField() {
		return CustomerNameTxtField;
	}


	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/span[1]/input[1]")
	WebElement PhoneNumTxtField;

	public WebElement getPhoneNumTxtField() {
		return PhoneNumTxtField;
	}

	public AmazonPages(WebDriver rdriver) {

		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);

	}





}
