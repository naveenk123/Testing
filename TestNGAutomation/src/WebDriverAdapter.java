import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverAdapter {

	/**
	 * @param args
	 */
	String browserDriver;
	
	public WebDriver getDriver(String browser){
		String dir = System.getProperty("user.dir");
		if(browser=="firefox"){
			System.setProperty("webdriver.gecko.driver",dir+"/tools/geckodriver");
			return new FirefoxDriver();	
		}
		else{
			System.setProperty("webdriver.chrome.driver",dir+"/tools/chromedriver");
			return new ChromeDriver();
		}
		
	}

}
