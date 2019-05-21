package Unicorn.Pages.Manifest;

import Unicorn.AbstractClasses.UnicornPageBase;
import Unicorn.SiteComponent.ConfirmPrompt;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class ManifestReset extends UnicornPageBase<ManifestReset> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private ManifestResetBy by = new ManifestResetBy();
    public ManifestReset(){
        title = "Base Line Reset";
        url = "media/reset";
    }

    @Override
    public ManifestReset isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        return this;
    }

    public class ManifestResetBy {
        By  back = By.xpath("//h1//i"),
            firmwareVersion = By.id("vmFirmwareVersion"),
            submitInventoryUpdate = By.xpath("//button[text()='Submit Inventory Update']");
    }

    public ManifestSummary clickBack()
    {
        dh.click(by.back);
        return new ManifestSummary().isLoaded();
    }

    public boolean isBackDisplayed()
    {
        return dh.isDisplayed(by.back);
    }

    public ManifestReset selectFirmwareVersion(String firmwareVersion)
    {
        dh.getDhs().selectOption(by.firmwareVersion, firmwareVersion);
        return this;
    }

    public String getFirmwareVersion()
    {
        return dh.getDhs().getSelectedOptionText(by.firmwareVersion);
    }

    public boolean isFirmwareVersionDisplayed()
    {
        return dh.isDisplayed(by.firmwareVersion);
    }

    public ConfirmPrompt<ManifestReset,ManifestSummary> clickSubmitInventoryUpdate()
    {
        dh.click(by.submitInventoryUpdate);
        return new ConfirmPrompt<>(new ManifestReset(), new ManifestSummary());
    }

    public boolean isSubmitInventoryUpdateDisplayed()
    {
        return dh.isDisplayed(by.submitInventoryUpdate);
    }
}