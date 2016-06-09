package com.live.TestCases;

import org.testng.annotations.Test;

import com.live.pages.LoginPageObject;
import com.live.pages.MenuBarObject;
import com.live.pages.WardMasterPageObect;

import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WardMaster {
WebDriver browser;

	@Test (dataProvider="testdata")
  public void Navigation(String UserName, String Password) {
		 WebDriver browser= new FirefoxDriver();
			browser.manage().window().maximize();
			browser.get("http://medopsplus.techcanvass.co.in");
			LoginPageObject LoginTestcase= new LoginPageObject(browser);
			LoginTestcase.Login(UserName, Password);
			MenuBarObject menuBar= new MenuBarObject(browser);
			menuBar.hoverOn(menuBar.Manage);
			menuBar.clickElement(menuBar.WardMaster);				
  }	
  @DataProvider (name= "testdata")
  public Object[][] getLoginTestData() {
    //return new Object[1][2];
	Object[][] obj= new Object[1][2];
	obj[0][0]="avinash";
	obj[0][1]="avinash";
	return obj;
    }
  
  @Test (dataProvider="WardData")
	  public void AddWard(String RoomType,String NoOfBeds,String WardName,String BookingCharge) {
	  //String DayCycle,
		WardMasterPageObect ward= new WardMasterPageObect(browser);
		ward.AddWard(RoomType,NoOfBeds,WardName,BookingCharge);			
	  }	
  @DataProvider (name= "WardData")
  public Object[][] getWardTestData() {
    //return new Object[1][2];
	Object[][] obj= new Object[1][4];
	obj[0][0]="ICCU";
	obj[0][1]="4";
	obj[0][2]="first ward";
	obj[0][3]="1";	
	return obj;
    }
  }
  
