package context;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.SignInPage;
import utils.BrowserFactory;
import utils.ReadConfig;


public class ScnContext {

	public WebDriver driver;
	public String browserName;
	public ReadConfig config;
	public final Logger logger = LogManager.getLogger(BrowserFactory.class.getName());
	public String appUrl;
	public SignInPage signInPage;
	


	
	
	
}
