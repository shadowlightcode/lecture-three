package L3.wizzair.ios;

import L3.wizzair.movileapp.api.*;

public class IosMobileApp implements MobileApp {

    @Override
    public BoardingCardsScreen boardingCardsScreen() {
        return null;
    }

    @Override
    public SearchScreen searchScreen() {
        return new IosSearchScreen();
    }

    @Override
    public ToolBarScreen toolBarScreen() {
        return new IosToolBarScreen() ;
    }

    @Override
    public MenuScreen menuScreen() {
        return new IosMenuScreen();
    }

    @Override
    public FindMyBookingScreen findMyBookingScreen() {
        return new IosFindMyBookingScreen();
    }

    @Override
    public MainScreen mainScreen() {
        return new IosMainScreen();
    }
}
