package Unicorn.AbstractClasses;

import Unicorn.Pages.PermissioningGroups.PermissioningGroups;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class PermissioningGroupBase<T extends PermissioningGroupBase> extends AddEditBase<PermissioningGroups>{
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private PermissioningGroupBaseBy by = new PermissioningGroupBaseBy();
    @Override
    public T isLoaded() {
        this.title = "Permission Group Details";
        super.isLoaded();
        return (T)this;
    }
    @Override
    public PermissioningGroups clickBack() {
        super.back();
        return new PermissioningGroups().isLoaded();
    }

    @Override
    protected PermissioningGroups clickUpdate() {
        super.update();
        return new PermissioningGroups().isLoaded();
    }

    @Override
    protected PermissioningGroups clickDelete() {
        super.delete();
        return new PermissioningGroups().isLoaded();
    }

    @Override
    protected PermissioningGroups clickAdd() {
        super.add();
        return new PermissioningGroups().isLoaded();
    }

    @Override
    public PermissioningGroups clickCancel() {
        super.cancel();
        return new PermissioningGroups().isLoaded();
    }

    private class PermissioningGroupBaseBy {
        By  name = By.id("vmGroupRole"),
            parkReportingLevel = By.id("vmGroupParkReportingLevel"),
            description = By.id("vmGroupLabel"),
            jobCode = By.name("vmGroupJobCode"),
            permissioningAccess = By.name("vmGroupPermissions"),
            positionNumber = By.name("vmGroupPositionNumber");


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
    
    public T selectParkReportingLevel(String parkReportingLevel)
    {
        dh.getDhs().selectOption(by.parkReportingLevel, parkReportingLevel);
        return (T)this;
    }
    
    public String getParkReportingLevel()
    {
        return dh.getDhs().getSelectedOptionText(by.parkReportingLevel);
    }
    
    public boolean isParkReportingLevelDisplayed()
    {
        return dh.isDisplayed(by.parkReportingLevel);
    }
    public T setDescription(String description)
    {
        dh.setText(by.description, description);
        return (T)this;
    }
    
    public String getDescription()
    {
        return dh.getValue(by.description);
    }
    
    public boolean isDescriptionDisplayed()
    {
        return dh.isDisplayed(by.description);
    }
    public T selectJobCode(String jobCode)
    {
        dh.getDhs().selectOption(by.jobCode, jobCode);
        return (T)this;
    }
    
    public String getJobCode()
    {
        return dh.getDhs().getSelectedOptionText(by.jobCode);
    }
    
    public boolean isJobCodeDisplayed()
    {
        return dh.isDisplayed(by.jobCode);
    }
    public T selectPermissioningAccess(String permissioningAccess)
    {
        dh.getDhs().selectOption(by.permissioningAccess, permissioningAccess);
        return (T)this;
    }
    
    public String getPermissioningAccess()
    {
        return dh.getDhs().getSelectedOptionText(by.permissioningAccess);
    }
    
    public boolean isPermissioningAccessDisplayed()
    {
        return dh.isDisplayed(by.permissioningAccess);
    }
    public T selectPositionNumber(String positionNumber)
    {
        dh.getDhs().selectOption(by.positionNumber, positionNumber);
        return (T)this;
    }
    
    public String getPositionNumber()
    {
        return dh.getDhs().getSelectedOptionText(by.positionNumber);
    }
    
    public boolean isPositionNumberDisplayed()
    {
        return dh.isDisplayed(by.positionNumber);
    }
    public T removeJobCode(String code)
    {
        dh.click("//*[@name='vmGroupJobCode']/../..//div[contains(text(),'" + code + "')]//i");
        return (T)this;
    }
    public T removePermissioningAccess(String access)
    {
        dh.click("//*[@name='vmGroupPermissions']/../..//div[contains(text(),'" + access + "')]//i");
        return (T)this;
    }
    public T removePositionNumber(String positionNumber)
    {
        dh.click("//*[@name='vmGroupPositionNumber']/../..//div[contains(text(),'" + positionNumber + "')]//i");
        return (T)this;
    }
}
