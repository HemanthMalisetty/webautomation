package Unicorn.AbstractClasses;

import Unicorn.Pages.Beacons.Beacons;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class BeaconsBase<T extends BeaconsBase> extends AddEditBase<Beacons> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private BeaconsBaseBy by = new BeaconsBaseBy();
    @Override
    public T isLoaded()
    {
        this.title = "Beacons Details";
        super.isLoaded();
        return (T)this;
    }
    @Override
    public Beacons clickBack() {
        super.back();
        return new Beacons().isLoaded();
    }

    @Override
    protected Beacons clickUpdate() {
        super.update();
        return new Beacons().isLoaded();
    }

    @Override
    protected Beacons clickDelete() {
        super.delete();
        return new Beacons().isLoaded();
    }

    @Override
    protected Beacons clickAdd() {
        super.add();
        return new Beacons().isLoaded();
    }

    @Override
    public Beacons clickCancel() {
        super.cancel();
        return new Beacons().isLoaded();
    }
    public class BeaconsBaseBy {
        By  name = By.id("vmBeaconName"),
            macAddress = By.id("vmBeaconMacAddress"),
            latitude = By.id("vmBeaconLatitude"),
            description = By.id("vmBeaconDescription"),
            ipAddress = By.id("vmBeaconIpAddress"),
            longitude = By.id("vmBeaconLongitude"),
            source = By.id("vmBeaconSource"),
            location = By.id("vmBeaconLocationId"),
            type = By.id("vmBeaconType");
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

    public T setMacAddress(String macAddress)
    {
        dh.setText(by.macAddress, macAddress);
        return (T)this;
    }
    
    public String getMacAddress()
    {
        return dh.getValue(by.macAddress);
    }
    
    public boolean isMacAddressDisplayed()
    {
        return dh.isDisplayed(by.macAddress);
    }
    
    public T setLatitude(String latitude)
    {
        dh.setText(by.latitude, latitude);
        return (T)this;
    }
    
    public String getLatitude()
    {
        return dh.getValue(by.latitude);
    }
    
    public boolean isLatitudeDisplayed()
    {
        return dh.isDisplayed(by.latitude);
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
    
    public T setLongitude(String longitude)
    {
        dh.setText(by.longitude, longitude);
        return (T)this;
    }

    public String getLongitude()
    {
        return dh.getValue(by.longitude);
    }

    public boolean isLongitudeDisplayed()
    {
        return dh.isDisplayed(by.longitude);
    }

    public T selectSource(String source)
    {
        dh.getDhs().selectOption(by.source, source);
        return (T)this;
    }
    
    public String getSource()
    {
        return dh.getDhs().getSelectedOption(by.source);
    }
    
    public boolean isSourceDisplayed()
    {
        return dh.isDisplayed(by.source);
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

    public T selectType(String type)
    {
        dh.getDhs().selectOption(by.type, type);
        return (T)this;
    }

    public String getType()
    {
        return dh.getDhs().getSelectedOption(by.type);
    }

    public boolean isTypeDisplayed()
    {
        return dh.isDisplayed(by.type);
    }
}