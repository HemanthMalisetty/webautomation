package Unicorn.Pages.Manifest;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class ManifestDetails extends PageComponentBase<ManifestDetails> {
    public ManifestDetails() {
        title = "Manifest Detail";
        url = "media";
    }

    @Override
    public ManifestDetails get() {
        getUrl();
        return isLoaded();
    }

    @Override
    protected RemoveRowFromTable<ManifestDetails> clickDeleteSelectedRows() {
        return null;
    }

    public ManifestSummary clickBack() {
        super.back();
        return new ManifestSummary().isLoaded();
    }

    public EditManifest clickRow(int oneBased)
    {
        super.clickOnRow(oneBased);
        return new EditManifest().isLoaded();
    }

    public ManifestDetails selectSearchType(String text) { return super.selectSearchType(text); }

    public ManifestDetails sortMediaId(){ return sortByHeader("Media ID"); }

    public ManifestDetails sortBandId(){ return sortByHeader("Band ID"); }

    public ManifestDetails sortType(){ return sortByHeader("Type"); }

    public ManifestDetails sortStatus(){ return sortByHeader("Status"); }

    public ManifestDetails sortState(){ return sortByHeader("State"); }

    public ManifestDetails sortLocation(){ return sortByHeader("Location"); }

    public ManifestDetails sortLifeCycle(){ return sortByHeader("Lifecycle"); }

    public ManifestDetails sortColor(){ return sortByHeader("Color"); }

    public ManifestDetails sortFirmware(){ return sortByHeader("Firmware"); }

    public ManifestDetails sortDisposed(){ return sortByHeader("Disposed"); }

    public ManifestDetails sortUpdated(){ return sortByHeader("Updated"); }

    public String getMediaID(int oneBased){ return  returnBoardString(oneBased,1); }

    public String getBandID(int oneBased){ return returnBoardString(oneBased,2); }

    public String getType(int oneBased){ return returnBoardString(oneBased,3 ); }

    public String getStatus(int oneBased){ return returnBoardString(oneBased, 4); }

    public String getState(int oneBased){ return returnBoardString(oneBased, 5); }

    public String getLocation(int oneBased){ return returnBoardString(oneBased, 6); }

    public String getLifeCycle(int oneBased){ return returnBoardString(oneBased, 7); }

    public String getColor(int oneBased){ return returnBoardString(oneBased, 8); }

    public String getFirmware(int oneBased){ return returnBoardString(oneBased, 9); }

    public String getDisposed(int oneBased){ return returnBoardString(oneBased, 10); }

    public String getUpdated(int oneBased){ return returnBoardString(oneBased, 11); }
}