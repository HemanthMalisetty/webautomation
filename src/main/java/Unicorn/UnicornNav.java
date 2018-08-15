package Unicorn;


import Unicorn.AdminPages.AdminDashboard;
import Unicorn.Pages.ACPs.ACPList.ACP;
import org.openqa.selenium.By;

public class UnicornNav{
    public Data data = new Data();
    public UnicornDriverHelper dh = new UnicornDriverHelper();
    public Monitoring monitoring = new Monitoring();
    public System system = new System();
    public Finance finance = new Finance();
    public Ops ops = new Ops();
    private UnicornNavBy by = new UnicornNavBy();

    private class UnicornNavBy{
        By      data = By.xpath("//*[contains(@class,'logo')]/..//li[contains(text(),'Data')]"),
                monitoring = By.xpath("//*[contains(@class,'logo')]/..//li[contains(text(),'Monitoring')]"),
                system = By.xpath("//*[contains(@class,'logo')]/..//li[contains(text(),'System')]"),
                finance = By.xpath("//*[contains(@class,'logo')]/..//li[contains(text(),'Finance')]"),
                ops = By.xpath("//*[contains(@class,'logo')]/..//li[contains(text(),'Ops')]"),
                logo = By.xpath("//header/div[contains(@class,'logo')]"),
                title = By.xpath("//h1"),
                username = By.xpath("//header//a[contains(@ng-click,'Account')]"),
                logout = By.xpath("//header//a[contains(@ng-click,'logout')]"),
                help = By.xpath("//header//span[contains(@class,'question-sign')]");
    }
    public boolean allNavItemsDisplayed(){
        return  isDataDisplayed()
                && isMonitoringDisplayed()
                && isSystemDisplayed()
                && isFinanceDisplayed()
                && isOpsDisplayed()
                && isLogoDisplayed()
                && isUsernameDisplayed()
                && isLogoutDisplayed()
                && isHelpDisplayed();
    }
    public boolean isNavActive(String navName){
        return dh.isDisplayed(By.xpath("//li[contains(@class,'link active') and contains(text(),'" + navName + "')]"));
    }
    public UnicornNav clickLogout()
    {
        dh.click(by.logout);
        return this;
    }

    public boolean isLogoutDisplayed()
    {
        return dh.isDisplayed(by.logout);
    }
    public UnicornNav clickHelp()
    {
        dh.click(by.help);
        return this;
    }

    public boolean isHelpDisplayed()
    {
        return dh.isDisplayed(by.help);
    }
    public UnicornNav clickUsername()
    {
        dh.click(by.username);
        return this;
    }

    public boolean isUsernameDisplayed()
    {
        return dh.isDisplayed(by.username);
    }

    public String getUserName()
    {
        return dh.getText(by.username);
    }
    public String getHeader()
    {
        return dh.getText(by.title);
    }
    public AdminDashboard clickLogo()
    {
        dh.click(by.logo);
        return new AdminDashboard().isLoaded();
    }

    public boolean isLogoDisplayed()
    {
        return dh.isDisplayed(by.logo);
    }


    public Data clickData()
    {
        dh.click(by.data);
        return new Data();
    }

    public boolean isDataDisplayed()
    {
        return dh.isDisplayed(by.data);
    }

    public Monitoring clickMonitoring()
    {
        dh.click(by.monitoring);
        return new Monitoring();
    }

    public boolean isMonitoringDisplayed()
    {
        return dh.isDisplayed(by.monitoring);
    }

    public System clickSystem()
    {
        dh.click(by.system);
        return new System();
    }

    public boolean isSystemDisplayed()
    {
        return dh.isDisplayed(by.system);
    }

    public Finance clickFinance()
    {
        dh.click(by.finance);
        return new Finance();
    }

    public boolean isFinanceDisplayed()
    {
        return dh.isDisplayed(by.finance);
    }

    public Ops clickOps()
    {
        dh.click(by.ops);
        return new Ops();
    }

    public boolean isOpsDisplayed()
    {
        return dh.isDisplayed(by.ops);
    }



    public class Data {
        DataBy by = new DataBy();
        public ACPs acps = new ACPs();
        public Data(){}

