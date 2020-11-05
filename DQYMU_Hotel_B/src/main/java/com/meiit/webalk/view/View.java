package com.meiit.webalk.view;

import java.util.List;
import com.meiit.webalk.domain.*;

public interface View {
    BookingPerson readBookingPerson();

    void printWelcomeMessage(BookingPerson a);

    void printBalance(BookingPerson a);

    void printRooms(List<Hotel> a);

    Room selectRoom(List<Hotel> a);

    void printReservationSaved(Res a);

    void printNotEnoughBalance(BookingPerson a);

    void printCheckIn();

    void printCheckOut();

    void printReservedRooms(List<Hotel> hotel, List<Res> reservation);

    void printReservationDetails(List<Hotel> a, int index);
}

