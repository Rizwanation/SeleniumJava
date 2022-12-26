import org.testng.annotations.Test;
import sources.Driver;
import sources.DriverManager;

public final class HomepageTest extends baseTest {

    private HomepageTest(){}

    @Test
    public void googleTest()
    {
        DriverManager.getDriver().get("https://www.google.com");
    }
}
