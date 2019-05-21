import Helpers.LocalDriverManager;
import dataProviders.Data;
import org.testng.annotations.Test;

public class test extends BaseTest{

    @Test(dataProvider = "dataTest", dataProviderClass = Data.class)
    public void test(int num)
    {
        LocalDriverManager.getDriver().get("https://www.google.com");

        System.out.println(num);
    }
}
