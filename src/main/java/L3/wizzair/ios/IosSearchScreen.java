package L3.wizzair.ios;

import L3.wizzair.movileapp.Input;
import L3.wizzair.movileapp.api.SearchScreen;

public class IosSearchScreen implements SearchScreen {

    @Override
    public Input leavingFrom(String airport) {
        System.out.println("IOS");
        Input input = new Input();
        input.airportName(airport);
        return input;
    }

    @Override
    public Input goingTo(String airport) {
        System.out.println("IOS");
        Input input = new Input();
        input.airportName(airport);
        return input;
    }

    @Override
    public void clickSearchFlights() {
        System.out.println("Click on search flight on IOS");
    }
}
