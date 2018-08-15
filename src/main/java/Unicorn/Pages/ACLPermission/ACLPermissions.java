package Unicorn.Pages.ACLPermission;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;
import Unicorn.UnicornDriverHelper;

public class ACLPermissions extends PageComponentBase<ACLPermissions> {

    public ACLPermissions()
    {
        title = "Permissions";
        url += "permissions";
    }
    @Override
    public RemoveRowFromTable<ACLPermissions> clickDeleteSelectedRows() {
        super.deleteSelectedRows();
        return new RemoveRowFromTable<>(new ACLPermissions());
    }
    public ACLPermissions get()
    {
        getUrl();
        return isLoaded();
    }
    public AddNewPermission clickAdd()
    {
        super.add();
        return new AddNewPermission().isLoaded();
    }
    public ACLPermissions selectRow(int oneBased)
    {
        return super.selectRow(oneBased);
    }
    public EditACLPermission clickRow(int oneBased)
    {
        super.clickOnRow(oneBased);
        return new EditACLPermission().isLoaded();
    }
    public ACLPermissions sortACLRole()
    {
        super.sortByHeader("ACL Role");
        return this;
    }
    public ACLPermissions sortShortDescription()
    {
        super.sortByHeader("Short Description");
        return this;
    }

    public ACLPermissions sortLongDescription()
    {
        super.sortByHeader("Long Description");
        return this;
    }
    public ACLPermissions sortCreatedOn()
    {
        super.sortByHeader("Created On");
        return this;
    }
    public String getACLRole(int oneBased)
    {
        return returnBoardString(oneBased,2);
    }
    public String getShortDescription(int oneBased)
    {
        return returnBoardString(oneBased, 3);
    }
    public String getLongDescription(int oneBased)
    {
        return returnBoardString(oneBased,4);
    }
    public String getCreatedOn(int oneBased)
    {
        return returnBoardString(oneBased,5);
    }
}
