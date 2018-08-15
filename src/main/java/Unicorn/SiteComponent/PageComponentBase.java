package Unicorn.SiteComponent;

import Unicorn.AbstractClasses.UnicornPageBase;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public abstract class PageComponentBase<T extends PageComponentBase> extends UnicornPageBase<T> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    public Table table = new Table();
    private PageComponentBaseBy by = new PageComponentBaseBy();

    @Override
    public T isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        return (T)this;
    }

    public abstract T get();

    public class PageComponentBaseBy
    {
       public  By   add  = By.xpath("//h1//span"),
                    searchBox = By.id("ctrlSearch"),
                    searchType = By.id("ctrlType"),
                    searchClear = By.xpath("//*[@class='reset']//i"),
                    searchButton = By.xpath("//act-search-box//button"),
                    deleteMessage = By.xpath("//act-actions-bar//div[contains(text(),'Selected')]"),
                    deleteSelectedRows = By.xpath("//act-actions-bar//button[contains(text(),'Delete Selected Rows')]"),
                    calendarFromInput = By.xpath("//act-date-picker[@model='vm.first']//input"),
                    calendarFromButton = By.xpath("//act-date-picker[@model='vm.first']//span"),
                    calendarTillInput = By.xpath("//act-date-picker[@model='vm.last']//input"),
                    calendarTillButton = By.xpath("//act-date-picker[@model='vm.last']//span"),
                    filter = By.xpath("//button[text()='Filter']"),
                    clear = By.xpath("//button[text()='Clear']"),
                    back  = By.xpath("//header//i");

    }
    protected T back()
    {
        dh.click(by.back);
        return (T)this;
    }

    protected boolean isBackDisplayed()
    {
        return dh.isDisplayed(by.back);
    }

    protected T selectSearchType(String type)
    {
        dh.getDhs().selectOption(by.searchType, type);
        return (T)this;
    }
    protected T clickFilter()
    {
        dh.click(by.filter);
        return (T)this;
    }

    protected boolean isFilterDisplayed()
    {
        return dh.isDisplayed(by.filter);
    }

    protected T clickClear()
    {
        dh.click(by.clear);
        return (T)this;
    }

    protected boolean isClearDisplayed()
    {
        return dh.isDisplayed(by.clear);
    }


    protected T setCalendarFromInput(String calendarFromInput)
    {
        dh.setText(by.calendarFromInput, calendarFromInput);
        dh.waitForUnicorn();
        return (T)this;
    }

    protected String getCalendarFromInput()
    {
        return dh.getValue(by.calendarFromInput);
    }

    public boolean isCalendarFromInputDisplayed()
    {
        return dh.isDisplayed(by.calendarFromInput);
    }


    protected T setCalendarTillInput(String calendarTillInput)
    {
        dh.setText(by.calendarTillInput, calendarTillInput);
        return (T)this;
    }

    protected String getCalendarTillInput()
    {
        return dh.getValue(by.calendarTillInput);
    }

    public boolean isCalendarTillInputDisplayed()
    {
        return dh.isDisplayed(by.calendarTillInput);
    }

    protected T clickCalendarFromButton()
    {
        dh.click(by.calendarFromButton);
        return (T)this;
    }

    protected boolean isCalendarFromButtonDisplayed()
    {
        return dh.isDisplayed(by.calendarFromButton);
    }

    protected T clickCalendarTillButton()
    {
        dh.click(by.calendarTillButton);
        return (T)this;
    }

    protected boolean isCalendarTillButtonDisplayed()
    {
        return dh.isDisplayed(by.calendarTillButton);
    }
    protected T add()
    {
        dh.click(by.add);
        return (T)this;
    }


    public boolean isDeleteSelectedRowsDisplayed()
    {
        return dh.isDisplayed(by.deleteSelectedRows);
    }

    protected boolean isAddDisplayed()
    {
        return dh.isDisplayed(by.add);
    }

    public T setSearchBox(String searchBox)
    {
        dh.setText(by.searchBox, searchBox);
        return (T)this;
    }

    public String getSearchBox()
    {
        return dh.getValue(by.searchBox);
    }

    public boolean isSearchBoxDisplayed()
    {
        return dh.isDisplayed(by.searchBox);
    }
    public boolean isSearchButtonDisplayed()
    {
        return dh.isDisplayed(by.searchButton);
    }

    public T clearSearch()
    {
        dh.click(by.searchClear,"");
        dh.waitForUnicorn();
        return (T)this;
    }

    public T clickSearchButton() {
        dh.click(by.searchButton);
        dh.waitForUnicorn();
        // TODO
        // Fix this with better solution.
        //  Unicorn disappeared but there was a slight difference between unicorn
        // and results of search to appear/disappear.
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        dh.waitForUnicorn();
        return (T) this;

    }

    public String getDeleteMessage()
    {
        return dh.getText(by.deleteMessage);
    }

    protected abstract RemoveRowFromTable<T> clickDeleteSelectedRows();

    protected void deleteSelectedRows()
    {
        dh.click(by.deleteSelectedRows);
        dh.waitForUnicorn();
    }
    // Table methods

    protected T selectRow(int oneBased)
    {
        table.selectRow(oneBased);
        return (T)this;
    }
    public int getRows()
    {
        return table.getRows();
    }
    protected String returnBoardString(int row, int col)
    {
        return table.returnBoardString(row, col);
    }

    protected T sortByHeader(String header)
    {
        table.sortByHeader(header);
        return (T)this;
    }
    public boolean isHeaderDisplayed(String header)
    {
        return table.isHeaderDisplayed(header);
    }

    protected T clickOnRow(int oneBased)
    {
        table.clickRow(oneBased);
        return (T)this;
    }
}
