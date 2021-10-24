package com.qa.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSSLCertificate {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setAcceptInsecureCerts(true);
		
		ChromeOptions options = new ChromeOptions();
		options.merge(Cap);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		Thread.sleep(2000);
		
		
		
	}
	
	
	
	
	

}
