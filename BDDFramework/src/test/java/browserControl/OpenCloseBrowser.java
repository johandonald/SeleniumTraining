package browserControl;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class OpenCloseBrowser extends BaseClass {

	@Before
	public void openBrowser() {
		if (browserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "../BDDFramework/src/test/java/resources/chromedriver");
			browser = new ChromeDriver();
			
		} else if(browserType.equalsIgnoreCase("Firefox")) {
			System.setProperty("Webdriver.gecko.driver","../BDDFramework/src/test/java/resources/geckodriver");
	        browser = new FirefoxDriver(); 
		     
		}
		 browser.manage().window().maximize();
	}	
	
	@After
	public void closeBrowser() {
		browser.close();
		
	}
	
	
}
