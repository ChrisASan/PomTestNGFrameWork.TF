package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import pages.NewDepositPage;
import util.BrowserFactory;

public class AddDepositTest {
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToAddDeposit() throws InterruptedException {
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");
		dashboardPage.clickTransactionButton();
		Thread.sleep(1000);
		dashboardPage.clickNewDepositButton();
		
		NewDepositPage newDepositPage = PageFactory.initElements(driver, NewDepositPage.class);
		newDepositPage.validateNewDepositPage("Add Deposit");
		newDepositPage.selectAccount("aaa");
		newDepositPage.insertDescription("Office supplies.");
		newDepositPage.insertAmount("10");
		newDepositPage.clickSubmitButton();
		
		Thread.sleep(1000);
		BrowserFactory.tearDown();
	}

}