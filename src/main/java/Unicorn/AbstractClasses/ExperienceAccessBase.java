package Unicorn.AbstractClasses;

import Unicorn.Pages.ExperienceAccess.ExperienceAccess;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class ExperienceAccessBase<T extends ExperienceAccessBase> extends AddEditBase<ExperienceAccess> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private ExperienceAccessBaseBy by = new ExperienceAccessBaseBy();

    @Override
    public T isLoaded()
    {
        this.title = "Experience Access Details";
        super.isLoaded();
        return (T)this;
    }

    @Override
    public ExperienceAccess clickBack() {
        super.back();
        return new ExperienceAccess().isLoaded();
    }

    @Override
    protected ExperienceAccess clickUpdate() {
        super.update();
        return new ExperienceAccess().isLoaded();
    }

    @Override
    protected ExperienceAccess clickDelete() {
        super.delete();
        return new ExperienceAccess().isLoaded();
    }

    @Override
    protected ExperienceAccess clickAdd() {
        super.add();
        return new ExperienceAccess().isLoaded();
    }

    @Override
    public ExperienceAccess clickCancel() {
        super.cancel();
        return new ExperienceAccess().isLoaded();
    }
    public class ExperienceAccessBaseBy {
        By  accessID = By.id("vmExperienceAccessId"),
            description = By.id("vmExperienceAccessDescription"),
            location = By.id("vmExperienceAccessLocationId"),
            facilityID = By.id("vmExperienceAccessFacilityId"),
            attractionID = By.id("vmExperienceAccessAttractionId"),
            experienceOperationID = By.id("vmExperienceAccessExperienceOperationId"),
            facilityOperationID = By.id("vmExperienceAccessFacilityOperationId");
    }
    public T setAccessID(String accessID)
    {
        dh.setText(by.accessID, accessID);
        return (T)this;
    }

    public String getAccessID()
    {
        return dh.getValue(by.accessID);
    }

    public boolean isAccessIDDisplayed()
    {
        return dh.isDisplayed(by.accessID);
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

    public T setFacilityID(String facilityID)
    {
        dh.setText(by.facilityID, facilityID);
        return (T)this;
    }

    public String getFacilityID()
    {
        return dh.getValue(by.facilityID);
    }

    public boolean isFacilityIDDisplayed()
    {
        return dh.isDisplayed(by.facilityID);
    }

    public T setAttractionID(String attractionID)
    {
        dh.setText(by.attractionID, attractionID);
        return (T)this;
    }

    public String getAttractionID()
    {
        return dh.getValue(by.attractionID);
    }

    public boolean isAttractionIDDisplayed()
    {
        return dh.isDisplayed(by.attractionID);
    }

    public T setExperienceOperationID(String experienceOperationID)
    {
        dh.setText(by.experienceOperationID, experienceOperationID);
        return (T)this;
    }

    public String getExperienceOperationID()
    {
        return dh.getValue(by.experienceOperationID);
    }

    public boolean isExperienceOperationIDDisplayed()
    {
        return dh.isDisplayed(by.experienceOperationID);
    }

    public T setFacilityOperationID(String facilityOperationID)
    {
        dh.setText(by.facilityOperationID, facilityOperationID);
        return (T)this;
    }

    public String getFacilityOperationID()
    {
        return dh.getValue(by.facilityOperationID);
    }

    public boolean isFacilityOperationIDDisplayed()
    {
        return dh.isDisplayed(by.facilityOperationID);
    }

    public T selectLocation(String location)
    {
        dh.getDhs().selectOption(by.location, location);
        return (T)this;
    }

    public String getLocation()
    {
        return dh.getDhs().getSelectedOptionText(by.location);
    }

    public boolean isLocationDisplayed()
    {
        return dh.isDisplayed(by.location);
    }
}