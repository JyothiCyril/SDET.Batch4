package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WorkingwithDragandDrop {

	@Test
	public void dragandDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement sourceEle = driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		
		WebElement targetEle = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sourceEle, targetEle).build().perform();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	
		
	}

}
