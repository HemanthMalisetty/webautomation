package Unicorn.Pages.Users;

import Unicorn.AbstractClasses.UnicornPageBase;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class EditUser extends UnicornPageBase<EditUser> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private EditUserBy by = new EditUserBy();
    public EditUser()
    {
        title = "Users Details";
    }

    @Override
    public EditUser isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        updateTestStep(title);
        return this;
    }
    private class EditUserBy {
        By  resetPassword = By.xpath("//*[@act-show-if-has-claim='resetPassword']"),
            firstName = By.xpath("//label[text()='First Name']/../following-sibling::div[1]//span"),
            lastName = By.xpath("//label[text()='Last Name']/../following-sibling::div[1]//span"),
            loginID = By.xpath("//label[text()='Login ID']/../following-sibling::div[1]//span"),
            groupSearchBox = By.xpath("//*[@ng-form='selectvmGroups']//input"),
            totalNumberGroups = By.xpath("//*[contains(@class,'total-count')]"),
            update = By.xpath("//button[text()='Update']"),
            cancel = By.xpath(".//act-standard-details-buttons" +
                    "//div[not(contains(@class,'ng-hide'))]//button[text()='Cancel']");
    }
    public Users clickUpdate()
    {
        dh.click(by.update);
        return new Users().isLoaded();
    }
    public Users clickCancel()
    {
        dh.click(by.cancel);
        return new Users().isLoaded();
    }
    public EditUser clickPageNumber(String pageNumber)
    {
        dh.click("//a[contains(@ng-show,'page')][contains(.,'" + pageNumber + "')]");
        return this;
    }
    public EditUser clickResetPassword()
    {
        dh.click(by.resetPassword);
        return this;
    }

    public boolean isResetPasswordDisplayed()
    {
        return dh.isDisplayed(by.resetPassword);
    }
    public String getFirstName()
    {
        return dh.getText(by.firstName);
    }
    public boolean isFirstNameDisplayed()
    {
        return dh.isDisplayed(by.firstName);
    }

    public String getLastName()
    {
        return dh.getText(by.lastName);
    }
    public boolean isLastNameDisplayed()
    {
        return dh.isDisplayed(by.lastName);
    }

    public String getLoginID()
    {
        return dh.getText(by.loginID);
    }
    public boolean isLoginIDDisplayed()
    {
        return dh.isDisplayed(by.loginID);
    }
    public EditUser setGroupSearchBox(String groupSearchBox)
    {
        dh.setText(by.groupSearchBox, groupSearchBox);
        return this;
    }

    public String getGroupSearchBox()
    {
        return dh.getValue(by.groupSearchBox);
    }

    public boolean isGroupSearchBoxDisplayed()
    {
        return dh.isDisplayed(by.groupSearchBox);
    }
    public int getTotalNumberGroups()
    {
        return Integer.parseInt(dh.getText(by.totalNumberGroups));
    }
    public boolean isTotalNumberGroupsDisplayed()
    {
        return dh.isDisplayed(by.totalNumberGroups);
    }
}