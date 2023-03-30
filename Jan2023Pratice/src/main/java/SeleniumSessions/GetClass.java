package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BrowserUtils bu = new BrowserUtils();
		
		WebDriver driver =  bu.browserName("safari");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String firstName = "Vinayak";
		String lastName = "Bhatte";
		
		By inputFirstname = By.id("input-firstname");
		By inputLastName = By.id("input-lastname");
		
		
		ElementUtils eu = new ElementUtils(driver);

		eu.doSendKeys(inputFirstname, firstName);
		
		eu.doSendKeys(inputLastName, lastName);

	}

}
