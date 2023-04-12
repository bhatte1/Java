package SeleniumSessions;

import java.util.List;

import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.google.com");

		By Searchlocator = By.className("gLFyf");

		By searchSuggestionBy = By.xpath("//div[@class='wM6W7d']/span");

		searchGoogle("dsdsdsdsdsd", Searchlocator, "Selenium Webdriver", searchSuggestionBy);

	}

	public static void searchGoogle(String SearchText, By SearchLocator, String searchEleText, By searchSuggestion)
			throws InterruptedException {

		WebElement element = driver.findElement(SearchLocator);

		element.sendKeys(SearchText);

		Thread.sleep(3000);

		List<WebElement> listOfSearchElements = driver.findElements(searchSuggestion);

		if (listOfSearchElements.size() > 0) {

			for (WebElement e : listOfSearchElements) {

				String text = e.getText();
				
				if(text.length() > 0) {

				System.out.println(text);

				if (e.getText().contains(searchEleText.toLowerCase())) {

					e.click();

					break;
				}
				 
				} else {
					System.out.println("Blank values");
					break;
				}

			}
		}else {
			System.out.println("Please pass the correct suggestion");
		}

	}

}
