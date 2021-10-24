package com.qa.testscript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AmazonPages;

public class WorkingwithscrollBars {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser
		AmazonPages AmazonOR = new AmazonPages(driver);
		
		driver.get("https://www.amazon.in/"); // amazon.in
		
		driver.manage().window().maximize();
		
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		WebElement ele = AmazonOR.getAboutusLink();
		
		Js.executeScript("arguments[0].scrollIntoView()",ele);
		
			
		Thread.sleep(3000);
		Js.executeScript("window.scrollBy(0,-200)");
		
		ele.click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		
	/*	for(int i=0;i<=5;i++) {
			Js.executeScript("window.scrollBy(0,500)"); // vertical scroll bar, to move down by 500 pts
			Thread.sleep(2000);
		}
		
		
		for(int i=5;i>=1;i--) {
			Js.executeScript("window.scrollBy(0,-500)");// vertical scroll bar, to move up by 500 pts
			Thread.sleep(2000);
		} */
		
		
		// horizontal scroll bars
		
		/*for(int i=0;i<=5;i++) {
			Js.executeScript("window.scrollBy(500,0)"); // horizontal scroll bar, right to left 500 pts
			Thread.sleep(2000);
		}
		
		
		for(int i=5;i>=1;i--) {
			Js.executeScript("window.scrollBy(-500,0)");// vertical scroll bar, left to right 500 pts
			Thread.sleep(2000);
		} */
		Thread.sleep(3000);
		
		driver.close();

	}

}
