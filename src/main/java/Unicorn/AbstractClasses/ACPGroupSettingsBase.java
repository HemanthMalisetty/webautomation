package Unicorn.AbstractClasses;

import Unicorn.Pages.ACPs.ACPGroupSettings.ACPGroupSettings;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class ACPGroupSettingsBase<T extends ACPGroupSettingsBase> extends AddEditBase<ACPGroupSettings> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private ACPGroupSettingsBaseBy by = new ACPGroupSettingsBaseBy();
    @Override
    public T isLoaded()
    {
        this.title = "Access Control Group Setting Details";
        super.isLoaded();
        return (T)this;
    }
    @Override
    public ACPGroupSettings clickBack() {
        back();
        return new ACPGroupSettings().isLoaded();
    }

    @Override
    protected ACPGroupSettings clickUpdate() {
        update();
        return new ACPGroupSettings().isLoaded();
    }

    @Override
    protected ACPGroupSettings clickDelete() {
        delete();
        return new ACPGroupSettings().isLoaded();
    }

    @Override
    protected ACPGroupSettings clickAdd() {
        add();
        return new ACPGroupSettings().isLoaded();
    }

    @Override
    public ACPGroupSettings clickCancel() {
        cancel();
        return new ACPGroupSettings().isLoaded();
    }
    private class ACPGroupSettingsBaseBy {
        By  name = By.id("vmAcpGroupSettingName"),
            experienceAccess = By.xpath("//*[@ng-form='selectvmAcpGroupSettingExperienceAccess']//input"),
            velocityCheckThreshold = By.id("vmAcpGroupSettingVelocityThresholdInMinutes"),
            theme = By.id("vmAcpGroupSettingTheme"),
            floridaResidentIDCheck = By.id("vmAcpGroupSettingResidentCheckEnabled"),
            biometrics = By.id("vmAcpGroupSettingBiometricsCheckEnabled"),
            velocityCheck = By.id("vmAcpGroupSettingVelocityCheckEnabled"),
            reEntryCheck = By.id("vmAcpGroupSettingReEntryCheckEnabled");
    }
    public T removeExperienceAccess(String code)
    {
        dh.click("//*[@ng-form='selectvmAcpGroupSettingExperienceAccess']" +
                "//following-sibling::div//div[contains(text(),'" + code + "')]//i");
        return (T)this;
    }
    public T setExperienceAccess(String experienceAccess)
    {
        dh.setText(by.experienceAccess, experienceAccess);
        return (T)this;
    }
    
    public String getExperienceAccess()
    {
        return dh.getValue(by.experienceAccess);
    }
    
    public boolean isExperienceAccessDisplayed()
    {
        return dh.isDisplayed(by.experienceAccess);
    }
    
    public T setName(String name)
    {
        dh.setText(by.name, name);
        return (T)this;
    }
    
    public String getName()
    {
        return dh.getValue(by.name);
    }
    
    public boolean isNameDisplayed()
    {
        return dh.isDisplayed(by.name);
    }
    
    public T setVelocityCheckThreshold(String velocityCheckThreshold)
    {
        dh.setText(by.velocityCheckThreshold, velocityCheckThreshold);
        return (T)this;
    }
    
    public String getVelocityCheckThreshold()
    {
        return dh.getValue(by.velocityCheckThreshold);
    }
    
    public boolean isVelocityCheckThresholdDisplayed()
    {
        return dh.isDisplayed(by.velocityCheckThreshold);
    }
    
    public T selectTheme(String theme)
    {
        dh.getDhs().selectOption(by.theme, theme);
        return (T)this;
    }
    
    public String getTheme()
    {
        return dh.getDhs().getSelectedOption(by.theme);
    }
    
    public boolean isThemeDisplayed()
    {
        return dh.isDisplayed(by.theme);
    }
    
    public T clickFloridaResidentIDCheck()
    {
        dh.click(by.floridaResidentIDCheck);
        return (T)this;
    }

    public boolean isFloridaResidentIDCheckDisplayed()
    {
        return dh.isDisplayed(by.floridaResidentIDCheck);
    }

    public T clickBiometrics()
    {
        dh.click(by.biometrics);
        return (T)this;
    }

    public boolean isBiometricsDisplayed()
    {
        return dh.isDisplayed(by.biometrics);
    }

    public T clickVelocityCheck()
    {
        dh.click(by.velocityCheck);
        return (T)this;
    }

    public boolean isVelocityCheckDisplayed()
    {
        return dh.isDisplayed(by.velocityCheck);
    }

    public T clickReEntryCheck()
    {
        dh.click(by.reEntryCheck);
        return (T)this;
    }

    public boolean isReEntryCheckDisplayed()
    {
        return dh.isDisplayed(by.reEntryCheck);
    }
}