package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocator {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtils bu = new BrowserUtils();

		driver =  bu.browserName("chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement element = driver.findElement(By.name("newsletter"));
		
		
		driver.findElement(with(By.tagName("label")).toLeftOf(element)).click();
	}

}
