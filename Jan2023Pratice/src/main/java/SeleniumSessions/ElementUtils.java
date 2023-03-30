package SeleniumSessions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	private WebDriver driver;
	
	
	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void doSendKeys(By locator, String keys) {
		getElement(locator).sendKeys(keys);
	}
	
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	
	

}
