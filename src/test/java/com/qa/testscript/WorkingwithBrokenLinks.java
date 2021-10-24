package com.qa.testscript;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WorkingwithBrokenLinks extends TestBase{

	HttpURLConnection huc = null;

	@Parameters({"Url"})
	@Test
	public void brokenLinks(String Url) {

		List<WebElement> allLinks = AmazonOR.getAllLinks();

		System.out.println("Total no. of links present are : " + allLinks.size());

		for(WebElement link:allLinks) {
			String getUrl = link.getAttribute("href");

			if(getUrl==null || getUrl.isEmpty()) {
				System.out.println("URL is not configured or it is empty");
				continue;
			}


			if(!getUrl.startsWith(Url)) {
				System.out.println("This Url belongs to another application");
				continue;
			}


			try {
				huc = (HttpURLConnection)(new URL(getUrl).openConnection());

				huc.setRequestMethod("HEAD");
				huc.connect();
				int responseCode = huc.getResponseCode();

				if(responseCode>=400) {
					System.out.println(getUrl + "is a broken link");
				}else {
					System.out.println(getUrl + "is a valid link");
				}


			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 





		}



	}

}
