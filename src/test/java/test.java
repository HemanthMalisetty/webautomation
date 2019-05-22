import CustomerPortal.Login;
import CustomerPortal.PolicyLandingPage;
import Helpers.LocalDriverManager;
import dataProviders.Data;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.rmi.runtime.Log;

import static org.testng.Assert.assertTrue;

public class test extends BaseTest{

    @Test(dataProvider = "dataTest", dataProviderClass = Data.class)
    public void test(int num)
    {
        LocalDriverManager.getDriver().get("https://www.google.com");

        System.out.println(num);
    }

    @Test
    public void loginToPortal()
    {
        Login login = new Login().get();
        PolicyLandingPage policyLandingPage =
                login
                        .setUsername("qaitest.ravidan@flhi.com")
                        .setPassword("Frontline1")
                        .clickSubmit();
        PolicyLandingPage.MyPolicies myPolicies = policyLandingPage.myPoliciesTable("2099611059");

        assertTrue(myPolicies.isPolicyPresent());

        assertTrue(!myPolicies.clickPolicyNumber().clickBillingDetails().getPolicyBilledTo().isEmpty());

        System.out.println("test completed");
    }
}
