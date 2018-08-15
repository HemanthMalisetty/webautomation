package Unicorn.Pages.Orders;

public class CCF6 extends Orders<CCF6> {
    public String getOrderNumber(int row){ return returnBoardString(row, 1); }

    public String getName(int row){ return returnBoardString(row, 2); }

    public String getDate(int row){ return returnBoardString(row,3 ); }

    public String getStore(int row){ return returnBoardString(row, 4); }

    public String getSource(int row){ return returnBoardString(row, 5); }

    public String getTotal(int row){ return returnBoardString(row, 6); }

    public String getCCF6(int row){ return returnBoardString(row, 7); }

    public boolean isOrderNumberDisplayed(){ return isHeaderDisplayed("Order #"); }

    public boolean isNameDisplayed(){ return isHeaderDisplayed("Name"); }

    public boolean isDateDisplayed(){ return isHeaderDisplayed("Date"); }

    public boolean isStoreDisplayed(){ return isHeaderDisplayed("Store"); }

    public boolean isSourceDisplayed(){ return isHeaderDisplayed("Source"); }

    public boolean isTotalDisplayed(){ return isHeaderDisplayed("Total"); }

    public boolean isCCF6Displayed(){ return isHeaderDisplayed("CC F6"); }

    public boolean allHeadersDisplayed()
    {
        return isOrderNumberDisplayed()
                && isNameDisplayed()
                && isDateDisplayed()
                && isStoreDisplayed()
                && isSourceDisplayed()
                && isTotalDisplayed()
                && isCCF6Displayed();
    }
    public CCF6 sortOrderNumber()
    {
        sortByHeader("Order #");
        return this;
    }
    public CCF6 sortDate()
    {
        sortByHeader("Date");
        return this;
    }
    public CCF6 sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public CCF6 sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public CCF6 sortTotal()
    {
        sortByHeader("Total");
        return this;
    }
    public CCF6 sortCCF6()
    {
        sortByHeader("CC F6");
        return this;
    }
    public ViewOrder<CCF6> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder(new CCF6()).isLoaded();
    }

    public CCF6 setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }

    public CCF6 setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public CCF6 setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public CCF6 clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public CCF6 clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public CCF6 clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}