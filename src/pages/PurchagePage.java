package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Base;

public class PurchagePage extends Base{

	

	public PurchagePage(WebDriver driver) {
		this.driver =driver;
	}
	
	By firstNameTextBox =By.xpath("//input[@id='inputName']");
	public void inputFirstName() {
		driver.findElement(firstNameTextBox).sendKeys("Ayaz");
		
	}
	
	By addressTextBox =By.xpath("//input[@id='address']");
	public void enterAddress() {
		driver.findElement(addressTextBox).sendKeys("2211 grange str p2v35");
		
	}

	
	By purchaseFlightButton =By.xpath("//input[@value='Purchase Flight']");
	public void clickOnPurchaseFlightButton() {
		driver.findElement(purchaseFlightButton).click();
		
	}
}
