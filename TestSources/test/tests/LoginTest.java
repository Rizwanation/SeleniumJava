import org.testng.annotations.Test;
import sources.Driver;

public class LoginTest extends Driver {


    @Test
    public void test1()
    {
        driver.get("https://www.gotdoodle.com");
    }
}
