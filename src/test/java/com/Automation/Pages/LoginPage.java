package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	//Declaration
	@FindBy(id="txtUsername")
    private WebElement unTB;
    
    @FindBy(id="txtPassword")
    private WebElement pwB;
    
    @FindBy(xpath="//input[@type='submit']")
    private WebElement btnLogin;
    
  
    
    @FindBy(xpath="//b[text()='Admin']")
    private WebElement AdminButt;
    
    @FindBy(id="menu_admin_UserManagement")
    private WebElement UserManagement;
    
    @FindBy(xpath="//a[text()='Users']")
    private WebElement UsersButt;
    
    
    @FindBy(id="btnAdd")
    private WebElement add;
    
    @FindBy(id="systemUser_userType")
    private WebElement add1;
    
    @FindBy(id="systemUser_employeeName_empName")
    private WebElement add2;
    
    @FindBy(id="systemUser_userName")
    private WebElement add3;
    
    @FindBy(id="systemUser_password")
    private WebElement add4;           //password
    
    @FindBy(id="systemUser_confirmPassword")
    private WebElement add5;          //Confirm Password
    
    @FindBy(id="btnSave")
    private WebElement add6;
    
    
    
    
    //Utilization
    public void enterUsername(String un){
    	unTB.sendKeys(un);
    }
    public void enterPassord(String pw){
    	pwB.sendKeys(pw);
    }
    public void clickPassword() {
    	btnLogin.click();
    }
    public void openUrl() {
    	driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    
    public void adminnn() {
    	AdminButt.click();
    }
    
    
    public void clickUsermanagement() {
    	UserManagement.click();  	
    }
    public void ClickUsers() {
    	UsersButt.click();}
		
	
public void shhh() {
	add.click();
}
public void shhh1() {
	add1.click();
}
public void shhh6() {
	add6.click();
}
public void shhh2(String a) {
	add2.sendKeys(a);
}
public void shhh3(String b) {
	add3.sendKeys(b);
}
public void shhh4(String c) {
	add4.sendKeys(c);
}
public void shhh5(String d) {
	add5.sendKeys(d);
}

   

}
