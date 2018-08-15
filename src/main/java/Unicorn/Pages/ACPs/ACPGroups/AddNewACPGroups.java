package Unicorn.Pages.ACPs.ACPGroups;

import Unicorn.AbstractClasses.ACPGroupsBase;

public class AddNewACPGroups extends ACPGroupsBase<AddNewACPGroups> {

    public AddNewACPGroups(){ url += "acp-groups/create"; }

    public AddNewACPGroups get()
    {
        getUrl();
        return isLoaded();
    }

    public ACPGroups clickAdd(){ return super.clickAdd(); }
}