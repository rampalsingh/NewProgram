package testCases;

import org.testng.annotations.Test;

public class Demo {

	@Test
	public void f(){
		
		System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}
}
