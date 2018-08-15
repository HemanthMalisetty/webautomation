package Unicorn.Pages.Orders;

import Unicorn.AbstractClasses.UnicornPageBase;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;

public class ViewOrder<T> extends UnicornPageBase<ViewOrder> {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private ViewOrderBy by = new ViewOrderBy();
    private Table orderItemsTable = new Table("Order Items");
    private Table paymentTransactions = new Table("Payment Transactions");
    private T t;

    public ViewOrder(T t)
    {
        title = "Order Details";
        this.t = t;
    }
    @Override
    public ViewOrder isLoaded() {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        return this;
    }

    public class ViewOrderBy {
        By  confirmationNumber = By.xpath(".//*[@id='orders']//label[text()='Confirmation #']/../following-sibling::div//span"),
            orderDate = By.xpath(".//*[@id='orders']//label[text()='Order Date']/../following-sibling::div//span"),
            sourceSystem = By.xpath(".//*[@id='orders']//label[text()='Source System']/../following-sibling::div//span"),
            attendantID = By.xpath(".//*[@id='orders']//label[text()='Attendant ID']/../following-sibling::div//span"),
            store = By.xpath(".//*[@id='orders']//label[text()='Store']/../following-sibling::div//span"),
            name = By.xpath(".//*[@id='orders']//label[text()='Name']/../following-sibling::div//span"),
            billingAddress = By.xpath(".//*[@id='orders']//label[text()='Billing Address']/../following-sibling::div//span"),
            email = By.xpath(".//*[@id='orders']//label[text()='Email']/../following-sibling::div//span"),
            phone = By.xpath(".//*[@id='orders']//label[text()='Phone']/../following-sibling::div//span"),
            accountType = By.xpath(".//*[@id='orders']//label[text()='Account Type']/../following-sibling::div//span"),
            subtotal = By.xpath(".//*[@id='orders']//label[text()='Subtotal']/following-sibling::value"),
            salesTax = By.xpath(".//*[@id='orders']//label[text()='Sales Tax']/following-sibling::value"),
            shipping = By.xpath(".//*[@id='orders']//label[text()='Shipping']/following-sibling::value"),
            grandTotal = By.xpath(".//*[@id='orders']//label[text()='Grand Total']/following-sibling::value"),
                back = By.xpath("//h1//i");
    }

    public T clickBack()
    {
        dh.click(by. back);
        return t;
    }

    public String getOrderItemsName(int oneBased){ return orderItemsTable.returnBoardString(oneBased,2); }

    public String getOrderItemsPLU(int oneBased){ return orderItemsTable.returnBoardString(oneBased,3); }

    public String getOrderItemsProduct(int oneBased){ return orderItemsTable.returnBoardString(oneBased,4); }

    public String getOrderItemsItemTotal(int oneBased){ return orderItemsTable.returnBoardString(oneBased,5 ); }

    public String getPayementTransactionDate(int oneBased){ return paymentTransactions.returnBoardString(oneBased,2); }

    public String getPaymetnTransactionSubType(int oneBased){ return paymentTransactions.returnBoardString(oneBased,3); }

    public String getPaymetnTransactionStatus(int oneBased){ return paymentTransactions.returnBoardString(oneBased,4); }

    public String getPaymetnTransactionPaymentMethod(int oneBased){ return paymentTransactions.returnBoardString(oneBased,5); }

    public String getPaymetnTransactionOrderAmount(int oneBased){ return paymentTransactions.returnBoardString(oneBased,6); }

    public String getPaymetnTransactionName(int oneBased){ return paymentTransactions.returnBoardString(oneBased,7); }

