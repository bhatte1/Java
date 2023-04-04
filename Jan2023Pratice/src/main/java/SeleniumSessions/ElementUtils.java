package SeleniumSessions;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<WebElement> totalTag(By locator) {
		
		return driver.findElements(locator);
		
	}
	
	public List<String> getTextElements(By locator) {
		
		List<String> st = new ArrayList<String>();
		
		List<WebElement> atag = totalTag(locator);
		
		for(WebElement e: atag) {
			
			String getText = e.getText();
			st.add(getText);
			
		}

		return st;
		
	}
	
	
	

}
