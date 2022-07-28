import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/vinayakbhatte/Java/chromedriver");   //system.setproperty(Key,Value)
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Vinayak");
		driver.findElement(By.name("inputPassword")).sendKeys("Vinayak");
		driver.findElement(By.className("signInBtn")).click();

	}

}
