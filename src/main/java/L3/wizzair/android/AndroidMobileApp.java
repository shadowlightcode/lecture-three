package L3.wizzair.android;

import L3.wizzair.movileapp.api.*;

public class AndroidMobileApp implements MobileApp {

    @Override
    public BoardingCardsScreen boardingCardsScreen() {
        return null;
    }

    @Override
    public SearchScreen searchScreen() {
        return new AndroidSearchScreen();
    }

    @Override
    public ToolBarScreen toolBarScreen() {
        return new AndroidToolBarScreen() ;
    }

    @Override
    public MenuScreen menuScreen() {
        return new AndroidMenuScreen();
    }

    @Override
    public FindMyBookingScreen findMyBookingScreen() {
        return new AndroidFindMyBookingScreen();
    }

    @Override
    public MainScreen mainScreen() {
        return new AndroidMainScreen();
    }
}
