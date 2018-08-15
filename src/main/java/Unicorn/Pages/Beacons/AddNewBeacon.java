package Unicorn.Pages.Beacons;

import Unicorn.AbstractClasses.BeaconsBase;

public class AddNewBeacon extends BeaconsBase<AddNewBeacon> {
    public AddNewBeacon() {
        url += "beacons/create";
    }
    public AddNewBeacon get()
    {
        getUrl();
        return isLoaded();
    }
    public Beacons clickAdd() { return super.clickAdd(); }
}
