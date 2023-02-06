package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Base;

public class LoginPage extends Base{
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	By emailAddressTextBox =By.xpath("//input[@id='email']");
	public void enterEmailAddress() {
		driver.findElement(emailAddressTextBox).sendKeys("test@test.com");
	}
	
	By passwordTextBox =By.xpath("//input[@id='email']");
	public void enterPassword() {
		driver.findElement(passwordTextBox).sendKeys("test@123");
	}
	
	
	By loginButton =By.xpath("//button[@type='submit']");
	public void clickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	By registerLink =By.xpath("//a[normalize-space()='Register']");
	public void clickOnRegisterLink() {
		driver.findElement(registerLink).click();
	}
}
