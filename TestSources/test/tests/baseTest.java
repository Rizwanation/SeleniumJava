import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sources.Driver;
import sources.FrameworkConstants;


import java.util.concurrent.TimeUnit;

public class baseTest
{

   protected baseTest(){

   }

   @BeforeMethod
   public void setUp() throws Exception {
      Driver.initDriver();
   }

   @AfterMethod
   public void tearDown()
   {
      Driver.quitDriver();
   }
}
