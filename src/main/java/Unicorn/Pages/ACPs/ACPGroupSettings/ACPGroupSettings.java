package Unicorn.Pages.ACPs.ACPGroupSettings;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class ACPGroupSettings extends PageComponentBase<ACPGroupSettings> {
    public ACPGroupSettings()
    {
        url+= "acp-group-settings";
        title = "Access Control Point Group Settings";
    }
    @Override
    public ACPGroupSettings get() {
        getUrl();
        return isLoaded();
    }

    @Override
    protected RemoveRowFromTable<ACPGroupSettings> clickDeleteSelectedRows() {
        deleteSelectedRows();
        return new RemoveRowFromTable<>(new ACPGroupSettings());
    }
}