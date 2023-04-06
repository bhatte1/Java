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
		
		ElementUtils eu = new ElementUtils(driver);
		
		By locator = By.className("list-group-item");

		List<String> getEleTextList = eu.getTextElements(locator);
		
		System.out.println(getEleTextList);

		

	}

}
