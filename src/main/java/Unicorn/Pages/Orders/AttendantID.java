package Unicorn.Pages.Orders;

public class AttendantID extends Orders<AttendantID> {

    public String getTerminalId(int row){ return returnBoardString(row, 1); }

    public String getOrderNumber(int row){ return returnBoardString(row, 2); }

    public String getUserName(int row){ return returnBoardString(row, 3); }

    public String getDate(int row){ return returnBoardString(row, 4); }

    public String getStore(int row){ return returnBoardString(row, 5); }

    public String getSource(int row){ return returnBoardString(row, 6); }

    public String getTenderType(int row){ return returnBoardString(row, 7);}

    public String getAmount(int row){ return returnBoardString(row, 8); }

    public String getAttendantId(int row){ return returnBoardString(row,9); }

    public Boolean isTerminalIdDisplayed(){ return isHeaderDisplayed("Terminal Id"); }

    public Boolean isOrderNumberDisplayed(){ return isHeaderDisplayed("Order Number"); }

    public Boolean isUserNameDisplayed(){ return isHeaderDisplayed("User Name"); }

    public Boolean isDateDisplayed(){ return isHeaderDisplayed("Date"); }

    public Boolean isStoreDisplayed(){ return isHeaderDisplayed("Store"); }

    public boolean isSourceDisplayed(){ return isHeaderDisplayed("Source"); }

    public boolean isTenderTypeDisplayed(){ return isHeaderDisplayed("Tender Type"); }

    public boolean isAmountDisplayed(){ return isHeaderDisplayed("Amount"); }

    public boolean isAttendantIdDisplayed(){ return isHeaderDisplayed("Attendant Id"); }

    public boolean allHeadersDisplayed()
    {
        return isTerminalIdDisplayed()
                && isOrderNumberDisplayed()
                && isUserNameDisplayed()
                && isDateDisplayed()
                && isStoreDisplayed()
                && isSourceDisplayed()
                && isTenderTypeDisplayed()
                && isAmountDisplayed()
                && isAttendantIdDisplayed();

    }

    public AttendantID sortTerminalId()
    {
        sortByHeader("Termial Id");
        return this;
    }

    public AttendantID sortOrderNumber()
    {
        sortByHeader("Order Number");
        return this;
    }
    public AttendantID sortDate()
    {
        sortByHeader("OrderNumber");
        return this;
    }
    public AttendantID sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public AttendantID sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public AttendantID sortTenderType()
    {
        sortByHeader("Tender Type");
        return this;
    }
    public AttendantID sortAmount()
    {
        sortByHeader("Amount");
        return this;
    }
    public AttendantID sortAttendantId()
    {
        sortByHeader("Attendant Id");
        return this;
    }
    public ViewOrder<AttendantID> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder(new AttendantID()).isLoaded();
    }
    public AttendantID setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }
    public AttendantID setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public AttendantID setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public AttendantID clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public AttendantID clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public AttendantID clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}
