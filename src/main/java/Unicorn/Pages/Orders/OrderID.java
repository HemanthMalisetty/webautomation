package Unicorn.Pages.Orders;

public class OrderID extends Orders<OrderID> {

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
    public OrderID sortOrderNumber()
    {
        sortByHeader("Order #");
        return this;
    }
    public OrderID sortDate()
    {
        sortByHeader("Date");
        return this;
    }
    public OrderID sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public OrderID sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public OrderID sortTotal()
    {
        sortByHeader("Total");
        return this;
    }
    public ViewOrder<OrderID> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder(new OrderID()).isLoaded();
    }

    public OrderID setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }

    public OrderID setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public OrderID setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public OrderID clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public OrderID clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public OrderID clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}