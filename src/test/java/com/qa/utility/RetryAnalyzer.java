package com.qa.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	public int retryCount = 0;
	public int maxRetryCount = 5;

	public boolean retry(ITestResult result) {

		if(retryCount<maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;

	}
}
