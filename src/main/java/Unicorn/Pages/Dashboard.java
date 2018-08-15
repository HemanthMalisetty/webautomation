package Unicorn.Pages;

import Unicorn.AbstractClasses.UnicornPageBase;
import Unicorn.UnicornDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public abstract class Dashboard <T extends Dashboard> extends UnicornPageBase {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private DashboardBy by = new DashboardBy();
    public Dashboard()
    {
        url += "dashboard";
        title = "Dashboard";
    }
    @Override
    public T isLoaded()
    {
        dh.waitForTitle(title);
        dh.waitForUnicorn();
        log("Navigated to:" + title);
        return (T)this;
    }
    public T get()
    {
        getUrl();
        return isLoaded();
    }

    public class DashboardBy
    {
            // Master Data
        By  acps = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Master Data']/..//div[contains(text(),'ACPs')]"),
            beacons = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Master Data']/..//div[contains(text(),'Beacons')]"),
            experienceAccess = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Master Data']/..//div[contains(text(),'Experience Access')]"),
            linkingConfiguration = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Master Data']/..//div[contains(text(),'Linking Configuration')]"),
            location = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Master Data']/..//div[contains(text(),'Locations')]"),
            mediaInventory = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Master Data']/..//div[contains(text(),'Media Inventory')]"),
            manifest = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Master Data']/..//div[contains(text(),'Manifest')]"),
            waitTimeBoards = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Master Data']/..//div[contains(text(),'Wait Time Boards')]"),

            // System Administrator
            aclPermission = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='System Administration']/..//div[contains(text(),'ACL Permissions')]"),
            applicationConfiguration = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='System Administration']/..//div[contains(text(),'Application Configuration')]"),
            auditLogs = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='System Administration']/..//div[contains(text(),'Audit Logs')]"),
            enumerations = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='System Administration']/..//div[contains(text(),'Enumerations')]"),
            permissioningGroups = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='System Administration']/..//div[contains(text(),'Permissioning Groups')]"),
            users = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='System Administration']/..//div[contains(text(),'Users')]"),

            // Monitoring & Reporting
            acpLogs = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Monitoring & Reporting']/..//div[contains(text(),'ACP Logs')]"),

            // Finance & Accounting
            ordersSearch = By.xpath("//*[contains(@class,'dashboard')]//h3[text()='Finance & Accounting']/..//div[contains(text(),'Orders Search')]"),

            // Operations Management
            cabanaAndPremiumSeatingInventory = By.xpath("//*[contains(@class,'dashboard')]" +
                    "//h3[text()='Operations Management']/..//div[contains(text(),'Cabana & Premium Seating Inventory')]"),
            acpConfiguration = By.xpath("//*[contains(@class,'dashboard')]" +
                    "//h3[text()='Operations Management']/..//div[contains(text(),'ACP Configuration')]"),
            operatingHours = By.xpath("//*[contains(@class,'dashboard')]" +
                    "//h3[text()='Operations Management']/..//div[contains(text(),'Operating Hours')]"),
            waitTimeBoardContent = By.xpath("//*[contains(@class,'dashboard')]" +
                    "//h3[text()='Operations Management']/..//div[contains(text(),'Wait Time Board Content')]");

    }
    public List<String> getAllLinkText()
    {
        List<String> list = new ArrayList<>();
        List<WebElement> elements = dh.findElements("//*[contains(@class,'dashboard')]//h3//following-sibling::div");
        for (WebElement element: elements)
        {
            list.add(element.getText());
        }
        return list;
    }
    public List<String> getAllLinkHref()
    {
        List<String> list = new ArrayList<>();
        List<WebElement> elements = dh.findElements("//*[contains(@class,'dashboard')]//h3//following-sibling::div");
        for (WebElement element: elements)
        {
            list.add(element.getAttribute("href"));
        }
        return list;
    }
    protected T clickAcp()
    {
        dh.click(by.acps);
        return (T)this;
    }

    protected boolean isAcpsDisplayed()
    {
        return dh.isDisplayed(by.acps);
    }

    protected T beacons()
    {
        dh.click(by.beacons);
        return (T)this;
    }

    protected boolean isBeaconsDisplayed()
    {
        return dh.isDisplayed(by.beacons);
    }

    protected T manifest()
    {
        dh.click(by.manifest);
        return (T)this;
    }

    protected boolean isManifestDisplayed()
    {
        return dh.isDisplayed(by.manifest);
    }



    protected T experienceAccess()
    {
        dh.click(by.experienceAccess);
        return (T)this;
    }

    protected boolean isExperienceAccessDisplayed()
    {
        return dh.isDisplayed(by.experienceAccess);
    }

    protected T linkingConfiguration()
    {
        dh.click(by.linkingConfiguration);
        return (T)this;
    }

    protected boolean isLinkingConfigurationDisplayed()
    {
        return dh.isDisplayed(by.linkingConfiguration);
    }

    protected T clickLocation()
    {
        dh.click(by.location);
        return (T)this;
    }

    protected boolean isLocationDisplayed()
    {
        return dh.isDisplayed(by.location);
    }

    protected T mediaInventory()
    {
        dh.click(by.mediaInventory);
        return (T)this;
    }

    protected boolean isMediaInventoryDisplayed()
    {
        return dh.isDisplayed(by.mediaInventory);
    }

    protected T clickWaitTimeBoards()
    {
        dh.click(by.waitTimeBoards);
        return (T)this;
    }

    protected boolean isWaitTimeBoardsDisplayed()
    {
        return dh.isDisplayed(by.waitTimeBoards);
    }

    protected T clickAclPermission()
    {
        dh.click(by.aclPermission);
        return (T)this;
    }

    protected boolean isAclPermissionDisplayed()
    {
        return dh.isDisplayed(by.aclPermission);
    }

    protected T clickApplicationConfigurations()
    {
        dh.click(by.applicationConfiguration);
        return (T)this;
    }

    protected boolean isApplicationConfigurationDisplayed()
    {
        return dh.isDisplayed(by.applicationConfiguration);
    }

    protected T auditLogs()
    {
        dh.click(by.auditLogs);
        return (T)this;
    }

    protected boolean isAuditLogsDisplayed()
    {
        return dh.isDisplayed(by.auditLogs);
    }

    protected T enumerations()
    {
        dh.click(by.enumerations);
        return (T)this;
    }

    protected boolean isEnumerationsDisplayed()
    {
        return dh.isDisplayed(by.enumerations);
    }

    protected T permissioningGroups()
    {
        dh.click(by.permissioningGroups);
        return (T)this;
    }

    protected boolean isPermissioningGroupsDisplayed()
    {
        return dh.isDisplayed(by.permissioningGroups);
    }

    protected T users()
    {
        dh.click(by.users);
        return (T)this;
    }

    protected boolean isUsersDisplayed()
    {
        return dh.isDisplayed(by.users);
    }

    protected T clickAcpLogs()
    {
        dh.click(by.acpLogs);
        return (T)this;
    }

    protected boolean isAcpLogsDisplayed()
    {
        return dh.isDisplayed(by.acpLogs);
    }

    protected T ordersSearch()
    {
        dh.click(by.ordersSearch);
        return (T)this;
    }

    protected boolean isOrdersSearchDisplayed()
    {
        return dh.isDisplayed(by.ordersSearch);
    }

    public T cabanaAndPremiumSeatingInventory()
    {
        dh.click(by.cabanaAndPremiumSeatingInventory);
        return (T)this;
    }

    public boolean isCabanaAndPremiumSeatingInventoryDisplayed()
    {
        return dh.isDisplayed(by.cabanaAndPremiumSeatingInventory);
    }

    protected T clickAcpConfiguration()
    {
        dh.click(by.acpConfiguration);
        return (T)this;
    }

    protected boolean isAcpConfigurationDisplayed()
    {
        return dh.isDisplayed(by.acpConfiguration);
    }

    protected T clickOperatingHours()
    {
        dh.click(by.operatingHours);
        return (T)this;
    }

    protected boolean isOperatingHoursDisplayed()
    {
        return dh.isDisplayed(by.operatingHours);
    }

    protected T clickWaitTimeBoardContent()
    {
        dh.click(by.waitTimeBoardContent);
        return (T)this;
    }

    protected boolean isWaitTimeBoardContentDisplayed()
    {
        return dh.isDisplayed(by.waitTimeBoardContent);
    }
}
