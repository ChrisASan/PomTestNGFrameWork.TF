package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUsername("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSignInButton();
		}

	
	
}
