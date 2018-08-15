package Unicorn.Pages.Location;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;


public class Locations extends PageComponentBase<Locations> {
    public Locations()
    {
        title = "Locations";
        url += "locations";
    }
    @Override
    public RemoveRowFromTable<Locations> clickDeleteSelectedRows() {
        super.deleteSelectedRows();
        return new RemoveRowFromTable<>(new Locations());
    }

    @Override
    public Locations isLoaded() {
        return super.isLoaded();
    }

    public Locations get() {
        getUrl();
        return isLoaded();
    }
    public AddNewLocation clickAdd()
    {
        super.add();
        return new AddNewLocation().isLoaded();
    }
    public Locations selectRow(int oneBased)
    {
        return super.selectRow(oneBased);
    }
    public EditLocation clickRow(int oneBased)
    {
        super.clickOnRow(1);
        return new EditLocation().isLoaded();
    }
    public Locations sortName()
    {
        sortByHeader("Name");
        return this;
    }

    public Locations sortShortDescription()
    {
        sortByHeader("Short Description");
        return this;
    }
    public Locations sortType()
    {
        sortByHeader("Type");
        return this;
    }
    public Locations sortZone()
    {
        sortByHeader("Zone");
        return this;
    }

    public String getName(int oneBased) { return returnBoardString(oneBased, 2); }

    public String getShortDescription(int oneBased) { return returnBoardString(oneBased, 3); }

    public String getType(int oneBased) { return returnBoardString(oneBased, 4); }

    public String getZone(int oneBased) { return returnBoardString(oneBased, 5); }

}