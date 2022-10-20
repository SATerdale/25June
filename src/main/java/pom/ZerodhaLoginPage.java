package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	
	@FindBy (xpath ="//input[@id='userid']")private WebElement userId;
	@FindBy (xpath ="//input[@id='password']")private WebElement password;
	@FindBy (xpath="//button[@type='submit']")private WebElement login;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	@FindBy (xpath="//input[@type='password']")private WebElement pin;
	@FindBy (xpath="//button[@type='submit']")private WebElement submitPin;
	@FindBy (xpath="//a[text()='Problem with PIN?']")private WebElement problemWithPin;
	@FindBy (xpath="//a[text()='Forgot 2FA?']")private WebElement forgot2FA;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public void enterUserID(String user) {
		userId.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void clickOnFotgot() {
		forgot.click();
	}
	
	public void clickOnSignUp() {
		signup.click();
	}
	
	public void enterPin(String pinNumber) {
		pin.sendKeys(pinNumber);
	}
	
	public void clickOnContinue() {
		submitPin.click();
	}
	
	public void clickOnProblemWithPin() {
		problemWithPin.click();
	}
	
	public void clickOnForgot2FA() {
		forgot2FA.click();
	}
	

}
