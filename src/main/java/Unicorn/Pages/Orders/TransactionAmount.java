package Unicorn.Pages.Orders;

public class TransactionAmount extends Orders<TransactionAmount>{

    public String getOrderNumber(int row){ return returnBoardString(row, 1); }

    public String getName(int row){ return returnBoardString(row, 2); }

    public String getDate(int row){ return returnBoardString(row,3 ); }

    public String getStore(int row){ return returnBoardString(row, 4); }

    public String getSource(int row){ return returnBoardString(row, 5); }

    public String getTotal(int row){ return returnBoardString(row, 6); }

    public boolean isOrderNumberDisplayed(){ return isHeaderDisplayed("Order #"); }

    public boolean isNameDisplayed(){ return isHeaderDisplayed("Name"); }

    public boolean isDateDisplayed(){ return isHeaderDisplayed("Date"); }

    public boolean isStoreDisplayed(){ return isHeaderDisplayed("Store"); }

    public boolean isSourceDisplayed(){ return isHeaderDisplayed("Source"); }

    public boolean isTotalDisplayed(){ return isHeaderDisplayed("Total"); }

    public boolean allHeadersDisplayed()
    {
        return isOrderNumberDisplayed()
                && isNameDisplayed()
                && isDateDisplayed()
                && isStoreDisplayed()
                && isSourceDisplayed()
                && isTotalDisplayed();
    }
    public TransactionAmount sortOrderNumber()
    {
        sortByHeader("Order #");
        return this;
    }
    public TransactionAmount sortDate()
    {
        sortByHeader("Date");
        return this;
    }
    public TransactionAmount sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public TransactionAmount sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public TransactionAmount sortTotal()
    {
        sortByHeader("Total");
        return this;
    }
    public ViewOrder<TransactionAmount> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder(new TransactionAmount()).isLoaded();
    }
    public TransactionAmount setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }
    public TransactionAmount setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public TransactionAmount setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public TransactionAmount clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public TransactionAmount clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public TransactionAmount clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}