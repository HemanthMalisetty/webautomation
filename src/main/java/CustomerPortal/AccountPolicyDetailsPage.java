package CustomerPortal;

import AbstractClasses.PageBase;
import CustomerPortal.PolicyAccordians.BillingDetails;
import Helpers.DriverHelper;
import org.openqa.selenium.By;

public class AccountPolicyDetailsPage extends PageBase {
    private DriverHelper dh = new DriverHelper();
    private AccountPolicyDetailsPageBy by = new AccountPolicyDetailsPageBy();
    public BillingDetails billingDetails = new BillingDetails();

    public AccountPolicyDetailsPage()
    {
        title = "Account Management Portal";
    }

    private class AccountPolicyDetailsPageBy {
        By  infoTab = By.xpath("//h3[contains(text(),'My Info')]"),
            billingDetails = By.xpath("//h3[contains(text(),'Billing Details')]");

    }

    public AccountPolicyDetailsPage isLoaded()
    {
        dh.waitForTitle(title);
        dh.waitForElementToBeVisible(by.infoTab);
        return this;
    }
    public BillingDetails clickBillingDetails()
    {
        dh.click(by.billingDetails);
        return billingDetails;
    }

}
