package com.qa.testscript;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverIntroduction {

	public static void main(String[] args) {
		
		// chrome browser
	// set environment variable for a browser		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
	// Instruction to launch a browser	D:\Selenium Software\Drivers\msedgedriver1.exe
		WebDriver driver = new ChromeDriver(); 
		
		
		
		// Firefox browser
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Software\\Drivers\\geckodriver.exe");
		FirefoxDriver FFDriver = new FirefoxDriver();
		
		
		// IE driver
		System.setProperty("webdriver.ie.driver", "D:\\Selenium Software\\Drivers\\IEDriverServer.exe");
		InternetExplorerDriver iedriver = new InternetExplorerDriver();
		
		
		//Edge driver
		
		System.setProperty("webdriver.edge.driver", "D:\\Selenium Software\\Drivers\\msedgedriver1.exe");
		EdgeDriver EDriver = new EdgeDriver();
;		
		
	}

}
