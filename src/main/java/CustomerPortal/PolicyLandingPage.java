package CustomerPortal;

import AbstractClasses.PageBase;
import Helpers.DriverHelper;
import org.openqa.selenium.By;

public class PolicyLandingPage extends PageBase {

    private DriverHelper dh = new DriverHelper();
    private PolicyLandingBy by = new PolicyLandingBy();

    private class PolicyLandingBy {
        By  myPoliciesTab = By.id("myPolicies");
    }

    public PolicyLandingPage isLoaded() {
        dh.waitForElementToBeVisible(by.myPoliciesTab);
        return this;
    }

    public Boolean policyIsPresent(String policyNumber) {
        return dh.isDisplayed("//*[@class='table']//b[text()='" + policyNumber + "']");
    }

    public MyPolicies myPoliciesTable(String policyNumber) {
        return new MyPolicies(policyNumber);
    }
//    public AccountPolicyDetailsPage clickPolicyNumberLink(String policyNumber) {
//        return dh.cl
//    }

    public class MyPolicies {
        private String policyNumber;
        private myPoliciesBy by;
        public MyPolicies(String policyNumber)
        {
            this.policyNumber = policyNumber;
            by= new myPoliciesBy();
        }

        private class myPoliciesBy {
            String policy = "//*[@class='table']//b[text()='" + policyNumber +"']/../../..";
            By      policyNumberLink = By.xpath(policy + "//a//b"),
                    policyStatus = By.xpath(policy + "//td[1]"),
                    policyLocation = By.xpath(policy + "//td[3]"),
                    policyEffective = By.xpath(policy + "//td[4]"),
                    policyPremiumPrice = By.xpath(policy + "//td[5]"),
                    fileAClaim = By.xpath(policy + "//i[contains(@class,'folder-open')]"),
                    payNow = By.xpath(policy + "//a[@title='Pay Now']");
        }

        public boolean isPolicyPresent()
        {
            return dh.isDisplayed(by.policy);
        }
        public AccountPolicyDetailsPage clickPolicyNumber()
        {
            dh.click(by.policyNumberLink);
            return new AccountPolicyDetailsPage().isLoaded();
        }
        public String getPolicyStatus()
        {
            return dh.getText(by.policyStatus);
        }
        public String getPolicyLocation()
        {
            return dh.getText(by.policyLocation);
        }
        public String getPolicyEffectiveDate()
        {
            return dh.getText(by.policyEffective);
        }
        public String getPolicyPremium()
        {
            return dh.getText(by.policyPremiumPrice);
        }
        // Add return type to new class where file a claim takes you
        public void fileAClaim()
        {
            dh.click(by.fileAClaim);
        }
        // Add return type to new class where pay now takes you
        public void payNow()
        {
            dh.click(by.payNow);
        }
    }
}
