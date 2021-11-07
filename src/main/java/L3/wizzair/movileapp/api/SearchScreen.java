package L3.wizzair.movileapp.api;

import L3.wizzair.movileapp.Input;

public interface SearchScreen {

    Input leavingFrom(String airport);

    Input goingTo(String airport);

    void clickSearchFlights();

}
