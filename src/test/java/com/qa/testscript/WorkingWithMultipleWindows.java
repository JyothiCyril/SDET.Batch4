package com.qa.testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.pages.CitiBankPages;



public class WorkingWithMultipleWindows {

	@Test
	public void multipleWindows() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser // 1st window
		CitiBankPages CitiBankOR = new CitiBankPages(driver);
		
		driver.get("https://www.online.citibank.co.in/"); // CITI bank home page
		driver.manage().window().maximize();
		
		CitiBankOR.getCitiGroupLink().click(); // 2 nd window will be launched
		
		CitiBankOR.getTandCLink().click(); // 3rd window
		
		CitiBankOR.getMCLRLink().click(); // 4th Window
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Iterator<String> iter = windowHandles.iterator();
		
		while(iter.hasNext()) {
			String windId = iter.next();
			WebDriver window = driver.switchTo().window(windId);
			System.out.println(window.getTitle());
			System.out.println(window.getCurrentUrl());
			
		}
		
		
		
		driver.quit();

	}

}
