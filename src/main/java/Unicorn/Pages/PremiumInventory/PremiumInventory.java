package Unicorn.Pages.PremiumInventory;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class PremiumInventory extends PageComponentBase<PremiumInventory> {
    UnicornDriverHelper dh = new UnicornDriverHelper();
    private PremiumInventoryBy by = new PremiumInventoryBy();
    public PremiumInventory()
    {
        title = "Inventory";
        url += "inventory";
    }
    @Override
    public PremiumInventory get() {
        getUrl();
        return isLoaded();
    }
    @Override
    protected RemoveRowFromTable<PremiumInventory> clickDeleteSelectedRows() {
        return null;
    }

    private class PremiumInventoryBy {
        By  dateInput = By.xpath("//act-date-picker//input"),
            dateButton = By.xpath("//act-date-picker//span");
    }
    public PremiumInventory setDateInput(String dateInput)
    {
        dh.setText(by.dateInput, dateInput);
        return this;
    }

    public String getDateInput()
    {
        return dh.getValue(by.dateInput);
    }

    public boolean isDateInputDisplayed()
    {
        return dh.isDisplayed(by.dateInput);
    }
    public PremiumInventory clickDateButton()
    {
        dh.click(by.dateButton);
        return this;
    }

    public boolean isDateButtonDisplayed()
    {
        return dh.isDisplayed(by.dateButton);
    }
    public String getName(int oneBased){ return returnBoardString(oneBased,1); }

    public String getAvailable(int oneBased){ return returnBoardString(oneBased, 2); }

    public String getTotal(int oneBased){ return returnBoardString(oneBased,3); }

    public String getSource(int oneBased){ return returnBoardString(oneBased,4); }

    public PremiumInventory sortName(int oneBased){ return sortByHeader("Name"); }

    public PremiumInventory sortAvailable(int oneBased){ return sortByHeader("Available"); }

    public PremiumInventory sortTotal(int oneBased){ return sortByHeader("Total"); }

    public PremiumInventory sortSource(int oneBased){ return sortByHeader("Source"); }
}