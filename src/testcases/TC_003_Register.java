package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.Register;
import utility.Base;

public class TC_003_Register extends Base{
	
	@Test
	public void TC_003_Register() throws Exception {
		
		HomePage homePage =new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		Register register =new Register(driver);
		
		homePage.clickOnHomeButton();
		waitForPageLoad();
		
		loginPage.clickOnRegisterLink();
		
		waitForPageLoad();
		register.enterName();
		register.enterCompanyName();
		
	}

}
