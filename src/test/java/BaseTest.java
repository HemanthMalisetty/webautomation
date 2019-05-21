import Helpers.LocalDriverManager;
import Helpers.Session;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class BaseTest {
    private static String browser,env;
    private static Session session;

    @Parameters({"browser","env"})
    @BeforeSuite
    //                                                          remove this optional and make it a required field
    public void beforeSuite(@Optional("chrome") String browser,@Optional("dev") String env)
    {
        session = new Session(browser, env);

    }

    @BeforeMethod
    public void beforeMethod()
    {
        setWebDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void teardown()
    {
        LocalDriverManager.getDriver().close();
    }

    private void setWebDriver(){
        WebDriver driver;

        switch (Session.getBrowser()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException();
        }
        LocalDriverManager.setWebDriver(driver);
    }
}
