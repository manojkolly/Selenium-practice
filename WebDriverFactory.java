package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	public static void  WebDriverFactory(){
	WebDriver browser= new FirefoxDriver();
	browser.manage().window().maximize();
	}

}
