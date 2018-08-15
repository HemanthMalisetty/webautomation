package Unicorn.Pages.ACPs.ACPList;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class ACP extends PageComponentBase<ACP> {
    public ACP() {
        title = "Access Control Points";
        url = "acps";
    }

    @Override
    public ACP get() {
        getUrl();
        return isLoaded();
    }

    @Override
    public RemoveRowFromTable<ACP> clickDeleteSelectedRows() {
        super.deleteSelectedRows();
        return new RemoveRowFromTable<>(new ACP());
    }

    public AddNewACP clickAdd() {
        super.add();
        return new AddNewACP().isLoaded();
    }

    public ACP selectRow(int oneBased) {
        return super.selectRow(oneBased);
    }

    public EditACP clickRow(int oneBased) {
        super.clickOnRow(oneBased);
        return new EditACP().isLoaded();
    }

    public ACP sortComputerName() {
        return super.sortByHeader("Computer Name");
    }

    public ACP sortDescription() {
        return super.sortByHeader("Description");
    }

    public ACP sortEnabled() {
        return super.sortByHeader("Enabled");
    }

    public ACP sortIPAddress() {
        return super.sortByHeader("IP Address");
    }

    public ACP sortLastOnline() {
        return super.sortByHeader("Last Online");
    }

    public ACP sortLoggedInUser()
    {
        return super.sortByHeader("Logged In User");
    }
    public ACP sortGroup()
    {
        return super.sortByHeader("Group");
    }

    public String getComputerName(int oneBased) { return returnBoardString(oneBased,2); }

    public String getDescription(int oneBased) { return returnBoardString(oneBased,3); }

    public String getEnabled(int oneBased) { return returnBoardString(oneBased,4 ); }

    public String getIPAddress(int oneBased) { return returnBoardString(oneBased, 5); }

    public String getLastOnline(int oneBased) { return returnBoardString(oneBased, 6); }

    public String getLoggedInUser(int oneBased) { return returnBoardString(oneBased, 7); }

    public String getGroup(int oneBased) { return returnBoardString(oneBased, 8); }
}
