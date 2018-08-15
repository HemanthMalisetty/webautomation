package Unicorn.Pages.Location;

import Unicorn.AbstractClasses.LocationBase;

public class AddNewLocation extends LocationBase<AddNewLocation> {
    public AddNewLocation()
    {
        url += "locations/create";
    }

    public AddNewLocation get()
    {
        getUrl();
        return isLoaded();
    }
    public Locations clickAdd()
    {
        return super.clickAdd();
    }

}
