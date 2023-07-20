package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage extends BasePage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {

		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")
	WebElement ADD_CUSTOMER_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement STATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_CODE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SUBMIT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"side-menu\\\"]/li[3]/ul/li[2]/a")
	WebElement LIST_CUSTOMERS_ELEMENT;

	public void validateAddCustomerPage(String expectedText) {
		validateElement(ADD_CUSTOMER_HEADER_ELEMENT.getText(), expectedText, "ADD cUSTOMER PAGE NOT FOUND!");

	}

	public void insertFullName(String fullName) {
		FULL_NAME_ELEMENT.sendKeys(fullName + randomNumGenerator(999));

	}

	public void selectCompanyName(String company) {
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);

	}

	public void inserEmail(String email) {
		EMAIL_ELEMENT.sendKeys(randomNumGenerator(999) + email);

	}

	public void insertPhoneNumber(String phoneNumber) {
		PHONE_NUMBER_ELEMENT.sendKeys(phoneNumber + randomNumGenerator(999));
	}

	public void insertAddress(String address) {

		ADDRESS_ELEMENT.sendKeys(address);
	}

	public void insertCity(String city) {

		CITY_ELEMENT.sendKeys(city);
	}

	public void insertState(String state) {

		STATE_ELEMENT.sendKeys(state);
	}

	public void insertZipCode(String zipcode) {

		ZIP_CODE_ELEMENT.sendKeys(zipcode);
	}

	public void selectCountryName(String country) {

		selectFromDropdown(COUNTRY_DROPDOWN_ELEMENT, country);
	}
	
	public void clickSaveButton() {
		
		SUBMIT_ELEMENT.click();
	}

}
