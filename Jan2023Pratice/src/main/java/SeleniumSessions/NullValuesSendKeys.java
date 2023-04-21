package SeleniumSessions;

import io.netty.util.collection.CharCollections;

public class NullValuesSendKeys {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		
//		driver.findElement(By.id("input-email")).sendKeys(null);
		
		
		
		String input = "My name is vinayak bhatte";
		
		StringBuilder vowels = new StringBuilder();
		
		String v = "aeiouAEIOU";
		
		
		
		char[] c = input.toCharArray();
		
		for(char e:c) {
			if(v.indexOf(e) >= 0) {
				vowels.append(e);
			}
	
		}
		
		System.out.println(vowels);
    
		    
		

		
	}


}
