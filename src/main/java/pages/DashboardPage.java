package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class DashboardPage extends BasePage {
	WebDriver driver;
	//Element List
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Transactions')]") WebElement TRANSACTION_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Deposit')]") WebElement NEW_DEPOSIT_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Customers')]") WebElement CUSTOMERS_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//A[contains(text(), 'Add Customer')]") WebElement ADD_CUSTOMER_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'List Customers')]") WebElement LIST_CUSTOMERS_ELEMENT;

		
	public void validateDashboardPage(String dashboard) {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), dashboard, "Wrong Page");
	}
	public void clickTransactionButton() {
		TRANSACTION_BUTTON_ELEMENT.click();
	}
	public void clickNewDepositButton() {
		NEW_DEPOSIT_ELEMENT.click();
	}
	public void clickCustomersButton() {
		CUSTOMERS_BUTTON_ELEMENT.click();
	}
	public void clickAddCustomerButton() throws InterruptedException {
		Thread.sleep(1000);
		ADD_CUSTOMER_BUTTON_ELEMENT.click();
	}
	public void clickListCustomerButton() throws InterruptedException {
		Thread.sleep(2000);
		LIST_CUSTOMERS_ELEMENT.click();
	}
}
