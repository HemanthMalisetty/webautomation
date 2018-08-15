package Unicorn.Pages.ExperienceAccess;

import Unicorn.SiteComponent.PageComponentBase;
import Unicorn.SiteComponent.RemoveRowFromTable;

public class ExperienceAccess extends PageComponentBase<ExperienceAccess> {

    public ExperienceAccess()
    {
        title = "Experience Access";
        url += "experience-access";
    }
    @Override
    public ExperienceAccess get() {
        getUrl();
        return isLoaded();
    }

    @Override
    public RemoveRowFromTable<ExperienceAccess> clickDeleteSelectedRows() {
        super.deleteSelectedRows();
        return new RemoveRowFromTable<>(new ExperienceAccess());
    }

    public AddNewExperienceAccess clickAdd() {
        super.add();
        return new AddNewExperienceAccess().isLoaded();
    }

    public ExperienceAccess selectRow(int oneBased){ return super.selectRow(oneBased); }

    public EditExperienceAccess clickRow(int oneBased)
    {
        super.clickOnRow(oneBased);
        return new EditExperienceAccess().isLoaded();
    }

    public ExperienceAccess sortAccessID() { return super.sortByHeader("Access Id"); }

    public ExperienceAccess sortDescription(){ return super.sortByHeader("Description"); }

    public ExperienceAccess sortLocation(){ return super.sortByHeader("Location"); }

    public String getAccessID(int oneBased){return returnBoardString(oneBased, 2); }

    public String getDescription(int oneBased){ return returnBoardString(oneBased,3 ); }

    public String getLocation(int oneBased){ return returnBoardString(oneBased,4); }

}