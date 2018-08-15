package Unicorn.Pages.WaitTimeBoard;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;
import Unicorn.UnicornDriverHelper;

public class WaitTimeBoards extends PageComponentBase<WaitTimeBoards> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    public WaitTimeBoards()
    {
        title = "Wait Time Boards";
        url += "wait-time-boards";
    }

    @Override
    public WaitTimeBoards isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        return this;
    }

    public WaitTimeBoards get()
    {
        getUrl();
        return isLoaded();
    }

    public WaitTimeBoards sortBoardName()
    {
        sortByHeader("Board Name");
        return this;
    }

    public boolean isBoardNameDisplayed()
    {
        return table.isHeaderDisplayed("Board Name");
    }

    public WaitTimeBoards sortLocation()
    {
        sortByHeader("Location");
        return this;
    }

    public boolean isLocationDisplayed()
    {
        return table.isHeaderDisplayed("Location");
    }

    public WaitTimeBoards sortType()
    {
        sortByHeader("Type");
        return this;
    }

    public boolean isTypeDisplayed()
    {
        return isHeaderDisplayed("Type");
    }

    public WaitTimeBoards sortTheme()
    {
        sortByHeader("Theme");
        return this;
    }

    public boolean isThemeDisplayed()
    {
        return isHeaderDisplayed("Theme");
    }

    @Override
    public RemoveRowFromTable<WaitTimeBoards> clickDeleteSelectedRows()
    {
        deleteSelectedRows();
        return new RemoveRowFromTable<>(new WaitTimeBoards());
    }

    public AddNewWaitTimeBoard clickAdd()
    {
        add();
        return new AddNewWaitTimeBoard().isLoaded();
    }
    public WaitTimeBoards selectRow(int oneBased)
    {
        return super.selectRow(oneBased);
    }
    public EditWaitTimeBoard clickRow(int oneBased)
    {
      clickOnRow(oneBased);
       return new EditWaitTimeBoard().isLoaded();
    }

    public String getBoardName(int oneBased)
    {
        return returnBoardString(oneBased,2);
    }

    public String getLocation(int oneBased)
    {
        return  returnBoardString(oneBased,3);
    }

    public String getType(int oneBased)
    {
        return  returnBoardString(oneBased,4);
    }

    public String getTheme(int oneBased)
    {
        return returnBoardString(oneBased,5);
    }
}
