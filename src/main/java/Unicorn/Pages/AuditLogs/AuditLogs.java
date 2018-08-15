package Unicorn.Pages.AuditLogs;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class AuditLogs extends PageComponentBase<AuditLogs> {
    public AuditLogs()
    {
        title = "Audit Logging";
        url += "audits";
    }
    @Override
    public AuditLogs get() {
        getUrl();
        return isLoaded();
    }

    @Override
    protected RemoveRowFromTable<AuditLogs> clickDeleteSelectedRows() {
        return null;
    }
    public AuditLogs setCalendarFromInput(String calendarFromInput)
    {
        return super.setCalendarFromInput(calendarFromInput);
    }

    public String getCalendarFromInput()
    {
        return super.getCalendarFromInput();
    }

    public AuditLogs setCalendarTillInput(String calendarTillInput)
    {
        return super.setCalendarTillInput(calendarTillInput);
    }

    public String getCalendarTillInput()
    {
        return super.getCalendarTillInput();
    }
    public AuditLogs clickCalendarFromButton()
    {
        return super.clickCalendarFromButton();
    }
    public AuditLogs clickCalendarTillButton()
    {
        return clickCalendarFromButton();
    }
    public String getName(int oneBased){ return returnBoardString(oneBased,1); }

    public String getDate(int oneBased){ return returnBoardString(oneBased,2); }

    public String getOperation(int oneBased){ return returnBoardString(oneBased,3); }

    public String getActivity(int oneBased){ return returnBoardString(oneBased,4); }

    public AuditLogs sortName(){ return sortByHeader("Name"); }

    public AuditLogs sortDate(){ return sortByHeader("Date"); }

    public AuditLogs sortOperation(){ return sortByHeader("Operation"); }

    public AuditLogs sortActivity(){ return sortByHeader("Activity"); }

}