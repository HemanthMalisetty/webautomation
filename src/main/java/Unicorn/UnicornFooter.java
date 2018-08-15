package Unicorn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UnicornFooter {
    private UnicornDriverHelper dh = new UnicornDriverHelper();
    private UnicornFooterBy by = new UnicornFooterBy();

    public class UnicornFooterBy {

            String footerBase = "//act-footer";
                     // Master Data
            By      acps = By.xpath(footerBase + "//h3[text()='Master Data']/..//div[contains(text(),'ACPs')]"),
                    beacons = By.xpath(footerBase + "//h3[text()='Master Data']/..//div[contains(text(),'Beacons')]"),
                    experienceAccess = By.xpath(footerBase + "//h3[text()='Master Data']/..//div[contains(text(),'Experience Access')]"),
                    linkingConfiguration = By.xpath(footerBase + "//h3[text()='Master Data']/..//div[contains(text(),'Linking Configuration')]"),
                    location = By.xpath(footerBase + "//h3[text()='Master Data']/..//div[contains(text(),'Locations')]"),
                    mediaInventory = By.xpath(footerBase + "//h3[text()='Master Data']/..//div[contains(text(),'Media Inventory')]"),
                    waitTimeBoards = By.xpath(footerBase + "//h3[text()='Master Data']/..//div[contains(text(),'Wait Time Boards')]"),

                    // System Administrator
                    aclPermission = By.xpath(footerBase + "//h3[text()='System Administration']/..//div[contains(text(),'ACL Permissions')]"),
                    applicationConfiguration = By.xpath(footerBase + "//h3[text()='System Administration']/..//div[contains(text(),'Application Configuration')]"),
                    auditLogs = By.xpath(footerBase + "//h3[text()='System Administration']/..//div[contains(text(),'Audit Logs')]"),
                    enumerations = By.xpath(footerBase + "//h3[text()='System Administration']/..//div[contains(text(),'Enumerations')]"),
                    permissioningGroups = By.xpath(footerBase + "//h3[text()='System Administration']/..//div[contains(text(),'Permissioning Groups')]"),
                    users = By.xpath(footerBase + "//h3[text()='System Administration']/..//div[contains(text(),'Users')]"),

                    // Monitoring & Reporting
                    acpLogs = By.xpath(footerBase + "//h3[text()='Monitoring & Reporting']/..//div[contains(text(),'ACP Logs')]"),

                    // Finance & Accounting
                    ordersSearch = By.xpath(footerBase + "//h3[text()='Finance & Accounting']/..//div[contains(text(),'Orders Search')]"),

                    // Operations Management
                    cabanaAndPremiumSeatingInventory = By.xpath(footerBase +
                    "//h3[text()='Operations Management']/..//div[contains(text(),'Cabana & Premium Seating Inventory')]"),
                    acpConfiguration = By.xpath(footerBase +
                            "//h3[text()='Operations Management']/..//div[contains(text(),'ACP Configuration')]"),
                    operatingHours = By.xpath(footerBase +
                            "//h3[text()='Operations Management']/..//div[contains(text(),'Operating Hours')]"),
                    waitTimeBoardContent = By.xpath(footerBase +
                            "//h3[text()='Operations Management']/..//div[contains(text(),'Wait Time Board Content')]"),

                    copyright = By.xpath("//act-footer//p[contains(@class,'copyright')]");

    }

    public boolean isCopyrightDisplayed()
    {
        return dh.isDisplayed(by.copyright);
    }


    public List<String> getAllLinkText()
    {
        List<String> list = new ArrayList<>();
        List<WebElement> elements = dh.findElements("//act-footer//h3//following-sibling::div");
        for (WebElement element: elements)
        {
            list.add(element.getText());
        }
        return list;
    }
    public List<String> getAllLinkHref()
    {
        List<String> list = new ArrayList<>();
        List<WebElement> elements = dh.findElements("//act-footer//h3//following-sibling::div");
        for (WebElement element: elements)
        {
            list.add(element.getAttribute("href"));
        }
        return list;
    }
    public UnicornFooter clickCabanaAndPremiumSeatingInventory()
    {
        dh.click(by.cabanaAndPremiumSeatingInventory);
        return this;
    }

    public boolean isCabanaAndPremiumSeatingInventoryDisplayed()
    {
        return dh.isDisplayed(by.cabanaAndPremiumSeatingInventory);
    }

    public UnicornFooter clickAcpConfiguration()
    {
        dh.click(by.acpConfiguration);
        return this;
    }

    public boolean isAcpConfigurationDisplayed()
    {
        return dh.isDisplayed(by.acpConfiguration);
    }

    public UnicornFooter clickOperatingHours()
    {
        dh.click(by.operatingHours);
        return this;
    }

    public boolean isOperatingHoursDisplayed()
    {
        return dh.isDisplayed(by.operatingHours);
    }

    public UnicornFooter clickWaitTimeBoardContent()
    {
        dh.click(by.waitTimeBoardContent);
        return this;
    }

    public boolean isWaitTimeBoardContentDisplayed()
    {
        return dh.isDisplayed(by.waitTimeBoardContent);
    }


    public UnicornFooter clickPermissioningGroups()
    {
        dh.click(by.permissioningGroups);
        return this;
    }

    public boolean isPermissioningGroupsDisplayed()
    {
        return dh.isDisplayed(by.permissioningGroups);
    }

    public UnicornFooter clickUsers()
    {
        dh.click(by.users);
        return this;
    }

    public boolean isUsersDisplayed()
    {
        return dh.isDisplayed(by.users);
    }

    public UnicornFooter clickAcpLogs()
    {
        dh.click(by.acpLogs);
        return this;
    }

    public boolean isAcpLogsDisplayed()
    {
        return dh.isDisplayed(by.acpLogs);
    }

    public UnicornFooter clickOrdersSearch()
    {
        dh.click(by.ordersSearch);
        return this;
    }

    public boolean isOrdersSearchDisplayed()
    {
        return dh.isDisplayed(by.ordersSearch);
    }
    public UnicornFooter clickAclPermission()
    {
        dh.click(by.aclPermission,"");
        return this;
    }

    public boolean isAclPermissionDisplayed()
    {
        return dh.isDisplayed(by.aclPermission);
    }

    public UnicornFooter clickApplicationConfiguration()
    {
        dh.click(by.applicationConfiguration);
        return this;
    }

    public boolean isApplicationConfigurationDisplayed()
    {
        return dh.isDisplayed(by.applicationConfiguration);
    }

    public UnicornFooter clickAuditLogs()
    {
        dh.click(by.auditLogs);
        return this;
    }

    public boolean isAuditLogsDisplayed()
    {
        return dh.isDisplayed(by.auditLogs);
    }
    public UnicornFooter clickEnumerations()
    {
        dh.click(by.enumerations);
        return this;
    }

    public boolean isEnumerationsDisplayed()
    {
        return dh.isDisplayed(by.enumerations);
    }


    public UnicornFooter clickMediaInventory()
    {
        dh.click(by.mediaInventory);
        return this;
    }

    public boolean isMediaInventoryDisplayed()
    {
        return dh.isDisplayed(by.mediaInventory);
    }

    public UnicornFooter clickWaitTimeBoards()
    {
        dh.click(by.waitTimeBoards);
        return this;
    }

    public boolean isWaitTimeBoardsDisplayed()
    {
        return dh.isDisplayed(by.waitTimeBoards);
    }
    public UnicornFooter clickBeacons()
    {
        dh.click(by.beacons);
        return this;
    }

    public boolean isBeaconsDisplayed()
    {
        return dh.isDisplayed(by.beacons);
    }

    public UnicornFooter clickExperienceAccess()
    {
        dh.click(by.experienceAccess);
        return this;
    }

    public boolean isExperienceAccessDisplayed()
    {
        return dh.isDisplayed(by.experienceAccess);
    }

    public UnicornFooter clickLinkingConfiguration()
    {
        dh.click(by.linkingConfiguration);
        return this;
    }

    public boolean isLinkingConfigurationDisplayed()
    {
        return dh.isDisplayed(by.linkingConfiguration);
    }
    public UnicornFooter clickLocation()
    {
        dh.click(by.location);
        return this;
    }

    public boolean isLocationDisplayed()
    {
        return dh.isDisplayed(by.location);
    }

    public UnicornFooter clickAcps()
    {
        dh.click(by.acps);
        return this;
    }

    public boolean isAcpsDisplayed()
    {
        return dh.isDisplayed(by.acps);
    }
}