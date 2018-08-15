package Unicorn.Pages.ACPs.ACPList;

import Unicorn.AbstractClasses.ACPsBase;

public class AddNewACP extends ACPsBase<AddNewACP> {

    public AddNewACP()
    {
        url += "acps/create";
    }
    public AddNewACP get()
    {
        getUrl();
        return isLoaded();
    }
    public ACP clickAdd()
    {
        return super.clickAdd();
    }
}
