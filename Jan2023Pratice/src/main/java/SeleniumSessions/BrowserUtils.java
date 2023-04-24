package SeleniumSessions;

import java.sql.Driver;

import org.asynchttpclient.netty.channel.DefaultChannelPool.PoolLeaseStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BrowserUtils {
	
	static WebDriver driver;
	
	public WebDriver browserName(String browser){

	switch(browser.toLowerCase()) {
	
	case "chrome":
		driver = new ChromeDriver();
		break;
		
	case "firefox":
		driver = new FirefoxDriver();
		break;
		
	case "safari":
		driver = new SafariDriver();
		break;
		
	default:
		System.out.println("Please pass the right browser");
		
	
	}
	return driver;
	
	
	
	
	}

}
