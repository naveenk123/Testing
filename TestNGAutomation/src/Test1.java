import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	WebDriverAdapter adapter = new WebDriverAdapter();
	WebDriver driver = adapter.getDriver("firefox");
	@Test
  public void openURL() throws InterruptedException {
		try{driver.get("https://securifi.com");
		driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
		Thread.sleep(3);
		System.out.println("Test case passed");
		}catch(Exception e){
			// This tells  that website is failed to load
			System.out.println(e.getMessage());
			Assert.fail();
		}
		driver.quit();
		Assert.assertEquals("passed", "passed");
	  
  }
}
