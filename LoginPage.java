package selauto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPage {	 
		  
	  @FindBy(id="txtUserName")
	  WebElement UserName;
	  @FindBy(id="txtPassword")
	  WebElement Password;	  
	  @FindBy(id="LoginButton")
	  WebElement LoginButton;
	  @FindBy(id="imgReset0")
	  WebElement ResetButton;
	  
	  
	  private WebDriver browser;
	    
	  public LoginPage(WebDriver browser){
		  this.browser=browser;
		PageFactory.initElements(browser, this);
	  }
	  
	  public void Login(String Username,String Password){
		  this.UserName.sendKeys(Username);
		  this.Password.sendKeys(Password);
		  this.LoginButton.click();
		
	  }
	  public void Reset(){
		  
		  this.ResetButton.click();
	  }
	 	 
	  
}