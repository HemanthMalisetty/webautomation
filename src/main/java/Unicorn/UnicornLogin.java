package Unicorn;

import Unicorn.AbstractClasses.UnicornPageBase;
import org.openqa.selenium.By;

public class UnicornLogin<T extends UnicornLogin> extends UnicornPageBase {

    private UnicornDriverHelper dh = new UnicornDriverHelper();
    UnicornLoginBy by = new UnicornLoginBy();
    public UnicornLogin()
    {
        title = "Login";
        url += "login";
    }
    @Override
    public T isLoaded() {
        dh.waitForTitle(title);
        log("Navigated to:" + title);
        return (T)this;
    }
    public T get()
    {
        getUrl();
        return isLoaded();
    }

    public class UnicornLoginBy {
        By  username = By.id("vmUserName"),
            passWord = By.id("vmPwd"),
            loginButton = By.xpath(".//*[@id='loginForm']//button[contains(text(),'Login')]");

    }
    public T setUsername(String username)
    {
        dh.setText(by.username, username);
        return (T)this;
    }
    public T setUsername()
    {

        dh.setText(by.username, excel.UserName);
        return (T)this;
    }

    public String getUsername()
    {
        return dh.getValue(by.username);
    }

    public boolean isUsernameDisplayed()
    {
        return dh.isDisplayed(by.username);
    }


    public T setPassWord(String passWord)
    {
        dh.setText(by.passWord, passWord);
        return (T)this;
    }
    public T setPassWord()
    {
        dh.setText(by.passWord, excel.Password);
        return (T)this;
    }

    public String getPassWord()
    {
        return dh.getValue(by.passWord);
    }

    public boolean isPassWordDisplayed()
    {
        return dh.isDisplayed(by.passWord);
    }

    public T clickLogin() {
        dh.click(by.loginButton);
        return (T)this;
    }

    public boolean isLoginDisplayed()
    {
        return dh.isDisplayed(by.loginButton);
    }

}
