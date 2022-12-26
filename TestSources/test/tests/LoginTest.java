import org.testng.annotations.Test;
import sources.Driver;
import sources.DriverManager;

public final class LoginTest extends baseTest {

    private LoginTest(){}
    @Test
    public void test1()
    {
        DriverManager.getDriver().get("https://www.twitter.com");
    }

    @Test
    public void test2()
    {
        DriverManager.getDriver().get("https://www.twitter.com");
    }

    @Test
    public void test3()
    {
        DriverManager.getDriver().get("https://www.twitter.com");
    }

    @Test
    public void test4()
    {
        DriverManager.getDriver().get("https://www.twitter.com");
    }

}
