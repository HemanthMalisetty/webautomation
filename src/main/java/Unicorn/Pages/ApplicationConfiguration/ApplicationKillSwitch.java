package Unicorn.Pages.ApplicationConfiguration;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class ApplicationKillSwitch extends PageComponentBase<ApplicationKillSwitch> {
    public ApplicationKillSwitch()
    {
        title = "Application Switch";
        url += "application-switch";
    }
    @Override
    public ApplicationKillSwitch get() {
        getUrl();
        return isLoaded();
    }

    @Override
    public RemoveRowFromTable<ApplicationKillSwitch> clickDeleteSelectedRows() {
        super.deleteSelectedRows();
        return new RemoveRowFromTable<>(new ApplicationKillSwitch());

    }
    public AddNewKillSwitch clickAdd()
    {
        super.add();
        return new AddNewKillSwitch().isLoaded();
    }
    public ApplicationKillSwitch selectRow(int oneBased)
    {
        return super.selectRow(oneBased);
    }
    public EditKillSwitch clickRow(int oneBased)
    {
        super.clickOnRow(oneBased);
        return new EditKillSwitch().isLoaded();
    }
    public ApplicationKillSwitch sortAppName()
    {
        sortByHeader("App Name");
        return this;
    }
    public ApplicationKillSwitch sortVersion()
    {
        sortByHeader("Version");
        return this;
    }
    public ApplicationKillSwitch sortOperatingSystem()
    {
        sortByHeader("Operating System");
        return this;
    }
    public String getAppName(int oneBased){ return returnBoardString(oneBased,2); }

    public String getVersion(int oneBased){ return returnBoardString(oneBased, 3); }

    public String getOperatingSystem(int oneBased){return returnBoardString(oneBased,4); }
}
