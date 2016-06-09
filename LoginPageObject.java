package com.live.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	//User name
	 @FindBy(id="txtUserName")
	 WebElement UsernameTextBox;
	//Password
	 @FindBy(id="txtPassword")
	 WebElement PasswordTextBox;	
	//Login button
	 @FindBy(id="LoginButton")
	 WebElement LoginButton;
	//Reset
	 @FindBy(id="imgReset0")
	  WebElement ResetButton;
	 @FindBy(xpath=".//input[@title='Logout']")
	 WebElement LogoutLink;
	 
	 private WebDriver browser;
	 private FirefoxDriver fBrowser;
	 
	 public LoginPageObject(WebDriver browser){
		 this.browser= browser;
		 PageFactory.initElements(browser, this);
	 }
	 public void Launch(){
		 WebDriver browser= new FirefoxDriver();
			this.fBrowser.manage().window().maximize();
			this.fBrowser.get("http://medopsplus.techcanvass.co.in"); 
	 }
	 public void Login(String UserName, String Password ){
		 this.UsernameTextBox.sendKeys(UserName);
		 this.PasswordTextBox.sendKeys(Password);
		 this.LoginButton.click();
	 }
	 public void Reset()
	 {
		this.ResetButton.click(); 
	 }
	 public void teardown(){
		 this.LogoutLink.click();
		this.browser.close();
		 
	 }
	 	 
}
