import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/vinayakbhatte/Java/chromedriver");   //system.setproperty(Key,Value)
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Vinayak");
		driver.findElement(By.name("inputPassword")).sendKeys("Vinayak");
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(5000);
		String a = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(a);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vinayak");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vin@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("vinayak@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("5454534546565");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		

		
		
		

	}

}
