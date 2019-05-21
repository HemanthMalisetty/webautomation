package Unicorn.AbstractClasses;

import Unicorn.Pages.ACPs.ACPList.ACP;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class ACPsBase<T extends ACPsBase> extends AddEditBase<ACP> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private ACPsBaseBy by = new ACPsBaseBy();
    @Override
    public T isLoaded()
    {
        this.title = "Access Control Points Details";
        super.isLoaded();
        return (T)this;
    }
    @Override
    public ACP clickBack() {
        super.back();
        return new ACP().isLoaded();
    }

    @Override
    protected ACP clickUpdate() {
        super.update();
        return new ACP().isLoaded();
    }

    @Override
    protected ACP clickDelete() {
        super.delete();
        return new ACP().isLoaded();
    }

    @Override
    protected ACP clickAdd() {
        super.add();
        return new ACP().isLoaded();
    }

    @Override
    public ACP clickCancel() {
        super.cancel();
        return new ACP().isLoaded();
    }
    public class ACPsBaseBy {
        By  name = By.id("vmAcpComputerName"),
            ipAddress = By.id("vmAcpIpAddress"),
            description = By.id("vmAcpDescription"),
            acpGroup = By.id("vmAcpAcpGroupId"),
            enabled = By.xpath(".//*[@id='acps']//label[contains(text(),'Enabled')]"),
            fixedLocation = By.xpath(".//*[@id='acps']//label[contains(text(),'Fixed Location')]");
    }
    public T clickEnabled()
    {
        dh.click(by.enabled);
        return (T)this;
    }

    public boolean isEnabledDisplayed()
    {
        return dh.isDisplayed(by.enabled);
    }
    public T clickFixedLocation()
    {
        dh.click(by.fixedLocation);
        return (T)this;
    }

    public boolean isFixedLocationDisplayed()
    {
        return dh.isDisplayed(by.fixedLocation);
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

    public T setIpAddress(String ipAddress)
    {
        dh.setText(by.ipAddress, ipAddress);
        return (T)this;
    }

    public String getIpAddress()
    {
        return dh.getValue(by.ipAddress);
    }

    public boolean isIpAddressDisplayed()
    {
        return dh.isDisplayed(by.ipAddress);
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

    public T selectAcpGroup(String acpGroup)
    {
        dh.getDhs().selectOption(by.acpGroup, acpGroup);
        return (T)this;
    }

    public String getAcpGroup()
    {
        return dh.getDhs().getSelectedOptionText(by.acpGroup);
    }

    public boolean isAcpGroupDisplayed()
    {
        return dh.isDisplayed(by.acpGroup);
    }
}