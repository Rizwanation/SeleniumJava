import org.testng.annotations.Test;
import sources.Driver;

public final class HomepageTest extends baseTest {

    private HomepageTest(){}

    @Test
    public void googleTest()
    {
        Driver.getDriver().get("https://www.google.com");
    }
}
