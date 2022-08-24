package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	  static WebDriver driver;
		
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin");
		driver.manage().window().maximize();
		return driver;
	}
	public static void tearDown() {
		driver.close();
		driver.quit();}

}
