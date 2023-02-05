package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Base;


public class ReservationPage extends Base{

	public ReservationPage(WebDriver driver) {
		this.driver =driver;
	}
	
	By chooseThisFlightButton =By.xpath("//tbody/tr[5]/td[1]/input[1]");
	public void clickOnChooseThisFlightButton() {
		driver.findElement(chooseThisFlightButton).click();
		
	}
	
	By flightNumber =By.xpath("//td[normalize-space()='4346']");
	public String getFlightNumber() {
		
	String flightID= driver.findElement(flightNumber).getText();
	return flightID;
		
	}
	
}