        private class DataBy{
            By      acps = By.xpath("//li[contains(text(),'ACPs')]"),
                    beacons = By.xpath("//li[contains(text(),'Beacons')]"),
                    experienceAccess = By.xpath("//li[contains(text(),'Experience Access')]"),
                    locations = By.xpath("//li[contains(text(),'Locations')]"),
                    linkingConfiguration = By.xpath("//li[contains(text(),'Linking Configuration')]"),
                    manifest = By.xpath("//li[contains(text(),'Manifest')]"),
                    waitTimeBoards = By.xpath("//li[contains(text(),'Wait Time Boards')]");

        }
        public boolean allSubNavItemsAreDisplayed()
        {
            return  isACPSsDisplayed()
                    && isExperienceAccessDisplayed()
                    && isLocationsDisplayed()
                    && isLinkingConfigurationDisplayed()
                    && isManifestDisplayed()
                    && isWaitTimeBoardsDisplayed();
        }
        public Data clickACPs()
        {
            dh.click(by.acps);
            return this;
        }

        public boolean isACPSsDisplayed()
        {
            return dh.isDisplayed(by.acps);
        }
        public Data clickBeacons()
        {
            dh.click(by.beacons);
            return this;
        }

        public boolean isBeaconsDisplayed()
        {
            return dh.isDisplayed(by.beacons);
        }

        public Data clickExperienceAccess()
        {
            dh.click(by.experienceAccess);
            return this;
        }

        public boolean isExperienceAccessDisplayed()
        {
            return dh.isDisplayed(by.experienceAccess);
        }

        public Data clickLocations()
        {
            dh.click(by.locations);
            return this;
        }

        public boolean isLocationsDisplayed()
        {
            return dh.isDisplayed(by.locations);
        }

        public Data clickLinkingConfiguration()
        {
            dh.click(by.linkingConfiguration);
            return this;
        }

        public boolean isLinkingConfigurationDisplayed()
        {
            return dh.isDisplayed(by.linkingConfiguration);
        }

        public Data clickMediaInventory()
        {
            dh.click(by.manifest);
            return this;
        }

        public boolean isManifestDisplayed()
        {
            return dh.isDisplayed(by.manifest);
        }

        public Data clickWaitTimeBoards()
        {
            dh.click(by.waitTimeBoards);
            return this;
        }

        public boolean isWaitTimeBoardsDisplayed()
        {
            return dh.isDisplayed(by.waitTimeBoards);
        }

        
        public class ACPs {
            private acpsBy by = new acpsBy();

            public class acpsBy {
                By  list = By.xpath("//li[contains(text(),'List')]"),
                    acpGroups = By.xpath("//li[contains(text(),'ACP Groups')]"),
                    acpGroupSettings = By.xpath("//li[contains(text(),'ACP Group Settings')]");
            }
            public ACP clickList()
            {
                dh.click(by.list);
                return new ACP();
            }

            public boolean isListDisplayed()
            {
                return dh.isDisplayed(by.list);
            }

            public ACPs clickAcpGroups()
            {
                dh.click(by.acpGroups);
                return this;
            }

            public boolean isAcpGroupsDisplayed()
            {
                return dh.isDisplayed(by.acpGroups);
            }

            public ACPs clickAcpGroupSettings()
            {
                dh.click(by.acpGroupSettings);
                return this;
            }

            public boolean isAcpGroupSettingsDisplayed()
            {
                return dh.isDisplayed(by.acpGroupSettings);
            }

        }

    }


    public class Monitoring {
        MonitoringBy by = new MonitoringBy();
        public Monitoring(){

        }

        private class MonitoringBy{
            By acpLogs = By.xpath("//li[contains(text(),'ACP Logs')]");
        }
        public Monitoring clickAcpLogs()
        {
            dh.click(by.acpLogs);
            return this;
        }
        
        public boolean isAcpLogsDisplayed()
        {
            return dh.isDisplayed(by.acpLogs);
        }

        

    }

    public class System {
        SystemBy by = new SystemBy();
        public System(){

        }

        private class SystemBy{
            By  aclPermissions = By.xpath("//li[contains(text(),'ACL Permissions')]"),
                applicationConfiguration = By.xpath("//li[contains(text(),'Application Configuration')]"),
                auditLogs = By.xpath("//li[contains(text(),'Audit Logs')]"),
                enumerations = By.xpath("//li[contains(text(),'Enumerations')]"),
                permissioningGroups = By.xpath("//li[contains(text(),'Permissioning Groups')]"),
                users = By.xpath("//li[contains(text(),'Users')]");
        }
        public boolean allSubNavItemsAreDisplayed()
        {
            return  isAclPermissionsDisplayed()
                    && isApplicationConfigurationDisplayed()
                    && isAuditLogsDisplayed()
                    && isEnumerationsDisplayed()
                    && isPermissioningGroupsDisplayed()
                    && isUsersDisplayed();
        }
        public System clickAclPermissions()
        {
            dh.click(by.aclPermissions);
            return this;
        }

