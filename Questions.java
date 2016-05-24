package com.techcavnass;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Questions {
	
	/**
	 * URL: http://stackoverflow.com/
	 * Get me all the questions on stackoverflow home page using class name locator
	 * 
	 * @author mrunal
	 *xpath .//a[@class='question-hyperlink']
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {
	WebDriver browser= new FirefoxDriver();
	browser.get("http://stackoverflow.com/");
	browser.manage().window().maximize();
	//browser.manage().wait(5000);
	List <WebElement> questions= new ArrayList <WebElement>();
	questions= browser.findElements(By.xpath(".//a[@class='question-hyperlink']"));
	int length=questions.size();
	System.out.println(length);
	for (int i=0;i<length;i++){
		String str = questions.get(i).getText(); 
		System.out.println(str);
	
		}

	}

}

