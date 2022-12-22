package sources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class Driver {
    private static WebDriver driver;
    private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static void setDriver(WebDriver driver)
    {
        dr.set(driver);
    }
    public static WebDriver getDriver()
    {
        return dr.get();
    }

    public static void unload()
    {
        dr.remove();
    }

    public static void initDriver() {
        System.out.println("init driver method");
       if (Objects.isNull(getDriver())) {
            System.setProperty("web.driver.chromedriver", FrameworkConstants.getChromePathDriver());
            driver = new ChromeDriver();
            setDriver(driver);
            getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(getDriver())) {
            getDriver().quit();
            unload();
        }
    }
}
