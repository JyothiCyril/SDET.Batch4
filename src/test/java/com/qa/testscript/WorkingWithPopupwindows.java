package com.qa.testscript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.RediffPages;



public class WorkingWithPopupwindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser
		RediffPages RediffOR = new RediffPages(driver);
		
		driver.get("https://www.rediff.com/"); // amazon.in
		driver.manage().window().maximize();
		
		RediffOR.getCreateAccountLnk().click();
		RediffOR.getFirstNameTxtField().sendKeys("12344");
		RediffOR.getFirstNameTxtField().sendKeys(Keys.TAB); // pop up window triggered 
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		//alert.accept();
		alert.dismiss();
		
		RediffOR.getFirstNameTxtField().sendKeys("@$^&&");
		Thread.sleep(3000);
		
		
		RediffOR.getFirstNameTxtField().clear();
		Thread.sleep(3000);
		RediffOR.getFirstNameTxtField().sendKeys("Kim Smith");
		RediffOR.getEmailIDTxtField().sendKeys("test@test.com");
		
		
		driver.close();

	}

}
