package Unicorn.AbstractClasses;

import Unicorn.Pages.ACLPermission.ACLPermissions;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public abstract class ACLPermissionBase<T extends ACLPermissionBase> extends AddEditBase<ACLPermissions> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private ACLPermissionBaseBy by = new ACLPermissionBaseBy();

    @Override
    public T isLoaded() {
        this.title = "Permissions Details";
        super.isLoaded();
        return (T)this;
    }

    @Override
    public ACLPermissions clickBack() {
        super.back();
        return new ACLPermissions().isLoaded();
    }

    @Override
    protected ACLPermissions clickUpdate() {
        super.update();
        return new ACLPermissions().isLoaded();

    }

    @Override
    protected ACLPermissions clickDelete() {
        super.delete();
        return new ACLPermissions().isLoaded();
    }

    @Override
    protected ACLPermissions clickAdd() {
        super.add();
        return new ACLPermissions().isLoaded();
    }

    @Override
    public ACLPermissions clickCancel() {
        super.cancel();
        return new ACLPermissions().isLoaded();
}

    public class ACLPermissionBaseBy {
        By  name = By.id("vmPermissionValue"),
            shortDescription = By.id("vmPermissionLabel"),
            longDescription = By.id("vmPermissionDescription");
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

    public T setShortDescription(String shortDescription)
    {
        dh.setText(by.shortDescription, shortDescription);
        return (T)this;
    }

    public String getShortDescription()
    {
        return dh.getValue(by.shortDescription);
    }

    public boolean isShortDescriptionDisplayed()
    {
        return dh.isDisplayed(by.shortDescription);
    }


    public T setLongDescription(String longDescription)
    {
        dh.setText(by.longDescription, longDescription);
        return (T)this;
    }

    public String getLongDescription()
    {
        return dh.getValue(by.longDescription);
    }

    public boolean isLongDescriptionDisplayed() {
        return dh.isDisplayed(by.longDescription);
    }
}
