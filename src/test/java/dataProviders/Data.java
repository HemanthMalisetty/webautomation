package dataProviders;

import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name = "dataTest",parallel = true)
    public static Object[][] provideDataTest()
    {
        return new Object[][]{ { 1 }, { 2 } };
    }
}
