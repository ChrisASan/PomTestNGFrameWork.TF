package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListCustomerPage {

	WebDriver driver;
	
//	Element List
	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'OK')]")
	WebElement POP_UP_OK_DELETE_CONFIRMATION_BUTTON;
	
	public void deleteConfirmCreatedCustomer() {
		POP_UP_OK_DELETE_CONFIRMATION_BUTTON.click();
	}
	
	
	
}
