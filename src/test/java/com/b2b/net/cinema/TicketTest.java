package com.b2b.net.cinema;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicketTest {

    private Ticket ticket1 = new Ticket(25.0, 60, 8);
    private Ticket ticket2 = new Ticket(32.0, 80, 12);
    private Ticket ticket3 = new Ticket(10.0,50, 9 );
    private Ticket ticket4 = new Ticket(11.0,40,6);
    private Ticket ticket5 = new Ticket(9.0,20,3);
    private Ticket ticket6 = new Ticket(6.0,5,2);
    private Ticket ticket7 = new Ticket(9.0,13,5);
    private Ticket ticket8 = new Ticket(8.0, 12, 9);

    /**
    Cena biletu jest niska kiedy kosztuje mniej niz 30,-
    badz wysoka kiedy kosztuje wiecej niz 30,-
    Miejsce usytuowane jest wysoko, kiedy znajduje sie
    w rzedzie 8 badz wyzej, srednio kiedy znajduje sie
    w rzedzie od 4 do 8 i nisko, kiedy znajduje sie
    w rzedzie 4 badz nizej. Miejsce znajduje sie po
    prawej stronie, kiedy jego nr jest mniejszy niz 8,
    po lewej, kiedy nr jest wiekszy niz 12, a na srodku,
    kiedy nr zawiera sie pomiedzy 8, a 12.
     */

    @Test
    public void isTicketPriceLow() {
        assertTrue(ticket1.getPrice() < 30.0);
    }

    @Test
    public void isTicketPriceHigh() {
        assertTrue(ticket2.getPrice() > 30.0);
    }

    @Test
    public void isPlaceHigh() {
        assertTrue(ticket3.getNoOfRow() > 7);
    }

    @Test
    public void isPlaceMedium() {
        assertTrue(ticket4.getNoOfRow() > 3 && ticket4.getNoOfRow() < 8);
    }

    @Test
    public void isPlaceLow() {
        assertTrue(ticket5.getNoOfRow() < 4);
    }

    @Test
    public void isPlaceRight() {
        assertTrue(ticket6.getNoOfSeat() < 8);
    }

    @Test
    public void isPlaceLeft() {
        assertTrue(ticket7.getNoOfSeat() > 12);
    }

    @Test
    public void isPlaceCentral() {
        assertTrue(ticket8.getNoOfSeat() > 7 && ticket8.getNoOfSeat() < 13);
    }
}