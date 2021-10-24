package com.qa.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAsserts extends TestBase{
	
	
	@Test
	public void HardAssertDemo() {
		
		String title = driver.getTitle();		
		Assert.assertEquals(title, "Amazon"); // test terminates here
		Reporter.log("Hard assert Test Continued..");
		
		boolean status = title.contains("Amazon");
		Assert.assertEquals(status, true);
		Reporter.log("Hard assert Test Continued..");
		
	}
	
	@Test
	public void softAssertDemo() {
		
		SoftAssert SAssert= new SoftAssert();
		
		
		
		String title = driver.getTitle();		
		SAssert.assertEquals(title, "Amazon");
		
		Reporter.log("Soft Assert Test Continued..");
		
		boolean status = title.contains("Amazon");
		SAssert.assertEquals(status, true);
		
		Reporter.log("Soft Assert Test Continued..");
		
		SAssert.assertAll();
		
		
	}
	
	
	

}
