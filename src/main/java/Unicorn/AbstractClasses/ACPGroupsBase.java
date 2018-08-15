package Unicorn.AbstractClasses;

import Unicorn.Pages.ACPs.ACPGroups.ACPGroups;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class ACPGroupsBase<T extends ACPGroupsBase> extends AddEditBase<ACPGroups> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private ACPGroupBaseBy by = new ACPGroupBaseBy();
    @Override
    public T isLoaded()
    {
        this.title = "Access Control Points Details";
        super.isLoaded();
        return (T)this;
    }
    @Override
    public ACPGroups clickBack() {
        back();
        return new ACPGroups().isLoaded();
    }

    @Override
    protected ACPGroups clickUpdate() {
        update();
        return new ACPGroups().isLoaded();
    }

    @Override
    protected ACPGroups clickDelete() {
        delete();
        return new ACPGroups().isLoaded();
    }

    @Override
    protected ACPGroups clickAdd() {
        add();
        return new ACPGroups().isLoaded();
    }

    @Override
    public ACPGroups clickCancel() {
        cancel();
        return new ACPGroups().isLoaded();
    }
    private class ACPGroupBaseBy {
        By  name = By.id("vmAcpGroupName"),
            location = By.id("vmAcpGroupLocationId"),
            ACPGroupSetting = By.id("vmAcpGroupGroupSettingId");
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
    public T selectLocation(String location)
    {
        dh.getDhs().selectOption(by.location, location);
        return (T)this;
    }

    public String getLocation()
    {
        return dh.getDhs().getSelectedOption(by.location);
    }

    public boolean isLocationDisplayed()
    {
        return dh.isDisplayed(by.location);
    }

    public T selectACPGroupSetting(String ACPGroupSetting)
    {
        dh.getDhs().selectOption(by.ACPGroupSetting, ACPGroupSetting);
        return (T)this;
    }

    public String getACPGroupSetting()
    {
        return dh.getDhs().getSelectedOption(by.ACPGroupSetting);
    }

    public boolean isACPGroupSettingDisplayed()
    {
        return dh.isDisplayed(by.ACPGroupSetting);
    }
}
