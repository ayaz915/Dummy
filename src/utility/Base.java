package utility;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base {

	public static WebDriver driver;
	
	@BeforeTest // anotations
	@Parameters("browser")

	public void setUp(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")){
			
			File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/chromedriver");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox")){
			File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			driver = new FirefoxDriver();		
		}
		else if(browser.equalsIgnoreCase("Edge")){
			File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/msedgedriver");
			System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
			driver = new EdgeDriver();
		}	
		
		else {
			Reporter.log("Invalid Browser Type");
			System.out.println("Invalid Browser Type");
		}
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/index.php");
		
	}
	
	@AfterTest
	public void tearDown() {
		
		//driver.close();
	} 
	
	public void waitForPageLoad() throws Exception{
		Thread.sleep(5000);
	}
	
	public void fluentWait() throws Exception{
		
	}
}
