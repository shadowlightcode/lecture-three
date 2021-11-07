package L3.wizzair.android;

import L3.wizzair.movileapp.api.ToolBarScreen;

public class AndroidToolBarScreen implements ToolBarScreen {

    @Override
    public void clickMenu() {
        System.out.println("Click menu on Android");
    }

    @Override
    public void clickSearch() {
        System.out.println("Click search on Android");
    }
}
