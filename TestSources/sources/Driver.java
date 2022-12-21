package sources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sources.FrameworkConstants;


import java.util.concurrent.TimeUnit;

public class Driver
{
   public WebDriver driver;
   @BeforeMethod
   public void setUp()
   {
      System.setProperty("web.driver.chromedriver", FrameworkConstants.getChromePathDriver());
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   }

   @AfterMethod
   public void tearDown()
   {
      driver.quit();
   }
}
