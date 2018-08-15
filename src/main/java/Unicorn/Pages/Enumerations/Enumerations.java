package Unicorn.Pages.Enumerations;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class Enumerations extends PageComponentBase<Enumerations> {
    public Enumerations()
    {
        url += "enumerations";
        title = "Enumerations";
    }
    @Override
    public Enumerations get() {
        getUrl();
        return isLoaded();
    }

    @Override
    public RemoveRowFromTable<Enumerations> clickDeleteSelectedRows() {
        super.deleteSelectedRows();
        return new RemoveRowFromTable<>(new Enumerations());
    }

    public Enumerations selectRow(int oneBased){ return super.selectRow(oneBased); }

    public EditEnumeration clickRow(int oneBased)
    {
        super.clickOnRow(oneBased);
        return new EditEnumeration().isLoaded();
    }

    public String getKey(int oneBased){ return returnBoardString(oneBased,2);}

    public String getName(int oneBased){ return returnBoardString(oneBased,3); }

    public String getShortDescription(int oneBased){ return returnBoardString(oneBased,4); }

    public String getLongDescription(int oneBased){ return  returnBoardString(oneBased,5); }

    public String getCreatedOn(int oneBased){ return returnBoardString(oneBased,6); }

    public Enumerations sortKey(){ return sortByHeader("Key"); }

    public Enumerations sortName(){ return sortByHeader("Name"); }

    public Enumerations sortShortDescription(){ return sortByHeader("Short Description"); }

    public Enumerations sortLongDescription(){ return sortByHeader("Long Description"); }

    public Enumerations sortCreatedOn(){ return sortByHeader("Created On"); }

}