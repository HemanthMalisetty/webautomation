package Unicorn.Pages.Enumerations;

import Unicorn.AbstractClasses.EnumerationBase;

public class AddNewEnumeration extends EnumerationBase<AddNewEnumeration> {

    public AddNewEnumeration()
    {
        url += "enumerations/id/create";
    }

    public Enumerations clickAdd(){ return super.clickAdd(); }
}