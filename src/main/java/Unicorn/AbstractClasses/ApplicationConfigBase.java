package Unicorn.AbstractClasses;

import Unicorn.Pages.ApplicationConfiguration.ApplicationKillSwitch;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class ApplicationConfigBase<T extends ApplicationConfigBase> extends AddEditBase<ApplicationKillSwitch> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    public ApplicationConfigBaseBy by = new ApplicationConfigBaseBy();
    @Override
    public T isLoaded() {
        this.title = "Application Switch Detail";
        super.isLoaded();
        return (T)this;
    }

    @Override
    public ApplicationKillSwitch clickBack() {
        super.back();
        return new ApplicationKillSwitch().isLoaded();
    }

    @Override
    protected ApplicationKillSwitch clickUpdate() {
        super.update();
        return new ApplicationKillSwitch().isLoaded();
    }

    @Override
    protected ApplicationKillSwitch clickDelete() {
        super.delete();
        return new ApplicationKillSwitch().isLoaded();
    }

    @Override
    protected ApplicationKillSwitch clickAdd() {
        super.add();
        return new ApplicationKillSwitch().isLoaded();
    }

    @Override
    public ApplicationKillSwitch clickCancel() {
        super.cancel();
        return new ApplicationKillSwitch().isLoaded();
    }
    public class ApplicationConfigBaseBy {
        By  applicationName = By.id("vmApplicationApplicationName"),
            applicationVersion = By.id("vmApplicationApplicationVersion"),
            operatingSystem = By.id("vmApplicationOperatingSystem"),
            features = By.xpath(".//*[@id='application-switch']//act-multi-select//input"),
            featuresAddButton = By.xpath(".//*[@id='application-switch']//act-multi-select//i[contains(@class,'fa-plus')]");
    }
    public T setApplicationName(String applicationName)
    {
        dh.setText(by.applicationName, applicationName);
        return (T)this;
    }

    public String getApplicationName()
    {
        return dh.getValue(by.applicationName);
    }

    public boolean isApplicationNameDisplayed()
    {
        return dh.isDisplayed(by.applicationName);
    }

    public T setApplicationVersion(String applicationVersion)
    {
        dh.setText(by.applicationVersion, applicationVersion);
        return (T)this;
    }

    public String getApplicationVersion()
    {
        return dh.getValue(by.applicationVersion);
    }

    public boolean isApplicationVersionDisplayed()
    {
        return dh.isDisplayed(by.applicationVersion);
    }


    public T selectPlatform(String operatingSystem)
    {
        dh.getDhs().selectOption(by.operatingSystem, operatingSystem);
        return (T)this;
    }
    
    public String getPlatform()
    {
        return dh.getDhs().getSelectedOption(by.operatingSystem);
    }
    
    public boolean isOperatingSystemDisplayed()
    {
        return dh.isDisplayed(by.operatingSystem);
    }
    
    


    public T addFeature(String feature)
    {
        dh.setText(by.features,feature);
        dh.click(by.featuresAddButton);
        isFeatureDisplayed(feature);
        return (T)this;
    }
    public T deleteFeature(String feature)
    {
        dh.click(By.xpath(".//*[@id='application-switch']//div[contains(text(),'" + feature + "')]//i"));
        return (T)this;
    }
    public T enableFeature(String feature)
    {
        dh.click(By.xpath(".//*[@id='application-switch']//act-standard-table//cell[text()='" + feature + "']/following-sibling::cell[1]//input"));
        return (T)this;
    }
    public T disableFeature(String feature)
    {
        dh.click(By.xpath(".//*[@id='application-switch']//act-standard-table//cell[text()='" + feature + "']/following-sibling::cell[2]//input"));
        return (T)this;
    }
    public T hideFeature(String feature)
    {
        dh.click(By.xpath(".//*[@id='application-switch']//act-standard-table//cell[text()='" + feature + "']/following-sibling::cell[3]//input"));
        return (T)this;
    }
    public boolean isFeatureDisplayed(String feature)
    {
        return dh.isDisplayed(By.xpath(".//*[@id='application-switch']//div[contains(text(),'" + feature + "')]"));
    }
}
