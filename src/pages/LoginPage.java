package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Base;

public class LoginPage extends Base{
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	By emailAddress =By.xpath("//input[@id='email']");
	public void enterEmailAddress() {
		
		driver.findElement(emailAddress).sendKeys("test@test.com");
	}
}
