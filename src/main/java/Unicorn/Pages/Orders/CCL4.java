package Unicorn.Pages.Orders;

public class CCL4 extends Orders<CCL4> {

    public String getOrderNumber(int row){ return returnBoardString(row, 1); }

    public String getName(int row){ return returnBoardString(row, 2); }

    public String getDate(int row){ return returnBoardString(row,3 ); }

    public String getStore(int row){ return returnBoardString(row, 4); }

    public String getSource(int row){ return returnBoardString(row, 5); }

    public String getTotal(int row){ return returnBoardString(row, 6); }

    public String getCCL4(int row){ return returnBoardString(row, 7); }

    public boolean isOrderNumberDisplayed(){ return isHeaderDisplayed("Order #"); }

    public boolean isNameDisplayed(){ return isHeaderDisplayed("Name"); }

    public boolean isDateDisplayed(){ return isHeaderDisplayed("Date"); }

    public boolean isStoreDisplayed(){ return isHeaderDisplayed("Store"); }

    public boolean isSourceDisplayed(){ return isHeaderDisplayed("Source"); }

    public boolean isTotalDisplayed(){ return isHeaderDisplayed("Total"); }

    public boolean isCCL4Displayed(){ return isHeaderDisplayed("CC L4"); }

    public boolean allHeadersDisplayed()
    {
        return isOrderNumberDisplayed()
                && isNameDisplayed()
                && isDateDisplayed()
                && isStoreDisplayed()
                && isSourceDisplayed()
                && isTotalDisplayed()
                && isCCL4Displayed();
    }
    public CCL4 sortOrderNumber()
    {
        sortByHeader("Order #");
        return this;
    }
    public CCL4 sortDate()
    {
        sortByHeader("Date");
        return this;
    }
    public CCL4 sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public CCL4 sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public CCL4 sortTotal()
    {
        sortByHeader("Total");
        return this;
    }
    public CCL4 sortCCL4()
    {
        sortByHeader("CC L4");
        return this;
    }
    public ViewOrder<CCL4> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder(new CCL4()).isLoaded();
    }

    public CCL4 setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }

    public CCL4 setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public CCL4 setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public CCL4 clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public CCL4 clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public CCL4 clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}