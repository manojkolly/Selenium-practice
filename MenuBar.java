package selauto;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;

public class MenuBar {
	
	@FindBy(xpath=".//a[contains(text(),'My Home')]")
	WebElement MyHome;
	@FindBy(xpath=".//a[contains(text(),'Manage')]")
	WebElement Manage;
	@FindBy(xpath=".//a[contains(text(),'Supplier Master')]")
	WebElement SupplierMaster;
	@FindBy(xpath=".//a[contains(text(),'Parameter Master')]")
	WebElement ParameterMaster;
	@FindBy(xpath=".//a[contains(text(),'Disease Parameter Master')]")
	WebElement DiseaseParameterMaster;
	@FindBy(xpath=".//a[contains(text(),'Service Master')]")
	WebElement ServiceMaster;
	@FindBy(xpath=".//a[contains(text(),'taxes Master')]")
	WebElement taxesMaster;
	@FindBy(xpath=".//a[contains(text(),'Branch Master')]")
	WebElement BranchMaster;
	@FindBy(xpath=".//a[contains(text(),'Doctor Master')]")
	WebElement DoctorMaster;
	@FindBy(xpath=".//a[contains(text(),'Ward Master')]")
	WebElement WardMaster;
	@FindBy(xpath=".//a[contains(text(),'package Master')]")
	WebElement PackageMaster;
	@FindBy(xpath=".//a[contains(text(),'Expense Master')]")
	WebElement expenseMaster;
	@FindBy(xpath=".//a[contains(text(),'Product Master')]")
	WebElement ProductMaster;
	@FindBy(xpath=".//a[contains(text(),'Issue Medicine')]")
	WebElement IssueMedicine;
	@FindBy(xpath=".//a[contains(text(),'Receive Stock')]")
	WebElement ReceiveStock;
	@FindBy(xpath=".//a[contains(text(),'Stock Details')]")
	WebElement StockDetails;
	@FindBy(xpath=".//a[contains(text(),'Campaign Master')]")
	WebElement CampaignMaster;
	@FindBy(xpath=".//a[contains(text(),'Comprehensive Patient Search')]")
	WebElement ComprehensivePatientSearch;
	@FindBy(xpath=".//a[contains(text(),'Customized Reminder')]")
	WebElement CustomizedReminder;
	@FindBy(xpath=".//a[contains(text(),'schedule Reminder SMS')]")
	WebElement scheduleReminderSMS;
	@FindBy(xpath=".//a[contains(text(),'Stores')]")
	WebElement Stores;
	@FindBy(xpath=".//a[contains(text(),'Patient Contact Management')]")
	WebElement PatientContactManagement;
	@FindBy(xpath=".//a[contains(text(),'Collection')]")
	WebElement Collection;
	@FindBy(xpath=".//a[contains(text(),'Reports')]")
	WebElement Reports;
	@FindBy(xpath=".//a[contains(text(),'Patient List')]")
	WebElement PatientList;
	@FindBy(xpath=".//a[contains(text(),'Doctor\'s AvailibilityReport')]")
	WebElement DoctorsAvailibilityReport;
	@FindBy(xpath=".//a[contains(text(),'Payments')]")
	WebElement Payments;	
	@FindBy(xpath=".//a[contains(text(),'Daily Collection')]")
	WebElement DailyCollection;
	@FindBy(xpath=".//a[contains(text(),'Periodic Collection')]")
	WebElement PeriodicCollection;
	@FindBy(xpath=".//a[contains(text(),'Hospital Summary Report')]")
	WebElement HospitalSummaryReport;
	@FindBy(xpath=".//a[contains(text(),'Monthly')]")
	WebElement Monthly;
	@FindBy(xpath=".//a[contains(text(),'Periodic')]")
	WebElement Periodic;
	@FindBy(xpath=".//a[contains(text(),'Doctor Payment')]")
	WebElement DoctorPayment;
	@FindBy(xpath=".//a[contains(text(),'Detailed Doctor Payment')]")
	WebElement DetailedDoctorPayment;
	@FindBy(xpath=".//a[contains(text(),'Summarized Doctor Payment')]")
	WebElement SummarizedDoctorPayment;
	@FindBy(xpath=".//a[contains(text(),'Consultant Payment')]")
	WebElement ConsultantPayment;
	@FindBy(xpath=".//a[contains(text(),'Detailed Consultant Payment')]")
	WebElement DetailedConsultantPayment;
	@FindBy(xpath=".//a[contains(text(),'Summarized Consultant Payment')]")
	WebElement SummarizedConsultantPayment;
	
	@FindBy(xpath=".//a[contains(text(),'Employee Payment')]")
	WebElement EmployeePayment;
	@FindBy(xpath=".//a[contains(text(),'Detailed Employee Payment')]")
	WebElement DetailedEmployeePayment;
	@FindBy(xpath=".//a[contains(text(),'Summarized Employee Payment')]")
	WebElement SummarizedEmployeePayment;
	@FindBy(xpath=".//a[contains(text(),'Stocks')]")
	WebElement Stocks;
	@FindBy(xpath=".//a[contains(text(),'Received Stocks')]")
	WebElement ReceivedStocks;
	@FindBy(xpath=".//a[contains(text(),'Present Stocks')]")
	WebElement PresentStocks;
	@FindBy(xpath=".//a[contains(text(),'Expired Stocks')]")
	WebElement ExpiredStocks;
		
	
	
	private WebDriver browser;
    
	  public MenuBar(WebDriver browser){
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
