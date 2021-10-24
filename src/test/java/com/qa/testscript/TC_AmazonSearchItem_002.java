package com.qa.testscript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.utility.ExcelUtility;

public class TC_AmazonSearchItem_002 extends TestBase {

	// receive the data
	@Test(dataProvider="getData")
	public void SearchItem(String Category, String ItemName) throws InterruptedException, IOException {
		
		SoftAssert SAssert = new SoftAssert();


		AmazonOR.getCategory().selectByVisibleText(Category); // 1 st field
		Thread.sleep(2000);
		AmazonOR.getSearchTxtField().clear();
		AmazonOR.getSearchTxtField().sendKeys(ItemName); //  2nd field
		AmazonOR.getMagnifierBtn().click();

		String title = driver.getTitle();
		//if(title.contains(ItemName)) {
		if(title.contains(ItemName)) {

			//System.out.println("The item is searched");
			Reporter.log("Title is correct",true);			
			//Assert.assertTrue(true);
			SAssert.assertTrue(true);

		}else {
			//System.out.println("Item is not searched");
			captureScreenshot(driver,"SearchItem");	
			Reporter.log("Title is not correct",true);					
			//Assert.assertTrue(false);
			SAssert.assertTrue(false);
		}	

		List<WebElement> itemNames = AmazonOR.getItemNames();
		System.out.println("Total no. of items loaded are : " +  itemNames.size());
		for(WebElement item: itemNames) {
			//	System.out.println(item.getText());
			Reporter.log(item.getText(),true);

		}


		SAssert.assertAll(); // All the assert statement used in the class with log here.

	}

	// source the data

	@DataProvider
	public String[][] getData() throws IOException {
		
		
		String xFile="D:\\Devlabs\\Batch 4\\SDETTraining\\SDET.Batch4\\src\\test\\java\\com\\qa\\testData\\TestData.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		
		for(int i=1; i<=rowCount ; i++) {
			for(int j=0; j<cellCount;j++) {
				
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
				
			}
			
		}
		
		return data;
//		Object[][] data = new Object[3][2];
//
//		// category
//		data[0][0] = "Books";
//		data[1][0] = "Electronics";
//		data[2][0] = "Appliances";
//
//		// ItemName
//
//		data[0][1] = "Da vinci Code";
//		data[1][1] = "Mobile phones";
//		data[2][1] = "Washing machines";
//
//		return data;

	}

}
