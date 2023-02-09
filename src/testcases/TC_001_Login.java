package testcases;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utility.Base;

public class TC_001_Login extends Base{
	
	@Test
	public void TC_001_Login() throws Exception {
		log.info("==========================Running TC_001_Login() ======================");
		HomePage homePage =new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		homePage.clickOnHomeButton();
		waitForPageLoad();
		loginPage.enterEmailAddress();
		
		loginPage.enterPassword();
		
		loginPage.clickOnLoginButton();
	}

}
