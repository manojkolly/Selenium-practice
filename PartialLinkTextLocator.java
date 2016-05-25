package com.techcavnass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * url=http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html
 * Get all PartialLinkText where links contain Element By
 * 
 * @author mrunal
 *
 */
public class PartialLinkTextLocator {
	public static void main(String[] args) {
		WebDriver browser= new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("http://software-testing-tutorials-automation.blogspot.in/2014/01/how-to-locate-element-by-link-text-or.html");
			
		List <WebElement> partiallinktext= new ArrayList <WebElement>();
		partiallinktext= browser.findElements(By.partialLinkText("Element By"));
		int length=partiallinktext.size();
		System.out.println(length);
		for (int i=0;i<length;i++){
			String str = partiallinktext.get(i).getText(); 
			System.out.println(str);
		
			}
		
		
	}
}