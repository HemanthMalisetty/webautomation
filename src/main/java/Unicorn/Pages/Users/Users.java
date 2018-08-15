package Unicorn.Pages.Users;

import Unicorn.AbstractClasses.UnicornPageBase;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class Users extends UnicornPageBase<Users> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private UsersBy by = new UsersBy();
    public Users()
    {
        url += "users/find";
        title = "Find User";
    }
    @Override
    public Users isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        updateTestStep(title);
        return this;
    }
    private class UsersBy {
        By      searchBox = By.id("ctrlSearch"),
                searchClear = By.xpath("//*[@class='reset']//i"),
                searchButton = By.xpath("//act-search-box//button");
    }
    public Users setSearchBox(String searchBox)
    {
        dh.setText(by.searchBox, searchBox);
        return this;
    }

    public String getSearchBox()
    {
        return dh.getValue(by.searchBox);
    }

    public boolean isSearchBoxDisplayed()
    {
        return dh.isDisplayed(by.searchBox);
    }
    public boolean isSearchButtonDisplayed()
    {
        return dh.isDisplayed(by.searchButton);
    }

    public Users clickSearchWithNoResult()
    {
        dh.click(by.searchButton);
        return this;
    }
    public EditUser clickSearchWithResult()
    {
        dh.click(by.searchButton);
        return new EditUser().isLoaded();
    }
}