package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_AmazonSearchItem_001 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser
		driver.get("https://www.amazon.in/"); // amazon.in
		
		//3. Enter Da vinci code in the search text field 
		
		WebElement SearchTextField = driver.findElement(By.id("twotabsearchtextbox"));
		SearchTextField.sendKeys("Da vinci code");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String title = driver.getTitle();
		
		if(title.contains("Da vinci code")) {
			System.out.println("Test is passed");
			
			//Get all the item names and print
			
			List<WebElement> ItemNames = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			
			// Total no. of items
			
			System.out.println("Total no. of items published are : " + ItemNames.size()); // returns an integer
			
			for(WebElement item : ItemNames) {
				System.out.println(item.getText());
			}
			
		}else {
			System.out.println("Test is failed");
		}
		
		
		driver.close();// deriver gets terminated
		
		

	}

}
