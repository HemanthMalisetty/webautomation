package Unicorn.Pages.LinkingConfiguration;

import Unicorn.AbstractClasses.UnicornPageBase;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class LinkingConfiguration extends UnicornPageBase<LinkingConfiguration>{
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private LinkingConfigurationBy by = new LinkingConfigurationBy();
    public LinkingConfiguration()
    {
        url+= "linking-configuration";
        title = "Linking Configuration";
    }
    @Override
    public LinkingConfiguration isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        updateTestStep(title);
        return this;
    }
    public LinkingConfiguration get()
    {
        getUrl();
        return isLoaded();
    }

    public class LinkingConfigurationBy {
        By  enforceFirstFactor = By.xpath(".//*[@id='linkingConfiguration']//label[contains(text(),'Enforce First Factor')]"),
            enforceSecondFactor = By.xpath(".//*[@id='linkingConfiguration']//label[contains(text(),'Enforce Second Factor')]"),
            enforcePLUMaximum = By.xpath(".//*[@id='linkingConfiguration']//label[contains(text(),'Enforce PLU Maximum')]"),
            maxFirstFactorFailures = By.id("vmValidation0MaxFirstFactorFailures"),
            maxPLUCount = By.id("vmValidation0MaxPluCount"),
            maxSecondFactorFailures = By.id("vmValidation0MaxSecondFactorFailures"),
            maxLockingDays = By.id("vmValidation0MaxLockingDays"),
            maxPLUDays = By.id("vmValidation0MaxPluDays"),
            save = By.xpath(".//*[@id='linkingConfiguration']//button[text()='Save']"),
            cancel = By.xpath(".//*[@id='linkingConfiguration']//button[text()='Cancel']");
    }
    public LinkingConfiguration clickEnforceFirstFactor()
    {
        dh.click(by.enforceFirstFactor);
        return this;
    }

    public boolean isEnforceFirstFactorDisplayed()
    {
        return dh.isDisplayed(by.enforceFirstFactor);
    }

    public LinkingConfiguration clickEnforceSecondFactor()
    {
        dh.click(by.enforceSecondFactor);
        return this;
    }

    public boolean isEnforceSecondFactorDisplayed()
    {
        return dh.isDisplayed(by.enforceSecondFactor);
    }

    public LinkingConfiguration clickEnforcePLUMaximum()
    {
        dh.click(by.enforcePLUMaximum);
        return this;
    }

    public boolean isEnforcePLUMaximumDisplayed()
    {
        return dh.isDisplayed(by.enforcePLUMaximum);
    }

    public LinkingConfiguration setMaxFirstFactorFailures(String maxFirstFactorFailures)
    {
        dh.setText(by.maxFirstFactorFailures, maxFirstFactorFailures);
        return this;
    }

    public String getMaxFirstFactorFailures()
    {
        return dh.getValue(by.maxFirstFactorFailures);
    }

    public boolean isMaxFirstFactorFailuresDisplayed()
    {
        return dh.isDisplayed(by.maxFirstFactorFailures);
    }

    public LinkingConfiguration setMaxPLUCount(String maxPLUCount)
    {
        dh.setText(by.maxPLUCount, maxPLUCount);
        return this;
    }

    public String getMaxPLUCount()
    {
        return dh.getValue(by.maxPLUCount);
    }

    public boolean isMaxPLUCountDisplayed()
    {
        return dh.isDisplayed(by.maxPLUCount);
    }

    public LinkingConfiguration setMaxSecondFactorFailures(String maxSecondFactorFailures)
    {
        dh.setText(by.maxSecondFactorFailures, maxSecondFactorFailures);
        return this;
    }

    public String getMaxSecondFactorFailures()
    {
        return dh.getValue(by.maxSecondFactorFailures);
    }

    public boolean isMaxSecondFactorFailuresDisplayed()
    {
        return dh.isDisplayed(by.maxSecondFactorFailures);
    }

    public LinkingConfiguration setMaxLockingDays(String maxLockingDays)
    {
        dh.setText(by.maxLockingDays, maxLockingDays);
        return this;
    }

    public String getMaxLockingDays()
    {
        return dh.getValue(by.maxLockingDays);
    }

    public boolean isMaxLockingDaysDisplayed()
    {
        return dh.isDisplayed(by.maxLockingDays);
    }

    public LinkingConfiguration setMaxPLUDays(String maxPLUDays)
    {
        dh.setText(by.maxPLUDays, maxPLUDays);
        return this;
    }

    public String getMaxPLUDays()
    {
        return dh.getValue(by.maxPLUDays);
    }

    public boolean isMaxPLUDaysDisplayed()
    {
        return dh.isDisplayed(by.maxPLUDays);
    }

    public LinkingConfiguration clickSave()
    {
        dh.click(by.save);
        return this;
    }

    public boolean isSaveDisplayed()
    {
        return dh.isDisplayed(by.save);
    }

    public LinkingConfiguration clickCancel()
    {
        dh.click(by.cancel);
        return this;
    }

    public boolean isCancelDisplayed()
    {
        return dh.isDisplayed(by.cancel);
    }


}
