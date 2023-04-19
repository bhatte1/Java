package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativeLocator {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtils bu = new BrowserUtils();

		driver =  bu.browserName("chrome");
		
		driver.get("https://www.aqi.in/dashboard/canada");
		
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.linkText("Burlington, Canada"));

		// right of ele -->
		String rightScore = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightScore);

		// left of ele-->
		String leftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftIndex);

		// below of ele--->
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);

		// above of ele--->
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);

		//near of ele:
		String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
	}

}
