package Unicorn.Pages.Manifest;

import Unicorn.AbstractClasses.UnicornPageBase;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class ManifestSummary extends UnicornPageBase<ManifestSummary> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private ManifestSummaryBy by = new ManifestSummaryBy();
    public ManifestSummary()
    {
        title = "Manifest Summary";
        url = "media/summary";
    }

    @Override
    public ManifestSummary isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        return this;
    }

    public class ManifestSummaryBy
    {
        By  ready = By.xpath(".//*[@label='Ready']//p//span"),
            repair = By.xpath(".//*[@label='Repair']//p//span"),
            disposed = By.xpath(".//*[@label='Disposed']//p//span"),
            lost = By.xpath(".//*[@label='Lost']//p//span"),
            stolen = By.xpath(".//*[@label='Stolen']//p//span"),
            damaged = By.xpath(".//*[@label='Damaged']//p//span"),
            other = By.xpath(".//*[@label='Other']//p//span"),
            total = By.xpath(".//*[@label='Total']//p//span"),
            details = By.xpath(".//span[contains(text(),'Details')]"),
            reset = By.xpath(".//span[contains(text(),'Reset')]");
    }
    public ManifestDetails clickDetails()
    {
        dh.click(by.details);
        return new ManifestDetails().isLoaded();
    }

    public boolean isDetailsDisplayed()
    {
        return dh.isDisplayed(by.details);
    }

    public ManifestReset clickReset()
    {
        dh.click(by.reset);
        return new ManifestReset().isLoaded();
    }

    public boolean isResetDisplayed()
    {
        return dh.isDisplayed(by.reset);
    }

    public String getReady()
    {
        return dh.getText(by.ready);
    }
    public boolean isReadyDisplayed()
    {
        return dh.isDisplayed(by.ready);
    }
    public String getRepair()
    {
        return dh.getText(by.repair);
    }
    public boolean isRepairDisplayed()
    {
        return dh.isDisplayed(by.repair);
    }
    public String getDisposed()
    {
        return dh.getText(by.disposed);
    }
    public boolean isDisposedDisplayed()
    {
        return dh.isDisplayed(by.disposed);
    }

    public String getLost()
    {
        return dh.getText(by.lost);
    }
    public boolean isLostDisplayed()
    {
        return dh.isDisplayed(by.lost);
    }

    public String getStolen()
    {
        return dh.getText(by.stolen);
    }
    public boolean isStolenDisplayed()
    {
        return dh.isDisplayed(by.stolen);
    }

    public String getDamaged()
    {
        return dh.getText(by.damaged);
    }
    public boolean isDamagedDisplayed()
    {
        return dh.isDisplayed(by.damaged);
    }
    public String getOther()
    {
        return dh.getText(by.other);
    }
    public boolean isOtherDisplayed()
    {
        return dh.isDisplayed(by.other);
    }

    public String getTotal()
    {
        return dh.getText(by.total);
    }
    public boolean isTotalDisplayed()
    {
        return dh.isDisplayed(by.total);
    }
}