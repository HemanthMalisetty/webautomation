package Unicorn.Pages.Orders;

public class TenderType extends Orders<TenderType> {

    public String getOrderNumber(int row){ return returnBoardString(row, 1); }

    public String getName(int row){ return returnBoardString(row, 2); }

    public String getDate(int row){ return returnBoardString(row,3 ); }

    public String getStore(int row){ return returnBoardString(row, 4); }

    public String getSource(int row){ return returnBoardString(row, 5); }

    public String getTotal(int row){ return returnBoardString(row, 6); }

    public String getTenderType(int row){ return returnBoardString(row,7); }

    public boolean isOrderNumberDisplayed(){ return isHeaderDisplayed("Order #"); }

    public boolean isNameDisplayed(){ return isHeaderDisplayed("Name"); }

    public boolean isDateDisplayed(){ return isHeaderDisplayed("Date"); }

    public boolean isStoreDisplayed(){ return isHeaderDisplayed("Store"); }

    public boolean isSourceDisplayed(){ return isHeaderDisplayed("Source"); }

    public boolean isTotalDisplayed(){ return isHeaderDisplayed("Total"); }

    public boolean isTenderTypeDisplayed(){ return isHeaderDisplayed("Tender Type"); }


    public boolean allHeadersDisplayed()
    {
        return isOrderNumberDisplayed()
                && isNameDisplayed()
                && isDateDisplayed()
                && isStoreDisplayed()
                && isSourceDisplayed()
                && isTotalDisplayed()
                && isTenderTypeDisplayed();
    }

    public TenderType sortOrderNumber()
    {
        sortByHeader("Order #");
        return this;
    }
    public TenderType sortDate()
    {
        sortByHeader("Date");
        return this;
    }
    public TenderType sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public TenderType sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public TenderType sortTotal()
    {
        sortByHeader("Total");
        return this;
    }
    public TenderType sortTenderType()
    {
        sortByHeader("Tender Type");
        return this;
    }
    public ViewOrder<TenderType> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder(new TenderType()).isLoaded();
    }

    public TenderType setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }

    public TenderType setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public TenderType setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public TenderType clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public TenderType clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public TenderType clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}