    public String getOrderItemsItemID(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased,"Item ID"); }

    public String getOrderItemsItemID(){ return orderItemsTable.getExpandedTableText("Item ID"); }

    public String getVisualID(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased, "Visual ID"); }

    public String getVisualID(){ return orderItemsTable.getExpandedTableText("Visual ID"); }

    public String getType(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased,"Type"); }

    public String getType(){ return orderItemsTable.getExpandedTableText("Type"); }

    public String getSku(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased,"SKU"); }

    public String getSku(){ return orderItemsTable.getExpandedTableText("SKU"); }

    public String getEntitlementStatus(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased,"EntitlementStatus"); }

    public String getEntitlementStatus(){ return orderItemsTable.getExpandedTableText("EntitlementStatus"); }

    public String getPaymentMethod(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased,"Payment Method"); }

    public String getPaymentMethod(){ return orderItemsTable.getExpandedTableText("Payment Method"); }

    public String getDeliveryMethod(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased,"Delivery Method"); }

    public String getDeliveryMethod(){ return orderItemsTable.getExpandedTableText("Delivery Method"); }

    public String getSalesProgram(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased,"Sales Program"); }

    public String getSalesProgram(){ return orderItemsTable.getExpandedTableText("Sales Program"); }

    public String getSalesChannel(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased,"Sales Channel"); }

    public String getSalesChannel(){ return orderItemsTable.getExpandedTableText("Sales Channel"); }

    public String getPlu(int oneBased){ return orderItemsTable.getExpandedTableText(oneBased,"PLU"); }

    public String getPlu(){ return orderItemsTable.getExpandedTableText("PLU"); }

    public String getCredCardNumber(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Cred Card #"); }

    public String getCredCardNumber(){ return paymentTransactions.getExpandedTableText("Cred Card #"); }

    public String getToken(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Token"); }

    public String getToken(){ return paymentTransactions.getExpandedTableText("Token"); }

    public String getStatusCode(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Status Code"); }

    public String getStatusCode(){ return paymentTransactions.getExpandedTableText("Status Code"); }

    public String getAuthorizationNumber(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Authorization #"); }

    public String getAuthorizationNumber(){ return paymentTransactions.getExpandedTableText("Authorization #"); }

    public String getCvvResponse(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"CVV Response"); }

    public String getCvvResponse(){ return paymentTransactions.getExpandedTableText("CVV Response"); }

    public String getAddressValidationCode(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Address Validation Code"); }

    public String getAddressValidationCode(){ return paymentTransactions.getExpandedTableText("Address Validation Code"); }

    public String getVerificationCode(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Verification Code"); }

    public String getVerificationCode(){ return paymentTransactions.getExpandedTableText("Verification Code"); }

    public String getSubType(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Sub Type"); }

    public String getSubType(){ return paymentTransactions.getExpandedTableText("Sub Type"); }

    public String getPhone(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Phone"); }

    public String getPhone(){ return paymentTransactions.getExpandedTableText("Phone"); }

    public String getEmail(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Email"); }

    public String getEmail(){ return paymentTransactions.getExpandedTableText("Email"); }

    public String getAddress(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"Address"); }

    public String getAddress(){ return paymentTransactions.getExpandedTableText("Address"); }

    public String getUserAttendant(int oneBased){ return paymentTransactions.getExpandedTableText(oneBased,"User/Attendant"); }

    public String getUserAttendant(){ return paymentTransactions.getExpandedTableText("User/Attendant"); }


    private class Table {
        String tableHeader;
        UnicornDriverHelper dh = new UnicornDriverHelper();
        int currentRow;

        public Table(String tableHeader)
        {
            this.tableHeader = tableHeader;
        }
        public String returnBoardString(int row, int col)
        {
            return dh.getText("//h3[text()='" + tableHeader + "']" +
                    "/following-sibling::*[1]//tr[contains(@class,'clickable')][" + row + "]" +
                    "/td[" + col + "]//span");
        }
        public void clickRow(int row)
        {
            currentRow = row;
            dh.click("//h3[text()='" + tableHeader + "']/following-sibling::*[1]" +
                    "//tr[contains(@class,'clickable')][" + row + "]/td[1]//i");

        }
        public void sortByHeader(String headerName)
        {
            dh.click("//h3[text()='" + tableHeader + "']" +
                    "/following-sibling::*[1]//th[contains(text(),'" + headerName + "')]");
        }
        public int getRows()
        {
            return dh.findElements(By.xpath("//h3[text()='" + tableHeader + "']" +
                    "/following-sibling::*[1]//tr[contains(@class,'clickable')]"))
                    .size();
        }
        public String getExpandedTableText(int row, String label)
        {
            currentRow = row;
            return dh.getText("//h3[text()='" + tableHeader + "']/following-sibling::*[1]//tr[contains(@class,'expanded')][" + row + "]" +
                    "//label[text()='" + label + "']/../following-sibling::div//span");
        }
        public String getExpandedTableText(String label){ return getExpandedTableText(currentRow, label); }
    }
}