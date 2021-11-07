package L3.wizzair.movileapp.api;

import L3.wizzair.movileapp.Input;

public interface FindMyBookingScreen {

    Input passengerLastNameInput(String lastName);

    Input confirmationCodeInput(String firstName);

    void clickFindMyBooking();
}
