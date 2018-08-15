package Unicorn.Pages.Orders;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class Orders<T extends Orders> extends PageComponentBase<Orders> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private OrdersBy by = new OrdersBy();

    public Orders()
    {
        title = "Orders";
        url += "orders";
    }
    @Override
    public Orders get() {
        getUrl();
        return isLoaded();
    }
    @Override
    public Orders isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        updateTestStep(title);
        return this;
    }
    @Override
    protected RemoveRowFromTable<Orders> clickDeleteSelectedRows() { return null; }

    public class OrdersBy {
        By  searchType = By.id("ctrlType");
    }

    protected T setCalendarFromInput(String calendarFromInput) {
        super.setCalendarFromInput(calendarFromInput);
        return (T)this;
    }


    public String getCalendarFromInput()
    {
        return super.getCalendarFromInput();
    }

    protected T setCalendarTillInput(String calendarTillInput)
    {
        super.setCalendarTillInput(calendarTillInput);
        return (T)this;
    }
    protected T setSearchInput(String text){
        super.setSearchBox(text);
        return (T)this;
    }

    public String getCalendarTillInput()
    {
        return super.getCalendarTillInput();
    }
    protected T clickCalendarFromButton()
    {
        super.clickCalendarFromButton();
        return (T)this;
    }
    protected T clickCalendarTillButton()
    {
        super.clickCalendarFromButton();
        return (T)this;
    }


//    public Orders selectSearchType(String searchType)
//    {
//        dh.dhs.selectOption(by.searchType, searchType);
//        return this;
//    }
    public Any selectSearchTypeAny()
    {
        dh.getDhs().selectOption(by.searchType, "Any");
        return new Any();
    }
    public AttendantID selectSearchTypeAttendantID()
    {
        dh.getDhs().selectOption(by.searchType, "Attendant ID");
        return new AttendantID();
    }
    public CCF6 selectSearchTypeCCF6()
    {
        dh.getDhs().selectOption(by.searchType, "CC F6");
        return new CCF6();
    }

    public CCL4 selectSearchTypeCCL4()
    {
        dh.getDhs().selectOption(by.searchType, "CC L4");
        return new CCL4();
    }

    public OrderID selectSearchTypeOrderID()
    {
        dh.getDhs().selectOption(by.searchType,"Order ID");
        return new OrderID();
    }
    public PhoneNumber selectSearchTypePhoneNumber()
    {
        dh.getDhs().selectOption(by.searchType,"Phone Number");
        return new PhoneNumber();
    }
    public PLU selectSearchTypePLU()
    {
        dh.getDhs().selectOption(by.searchType, "PLU");
        return new PLU();
    }
    public VisualID selectSearchTypeVisualID()
    {
        dh.getDhs().selectOption(by.searchType,"Visual ID");
        return new VisualID();
    }
    public TenderType selectSearchTypeTenderType()
    {
        dh.getDhs().selectOption(by.searchType, "Tender Type");
        return new TenderType();
    }
    public TransactionAmount selectSearchTypeTransactionAmount()
    {
        dh.getDhs().selectOption(by.searchType, "Transaction Amount");
        return new TransactionAmount();
    }

    public String getSearchType()
    {
        return dh.getDhs().getSelectedOption(by.searchType);
    }

    public boolean isSearchTypeDisplayed()
    {
        return dh.isDisplayed(by.searchType);
    }

}