package Unicorn.Pages.WaitTimeBoard;

import Unicorn.AbstractClasses.WaitTimeBoardsBase;

public class AddNewWaitTimeBoard extends WaitTimeBoardsBase<AddNewWaitTimeBoard> {
    public AddNewWaitTimeBoard(){
        url += "wait-time-boards/create";
    }

    public AddNewWaitTimeBoard get()
    {
        getUrl();
        return isLoaded();
    }


    public WaitTimeBoards clickAdd()
    {
        return super.clickAdd();

    }

    public boolean isAddDisplayed()
    {
        return super.isAddDisplayed();
    }

    public WaitTimeBoards clickCancel()
    {
       return super.clickCancel();
    }

    public boolean isCancelDisplayed()
    {
        return super.isCancelDisplayed();
    }

    public WaitTimeBoards clickBack()
    {
      return super.clickBack();
    }

    public boolean isBackDisplayed()
    {
        return super.isBackDisplayed();
    }
}


