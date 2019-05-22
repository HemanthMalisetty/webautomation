package CustomerPortal.PolicyAccordians;

import Helpers.DriverHelper;
import org.openqa.selenium.By;

public class BillingDetails  {
    private DriverHelper dh = new DriverHelper();
    private BillingDetailsBy by = new BillingDetailsBy();

    private class BillingDetailsBy {
        By policyBilledTo = By.xpath("//label[contains(text(),'Policy Billed To')]/..//div");
    }

    public String getPolicyBilledTo()
    {
        return dh.getText(by.policyBilledTo);
    }
}

