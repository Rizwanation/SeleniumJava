package pages;

import config.ReadConfig;
import org.openqa.selenium.By;
import sources.DriverManager;

public final class PPDLoginPage {

    private final By txtEmail = By.id("login-email");
    private final By txtPassword = By.xpath("//input[@id='login-password' and @type = 'password']");
    private final By btnLogin = By.xpath("//button[text()='Log In']");

    public PPDLoginPage enterEmailAddress(String email)  {
        DriverManager.getDriver().findElement(txtEmail).sendKeys(email);
        return this;
    }

    public PPDLoginPage enterPassword(String password) {
        DriverManager.getDriver().findElement(txtPassword).sendKeys(password);
        return this;
    }

    public void clickLoginButton()
    {
        DriverManager.getDriver().findElement(btnLogin).click();
    }



}
