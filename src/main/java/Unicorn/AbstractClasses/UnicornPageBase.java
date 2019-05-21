package Unicorn.AbstractClasses;

import AbstractClasses.PageBase;
import Helpers.Session;
import Unicorn.UnicornDriverHelper;
import Unicorn.UnicornExcel;
import Unicorn.UnicornFooter;
import Unicorn.UnicornNav;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class UnicornPageBase<H extends UnicornPageBase> extends PageBase{

    protected String url = null,title;
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    public UnicornExcel excel = new UnicornExcel(Session.getExcelHeader());
    public UnicornNav nav = new UnicornNav();
    public UnicornFooter footer = new UnicornFooter();
    public final Logger logger = LoggerFactory.getLogger(getClass());
    private UnicornPageBaseBy by = new UnicornPageBaseBy();
    public UnicornPageBase()
    {
        if (!Session.getEnv().toLowerCase().equals("localhost"))
            url = "" + Session.getEnv().toLowerCase() + "";
        else
            url = "http://localhost:8080/";
    }
    public class UnicornPageBaseBy {
        By header = By.xpath("//h1");
    }

    public abstract H isLoaded();

    protected void getUrl()
    {
        log("Attempting to navigate to: " + title);
        dh.getURL(url);
    }
    public void log(String message) {
        logger.info(message);
        System.out.println(message);
    }
    public String getHeader(){ return dh.getText(by.header); }
}
