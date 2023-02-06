package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utility.Base;

public class Confirmation extends Base{

	
	public Confirmation(WebDriver driver) {
		this.driver =driver;
	}

	
	By thankYouText =By.xpath("//h1[normalize-space()='Thank you for your purchase today!']");
	public void validateThankYouText() {
		
		String actualText =driver.findElement(thankYouText).getText();
		
		Assert.assertEquals(actualText, "Thank you for your purchase today!");
	}
}
