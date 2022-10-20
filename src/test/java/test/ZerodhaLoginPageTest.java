package test;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v102.browser.Browser;
import org.testng.annotations.BeforeMethod;
import pom.ZerodhaLoginPage;
import utility.Parametrization;



public class ZerodhaLoginPageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = Browser.openChromeBrowser("http/vctcpune.com");
	}
	
	@Test
	public void validateZerodhaLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage obj = new ZerodhaLoginPage(driver);
		
		obj.enterUserID(Parametrization.getExcelData(0, 1, "Credentials"));
		obj.enterPassword(Parametrization.getExcelData(1, 1, "Credentials"));
		obj.clickOnLogin();
		Thread.sleep(1000);
		obj.enterPin(Parametrization.getExcelData(2, 1, "Credentials"));
		obj.clickOnContinue();
		
	}
	
	

}
