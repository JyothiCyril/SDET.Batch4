package com.qa.testscript;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {




	@BeforeTest // Before the class in a test is invoked
	public void setUp() {
		System.out.println("Invoke the Browser and launch URL");
	}


	@AfterTest // runs after all the classes in a test is executed..
	public void tearDown() {
		System.out.println("Close the browser");
	}



	@BeforeClass // run once the class invoked
	public void Login() {
		System.out.println("Enter the credentials to login");
	}


	@AfterClass // runs before the class gets terminated
	public void Logout() {
		System.out.println("Logout the application");
	}


	@BeforeMethod // execute every time before @Test methods
	// as many as time based on the no. of @Test methods within a class	
	public void checkBalance() {
		System.out.println("Check the account balance");
	}

	@AfterMethod// execute every time after the successful execution of  @Test methods
	// as many as time based on the no. of @Test methods within a class
	//** If @Test fails, @AfterMethod will not run
	public void Acknowledgement() {
		System.out.println("Download payment receipt");
	}





	@Test(priority=1, groups = "Payments")
	public void FundTransfer() {
		System.out.println("Steps to transfer the fund");
		Assert.assertTrue(false);
	}


	@Test(priority=2, groups = "Payments", dependsOnMethods="FundTransfer")
	public void UtilitBillPayment() {
		System.out.println("Steps to pay the utility bill");
	}


	@Test(priority=3, groups = "Payments")
	public void CreditCardBillPayment() {
		System.out.println("Steps to pay credit card bill payment");
	}

	
	@Test(priority=  4, groups = "Insurance", invocationCount=3)
	public void HealthInsurance() {
		System.out.println("Steps to pay health insurance");
	}
	

	@Test(priority = 5,groups = "Insurance" , enabled=false)
	public void VehicleInsurance() {
		System.out.println("Steps to pay vehicle insurance");

	}


	@BeforeGroups("Insurance")
	public void ExeBeforeGroup() {

		System.out.println("I am execute before a group");
	}

	@AfterGroups("Insurance")
	public void ExeAfterGroup() {

		System.out.println("I am execute after a group");
	}
	
	
	@Test(priority=6, expectedExceptions=NumberFormatException.class)
	public void sampleTest() {
		
		String str = "Smith";
		Integer.parseInt(str);
	}
	
	@Test(priority=7,timeOut=2000)
	public void LoopTest() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}

}
