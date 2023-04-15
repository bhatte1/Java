package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.build.AndroidDescriptor;

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		driver = new ChromeDriver();
//		driver.get("https://selectorshub.com/xpath-practice-page/");
//		
//		Thread.sleep(3000);
//		
//		
//		driver.findElement(By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input")).click();

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);

		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		List<WebElement> detailsElements = driver
				.findElements(By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td"));

		List<String> details = new ArrayList<String>();

		for (WebElement e : detailsElements) {
			String element = e.getText();
			if (element.isBlank() || element.contains("|")) {
				System.out.println("Blank or ||");
			} else {
				details.add(element.trim());
			}

		}

		System.out.println(details);

	}

}
