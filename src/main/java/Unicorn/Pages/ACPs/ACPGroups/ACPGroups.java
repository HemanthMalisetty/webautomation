package Unicorn.Pages.ACPs.ACPGroups;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class ACPGroups extends PageComponentBase<ACPGroups> {

    public ACPGroups()
    {
        title = "Access Point Control Groups";
        url += "acp-groups";
    }
    @Override
    public ACPGroups get() {
        getUrl();
        return isLoaded();
    }

    @Override
    protected RemoveRowFromTable<ACPGroups> clickDeleteSelectedRows() {
        super.deleteSelectedRows();
        return new RemoveRowFromTable<>(new ACPGroups());
    }

    public ACPGroups selectRow(int oneBased){ return super.selectRow(oneBased); }

    public EditACPGroups clickRow(int oneBased)
    {
        super.clickOnRow(oneBased);
        return new EditACPGroups().isLoaded();
    }
    public String getGroup(int oneBased){ return returnBoardString(oneBased,2); }

    public String getLocation(int oneBased){ return returnBoardString(oneBased,3); }

    public String getSetting(int oneBased){ return returnBoardString(oneBased, 4); }

    public ACPGroups sortGroup(){ return sortByHeader("Group"); }

    public ACPGroups sortLocation(){ return sortByHeader("Location"); }

    public ACPGroups sortSetting(){ return sortByHeader("Setting"); }
}