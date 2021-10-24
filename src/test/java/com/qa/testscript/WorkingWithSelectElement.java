package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AmazonPages;

public class WorkingWithSelectElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser
		AmazonPages AmazonOR = new AmazonPages(driver);
		
		driver.get("https://www.amazon.in/"); // amazon.in
		
		WebElement firstSelectedOption = AmazonOR.getCategory().getFirstSelectedOption(); // Default item selected
		System.out.println("The first selected option is : " + firstSelectedOption.getText());
		
		Thread.sleep(2000);
		// Total no. of items present in the list box
		List<WebElement> Alloptions = AmazonOR.getCategory().getOptions();
		System.out.println("Total no. of items in the item collections are : " + Alloptions.size());
		
		for(WebElement option : Alloptions) {
			System.out.println(option.getText());
		}
		
			
		
		AmazonOR.getCategory().selectByVisibleText("Books"); // Select the item from the list by visible text
		Thread.sleep(2000);
		
		AmazonOR.getCategory().selectByIndex(5); // // Select the item from the list by index position
		Thread.sleep(2000);
		
		AmazonOR.getCategory().selectByValue("search-alias=jewelry");//Select the item from the list value
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
	}

}
