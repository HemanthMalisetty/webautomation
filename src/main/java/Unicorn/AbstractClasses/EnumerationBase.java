package Unicorn.AbstractClasses;

import Unicorn.Pages.Enumerations.Enumerations;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class EnumerationBase<T extends EnumerationBase> extends AddEditBase<Enumerations> {
    private EnumerationsBy by = new EnumerationsBy();
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    @Override
    public T isLoaded() {
        this.title = "Enumeration Details";
        super.isLoaded();
        return (T)this;
    }
    @Override
    public Enumerations clickBack() {
        super.back();
        return new Enumerations().isLoaded();
    }

    @Override
    protected Enumerations clickUpdate() {
        super.update();
        return new Enumerations().isLoaded();
    }

    @Override
    protected Enumerations clickDelete() {
        super.delete();
        return new Enumerations().isLoaded();
    }

    @Override
    protected Enumerations clickAdd() {
        super.add();
        return new Enumerations().isLoaded();
    }

    @Override
    public Enumerations clickCancel() {
        super.cancel();
        return new Enumerations().isLoaded();
    }
    public class EnumerationsBy {
        By  key = By.id("vmEnumerationsKey"),
            name = By.id("vmEnumerationsValue"),
            shortDescription = By.id("vmEnumerationsLabel"),
            longDescription = By.id("vmEnumerationsDescription");
    }
    public T selectKey(String key)
    {
        dh.getDhs().selectOption(by.key, key);
        return (T)this;
    }
    public String getKey()
    {
        return dh.getDhs().getSelectedOption(by.key);
    }
    public boolean isKeyDisplayed()
    {
        return dh.isDisplayed(by.key);
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

    public boolean isLongDescriptionDisplayed()
    {
        return dh.isDisplayed(by.longDescription);
    }
}
