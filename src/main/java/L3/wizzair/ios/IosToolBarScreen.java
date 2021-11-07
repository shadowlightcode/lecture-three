package L3.wizzair.ios;

import L3.wizzair.movileapp.api.ToolBarScreen;

public class IosToolBarScreen implements ToolBarScreen {

    @Override
    public void clickMenu() {
        System.out.println("Click menu on IOS");
    }

    @Override
    public void clickSearch() {
        System.out.println("Click search on IOS");
    }
}
