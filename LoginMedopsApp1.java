package selauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginMedopsApp1 {
	 @Test
	  public void LoginMedopsApp(){
		  WebDriver browser= new FirefoxDriver();
			browser.manage().window().maximize();
			browser.get("http://medopsplus.techcanvass.co.in");
			LoginPage LoginPage1= new LoginPage(browser);
			LoginPage1.ResetButton.click();
			LoginPage1.Login("avinash", "avinash");	
		  
	  }
}
