package SeleniumSessions;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project2 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtils bu = new BrowserUtils();
		
		driver =  bu.browserName("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//By locator = By.tagName("a");
		
		By locator = By.className("list-group-item");
		
		
		
		List<String> getEleTextList = getTextElements(locator);
		
		System.out.println(getEleTextList);

		

	}
	
	public static List<WebElement> totalTag(By locator) {
		
		return driver.findElements(locator);
		
	}
	
	public static List<String> getTextElements(By locator) {
		
		List<String> st = new ArrayList<String>();
		
		List<WebElement> atag = totalTag(locator);
		
		for(WebElement e: atag) {
			
			String getText = e.getText();
			st.add(getText);
			
		}
			
			
		return st;
		
	}

}
