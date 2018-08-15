package Unicorn.Pages.Orders;


import Unicorn.UnicornDriverHelper;

public class Any extends Orders<Any>{

    public String getOrderNumber(int row){ return returnBoardString(row,1); }

    public String getName(int row){ return returnBoardString(row, 2); }

    public String getDate(int row){ return returnBoardString(row, 3); }

    public String getStore(int row){ return returnBoardString(row,4); }

    public String getSource(int row){ return returnBoardString(row,5); }

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

    public Any sortOrder()
    {
        sortByHeader("Order #");
        return this;
    }

    public Any sortDate()
    {
        sortByHeader("Date");
        return this;
    }
    public Any sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public Any sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public Any sortTotal()
    {
        sortByHeader("Total");
        return this;
    }
    public ViewOrder<Any> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder(new Any()).isLoaded();
    }

    public Any setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }

    public Any setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public Any setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public Any clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public Any clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public Any clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}