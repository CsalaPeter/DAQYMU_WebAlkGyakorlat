package com.meiit.webalk;

import com.meiit.webalk.domain.BookingPerson;
import com.meiit.webalk.domain.Res;
import com.meiit.webalk.domain.Room;
import com.meiit.webalk.service.Service;
import com.meiit.webalk.view.View;


public class App {
    Service s;
    View view;

    public App(Service service) {
    }


    public static void main(String[] args) {
        App app=new App(new Service());
        app.createBookingPerson();
        app.book();
        app.checkIn();
        app.checkOut();


    }
    public App(Service s,View v) {
        this.s=s;
        this.view=v;
        s.init();

    }
    public void createBookingPerson() {
        BookingPerson bookingperson = view.readBookingPerson();
        s.saveBookingPerson(bookingperson);
        view.printBalance(bookingperson);

    }
    public void book() {
        Room r = null;
        do {
            r = view.selectRoom(s.findAllHotels());
            if (r != null && s.findBookingperson().getBalance().compareTo(r.getPrice())>=0) {
                Res newReservation = new Res(s.findBookingperson().getName(), r);
                s.saveReservation(newReservation, view);
            }
            else if (r!=null && s.findBookingperson().getBalance().compareTo(r.getPrice())<0) {
                view.printNotEnoughBalance(s.findBookingperson());
            }
        }while (r!=null);
    }


    public void checkIn() {
        if(s.findAllReservation().isEmpty()==false) {
            view.printCheckIn();
        }
    }
    public void checkOut() {
        if(s.findAllReservation().isEmpty()==false) {
            view.printCheckOut();
            view.printBalance(s.findBookingperson());
        }
    }
}
