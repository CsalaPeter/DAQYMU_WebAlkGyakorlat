package com.meiit.webalk.service;

import com.meiit.webalk.domain.BookingPerson;
import com.meiit.webalk.domain.Hotel;
import com.meiit.webalk.domain.Res;
import com.meiit.webalk.view.View;
import java.util.List;

public interface ReservationService {

    public void saveBookingPerson(BookingPerson bp);
    public BookingPerson findBookingperson();
    public List<Hotel> findAllHotels();
    public void saveReservation(Res r, View v);
    public List<Res> findAllReservation();
    public void checkIn(Res r);
    public void checkOut(Res r);
    public void init();
}
