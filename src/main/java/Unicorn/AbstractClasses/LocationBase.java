package Unicorn.AbstractClasses;

import Unicorn.Pages.Location.Locations;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public abstract class LocationBase<T extends LocationBase> extends AddEditBase<Locations> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    public LocationBaseBy by = new LocationBaseBy();

    public class LocationBaseBy {
        By  locationType = By.id("vmLocationType"),
            name = By.id("vmLocationName"),
            parent = By.id("vmLocationParentId"),
            longDescription = By.id("vmLocationLongDescription"),
            shortDescription = By.id("vmLocationShortDescription"),
            restrictions = By.id("vmLocationRestrictions"),
            capacity = By.id("vmLocationCapacity"),
            runningCapacity = By.id("vmLocationRunningCapacity"),
            tcmId = By.id("vmLocationTcmId"),
            accessibility = By.id("vmLocationAccessibility"),
            latitude = By.id("vmLocationLatitude"),
            longitude = By.id("vmLocationLongitude"),
            maximoLocation = By.id("vmLocationMaximoLocation"),
            zones = By.id("vmLocationZone"),
            operatingState = By.id("vmLocationOperatingState"),
            waitTime = By.id("vmLocationWaitTimeInMinutes"),
            averageRideDuration = By.id("vmLocationAvgRideDuration"),
            rideDurationErrorValue = By.id("vmLocationRideDurationErrorValue"),
            addressLine1 = By.id("vmLocationAddressLine1"),
            addressLine2 = By.id("vmLocationAddressLine2"),
            city = By.id("vmLocationCity"),
            state = By.id("vmLocationState"),
            zip = By.id("vmLocationZipCode"),
            phone = By.id("vmLocationPhone"),
            country = By.id("vmLocationCountry"),
            category = By.id("vmLocationCategory"),
            externalAttraction = By.id("vmLocationCategory"),
            virtualLine = By.xpath(".//form//div[not(contains(@class,'ng-hide'))]//input[@id='vmLocationVirtualQueueIndicator']/following-sibling::label"),
            expressPass = By.xpath(".//form//div[not(contains(@class,'ng-hide'))]//input[@id='vmLocationExpressPassIndicator']/following-sibling::label"),
            active = By.xpath(".//form//div[not(contains(@class,'ng-hide'))]//input[@id='vmLocationActive']/following-sibling::label"),
            cmsIndicator = By.xpath(".//form//div[not(contains(@class,'ng-hide'))]//input[@id='vmLocationCmsIndicator']/following-sibling::label");

    }
    public T clickActive()
    {
        dh.click(by.active);
        return (T)this;
    }

    public boolean isActiveDisplayed()
    {
        return dh.isDisplayed(by.active);
    }

    public T clickCmsIndicator()
    {
        dh.click(by.cmsIndicator);
        return (T)this;
    }

    public boolean isCmsIndicatorDisplayed()
    {
        return dh.isDisplayed(by.cmsIndicator);
    }


    public T clickExpressPass()
    {
        dh.click(by.expressPass);
        return (T)this;
    }

    public boolean isExpressPassDisplayed()
    {
        return dh.isDisplayed(by.expressPass);
    }


    public T clickVirtualLine()
    {
        dh.click(by.virtualLine);
        return (T)this;
    }

    public boolean isVirtualLineDisplayed()
    {
        return dh.isDisplayed(by.virtualLine);
    }


    public T selectCategory(String category)
    {
        dh.getDhs().selectOption(by.category, category);
        return (T)this;
    }

    public String getCategory()
    {
        return dh.getDhs().getSelectedOption(by.category);
    }

    public boolean isCategoryDisplayed()
    {
        return dh.isDisplayed(by.category);
    }

    public T selectExternalAttraction(String externalAttraction)
    {
        dh.getDhs().selectOption(by.externalAttraction, externalAttraction);
        return (T)this;
    }

    public String getExternalAttraction()
    {
        return dh.getDhs().getSelectedOption(by.externalAttraction);
    }

    public boolean isExternalAttractionDisplayed()
    {
        return dh.isDisplayed(by.externalAttraction);
    }

    public T isLoaded()
    {
        this.title = "Location Details";
        super.isLoaded();
        return (T)this;
    }
    @Override
    public Locations clickBack() {
        super.back();
        return new Locations().isLoaded();
    }

    @Override
    protected Locations clickUpdate() {
        super.update();
        return new Locations().isLoaded();
    }

    @Override
    protected Locations clickDelete() {
        super.delete();
        return new Locations().isLoaded();
    }

    @Override
    protected Locations clickAdd() {
        super.add();
        return new Locations().isLoaded();
    }

    @Override
    public Locations clickCancel() {
        super.cancel();
        return new Locations().isLoaded();
    }
    public T selectLocationType(String locationType)
    {
        dh.getDhs().selectOption(by.locationType, locationType);
        return (T)this;
    }
    
    public String getLocationType()
    {
        return dh.getDhs().getSelectedOption(by.locationType);
    }
    
    public boolean isLocationTypeDisplayed()
    {
        return dh.isDisplayed(by.locationType);
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
    public T selectParent(String parent)
    {
        dh.getDhs().selectOption(by.parent, parent);
        return (T)this;
    }
    
    public String getParent()
    {
        return dh.getDhs().getSelectedOption(by.parent);
    }
    
    public boolean isParentDisplayed()
    {
        return dh.isDisplayed(by.parent);
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
    
    
    public T setTcmId(String tcmId)
    {
        dh.setText(by.tcmId, tcmId);
        return (T)this;
    }
    
    public String getTcmId()
    {
        return dh.getValue(by.tcmId);
    }
    
    public boolean isTcmIdDisplayed()
    {
        return dh.isDisplayed(by.tcmId);
    }
    
    
    public T selectZones(String zones)
    {
        dh.getDhs().selectOption(by.zones, zones);
        return (T)this;
    }
    public T selectZones(int index)
    {
        dh.getDhs().selectOption(by.zones, index);
        return (T)this;
    }
    public String getZones()
    {
        return dh.getDhs().getSelectedOption(by.zones);
    }
    
    public boolean isZonesDisplayed()
    {
        return dh.isDisplayed(by.zones);
    }
    
    public T setAccessibility(String accessibility)
    {
        dh.setText(by.accessibility, accessibility);
        return (T)this;
    }

    public String getAccessibility()
    {
        return dh.getValue(by.accessibility);
    }

    public boolean isAccessibilityDisplayed()
    {
        return dh.isDisplayed(by.accessibility);
    }


    public T selectOperatingState(String operatingState)
    {
        dh.getDhs().selectOption(by.operatingState, operatingState);
        return (T)this;
    }
    
    public String getOperatingState()
    {
        return dh.getDhs().getSelectedOption(by.operatingState);
    }
    
    public boolean isOperatingStateDisplayed()
    {
        return dh.isDisplayed(by.operatingState);
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


    public T setWaitTime(String waitTime)
    {
        dh.setText(by.waitTime, waitTime);
        return (T)this;
    }
    
    public String getWaitTime()
    {
        return dh.getValue(by.waitTime);
    }
    
    public boolean isWaitTimeDisplayed()
    {
        return dh.isDisplayed(by.waitTime);
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


    public T setAverageRideDuration(String averageRideDuration)
    {
        dh.setText(by.averageRideDuration, averageRideDuration);
        return (T)this;
    }
    
    public String getAverageRideDuration()
    {
        return dh.getValue(by.averageRideDuration);
    }
    
    public boolean isAverageRideDurationDisplayed()
    {
        return dh.isDisplayed(by.averageRideDuration);
    }
    
    
    public T setMaximoLocation(String maximoLocation)
    {
        dh.setText(by.maximoLocation, maximoLocation);
        return (T)this;
    }

    public String getMaximoLocation()
    {
        return dh.getValue(by.maximoLocation);
    }

    public boolean isMaximoLocationDisplayed()
    {
        return dh.isDisplayed(by.maximoLocation);
    }


    public T setRideDurationErrorValue(String rideDurationErrorValue)
    {
        dh.setText(by.rideDurationErrorValue, rideDurationErrorValue);
        return (T)this;
    }
    
    public String getRideDurationErrorValue()
    {
        return dh.getValue(by.rideDurationErrorValue);
    }
    
    public boolean isRideDurationErrorValueDisplayed()
    {
        return dh.isDisplayed(by.rideDurationErrorValue);
    }
    
    
    public T setRestrictions(String restrictions)
    {
        dh.setText(by.restrictions, restrictions);
        return (T)this;
    }

    public String getRestrictions()
    {
        return dh.getValue(by.restrictions);
    }

    public boolean isRestrictionsDisplayed()
    {
        return dh.isDisplayed(by.restrictions);
    }


    public T setCapacity(String capacity)
    {
        dh.setText(by.capacity, capacity);
        return (T)this;
    }
    
    public String getCapacity()
    {
        return dh.getValue(by.capacity);
    }
    
    public boolean isCapacityDisplayed()
    {
        return dh.isDisplayed(by.capacity);
    }
    
    
    public T setRunningCapacity(String runningCapacity)
    {
        dh.setText(by.runningCapacity, runningCapacity);
        return (T)this;
    }
    
    public String getRunningCapacity()
    {
        return dh.getValue(by.runningCapacity);
    }
    
    public boolean isRunningCapacityDisplayed()
    {
        return dh.isDisplayed(by.runningCapacity);
    }
    
    
    public T setAddressLine1(String addressLine1)
    {
        dh.setText(by.addressLine1, addressLine1);
        return (T)this;
    }

    public String getAddressLine1()
    {
        return dh.getValue(by.addressLine1);
    }

    public boolean isAddressLine1Displayed()
    {
        return dh.isDisplayed(by.addressLine1);
    }


    public T setAddressLine2(String addressLine2)
    {
        dh.setText(by.addressLine2, addressLine2);
        return (T)this;
    }

    public String getAddressLine2()
    {
        return dh.getValue(by.addressLine2);
    }

    public boolean isAddressLine2Displayed()
    {
        return dh.isDisplayed(by.addressLine2);
    }


    public T setCity(String city)
    {
        dh.setText(by.city, city);
        return (T)this;
    }
    
    public String getCity()
    {
        return dh.getValue(by.city);
    }
    
    public boolean isCityDisplayed()
    {
        return dh.isDisplayed(by.city);
    }
    
    
    public T selectState(String state)
    {
        dh.getDhs().selectOption(by.state, state);
        return (T)this;
    }
    
    public String getState()
    {
        return dh.getDhs().getSelectedOption(by.state);
    }
    
    public boolean isStateDisplayed()
    {
        return dh.isDisplayed(by.state);
    }
    public T setZip(String zip)
    {
        dh.setText(by.zip, zip);
        return (T)this;
    }

    public String getZip()
    {
        return dh.getValue(by.zip);
    }

    public boolean isZipDisplayed()
    {
        return dh.isDisplayed(by.zip);
    }


    public T setPhone(String phone)
    {
        dh.setText(by.phone, phone);
        return (T)this;
    }

    public String getPhone()
    {
        return dh.getValue(by.phone);
    }

    public boolean isPhoneDisplayed()
    {
        return dh.isDisplayed(by.phone);
    }


    public T setCountry(String country)
    {
        dh.setText(by.country, country);
        return (T)this;
    }

    public String getCountry()
    {
        return dh.getValue(by.country);
    }

    public boolean isCountryDisplayed()
    {
        return dh.isDisplayed(by.country);
    }
}
