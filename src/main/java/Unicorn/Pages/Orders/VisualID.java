package Unicorn.Pages.Orders;

public class VisualID extends Orders<VisualID> {

    public String getOrderNumber(int row){ return returnBoardString(row, 1); }

    public String getName(int row){ return returnBoardString(row, 2); }

    public String getDate(int row){ return returnBoardString(row,3 ); }

    public String getStore(int row){ return returnBoardString(row, 4); }

    public String getSource(int row){ return returnBoardString(row, 5); }

    public String getTotal(int row){ return returnBoardString(row, 6); }

    public String getVisualID(int row){ return returnBoardString(row,7); }

    public boolean isOrderNumberDisplayed(){ return isHeaderDisplayed("Order #"); }

    public boolean isNameDisplayed(){ return isHeaderDisplayed("Name"); }

    public boolean isDateDisplayed(){ return isHeaderDisplayed("Date"); }

    public boolean isStoreDisplayed(){ return isHeaderDisplayed("Store"); }

    public boolean isSourceDisplayed(){ return isHeaderDisplayed("Source"); }

    public boolean isTotalDisplayed(){ return isHeaderDisplayed("Total"); }

    public boolean isVisualIdDisplayed(){ return isHeaderDisplayed("Visual ID"); }


    public boolean allHeadersDisplayed()
    {
        return isOrderNumberDisplayed()
                && isNameDisplayed()
                && isDateDisplayed()
                && isStoreDisplayed()
                && isSourceDisplayed()
                && isTotalDisplayed()
                && isVisualIdDisplayed();
    }

    public VisualID sortOrderNumber()
    {
        sortByHeader("Order #");
        return this;
    }
    public VisualID sortDate()
    {
        sortByHeader("Date");
        return this;
    }
    public VisualID sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public VisualID sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public VisualID sortTotal()
    {
        sortByHeader("Total");
        return this;
    }
    public VisualID sortVisualID()
    {
        sortByHeader("Visual ID");
        return this;
    }
    public ViewOrder<VisualID> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder<>(new VisualID()).isLoaded();
    }

    public VisualID setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }

    public VisualID setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public VisualID setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public VisualID clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public VisualID clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public VisualID clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}