package pages;

import org.openqa.selenium.By;
import sources.DriverManager;

//page object class should be final because it doesn't need to be extended (inherited)
public final class PPDHomePage {
    //By type locators - keep them private so only getters/setters can access them

    private final By btnLogin = By.xpath("//a[@title='Account' and @href='/login']");

    //constructor - should be protected as we need to create objects for this page

    public PPDLoginPage clickLogin()
    {
        DriverManager.getDriver().findElement(btnLogin).click();
        return new PPDLoginPage();
    }



    //getters and setters


}
