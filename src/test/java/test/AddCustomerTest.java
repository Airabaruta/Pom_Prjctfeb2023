package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	
	WebDriver driver;
	
	//Test Data
	String username = "demo@techfios.com";
	String password = "abc123";
	String dashboardValidationText = "Dashboard";
	String addCustomerValidationText = "Add Contact";
	String FULLNAME = "Michelle Obama";
	String COMPANY = "Apple";
	String EMAIL = "michelleobama@techfios.com";
	String PHONE = "2075709050";
	String ADDRESS = "45 TECHFIOS DR";
	String CITY = "Dallas";
	String STATE = "Texas";
	String ZIPCODE = "77580";
	String COUNTRY = "Burundi";
	

	
	@Test
	public void userShouldBeAbleToAddCustomer() throws InterruptedException {
		
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.performLogin(username, password);
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(dashboardValidationText);
		Thread.sleep(3000);
		dashboardPage.clickCustomerButton();
		dashboardPage.clickAddCustomerButton();
		
		AddCustomerPage addCustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomerPage.validateAddCustomerPage(addCustomerValidationText);
		addCustomerPage.insertFullName(FULLNAME);
		addCustomerPage.selectCompanyName(COMPANY);
		addCustomerPage.inserEmail(EMAIL);
		addCustomerPage.insertPhoneNumber(PHONE);
		addCustomerPage.insertAddress(ADDRESS);
		addCustomerPage.insertCity(CITY);
		addCustomerPage.insertState(STATE);
		addCustomerPage.insertZipCode(ZIPCODE);
		addCustomerPage.selectCountryName(COUNTRY);
		addCustomerPage.clickSaveButton();
		
		
		
		
	}
		
		
		
	
	
	
}


