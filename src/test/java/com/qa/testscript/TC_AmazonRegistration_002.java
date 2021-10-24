package com.qa.testscript;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;

public class TC_AmazonRegistration_002 extends TestBase {
	
	@Test(dataProvider="getData")
	public void newRegistration(String customername) throws InterruptedException {
		
		WebElement ele = AmazonOR.getAccountandList();
		act.moveToElement(ele).build().perform();
		
		Thread.sleep(5000);
		
		AmazonOR.getRegistrationLink().click();
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		if(title.contains("Registration")) {
			Reporter.log("User is landed on registration page");
			AmazonOR.getCustomerNameTxtField().sendKeys(customername);
			Thread.sleep(3000);
			driver.navigate().back();
			
			
		}else {
			Reporter.log("Registration page is not loaded");
		}
		
		
	}
	
	@DataProvider
	public String[][] getData() throws IOException {
		
		
		String xFile="D:\\Devlabs\\Batch 4\\SDETTraining\\SDET.Batch4\\src\\test\\java\\com\\qa\\testData\\TestData.xlsx";
		String xSheet="Sheet2";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		
		for(int i=1; i<=rowCount ; i++) {
			for(int j=0; j<cellCount;j++) {
				
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
				
			}
			
		}
		
		return data;
	}

}
