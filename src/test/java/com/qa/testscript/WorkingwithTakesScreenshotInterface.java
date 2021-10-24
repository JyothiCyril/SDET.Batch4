package com.qa.testscript;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AmazonPages;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class WorkingwithTakesScreenshotInterface {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Software\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // empty browser
		AmazonPages AmazonOR = new AmazonPages(driver);
		
		driver.get("https://www.amazon.in/"); // amazon.in
		
		// get the screenshot of an element
		File screenshotAs = AmazonOR.getAmazonLogo().getScreenshotAs(OutputType.FILE);
		String Destination = System.getProperty("user.dir")+"/Screenshots/"+"AmazonLogo.png";		
		FileUtils.copyFile(screenshotAs, new File(Destination));	
		
		// screenshot of a driver
		TakesScreenshot Ts = (TakesScreenshot)driver;		
		File screenshotAs2 = Ts.getScreenshotAs(OutputType.FILE);		
		String DatePattern = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());		
		String Destination1 = System.getProperty("user.dir")+"/Screenshots/"+"DriverScreenshot" +DatePattern + ".png";		
		FileUtils.copyFile(screenshotAs2, new File(Destination1));
		
		
		// Screenshot of fullpage using AShot API.
		
		AShot screen = new AShot();		
		Screenshot takeScreenshot = screen.shootingStrategy(ShootingStrategies.viewportPasting(200)).takeScreenshot(driver);		
		String Destination2 = System.getProperty("user.dir")+"/Screenshots/"+"FullPageScreenshot" +DatePattern + ".png";		
		ImageIO.write(takeScreenshot.getImage(), "jpg", new File(Destination2));
		
		
		driver.close();
		
	}

}
