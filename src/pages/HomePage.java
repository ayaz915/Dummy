package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Base;




public class HomePage extends Base{
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
	}

	
	By departureCity =By.xpath("//select[@name='fromPort']");
	public void chooseYourDepartureCity() {
		
		new Select(driver.findElement(departureCity)).selectByIndex(1);
	}
	
	By destinationCity =By.xpath("//select[@name='toPort']");
	public void chooseYourDestinationCity() {
		
		new Select(driver.findElement(departureCity)).selectByIndex(1);
	}
	
	
	By findFlightsButton =By.xpath("//input[@value='Find Flights']");
	public void clickOnFindFlightsButton() {
		
		driver.findElement(findFlightsButton).click();
	}
	
	By findFhomeButton =By.xpath("//a[normalize-space()='home']");
	public void clickOnHomeButton() {
		
		driver.findElement(findFhomeButton).click();
	}
}
