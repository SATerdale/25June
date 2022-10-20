package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver openChromeBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\Sanchali\\automation testing notes\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to(url);
		
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
