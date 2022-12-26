package sources;

import config.ReadConfig;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public final class Driver {
    public static void initDriver() throws Exception {

       if (Objects.isNull(DriverManager.getDriver())) {
            System.setProperty("web.driver.chromedriver", FrameworkConstants.getChromePathDriver());
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            DriverManager.getDriver().get(ReadConfig.get("url"));
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
