package Unicorn;

import Unicorn.AdminPages.AdminDashboard;
import Unicorn.AdminPages.AdminLogin;
import Unicorn.Pages.Dashboard;

public class Unicorn {

    // Static wrapper so that you can begin method chain
    // without instantiation.
    public static AdminLogin adminLogin()
    {
        return new AdminLogin().get();
    }
    public static AdminDashboard adminDashboard()
    {
        return new AdminDashboard().isLoaded();
    }
}
