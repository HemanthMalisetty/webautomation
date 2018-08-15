package Unicorn.Pages.Beacons;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class Beacons extends PageComponentBase<Beacons> {
    public Beacons() {
        title = "Beacons";
        url = "beacons";
    }
    @Override
    public Beacons get() {
        getUrl();
        return isLoaded();
    }
    @Override
    public RemoveRowFromTable<Beacons> clickDeleteSelectedRows() {
        super.deleteSelectedRows();
        return new RemoveRowFromTable<>(new Beacons());
    }
    public AddNewBeacon clickAdd() {
        super.add();
        return new AddNewBeacon().isLoaded();
    }
    public Beacons selectRow(int oneBased) { return super.selectRow(oneBased); }

    public EditBeacon clickRow(int oneBased) {
        super.clickOnRow(oneBased);
        return new EditBeacon().isLoaded();
    }
    public Beacons sortName(){ return sortByHeader("Name"); }

    public Beacons sortType(){ return sortByHeader("Type"); }

    public Beacons sortLocation(){ return sortByHeader("Location"); }

    public Beacons sortACPGroup(){ return sortByHeader("ACP Group"); }

    public Beacons sortSource(){ return sortByHeader("Source"); }

    public String getName(int oneBased){ return returnBoardString(oneBased,2); }

    public String getType(int oneBased){ return returnBoardString(oneBased, 3); }

    public String getLocation(int oneBased){ return returnBoardString(oneBased, 4); }

    public String getACPGroup(int oneBased){ return returnBoardString(oneBased, 5); }

    public String getSource(int oneBased){ return returnBoardString(oneBased,6); }
}
