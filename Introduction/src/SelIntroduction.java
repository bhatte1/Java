import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//The control and beginning of execution of a program starts from the main method.
		//Invocation the browser
		//Chrome - ChromeDriver -> Methods
		// webdriver is an interface
		// Webdriver methods + personal chrome driver methods
		//ChromeDriver driver = new ChromeDriver();
		//hence changed to webdriver because  chrome dirver personal methods might not work with Firefox and Edge
		
		System.setProperty("webdriver.chrome.driver", "/Users/vinayakbhatte/Java/chromedriver");   //system.setproperty(Key,Value)
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
