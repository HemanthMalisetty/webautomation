package Unicorn.Pages.ExperienceAccess;

import Unicorn.AbstractClasses.ExperienceAccessBase;

public class AddNewExperienceAccess extends ExperienceAccessBase<AddNewExperienceAccess> {

    public AddNewExperienceAccess(){ url += "experience-access/create"; }

    public AddNewExperienceAccess get()
    {
        getUrl();
        return isLoaded();
    }

    public ExperienceAccess clickAdd(){ return super.clickAdd(); }
}