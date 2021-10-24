package com.qa.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DemoSeleniumGRID {

	@Test
	public void DemoCode() throws MalformedURLException {

		DesiredCapabilities Cap = new DesiredCapabilities();
		Cap.setBrowserName("chrome");
		Cap.setPlatform(Platform.WINDOWS);

		ChromeOptions option = new ChromeOptions();
		option.merge(Cap);

		String Url = "http://192.168.29.62:4444/wd/hub";

		WebDriver driver = new RemoteWebDriver(new URL(Url),option);

		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());

		driver.close();	


	}

}
