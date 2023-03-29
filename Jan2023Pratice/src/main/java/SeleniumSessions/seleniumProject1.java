package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumProject1 {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		
		
		//1st approach
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Vinayak");
		
		driver.findElement(By.id("input-lastname")).sendKeys("Bhatte");

	}

}
