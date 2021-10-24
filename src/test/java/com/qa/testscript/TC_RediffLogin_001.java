package com.qa.testscript;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_RediffLogin_001 extends TestBase{
	
	
	@Test
	public void Login() throws InterruptedException {
		
		RediffOR.getSignInLink().click();
		
		String currentUrl = driver.getCurrentUrl();
		
		if(currentUrl.contains("login")) {
			Reporter.log("User is on registration page",true);

			RediffOR.getUNameTxtField().sendKeys(prop.getProperty("Uname"));
			RediffOR.getPwdTxtField().sendKeys(prop.getProperty("Pwd"));
			//Thread.sleep(4000);
			
			WebDriverWait expWait = new WebDriverWait(driver, 40);
			expWait.until(ExpectedConditions.visibilityOf(RediffOR.getrememberMeChkBox()));
			
			
			boolean selected = RediffOR.getrememberMeChkBox().isSelected();
			
			Assert.assertTrue(selected);
			Reporter.log("The check box is selected", true);
		
		}
		
		
		
		
	}

}
