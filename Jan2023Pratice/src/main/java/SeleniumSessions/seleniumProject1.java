package SeleniumSessions;

import java.security.PublicKey;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumProject1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		
		
		
//		//1st approach
//		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		
//		driver.findElement(By.id("input-firstname")).sendKeys("Vinayak");
//		
//		driver.findElement(By.id("input-lastname")).sendKeys("Bhatte");
//		
//		
//		//2nd approach
//		
//		String firstName = "Vinayak";
//		String lastName = "Bhatte";
//		
//		WebElement first  = driver.findElement(By.id("input-firstname"));
//		
//		WebElement last  = driver.findElement(By.id("input-lastname"));
//		
//		first.sendKeys(firstName);
//		last.sendKeys(lastName);
		
		
//		//3rd approach
//		
//		String firstName = "Vinayak";
//		String lastName = "Bhatte";
//		
//		By inputFirstname = By.id("input-firstname");
//		By inputLastName = By.id("input-lastname");
//		
//		WebElement first  = driver.findElement(inputFirstname);
//		
//		WebElement last  = driver.findElement(inputLastName);
//		
//		first.sendKeys(firstName);
//		last.sendKeys(lastName);
//		
//		//4th approach
//		
//		String firstName = "Vinayak";
//		String lastName = "Bhatte";
//		
//		By inputFirstname = By.id("input-firstname");
//		By inputLastName = By.id("input-lastname");
//		
//		WebElement first  = getElement(inputFirstname);
//		
//		WebElement last  = getElement(inputLastName);
//		
//		first.sendKeys(firstName);
//		last.sendKeys(lastName);
		
//		//5th Approach
//		String firstName = "Vinayak";
//		String lastName = "Bhatte";
//		
//		By inputFirstname = By.id("input-firstname");
//		By inputLastName = By.id("input-lastname");
//		
//		doSendKeys(inputFirstname, lastName);
//		doSendKeys(inputLastName, lastName);
		
		//6th approach
		
		String firstName = "Vinayak";
		String lastName = "Bhatte";
		
		By inputFirstname = By.id("input-firstname");
		By inputLastName = By.id("input-lastname");
		
		
		ElementUtils eu = new ElementUtils(driver);
		
		eu.doSendKeys(inputLastName, lastName);
		eu.doSendKeys(inputFirstname, firstName);
		
		
			

	}
	
//	public static void doSendKeys(By locator, String keys) {
//		getElement(locator).sendKeys(keys);
//	}
//	
//	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//		
//	}

}
