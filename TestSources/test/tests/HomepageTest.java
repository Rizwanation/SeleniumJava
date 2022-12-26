import org.testng.annotations.Test;
import sources.Driver;
import sources.DriverManager;

import java.time.Instant;
import java.util.Date;

public final class HomepageTest extends baseTest {

    private HomepageTest(){}

    @Test
    public void googleTest()
    {
        System.out.println("test 1 at : " + Date.from(Instant.now()));
        DriverManager.getDriver().get("https://www.google.com");
    }
}
