package testcases;
import org.testng.annotations.Test;

import pages.Confirmation;
import pages.HomePage;
import pages.PurchagePage;
import pages.ReservationPage;
import utility.Base;

public class TC_002_BookFlight extends Base{
	
	@Test
	public void TC_002_BookFlight() throws Exception {
		HomePage homePage = new HomePage(driver);
		ReservationPage reservationPage = new ReservationPage(driver);
		PurchagePage purchagePage = new PurchagePage(driver);
		Confirmation confirmation =new Confirmation(driver);
		
		homePage.chooseYourDepartureCity();
		homePage.chooseYourDestinationCity();
		homePage.clickOnFindFlightsButton();
		waitForPageLoad();
		
		reservationPage.clickOnChooseThisFlightButton();
		waitForPageLoad();
		
		purchagePage.inputFirstName();
		purchagePage.enterAddress();
		purchagePage.clickOnPurchaseFlightButton();
		
		waitForPageLoad();
		confirmation.validateThankYouText();
		
	}

}
