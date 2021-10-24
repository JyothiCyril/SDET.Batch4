package com.qa.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoFailedTestRetry {
	
	@Test
	public void method1() {
		Assert.assertTrue(true);
		
	}
	
	@Test(retryAnalyzer=com.qa.utility.RetryAnalyzer.class)
	public void method2() {
		
		Assert.assertTrue(false);
	}

}
