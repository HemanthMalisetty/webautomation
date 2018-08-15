package Unicorn.SiteComponent;

import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class Table {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private TableBy by = new TableBy();
    public class TableBy
    {
        By rowsInBoard = By.xpath("//tbody[@ng-if='$table.list.length']//tr");
    }
    public void selectRow(int oneBased)
    {
        //assert oneBased <= getRows(): "Row " + String.valueOf(oneBased)+ " does not exist in table";
        dh.click(".//act-standard-table//tbody//tr[" + String.valueOf(oneBased) + "]//label","Row " + oneBased + " is not available");
    }
    public void clickRow(int oneBased)
    {
        //assert oneBased <= getRows(): "Row " + String.valueOf(oneBased)+ " does not exist in table";
        dh.click(".//act-standard-table//tbody//tr[" + String.valueOf(oneBased) + "]//td[2]//span", "Row " + oneBased + " is not available");
    }
    public int getRows()
    {
        return dh.getDriver().findElements(by.rowsInBoard).size();
    }
    public String returnBoardString(int row, int col)
    {
        return dh.getText("//tbody[@ng-if='$table.list.length']" +
                "//tr[" + row +"]/td[" + col + "]//span");
    }
    public void sortByHeader(String header)
    {
        dh.click(By.xpath(".//act-standard-table//th[contains(text(),'" + header + "')]"), "Cannot sort by header: " + header);
        dh.waitForUnicorn();
    }
    public boolean isHeaderDisplayed(String header)
    {
        return dh.isDisplayed(By.xpath(".//act-standard-table//th[contains(text(),'" + header + "')]"));
    }
}
