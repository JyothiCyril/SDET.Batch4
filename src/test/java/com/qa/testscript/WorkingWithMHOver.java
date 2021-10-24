package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.pages.AmazonPages;

public class WorkingWithMHOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser
		AmazonPages AmazonOR = new AmazonPages(driver);
		
		driver.get("https://www.amazon.in/"); // amazon.in
		
		
		// MHover on Account & lists
		Actions act = new Actions(driver);
		WebElement ele = AmazonOR.getAccountandList();
		act.moveToElement(ele).build().perform(); // mouse over on element
		
		// click start here links
		
		AmazonOR.getRegistrationLink().click();		
		
		// validate if the user is landed on the registration page
		
		String title = driver.getTitle();
		
		if(title.contains("Registration")) {
			System.out.println("User is landed on registration page");
			// type Name & Mobile number
			AmazonOR.getCustomerNameTxtField().sendKeys("JyothiCyril");
			AmazonOR.getPhoneNumTxtField().sendKeys("1234567890");
		}
		
		
		
		driver.close();

	}

}
