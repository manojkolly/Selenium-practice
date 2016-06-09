/**
 * 
 */
package com.live.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Manoj
 *
 */
public class WardMasterPageObect {
	@FindBy(xpath=".//a[contains(@id,'addnew')]")
	public WebElement AddNewLink;
	@FindBy(xpath=".//span[contains(text(),'Ward Master')]")
	public WebElement Title;
	@FindBy(xpath=".//label[contains(text(),'Half Day Cycle')]")
	public WebElement HalfDayCycleChk;
	@FindBy(xpath=".//label[contains(text(),'24 Hrs Cycle')]")
	public WebElement FullDayCycleChk;
	@FindBy(xpath=".//select[contains(@id,'RoomType')]")
	public WebElement RoomTypeDDL;
	@FindBy(xpath=".//span[contains(text(),'WARD DETAILS')]")
	public WebElement WardDetailsTitle;	
	@FindBy(xpath=".//select[contains(@id,'Room')]")
	public WebElement RoomDDL;
	@FindBy(xpath=".//input[contains(@id,'txtAvailableBed')]")
	public WebElement BedsTextbox;
	@FindBy(xpath=".//input[contains(@id,'txtWardName')]")
	public WebElement WardNameTextbox;
	@FindBy(xpath=".//input[contains(@id,'txtBookingCharge')]")
	public WebElement BookingChargeTextbox;
	@FindBy(xpath=".//input[contains(@id,'btnSave')]")
	public WebElement SaveButton;
	
	private WebDriver browser;
	  public WardMasterPageObect(WebDriver browser){
		  this.browser=browser;
		PageFactory.initElements(browser, this);
	  }
public void save(){
		  
		  this.SaveButton.click();
	  }
public void AddWard(String RoomType,String NoOfBeds,String WardName,String BookingCharge){
	//String DayCycle,"
	this.AddNewLink.click();
	  this.FullDayCycleChk.click();
	  this.RoomTypeDDL.sendKeys(RoomType);
	  this.BedsTextbox.sendKeys(NoOfBeds);
	  this.WardNameTextbox.sendKeys(WardName);
	  this.BookingChargeTextbox.sendKeys(BookingCharge);
	  this.SaveButton.click();
}
public void editWard(){
	  
	  this.SaveButton.click();
}

public void enableWard(){
	  
	  this.SaveButton.click();
}
public void disableWard(){
	  
	  this.SaveButton.click();
}
public void searchWard(){
	  
	  this.SaveButton.click();
}
public void navigateWard(){
	  
	  this.SaveButton.click();
}
public void SelectWardRoomType(){
	  
	  this.SaveButton.click();
}


}
