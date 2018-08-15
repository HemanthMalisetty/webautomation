package Unicorn.AdminPages;
import Unicorn.Pages.ACLPermission.ACLPermissions;
import Unicorn.Pages.ACPs.ACPList.ACP;
import Unicorn.Pages.ApplicationConfiguration.ApplicationKillSwitch;
import Unicorn.Pages.AuditLogs.AuditLogs;
import Unicorn.Pages.Beacons.Beacons;
import Unicorn.Pages.Dashboard;
import Unicorn.Pages.Enumerations.Enumerations;
import Unicorn.Pages.ExperienceAccess.ExperienceAccess;
import Unicorn.Pages.LinkingConfiguration.LinkingConfiguration;
import Unicorn.Pages.Location.Locations;
import Unicorn.Pages.Manifest.ManifestSummary;
import Unicorn.Pages.MediaInventory.Media;
import Unicorn.Pages.Orders.Orders;
import Unicorn.Pages.PermissioningGroups.PermissioningGroups;
import Unicorn.Pages.PremiumInventory.PremiumInventory;
import Unicorn.Pages.Users.Users;
import Unicorn.Pages.WaitTimeBoard.WaitTimeBoards;

public class AdminDashboard extends Dashboard<AdminDashboard>{
    public AdminDashboard()
    {
        super();
    }
    public ACP clickAcps()
    {
        super.clickAcp();
        return new ACP().isLoaded();
    }

    public boolean isAcpsDisplayed()
    {
        return super.isAcpsDisplayed();
    }
    public Beacons clickBeacons()
    {
        super.beacons();
        return new Beacons().isLoaded();
    }

    public boolean isBeaconsDisplayed()
    {
        return super.isBeaconsDisplayed();
    }

    public ExperienceAccess clickExperienceAccess()
    {
        super.experienceAccess();
        return new ExperienceAccess().isLoaded();
    }

    public ManifestSummary clickManifest()
    {
        super.manifest();
        return new ManifestSummary().isLoaded();
    }

    protected boolean isManifestDisplayed()
    {
        return super.isManifestDisplayed();
    }

    public boolean isExperienceAccessDisplayed()
    {
        return super.isExperienceAccessDisplayed();
    }

    public LinkingConfiguration clickLinkingConfiguration()
    {
        super.linkingConfiguration();
        return new LinkingConfiguration().isLoaded();
    }

    public boolean isLinkingConfigurationDisplayed()
    {
        return super.isLinkingConfigurationDisplayed();
    }

    public Locations clickLocations()
    {
        super.clickLocation();
        return new Locations().isLoaded();
    }

    public boolean isLocationDisplayed()
    {
        return super.isLocationDisplayed();
    }

    public Media clickMediaInventory()
    {
        super.mediaInventory();
        return new Media().isLoaded();
    }

    public boolean isMediaInventoryDisplayed()
    {
        return super.isMediaInventoryDisplayed();
    }
    
    public WaitTimeBoards clickWaitTimeBoard()
    {
        super.clickWaitTimeBoards();
        return new WaitTimeBoards().isLoaded();
    }

    protected boolean isWaitTimeBoardsDisplayed()
    {
        return super.isWaitTimeBoardsDisplayed();
    }

    public ACLPermissions clickAclPermissions()
    {
        super.clickAclPermission();
        return new ACLPermissions().isLoaded();
    }

    protected boolean isAclPermissionDisplayed()
    {
        return super.isAclPermissionDisplayed();
    }

    public ApplicationKillSwitch clickApplicationConfiguration()
    {
        super.clickApplicationConfigurations();
        return new ApplicationKillSwitch().isLoaded();
    }

    protected boolean isApplicationConfigurationDisplayed()
    {
        return super.isApplicationConfigurationDisplayed();
    }

    public AuditLogs clickAuditLogs()
    {
        super.auditLogs();
        return new AuditLogs().isLoaded();
    }

    protected boolean isAuditLogsDisplayed()
    {
        return super.isAuditLogsDisplayed();
    }

    public Enumerations clickEnumerations()
    {
        super.enumerations();
        return new Enumerations().isLoaded();
    }

    protected boolean isEnumerationsDisplayed()
    {
        return super.isEnumerationsDisplayed();
    }

    public PermissioningGroups clickPermissioningGroups()
    {
        super.permissioningGroups();
        return new PermissioningGroups().isLoaded();
    }

    protected boolean isPermissioningGroupsDisplayed()
    {
        return super.isPermissioningGroupsDisplayed();
    }

    public Users clickUsers()
    {
        super.users();
        return new Users().isLoaded();
    }

    protected boolean isUsersDisplayed()
    {
        return super.isUsersDisplayed();
    }

    public PremiumInventory clickCabanaAndPremiumSeatingInventory()
    {
        super.cabanaAndPremiumSeatingInventory();
        return new PremiumInventory().isLoaded();
    }

    public boolean isCabanaAndPremiumSeatingInventoryDisplayed()
    {
        return super.isCabanaAndPremiumSeatingInventoryDisplayed();
    }
    public Orders clickOrdersSearch()
    {
        super.ordersSearch();
        return new Orders().isLoaded();
    }

    public boolean isOrdersSearchDisplayed()
    {
        return super.isOrdersSearchDisplayed();
    }
}
