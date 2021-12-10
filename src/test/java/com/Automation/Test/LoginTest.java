package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.Pages.LoginPage;

public class LoginTest extends BaseTest{
	
	LoginPage loginPage=new LoginPage();
	
	   @Test
	   public void VerifyLogin()
	   {
		   loginPage.openUrl();
		   loginPage.enterUsername("Admin");
		   loginPage.enterPassord("admin123");
		   loginPage.clickPassword();
		  
	   }
}
