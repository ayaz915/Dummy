package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Base;

public class Register extends Base{

	
	//a[normalize-space()='Register']
	
	public Register(WebDriver driver) {
		this.driver=driver;
	}

	By nameTextBox =By.xpath("//input[@id='name']");
	public void enterName() {
		driver.findElement(companyNameTextBox).sendKeys("Ayaz");
	}
	By companyNameTextBox =By.xpath("//input[@id='company']");
	public void enterCompanyName() {
		driver.findElement(companyNameTextBox).sendKeys("Telus Intrernational");
	}
}
