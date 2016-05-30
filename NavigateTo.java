package selauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class NavigateTo {
	
	public void NavigateTo(){
		  WebDriver browser= new FirefoxDriver();
		  WebDriverWait wait = new WebDriverWait(browser, 5000);
			browser.manage().window().maximize();
			browser.get("http://medopsplus.techcanvass.co.in");
			LoginPage LoginPage1= new LoginPage(browser);
			LoginPage1.ResetButton.click();
			LoginPage1.Login("avinash", "avinash");
			
			MenuBar menubar = new MenuBar(browser);
			//menubar.clickElement(menubar.MyHome);
			menubar.hoverOn(menubar.Reports);
			System.out.println("Reports");
			menubar.hoverOn(menubar.Collection);
			System.out.println("Collection");
			menubar.clickElement(menubar.DailyCollection);
			System.out.println("Daily Collection");
		  
	
  }
}