        public boolean isAclPermissionsDisplayed()
        {
            return dh.isDisplayed(by.aclPermissions);
        }

        public System clickApplicationConfiguration()
        {
            dh.click(by.applicationConfiguration);
            return this;
        }

        public boolean isApplicationConfigurationDisplayed()
        {
            return dh.isDisplayed(by.applicationConfiguration);
        }

        public System clickAuditLogs()
        {
            dh.click(by.auditLogs);
            return this;
        }

        public boolean isAuditLogsDisplayed()
        {
            return dh.isDisplayed(by.auditLogs);
        }

        public System clickEnumerations()
        {
            dh.click(by.enumerations);
            return this;
        }

        public boolean isEnumerationsDisplayed()
        {
            return dh.isDisplayed(by.enumerations);
        }

        public System clickPermissioningGroups()
        {
            dh.click(by.permissioningGroups);
            return this;
        }

        public boolean isPermissioningGroupsDisplayed()
        {
            return dh.isDisplayed(by.permissioningGroups);
        }

        public System clickUsers()
        {
            dh.click(by.users);
            return this;
        }

        public boolean isUsersDisplayed()
        {
            return dh.isDisplayed(by.users);
        }


    }

    public class Finance {
        FinanceBy by = new FinanceBy();
        public Finance(){

        }

        private class FinanceBy{
            By  ordersSearch = By.xpath("//li[contains(text(),'Orders Search')]"),
                tenderTotals = By.xpath("//li[contains(text(),'Tender Totals')]");
        }
        public boolean allSubNavItemsAreDisplayeD()
        {
            return  isOrdersSearchDisplayed()
                    && isTenderTotalsDisplayed();
        }
        public Finance clickTenderTotals()
        {
            dh.click(by.tenderTotals);
            return this;
        }

        public boolean isTenderTotalsDisplayed()
        {
            return dh.isDisplayed(by.tenderTotals);
        }

        public Finance clickOrdersSearch()
        {
            dh.click(by.ordersSearch);
            return this;
        }

        public boolean isOrdersSearchDisplayed()
        {
            return dh.isDisplayed(by.ordersSearch);
        }


    }

    public class Ops {
        OpsBy by = new OpsBy();
        public Ops(){

        }

        private class OpsBy{
            By  premiumInventory = By.xpath("//li[contains(text(),'Premium Inventory')]"),
                acpConfiguration = By.xpath("//li[contains(text(),'ACP Configuration')]"),
                operatingHours = By.xpath("//li[contains(text(),'Operating Hours')]"),
                waitTimeBoardContent = By.xpath("//li[contains(text(),'Wait Time Board Content')]");
        }

        public boolean allSubNavItemsAreDisplayed()
        {
            return  isPremiumInventoryDisplayed()
                    && isAcpConfigurationDisplayed()
                    && isOperatingHoursDisplayed()
                    && isWaitTimeBoardContentDisplayed();
        }
        public Ops clickPremiumInventory()
        {
            dh.click(by.premiumInventory);
            return this;
        }

        public boolean isPremiumInventoryDisplayed()
        {
            return dh.isDisplayed(by.premiumInventory);
        }

        public Ops clickAcpConfiguration()
        {
            dh.click(by.acpConfiguration);
            return this;
        }

        public boolean isAcpConfigurationDisplayed()
        {
            return dh.isDisplayed(by.acpConfiguration);
        }

        public Ops clickOperatingHours()
        {
            dh.click(by.operatingHours);
            return this;
        }

        public boolean isOperatingHoursDisplayed()
        {
            return dh.isDisplayed(by.operatingHours);
        }

        public Ops clickWaitTimeBoardContent()
        {
            dh.click(by.waitTimeBoardContent);
            return this;
        }

        public boolean isWaitTimeBoardContentDisplayed()
        {
            return dh.isDisplayed(by.waitTimeBoardContent);
        }
    }
}


