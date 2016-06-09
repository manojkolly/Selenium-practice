/**
 * 
 */
package com.live.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Manoj
 *
 */
public class MenuBarObject {
	@FindBy(xpath=".//a[contains(text(),'My Home')]")
	WebElement MyHome;
	@FindBy(xpath=".//a[contains(text(),'Manage')]")
	public	WebElement Manage;
	@FindBy(xpath=".//a[contains(text(),'Ward Master')]")
	public	WebElement WardMaster;
	private WebDriver browser;
    
	  public MenuBarObject(WebDriver browser){
		  this.browser=browser;
		PageFactory.initElements(browser, this);
	  }
	  public void clickElement(WebElement element){
			//clicking on webelement
			element.click();
		}
	  public void hoverOn(WebElement element){
			//Hover on webelement
			Actions builder= new Actions(browser);
			builder.moveToElement(element).build().perform();	 
		}

}
