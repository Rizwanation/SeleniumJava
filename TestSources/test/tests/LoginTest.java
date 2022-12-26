import config.ReadConfig;
import org.testng.annotations.Test;
import sources.Driver;
import sources.DriverManager;

import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public final class LoginTest extends baseTest {

    private LoginTest(){}
    @Test
    public void test1() throws IOException {
        System.out.println("test 2 at : " + Date.from(Instant.now()));

    }

}
