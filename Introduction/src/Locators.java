import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/vinayakbhatte/Java/chromedriver");   //system.setproperty(Key,Value)
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  // wait till the item is appeared on the page 	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Vinayak");
		driver.findElement(By.name("inputPassword")).sendKeys("Vinayak");
		driver.findElement(By.className("signInBtn")).click();
		String a = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(a);
		driver.findElement(By.linkText("Forgot your password?")).click();
		//Thread.sleep(5000)
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vinayak");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vin@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("vinayak@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("5454534546565");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String actualPassword = getPassword(driver);
		System.out.println(actualPassword);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Vinayak");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(actualPassword);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='dropdown' and @id='vinayak']"));
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		String text = driver.findElement(By.cssSelector("form p")).getText();
		String [] splitText = text.split(" ");
		return splitText[4].substring(1,splitText[4].length()-1);	
		
	}

}


