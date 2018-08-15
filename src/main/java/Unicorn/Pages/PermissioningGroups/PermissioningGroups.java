package Unicorn.Pages.PermissioningGroups;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class PermissioningGroups extends PageComponentBase<PermissioningGroups> {
    public PermissioningGroups()
    {
        url += "groups";
        title = "Permissioning Groups";
    }
    @Override
    public PermissioningGroups get() {
        getUrl();
        return isLoaded();
    }

    @Override
    protected RemoveRowFromTable<PermissioningGroups> clickDeleteSelectedRows() {
        super.deleteSelectedRows();
        return new RemoveRowFromTable<>(new PermissioningGroups());
    }

    public PermissioningGroups selectRow(int oneBased){ return super.selectRow(oneBased); }

    public EditPermissionGroups clickRow(int oneBased)
    {
        super.clickOnRow(oneBased);
        return new EditPermissionGroups().isLoaded();
    }
    public String getGroupRole(int oneBased){ return returnBoardString(oneBased,2); }

    public String getDescription(int oneBased){ return returnBoardString(oneBased,3); }

    public String getCreatedOn(int oneBased){ return returnBoardString(oneBased,4); }

    public PermissioningGroups sortGroupRole(int oneBased){ return sortByHeader("Group Role"); }

    public PermissioningGroups sortDescription(int oneBased){ return sortByHeader("Description"); }

    public PermissioningGroups sortCreatedOn(int oneBased){ return sortByHeader("Created On"); }

}