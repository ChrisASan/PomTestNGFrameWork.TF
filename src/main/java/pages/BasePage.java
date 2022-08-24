
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	
	public void selectFromDropdown(WebElement element, String text) {
		Select sel = new Select((element));
		sel.selectByVisibleText(text);
	}
	public void waiting(WebDriver driver, int seconds, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));	
	}
}
