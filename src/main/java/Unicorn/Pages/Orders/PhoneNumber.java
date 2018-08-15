package Unicorn.Pages.Orders;

public class PhoneNumber extends Orders<PhoneNumber> {

    public String getOrderNumber(int row){ return returnBoardString(row, 1); }

    public String getName(int row){ return returnBoardString(row, 2); }

    public String getDate(int row){ return returnBoardString(row,3 ); }

    public String getStore(int row){ return returnBoardString(row, 4); }

    public String getSource(int row){ return returnBoardString(row, 5); }

    public String getTotal(int row){ return returnBoardString(row, 6); }

    public String getPhoneNumber(int row){ return returnBoardString(row,7); }

    public boolean isOrderNumberDisplayed(){ return isHeaderDisplayed("Order #"); }

    public boolean isNameDisplayed(){ return isHeaderDisplayed("Name"); }

    public boolean isDateDisplayed(){ return isHeaderDisplayed("Date"); }

    public boolean isStoreDisplayed(){ return isHeaderDisplayed("Store"); }

    public boolean isSourceDisplayed(){ return isHeaderDisplayed("Source"); }

    public boolean isTotalDisplayed(){ return isHeaderDisplayed("Total"); }

    public boolean isPhoneNumberDisplayed(){ return isHeaderDisplayed("Phone Number"); }


    public boolean allHeadersDisplayed()
    {
        return isOrderNumberDisplayed()
                && isNameDisplayed()
                && isDateDisplayed()
                && isStoreDisplayed()
                && isSourceDisplayed()
                && isTotalDisplayed()
                && isPhoneNumberDisplayed();
    }
    public PhoneNumber sortOrderNumber()
    {
        sortByHeader("Order #");
        return this;
    }
    public PhoneNumber sortDate()
    {
        sortByHeader("Date");
        return this;
    }
    public PhoneNumber sortStore()
    {
        sortByHeader("Store");
        return this;
    }
    public PhoneNumber sortSource()
    {
        sortByHeader("Source");
        return this;
    }
    public PhoneNumber sortTotal()
    {
        sortByHeader("Total");
        return this;
    }
    public PhoneNumber sortPhoneNumber()
    {
        sortByHeader("Phone Number");
        return this;
    }
    public ViewOrder<PhoneNumber> clickRow(int row)
    {
        clickOnRow(row);
        return new ViewOrder(new PhoneNumber()).isLoaded();
    }

    public PhoneNumber setSearchBox(String text)
    {
        super.setSearchBox(text);
        return this;
    }

    public PhoneNumber setCalendarFromInput(String calendarFromInput)
    {
        super.setCalendarFromInput(calendarFromInput);
        return this;
    }
    public PhoneNumber setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return this;
    }
    public PhoneNumber clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return this;
    }
    public PhoneNumber clickCalendarTillButton()
    {
        super.clickCalendarTillButton();
        return this;
    }
    public PhoneNumber clickSearchButton()
    {
        super.clickSearchButton();
        return this;
    }
}