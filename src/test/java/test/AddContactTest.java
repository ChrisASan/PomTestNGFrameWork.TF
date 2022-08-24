package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddContactPage;
import pages.DashboardPage;
import pages.ListCustomerPage;
import pages.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	WebDriver driver;
	@Test
	public void validUserShouldBeAbleToAddContact() throws InterruptedException {
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");
		dashboardPage.clickCustomersButton();
		dashboardPage.clickAddCustomerButton();
		
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.validateAddContactPage("Add Contact");
		addContactPage.insertFullName("San Ris");
		addContactPage.selectCompanyFromDropDown("Techfios");
		addContactPage.insertEmail("sanris@gmail.com");
		addContactPage.insertPhone("111-222-3333");
		addContactPage.insertAddress("north pole");
		addContactPage.insertCity("arkan City");
		addContactPage.insertState("georgia  "); 
		addContactPage.insertZipCode("4444");
		addContactPage.selectCountryFromDropDown("United States");
		addContactPage.selectTagFromDropdown("IT Training");
		addContactPage.selectCurrencyFromDropDown("USD");
		addContactPage.selectGroupFromDropDown("Selenium");
		addContactPage.insertPassword("password");
		addContactPage.insertPasswrodAgainToConfirm("password");
		addContactPage.clickEmailButton();
		addContactPage.clickSaveButton();
		
		dashboardPage.clickListCustomerButton();
		
		addContactPage.validateCreatedCustomerAndDelete();
		
		ListCustomerPage listCustomerPage = PageFactory.initElements(driver, ListCustomerPage.class);
		listCustomerPage.deleteConfirmCreatedCustomer();
		
		BrowserFactory.tearDown();
	} 

}
