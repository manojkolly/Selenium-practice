package com.techcavnass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * url=http://www.adactin.com/HotelApp/Register.php
 * Get all input tags
 * @author mrunal
 *.//form[@ id='register_form']//input
 */
public class TagNameLocator {
	public static void main(String[] args) {
		
		WebDriver browser = new FirefoxDriver();
		browser.manage().window().maximize();
		browser.get("http://www.adactin.com/HotelApp/Register.php");
		List <WebElement> inputtags= new ArrayList <WebElement>();
		inputtags= browser.findElements(By.tagName("input"));
		int length=inputtags.size();
		System.out.println(length);
		for (int i=0;i<length;i++){
			String str = inputtags.get(i).getAttribute("name"); 
			System.out.println(str);
		
			}
		
	}
}