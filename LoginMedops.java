package com.live.TestCases;

import org.testng.annotations.Test;

import com.live.pages.LoginPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class LoginMedops {
WebDriver browser;

	 @Test (dataProvider="testdata")
	public void LoginTest(String UserName, String Password){
		 WebDriver browser= new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("http://medopsplus.techcanvass.co.in");
		LoginPageObject LoginTestcase= new LoginPageObject(browser);
		//LoginTestcase.Launch();
		LoginTestcase.Login(UserName, Password);
		LoginTestcase.teardown();
		
	}
	
 @DataProvider (name= "testdata")
	  public Object[][] getLoginTestData() {
	    //return new Object[1][2];
		Object[][] obj= new Object[1][2];
		obj[0][0]="avinash";
		obj[0][1]="avinash";
		return obj;
	    }
	
	
	
	
	

 
}
