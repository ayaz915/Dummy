package testcases;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ReservationPage;
import utility.Base;

public class TC_002_BookFlight extends Base{
	
	@Test
	public void TC_002_BookFlight() throws Exception {
		HomePage homePage = new HomePage(driver);
		ReservationPage reservationPage = new ReservationPage(driver);
		homePage.chooseYourDepartureCity();
		homePage.chooseYourDestinationCity();
		homePage.clickOnFindFlightsButton();
		waitForPageLoad();
		
		reservationPage.clickOnChooseThisFlightButton();
		
		
	}

}
