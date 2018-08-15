package Unicorn.Pages.Orders;

public class PLU extends Orders<PLU> {

    public String getOrderNumber(int row){ return returnBoardString(row, 1); }

    public String getName(int row){ return returnBoardString(row, 2); }

    public String getDate(int row){ return returnBoardString(row,3 ); }

    public String getStore(int row){ return returnBoardString(row, 4); }

    public String getSource(int row){ return returnBoardString(row, 5); }

    public String getTotal(int row){ return returnBoardString(row, 6); }

    public String getPLU(int row){ return returnBoardString(row,7); }

    public boolean isOrderNumberDisplayed(){ return isHeaderDisplayed("Order #"); }

    public boolean isNameDisplayed(){ return isHeaderDisplayed("Name"); }

    public boolean isDateDisplayed(){ return isHeaderDisplayed("Date"); }

    public boolean isStoreDisplayed(){ return isHeaderDisplayed("Store"); }

    public boolean isSourceDisplayed(){ return isHeaderDisplayed("Source"); }

    public boolean isTotalDisplayed(){ return isHeaderDisplayed("Total"); }

    public boolean isPluDisplayed(){ return isHeaderDisplayed("PLU"); }


    public boolean allHeadersDisplayed()
    {
        return isOrderNumberDisplayed()
                && isNameDisplayed()
                && isDateDisplayed()
                && isStoreDisplayed()
                && isSourceDisplayed()
                && isTotalDisplayed()
                && isPluDisplayed();
    }

    public PLU sortOrderNumber()
    {
        sortByHeader("Order #");
        return this;
    }
    public PLU sortDate()
    {
        sortByHeader("Date");
        return this;
    }
    public PLU sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public PLU sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public PLU sortTotal()
    {
        sortByHeader("Total");
        return this;
    }
    public PLU sortPLU()
    {
        sortByHeader("PLU");
        return this;
    }
    public ViewOrder<PLU> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder(new PLU()).isLoaded();
    }

    public PLU setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }

    public PLU setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public PLU setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public PLU clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public PLU clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public PLU clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}