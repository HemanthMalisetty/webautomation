package Unicorn.Pages.ApplicationConfiguration;

import Unicorn.AbstractClasses.ApplicationConfigBase;

public class AddNewKillSwitch extends ApplicationConfigBase<AddNewKillSwitch> {
    public AddNewKillSwitch()
    {
        url += "application-switch/create";
    }
    public AddNewKillSwitch get()
    {
        getUrl();
        return isLoaded();
    }
    public ApplicationKillSwitch clickAdd()
    {
        return super.clickAdd();
    }
}
