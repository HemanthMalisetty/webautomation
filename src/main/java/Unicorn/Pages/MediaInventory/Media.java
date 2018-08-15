package Unicorn.Pages.MediaInventory;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class Media extends PageComponentBase<Media> {
    public Media()
    {
        title = "Media Inventory";
        url += "media";
    }

    @Override
    public Media get() {
        getUrl();
        return isLoaded();
    }

    @Override
    protected RemoveRowFromTable<Media> clickDeleteSelectedRows() {
        return null;
    }

    public AddNewMediaDevice clickAdd()
    {
        super.add();
        return new AddNewMediaDevice().isLoaded();
    }
    public EditMediaDevice clickRow(int oneBased)
    {
        super.clickOnRow(oneBased);
        return new EditMediaDevice().isLoaded();
    }
    public Media sortMediaID()
    {
        sortByHeader("Media ID");
        return this;
    }
    public Media sortBandID()
    {
        sortByHeader("Band ID");
        return this;
    }
    public Media sortDescription()
    {
        sortByHeader("Description");
        return this;
    }
    public Media sortType()
    {
        sortByHeader("Type");
        return this;
    }
    public Media sortStatus()
    {
        sortByHeader("Status");
        return this;
    }
    public String getMediaID(int oneBased){ return returnBoardString(oneBased, 2); }

    public String getBandID(int oneBased){ return returnBoardString(oneBased,3); }

    public String getDescription(int oneBased){ return returnBoardString(oneBased,4); }

    public String getType(int oneBased){ return returnBoardString(oneBased, 5); }

    public String getStatus(int oneBased){ return returnBoardString(oneBased, 6); }
}
