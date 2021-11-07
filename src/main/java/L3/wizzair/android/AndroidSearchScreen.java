package L3.wizzair.android;

import L3.wizzair.movileapp.Input;
import L3.wizzair.movileapp.api.SearchScreen;

public class AndroidSearchScreen implements SearchScreen {

    @Override
    public Input leavingFrom(String airport) {
        Input input = new Input();
        input.airportName(airport);
        return input;
    }

    @Override
    public Input goingTo(String airport) {
        Input input = new Input();
        input.airportName(airport);
        return input;
    }

    @Override
    public void clickSearchFlights() {
        System.out.println("Click on search flight");
    }
}
