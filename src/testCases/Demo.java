package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void f(){
		
//		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver();
	
		driver.get("http://www.google.com");
		 
		// Print the title
		System.out.println("Title of the page : "+ driver.getTitle());
	}
}
