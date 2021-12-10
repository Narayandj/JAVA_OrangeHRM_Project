package com.Automation.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Automation.Generic.DriverUtils;

public class BaseTest {
	
	@BeforeTest
	public void setup() {
		DriverUtils.createDriver();
	}
	
//	@AfterMethod
//	public void cleanUp() {
//		DriverUtils.getDriver();
//	}
//	

}
