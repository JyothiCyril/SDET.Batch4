package com.qa.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser

		driver.get("https://www.rediff.com/");

		driver.findElement(By.linkText("Create Account")).click(); // navigate to Registration page

		String currentUrl = driver.getCurrentUrl();

		if(currentUrl.contains("register")) {
			System.out.println("User is on registration page");
			driver.findElement(By.xpath("//table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Kim Smith");
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("smith@test.com");
			driver.findElement(By.className("btn_checkavail")).click();

			// validate if the check box is already selected. if not select by clicking the element

			boolean selected = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
			// Validate if the check box is selected

			if(selected) {
				System.out.println("Checkbox is selected by default");
			}else {
				System.out.println("Check box is not selected");
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();		// Click event on check box.		
			}

			Thread.sleep(3000);

		}else {
			System.out.println("The user is not on the registration page");		

		}
		


			driver.close();

		}

	}
