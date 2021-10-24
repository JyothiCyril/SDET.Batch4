package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser

		driver.get("https://docs.oracle.com/javase/7/docs/api/"); // parent frame
		driver.manage().window().maximize();

		//Demonstrate frameByIndex.

		// find total no. of frames that is present on the page
		// get total no. of hyper links present on the each frame

		/*	List<WebElement> AllFrames = driver.findElements(By.tagName("frame"));
		int count = AllFrames.size();
		System.out.println("Total no. of frames present on the page are : " + count);

		for(int i=0; i<count ; i++) {

			WebDriver frame = driver.switchTo().frame(i); // switch from driver to a frame
			List<WebElement> AllLinks = frame.findElements(By.tagName("a"));
			System.out.println("Total no. of hyper links present on the frame " + i + " are : " + AllLinks.size());	
			driver.switchTo().defaultContent(); // move the control from frame back to the driver

		} */

		// frameByName:


	/*	WebDriver frame = driver.switchTo().frame("packageFrame");
		WebElement link = frame.findElement(By.linkText("Matcher"));

		boolean displayed = link.isDisplayed();
		System.out.println("is the hyper link present on the frame" +  displayed);

		System.out.println(link.getAttribute("href"));
		System.out.println(link.getAttribute("title"));
		System.out.println(link.getText());
		link.click();
		Thread.sleep(3000);

		driver.switchTo().defaultContent();*/
		
		//frameByElement
		
		WebElement ele = driver.findElement(By.xpath("//frame[@title='Package, class and interface descriptions']"));
		WebDriver frame = driver.switchTo().frame(ele);
		
		System.out.println(frame.getTitle());
		
		List<WebElement> AllLinks = frame.findElements(By.tagName("a"));
		System.out.println("Total no. of links present on the frame are : " + AllLinks.size());
		
		for(WebElement link:AllLinks) {
			System.out.println(link.getText());
		}

		driver.switchTo().defaultContent();

		driver.quit();

	}

}
