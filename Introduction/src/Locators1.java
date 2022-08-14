import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/vinayakbhatte/Java/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("rahul");

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals("You are successfully logged in.", text);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();

	}

}
