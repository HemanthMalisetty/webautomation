package Unicorn.AbstractClasses;

import Unicorn.Pages.MediaInventory.Media;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class MediaInventoryBase<T extends MediaInventoryBase> extends AddEditBase<Media> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private MediaInventoryBaseBy by = new MediaInventoryBaseBy();

    @Override
    public T isLoaded() {
        this.title = "Edit Media";
        super.isLoaded();
        return (T) this;
    }

    @Override
    public Media clickBack() {
        super.back();
        return new Media().isLoaded();
    }

    @Override
    protected Media clickUpdate() {
        super.update();
        return new Media().isLoaded();
    }

    @Override
    protected Media clickDelete() {
        super.delete();
        return new Media().isLoaded();
    }

    @Override
    protected Media clickAdd() {
        super.add();
        return new Media().isLoaded();
    }

    @Override
    public Media clickCancel() {
        super.cancel();
        return new Media().isLoaded();
    }

    public class MediaInventoryBaseBy {
        By  mediaID = By.id("vmMediaMediaId"),
            firmwareVersion = By.id("vmMediaFirmwareVersion"),
            buildDate = By.xpath(".//*[@id='media']//label[contains(text(),'Build Date')]/../following-sibling::div[1]//input"),
            buildDateCalendar = By.xpath(".//*[@id='media']//label[contains(text(),'Build Date')]/../following-sibling::div[1]//span[contains(@class,'calendar')]"),
            disposedReason = By.id("vmMediaDisposedReason"),
            repairReason = By.id("vmMediaRepairReason"),
            locationStartDate = By.xpath(".//*[@id='media']//label[contains(text(),'Location Start Date')]/../following-sibling::div[1]//input"),
            locationStartDateCalendar = By.xpath(".//*[@id='media']//label[contains(text(),'Location Start Date')]/../following-sibling::div[1]//span[contains(@class,'calendar')]"),
            expirationDate = By.xpath(".//*[@id='media']//label[contains(text(),'Expiration Date')]/../following-sibling::div[1]//input"),
            expirationDateCalendar = By.xpath(".//*[@id='media']//label[contains(text(),'Expiration Date')]/../following-sibling::div[1]//span[contains(@class,'calendar')]"),
            repairDate = By.xpath(".//*[@id='media']//label[contains(text(),'Repair Date')]/../following-sibling::div[1]//input"),
            repairDateCalendar = By.xpath(".//*[@id='media']//label[contains(text(),'Repair Date')]/../following-sibling::div[1]//span[contains(@class,'calendar')]"),
            locationState = By.id("vmMediaLocationState"),
            type = By.id("vmMediaMediaType"),
            status = By.id("vmMediaState"),
            bandID = By.id("vmMediaBandId"),
            color = By.id("vmMediaMediaColor"),
            lifeCycleState = By.id("vmMediaLifeCycleState"),
            pcbaID = By.id("vmMediaPcbaId"),
            guestID = By.id("vmMediaGuestId"),
            description = By.id("vmMediaMediaDescription");
    }
    public T selectLocationState(String locationState)
    {
        dh.getDhs().selectOption(by.locationState, locationState);
        return (T)this;
    }

    public T selectLocationState(int index)
    {
        dh.getDhs().selectOption(by.locationState, index);
        return (T)this;
    }
    public String getLocationState()
    {
        return dh.getDhs().getSelectedOption(by.locationState);
    }

    public boolean isLocationStateDisplayed()
    {
        return dh.isDisplayed(by.locationState);
    }


    public T setDisposedReason(String disposedReason)
    {
        dh.setText(by.disposedReason, disposedReason);
        return (T)this;
    }

    public String getDisposedReason()
    {
        return dh.getValue(by.disposedReason);
    }

    public boolean isDisposedReasonDisplayed()
    {
        return dh.isDisplayed(by.disposedReason);
    }
    public T setRepairDate(String repairDate)
    {
        dh.setText(by.repairDate, repairDate);
        return (T)this;
    }
    public String getRepairDate()
    {
        return dh.getValue(by.repairDate);
    }
    public boolean isRepairDateDisplayed()
    {
        return dh.isDisplayed(by.repairDate);
    }
    public T setExpirationDate(String expirationDate)
    {
        dh.setText(by.expirationDate, expirationDate);
        return (T)this;
    }
    public String getExpirationDate()
    {
        return dh.getValue(by.expirationDate);
    }
    public boolean isExpirationDateDisplayed()
    {
        return dh.isDisplayed(by.expirationDate);
    }
    public T setRepairReason(String repairReason)
    {
        dh.setText(by.repairReason, repairReason);
        return (T)this;
    }
    public String getRepairReason()
    {
        return dh.getValue(by.repairReason);
    }

    public boolean isRepairReasonDisplayed()
    {
        return dh.isDisplayed(by.repairReason);
    }
    public T setLocationStartDate(String locationStartDate)
    {
        dh.setText(by.locationStartDate, locationStartDate);
        return (T)this;
    }

    public String getLocationStartDate()
    {
        return dh.getValue(by.locationStartDate);
    }

    public boolean isLocationStartDateDisplayed()
    {
        return dh.isDisplayed(by.locationStartDate);
    }
    public T setFirmwareVersion(String firmwareVersion)
    {
        dh.setText(by.firmwareVersion, firmwareVersion);
        return (T)this;
    }
    public String getFirmwareVersion()
    {
        return dh.getValue(by.firmwareVersion);
    }
    public boolean isFirmwareVersionDisplayed()
    {
        return dh.isDisplayed(by.firmwareVersion);
    }
    public T setBuildDate(String buildDate)
    {
        dh.setText(by.buildDate, buildDate);
        return (T)this;
    }
    public String getBuildDate()
    {
        return dh.getValue(by.buildDate);
    }
    public boolean isBuildDateDisplayed()
    {
        return dh.isDisplayed(by.buildDate);
    }
    public T setMediaID(String mediaID)
    {
        dh.setText(by.mediaID, mediaID);
        return (T)this;
    }

    public String getMediaID()
    {
        return dh.getValue(by.mediaID);
    }

    public boolean isMediaIDDisplayed()
    {
        return dh.isDisplayed(by.mediaID);
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

    public T setBandID(String bandID)
    {
        dh.setText(by.bandID, bandID);
        return (T)this;
    }

    public String getBandID()
    {
        return dh.getValue(by.bandID);
    }

    public boolean isBandIDDisplayed()
    {
        return dh.isDisplayed(by.bandID);
    }

    public T selectStatus(String status)
    {
        dh.getDhs().selectOption(by.status, status);
        return (T)this;
    }

    public String getStatus()
    {
        return dh.getDhs().getSelectedOption(by.status);
    }

    public boolean isStatusDisplayed()
    {
        return dh.isDisplayed(by.status);
    }

    public T selectColor(String color)
    {
        dh.getDhs().selectOption(by.color, color);
        return (T)this;
    }

    public String getColor()
    {
        return dh.getDhs().getSelectedOption(by.color);
    }

    public boolean isColorDisplayed()
    {
        return dh.isDisplayed(by.color);
    }

    public T selectLifeCycleState(String lifeCycleState)
    {
        dh.getDhs().selectOption(by.lifeCycleState, lifeCycleState);
        return (T)this;
    }

    public String getLifeCycleState()
    {
        return dh.getDhs().getSelectedOption(by.lifeCycleState);
    }

    public boolean isLifeCycleStateDisplayed()
    {
        return dh.isDisplayed(by.lifeCycleState);
    }

    public T setPcbaID(String pcbaID)
    {
        dh.setText(by.pcbaID, pcbaID);
        return (T)this;
    }

    public String getPcbaID()
    {
        return dh.getValue(by.pcbaID);
    }

    public boolean isPcbaIDDisplayed()
    {
        return dh.isDisplayed(by.pcbaID);
    }

    public T setGuestID(String guestID)
    {
        dh.setText(by.guestID, guestID);
        return (T)this;
    }

    public String getGuestID()
    {
        return dh.getValue(by.guestID);
    }

    public boolean isGuestIDDisplayed()
    {
        return dh.isDisplayed(by.guestID);
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
}
