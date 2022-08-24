package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddContactPage extends BasePage {
	WebDriver driver;
	public AddContactPage(WebDriver driver) {
		this.driver = driver;
	}
	// Element List
	@FindBy(how = How.XPATH, using = "//h5[contains(text(), 'Add Contact')]")
	WebElement ADD_CONTACT_PAGE_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'account']")
	WebElement FULL_NAME_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'cid']")
	WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'email']")
	WebElement EMAIL_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'phone']")
	WebElement PHONE_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'address']")
	WebElement ADDRESS_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'city']")
	WebElement CITY_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'state']")
	WebElement STATE_REGION_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'zip']")
	WebElement ZIP_POSTAL_CODE_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'country']")
	WebElement COUNTRY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'tags']")
	WebElement TAGS_DROPWDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'currency']")
	WebElement CURRENCY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'group']")
	WebElement GROUP_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'password']")
	WebElement PASSWORD_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'cpassword']")
	WebElement CONFIRM_PASSWORD_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//label[contains(text(), 'Yes')]")
	WebElement WELCOME_EMAIL_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id = 'submit']")
	WebElement SAVE_BUTTON_ELEMENT;

	public void validateAddContactPage(String header) {
		Assert.assertEquals(ADD_CONTACT_PAGE_HEADER_ELEMENT.getText(), header, "Wrong Page");
	}
	
	String enteredName;
	public void insertFullName(String fullName) {
		enteredName = fullName;
		FULL_NAME_INPUT_BOX_ELEMENT.sendKeys(enteredName);
	}

	public void selectCompanyFromDropDown(String company) {
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT, company);
	}

	public void insertEmail(String email) {
		EMAIL_INPUT_BOX_ELEMENT.sendKeys(email);
	}

	public void insertPhone(String phoneNumber) {
		PHONE_INPUT_BOX_ELEMENT.sendKeys(phoneNumber);
	}

	public void insertAddress(String address) {
		ADDRESS_INPUT_BOX_ELEMENT.sendKeys(address);
	}

	public void insertCity(String city) {
		CITY_INPUT_BOX_ELEMENT.sendKeys(city);
	}

	public void insertState(String state) {
		STATE_REGION_INPUT_BOX_ELEMENT.sendKeys(state);
	}

	public void insertZipCode(String zip) {
		ZIP_POSTAL_CODE_INPUT_BOX_ELEMENT.sendKeys(zip);
	}

	public void selectCountryFromDropDown(String country) {
		selectFromDropdown(COUNTRY_DROPDOWN_ELEMENT, country);
	}

	public void selectTagFromDropdown(String tag) {
		selectFromDropdown(TAGS_DROPWDOWN_ELEMENT, tag);
	}

	public void selectCurrencyFromDropDown(String currency) {
		selectFromDropdown(CURRENCY_DROPDOWN_ELEMENT, currency);
	}

	public void selectGroupFromDropDown(String group) {
		selectFromDropdown(GROUP_DROPDOWN_ELEMENT, group);
	}

	public void insertPassword(String password) {
		PASSWORD_INPUT_BOX_ELEMENT.sendKeys(password);
	}

	public void insertPasswrodAgainToConfirm(String cpassword) {
		CONFIRM_PASSWORD_INPUT_BOX_ELEMENT.sendKeys(cpassword);
	}

	public void clickEmailButton() {
		WELCOME_EMAIL_BUTTON_ELEMENT.click();
	}

	public void clickSaveButton() {
		SAVE_BUTTON_ELEMENT.click();
	}

	String beforeXPATH = "//tbody/tr[";
	String afterXPATH = "]/td[3]";
	String after_XPATH_delete = "]/td[3]/following-sibling::td[4]/a[2]";

	public void validateCreatedCustomerAndDelete() {
		for (int i = 1; i <= 5; i++) {
			String customerList = driver.findElement(By.xpath(beforeXPATH + i + afterXPATH)).getText();
			if (customerList.contains(enteredName)) {
				System.out.println("Entered name exist.");
				driver.findElement(By.xpath(beforeXPATH + i + after_XPATH_delete)).click();
			}
		}
	}

}