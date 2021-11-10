package L3.wizzair;

import L3.wizzair.android.AndroidMobileApp;
import L3.wizzair.ios.IosMobileApp;
import L3.wizzair.movileapp.api.MobileApp;

public class TestApp {

    public static void main(String[] args) {

        System.out.println("Enter to app");
        MobileApp app = getApp();

        System.out.println("Click search");
        app.toolBarScreen().clickSearch();

        System.out.println("Enter to leavingFrom airport");
        app.searchScreen().leavingFrom("Kiev Borispil");

        System.out.println("Enter to goingTo airport");
        app.searchScreen().goingTo("kathmandu");

        System.out.println("Click search result");
        app.searchScreen().clickSearchFlights();

        System.out.println("Verify search output");
        System.out.println("====>>>  kathmandu found");
    }

    private static MobileApp getApp() {
        return System.getenv("platform").equals("IOS") ? new IosMobileApp() : new AndroidMobileApp();
    }
}
