package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
//		1. Open the browser (Chrome)
//		2. Launch Google URL
//		3. fetch and print the title of the page
//		4. Close the browser
		
		//1. Open the browser (Chrome)
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // BRowser gets invoked
		
		//2. Launch Google URL
		driver.get("https://www.google.com/"); // Open the URl on the browser
		driver.manage().window().maximize(); // Before / after get method
		
		//3. fetch and print the title of the page
		
		String title = driver.getTitle(); // fetch the title of the page
		System.out.println("The title of the page is : " + title);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		System.out.println(driver.getCurrentUrl()); // fetch current URL and return string 
		
		//System.out.println(driver.getPageSource()); // HTML page source , returns String
		
		System.out.println(driver.getWindowHandle()); // get the Window ID
		
		//driver.getWindowHandles(); // return String collection : Window ID of all the tabs or windows opened by the WebDriver
		
		
	//	driver.switchTo().window(Window ID); // Switch from parent browser to other new tab / window triggered or opened by the WebDriver transactions.

		// driver.switchTo().frame(index/name /webelemnt); // switch to different frames on the browser
		
	//	driver.switchTo().alert(); // switch from driver to pop up window
		
	//WebElement ele = 	driver.findElement(locator); // Reach the WebElement on the URL / page based on matching locator
		
		//returns one single WebElement
	
	//	List<WebElement> eles = driver.findElements(Locators) ;; Reach the group of WebElements matching the locator
		
		//returns one group of WebElement
		
		
		//		4. Close the browser
		driver.close(); // Browser get closed / terminated , only the parent window
		
		driver.quit(); // Close all the associated windows /tabs
		
		/* No LOC to be written after this statement*/
		
		
		


	}

}
