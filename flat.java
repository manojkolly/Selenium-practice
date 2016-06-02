package selauto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flat {
	
	@FindBy(xpath=".//a[contains(@id,'Add')]")
	WebElement AddNew;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver browser= new FirefoxDriver();
		  WebDriverWait wait = new WebDriverWait(browser, 5000);
			browser.manage().window().maximize();
			browser.get("http://medopsplus.techcanvass.co.in");
			browser.findElement(By.id("txtUserName")).sendKeys("avinash");
			browser.findElement(By.id("txtPassword")).sendKeys("avinash");
			browser.findElement(By.id("LoginButton")).click();
			//doctor master
			Actions builder= new Actions(browser);
			builder.moveToElement(browser.findElement(By.xpath(".//a[contains(text(),'Manage')]"))).build().perform();
			Thread.sleep(2000);
			browser.findElement(By.xpath(".//a[contains(text(),'Ward Master')]")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath(".//*[contains(@id,'Add')]")).click();
			Thread.sleep(2000);
			boolean bool= browser.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceHolder1_lblHeader']")).isDisplayed();
			System.out.println(bool);
			browser.findElement(By.xpath(".//input[@value='chk24hrs']")).click();
			Select select = new Select(browser.findElement(By.xpath(".//select[@id='ctl00_ContentPlaceHolder1_DropDownRoom']")));
			select.selectByVisibleText("General");
			browser.findElement(By.xpath(".//select[@id='ctl00_ContentPlaceHolder1_DropDownRoom']")).click();
			browser.findElement(By.xpath(".//select[@id='ctl00_ContentPlaceHolder1_DropDownRoom']")).sendKeys("General");
			browser.findElement(By.xpath(".//input[contains(@id,'txtAvailableBed')]")).sendKeys("2");
			browser.findElement(By.xpath(".//input[contains(@id,'txtWardName')]")).sendKeys("Test Ward 6");
			browser.findElement(By.xpath(".//input[contains(@id,'txtBookingCharge')]")).sendKeys("1000");
			browser.findElement(By.xpath(".//input[contains(@id,'txtCheckin')]")).sendKeys("11");
			browser.findElement(By.xpath(".//input[contains(@id,'txtCheckOut')]")).sendKeys("11");
			browser.findElement(By.xpath(".//input[contains(@id,'btnSave')]")).click();
			
			System.out.println("Save Successful");
			Thread.sleep(2000);	
			Select dropdown = new Select(browser.findElement(By.xpath(".//select[contains(@id,'ddlRoomType')]")));
			dropdown.selectByVisibleText("General");
			Thread.sleep(4000);
			System.out.println("General selected");
			List <WebElement> ele= browser.findElements(By.xpath(".//td[contains(text(),'Test Ward 6')]/preceding-sibling::td/input"));
			/*for(WebElement ele1: ele){
			ele1.getAttribute("title");
				System.out.println(ele1.getAttribute("title"));					
			}*/
			WebElement Edit=ele.get(0);
			Edit.click();
			Thread.sleep(4000);
			browser.findElement(By.xpath(".//input[contains(@id,'txtWardName')]")).clear();
			browser.findElement(By.xpath(".//input[contains(@id,'txtWardName')]")).sendKeys("Edited Ward");
			browser.findElement(By.xpath(".//input[contains(@id,'BtnUpdate')]")).click();
			
			
			

	}

}
