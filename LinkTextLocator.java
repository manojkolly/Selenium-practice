package com.techcavnass;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * url=http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html 
 * linktext=Locate Element By Name
 * 
 * @author mrunal
 *
 */
public class LinkTextLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver browser= new FirefoxDriver();
		browser.get("http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html"); 
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement linktext = browser.findElement(By.linkText("Locate Element By Name"));		
		System.out.println(linktext.getText());
		linktext.click();
		

	}

}
