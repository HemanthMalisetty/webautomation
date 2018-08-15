package Unicorn.AbstractClasses;

import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public abstract class AddEditBase<T extends UnicornPageBase> extends UnicornPageBase {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private AddEditBaseBy by = new AddEditBaseBy();
    @Override
    public UnicornPageBase isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        return this;
    }
    public class AddEditBaseBy {
        By      back = By.xpath("//h1//i"),
                update = By.xpath("//button[text()='Update']"),
                delete = By.xpath("//button[text()='Delete']"),
                add = By.xpath(".//act-standard-details-buttons//button[contains(text(),'Add')]"),
                cancel = By.xpath(".//act-standard-details-buttons" +
                        "//div[not(contains(@class,'ng-hide'))]//button[text()='Cancel']");
    }

    public abstract T clickBack();
    protected abstract T clickUpdate();
    protected abstract T clickDelete();
    protected abstract T clickAdd();
    public abstract T clickCancel();


    protected T back()
    {
        dh.click(by.back);
        return (T)this;
    }

    public boolean isBackDisplayed()
    {
        return dh.isDisplayed(by.back);
    }

    protected T update()
    {
        dh.click(by.update);
        return (T)this;
    }

    public boolean isUpdateDisplayed()
    {
        return dh.isDisplayed(by.update);
    }

    protected T delete()
    {
        dh.click(by.delete);
        return (T)this;
    }

    public boolean isDeleteDisplayed()
    {
        return dh.isDisplayed(by.delete);
    }

    protected T add()
    {
        dh.click(by.add);
        return (T)this;
    }

    public boolean isAddDisplayed()
    {
        return dh.isDisplayed(by.add);
    }

    protected T cancel()
    {
        dh.click(by.cancel);
        if(dh.isDisplayed(by.cancel))
            dh.click(by.cancel);
        return (T)this;
    }

    public boolean isCancelDisplayed()
    {
        return dh.isDisplayed(by.cancel);
    }
}
