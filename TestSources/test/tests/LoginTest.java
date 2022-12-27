import static config.ReadConfig.*;

import org.assertj.core.api.SoftAssertions;
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

        SoftAssertions softly = new SoftAssertions();
        DriverManager.getDriver().get(get("url"));
        PPDHomePage hp = new PPDHomePage();
        hp.clickLogin().enterEmailAddress(get("useremail")).enterPassword(get("password")).clickLoginButton();
        Thread.sleep(5000);
        softly.assertThat(DriverManager.getDriver().getTitle())
                .isEqualTo("Maisonette | Boutique Children's Clothes and Decor");

        softly.assertAll();

    }
}
