package Unicorn.SiteComponent;

import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class RemoveRowFromTable<T>{
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private RemoveRowFromTableBy by = new RemoveRowFromTableBy();
    private T t;
    public RemoveRowFromTable(T t)
    {
        this.t = t;

    }
    public class RemoveRowFromTableBy {
        By yes = By.xpath("//footer//button[text()='Yes']"),
                cancel = By.xpath("//footer//button[text()='Cancel']"),
                close = By.xpath("//span[text()='×']");
    }
    public T clickClose()
    {
        dh.click(by.close);
        return t;
    }

    public boolean isCloseDisplayed()
    {
        return dh.isDisplayed(by.close);
    }

    public T clickYes()
    {
        dh.click(by.yes);
        return t;
    }

    public boolean isYesDisplayed()
    {
        return dh.isDisplayed(by.yes);
    }

    public T clickCancel()
    {
        dh.click(by.cancel);
        return t;
    }

    public boolean isCancelDisplayed()
    {
        return dh.isDisplayed(by.cancel);
    }
}