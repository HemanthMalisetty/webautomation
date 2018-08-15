package Unicorn.Pages.ACLPermission;

import Unicorn.AbstractClasses.ACLPermissionBase;

public class AddNewPermission extends ACLPermissionBase<AddNewPermission> {
    public AddNewPermission()
    {
        url += "permissions/create";
    }
    public AddNewPermission get()
    {
        getUrl();
        return isLoaded();
    }
    public ACLPermissions clickAdd()
    {
        return super.clickAdd();
    }
}
