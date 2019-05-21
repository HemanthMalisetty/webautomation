package Unicorn.Pages.Manifest;

import Unicorn.AbstractClasses.AddEditBase;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class EditManifest extends AddEditBase<ManifestDetails>{
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private EditManifestBy by = new EditManifestBy();
    public EditManifest()
    {
        title = "Edit Media";
    }
    @Override
    public EditManifest isLoaded() {
        this.title = "Edit Media";
        super.isLoaded();
        return this;
    }
    @Override
    public ManifestDetails clickBack() {
        super.back();
        return new ManifestDetails().isLoaded();
    }

    @Override
    public ManifestDetails clickUpdate() {
        super.update();
        return new ManifestDetails().isLoaded();
    }

    @Override
    public ManifestDetails clickDelete() {
        super.delete();
        return new ManifestDetails().isLoaded();
    }

    @Override
    protected ManifestDetails clickAdd() {
        return null;
    }

    @Override
    public ManifestDetails clickCancel() {
        super.cancel();
        return new ManifestDetails().isLoaded();
    }
    public class EditManifestBy
    {
        By  mediaID = By.id("vmMediaMediaId"),
            bandID = By.id("vmMediaBandId"),
            firmwareVersion = By.id("vmMediaFirmwareVersion"),
            buildDate = By.xpath("//*[contains(@for,'vmMediaBuildDate')]/../following-sibling::div//input"),
            type = By.id("vmMediaMediaType"),
            color = By.id("vmMediaMediaColor"),
            status = By.id("vmMediaStatus"),
            state = By.id("vmMediaState"),
            lifecycleState = By.id("vmMediaLifecycleState"),
            expirationDate = By.xpath("//*[contains(@for,'vmMediaExpirationDateTime')]/../following-sibling::div//input"),
            locationState = By.id("vmMediaLocationState"),
            disposedReason = By.id("vmMediaDisposedReason"),
            locationStartDate = By.xpath("//*[contains(@for,'vmMediaLocationStartDateTime')]/../following-sibling::div//input"),
            repairReason = By.id("vmMediaRepairReason");
    }
    public EditManifest setMediaID(String mediaID)
    {
        dh.setText(by.mediaID, mediaID);
        return this;
    }

    public String getMediaID()
    {
        return dh.getValue(by.mediaID);
    }

    public boolean isMediaIDDisplayed()
    {
        return dh.isDisplayed(by.mediaID);
    }
    public EditManifest setBandID(String bandID)
    {
        dh.setText(by.bandID, bandID);
        return this;
    }

    public String getBandID()
    {
        return dh.getValue(by.bandID);
    }

    public boolean isBandIDDisplayed()
    {
        return dh.isDisplayed(by.bandID);
    }


    public EditManifest selectFirmwareVersion(String firmwareVersion)
    {
        dh.getDhs().selectOption(by.firmwareVersion, firmwareVersion);
        return this;
    }
    public EditManifest selectFirmwareVersion(int index)
    {
        dh.getDhs().selectOption(by.firmwareVersion, index);
        return this;
    }

    public String getFirmwareVersion()
    {
        return dh.getDhs().getSelectedOptionText(by.firmwareVersion);
    }

    public boolean isFirmwareVersionDisplayed()
    {
        return dh.isDisplayed(by.firmwareVersion);
    }

    public EditManifest setBuildDate(String buildDate)
    {
        dh.setText(by.buildDate, buildDate);
        return this;
    }

    public String getBuildDate()
    {
        return dh.getValue(by.buildDate);
    }

    public boolean isBuildDateDisplayed()
    {
        return dh.isDisplayed(by.buildDate);
    }

    public EditManifest selectType(String type)
    {
        dh.getDhs().selectOption(by.type, type);
        return this;
    }
    public EditManifest selectType(int index)
    {
        dh.getDhs().selectOption(by.type, index);
        return this;
    }

    public String getType()
    {
        return dh.getDhs().getSelectedOptionText(by.type);
    }

    public boolean isTypeDisplayed()
    {
        return dh.isDisplayed(by.type);
    }

    public EditManifest selectColor(String color)
    {
        dh.getDhs().selectOption(by.color, color);
        return this;
    }
    public EditManifest selectColor(int index)
    {
        dh.getDhs().selectOption(by.color, index);
        return this;
    }

    public String getColor()
    {
        return dh.getDhs().getSelectedOptionText(by.color);
    }

    public boolean isColorDisplayed()
    {
        return dh.isDisplayed(by.color);
    }

    public EditManifest selectStatus(String status)
    {
        dh.getDhs().selectOption(by.status, status);
        return this;
    }
    public EditManifest selectStatus(int index)
    {
        dh.getDhs().selectOption(by.status, index);
        return this;
    }

    public String getStatus()
    {
        return dh.getDhs().getSelectedOptionText(by.status);
    }

    public boolean isStatusDisplayed()
    {
        return dh.isDisplayed(by.status);
    }

    public EditManifest selectState(String state)
    {
        dh.getDhs().selectOption(by.state, state);
        return this;
    }

    public String getState()
    {
        return dh.getDhs().getSelectedOptionText(by.state);
    }

    public boolean isStateDisplayed()
    {
        return dh.isDisplayed(by.state);
    }

    public EditManifest selectLifecycleState(String lifecycleState)
    {
        dh.getDhs().selectOption(by.lifecycleState, lifecycleState);
        return this;
    }

    public String getLifecycleState()
    {
        return dh.getDhs().getSelectedOptionText(by.lifecycleState);
    }

    public boolean isLifecycleStateDisplayed()
    {
        return dh.isDisplayed(by.lifecycleState);
    }

    public EditManifest setExpirationDate(String expirationDate)
    {
        dh.setText(by.expirationDate, expirationDate);
        return this;
    }

    public String getExpirationDate()
    {
        return dh.getValue(by.expirationDate);
    }

    public boolean isExpirationDateDisplayed()
    {
        return dh.isDisplayed(by.expirationDate);
    }

    public EditManifest selectLocationState(String locationState)
    {
        dh.getDhs().selectOption(by.locationState, locationState);
        return this;
    }

    public String getLocationState()
    {
        return dh.getDhs().getSelectedOptionText(by.locationState);
    }

    public boolean isLocationStateDisplayed()
    {
        return dh.isDisplayed(by.locationState);
    }

    public EditManifest selectDisposedReason(String disposedReason)
    {
        dh.getDhs().selectOption(by.disposedReason, disposedReason);
        return this;
    }

    public String getDisposedReason()
    {
        return dh.getDhs().getSelectedOptionText(by.disposedReason);
    }

    public boolean isDisposedReasonDisplayed()
    {
        return dh.isDisplayed(by.disposedReason);
    }

    public EditManifest setLocationStartDate(String locationStartDate)
    {
        dh.setText(by.locationStartDate, locationStartDate);
        return this;
    }

    public String getLocationStartDate()
    {
        return dh.getValue(by.locationStartDate);
    }

    public boolean isLocationStartDateDisplayed()
    {
        return dh.isDisplayed(by.locationStartDate);
    }


    public EditManifest selectRepairReason(String repairReason)
    {
        dh.getDhs().selectOption(by.repairReason, repairReason);
        return this;
    }

    public String getRepairReason()
    {
        return dh.getDhs().getSelectedOptionText(by.repairReason);
    }

    public boolean isRepairReasonDisplayed()
    {
        return dh.isDisplayed(by.repairReason);
    }
}