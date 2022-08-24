package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class NewDepositPage extends BasePage {
	WebDriver driver;
//	Element List
	@FindBy(how = How.XPATH, using = "//h5[contains(text(), 'Add Deposit')]") WebElement ADD_DEPOSIT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id = 'account']") WebElement ACCOUNT_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name = 'description']") WebElement DESCRIPTION_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@name = 'amount']") WebElement AMOUNT_INPUT_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id = 'submit']") WebElement SUBMIT_BUTTON_ELEMENT;
	
	
	public void validateNewDepositPage(String header) {
		Assert.assertEquals(ADD_DEPOSIT_HEADER_ELEMENT.getText(), header, "Wrong Page!!");
	}
	public void selectAccount(String account) {
		selectFromDropdown(ACCOUNT_DROPDOWN_ELEMENT, account);
	}
	public void insertDescription(String desc) {
		DESCRIPTION_INPUT_BOX_ELEMENT.sendKeys(desc);
	}
	public void insertAmount(String amount) {
		AMOUNT_INPUT_BOX_ELEMENT.sendKeys(amount);
	}
	public void clickSubmitButton() {
		SUBMIT_BUTTON_ELEMENT.click();
	}
}
