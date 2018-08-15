package Unicorn.Pages.PermissioningGroups;

import Unicorn.AbstractClasses.PermissioningGroupBase;

public class AddNewPermissioningGroups extends PermissioningGroupBase<AddNewPermissioningGroups> {
    public AddNewPermissioningGroups()
    {
        url+= "groups/create";
    }
    public AddNewPermissioningGroups get()
    {
        getUrl();
        return isLoaded();
    }
    public PermissioningGroups clickAdd(){ return super.clickAdd(); }

}