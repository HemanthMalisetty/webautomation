package CustomerPortal;

import AbstractClasses.PageBase;
import Helpers.DriverHelper;
import org.openqa.selenium.By;

public class Login extends PageBase {
    private DriverHelper dh = new DriverHelper();
    private LoginBy by = new LoginBy();

    public Login(){
    }

    private class LoginBy {
        By  username = By.name("j_username"),
            password = By.name("j_password"),
            submit = By.name("submitquote");
    }

    public Login get()
    {
        dh.getURL(url);
        return isLoaded();
    }
    public Login isLoaded()
    {
        dh.waitForElementToBeVisible(by.username);
        return this;
    }
    public Login setUsername(String username)
    {
        dh.setText(by.username, username);
        return this;
    }
    public Login setPassword(String password)
    {
        dh.setText(by.password, password);
        return this;
    }

    /**
     * Return isLoaded to enable method chaining and waiting for page to properly
     * load, thus resulting in more stable tests */
    public PolicyLandingPage clickSubmit()
    {
        dh.click(by.submit);
        return new PolicyLandingPage().isLoaded();
    }
}
