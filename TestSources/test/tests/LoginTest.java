import org.testng.annotations.Test;
import sources.Driver;

public final class LoginTest extends baseTest {

    private LoginTest(){}
    @Test
    public void test1()
    {
        Driver.getDriver().get("https://www.twitter.com");
    }

}
