import static config.ReadConfig.*;
import org.testng.annotations.Test;
import pages.PPDHomePage;
import sources.Driver;
import sources.DriverManager;

import java.time.Instant;
import java.util.Date;

public final class LoginTest extends baseTest {

    private LoginTest(){}

    @Test
    public void LoginTest() throws Exception {

        DriverManager.getDriver().get(get("url"));
        PPDHomePage hp = new PPDHomePage();
        hp.clickLogin().enterEmailAddress(get("useremail")).enterPassword(get("password")).clickLoginButton();
        Thread.sleep(5000);

    }
}
