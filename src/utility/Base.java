package utility;

import java.io.File;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class Base {
	
	public static final Logger log = LogManager.getLogger(Base.class);

	public static WebDriver driver;
	
	@BeforeTest // anotations
	@Parameters("browser")

	public void setUp(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")){
			
			
			File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/chromedriver");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			driver = new ChromeDriver();
			log.info("Opening Chrome Browser");
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox")){
			log.info("Opening Firefox Browser");
			File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/geckodriver");
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
			driver = new FirefoxDriver();		
		}
		else if(browser.equalsIgnoreCase("Edge")){
			log.info("Opening Edge Browser");
			File file = new File("/Users/mr.a2z/Ayazworkspace/SDETBatch007/jar/msedgedriver");
			System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
			driver = new EdgeDriver();
		}	
		
		else {
			log.info("Invalid Browser Type");
		}
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/index.php");
		log.info("Url opened");
		
	}
	
	@AfterTest
	public void tearDown() {
		log.info("Closing the browser");
		//driver.close();
	} 
	
	public void waitForPageLoad() throws Exception{
		log.info("Waiting for 5 second");
		Thread.sleep(5000);
	}
	
	public void fluentWait() throws Exception{
		
	}
}
