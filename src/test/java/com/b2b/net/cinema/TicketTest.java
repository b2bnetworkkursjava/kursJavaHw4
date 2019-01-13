package com.b2b.net.cinema;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicketTest {

    private Ticket ticket1 = new Ticket(15, 5, 7);
    private Ticket ticket2 = new Ticket(13, 4, 10);
    private Ticket ticket3 = new Ticket(25, 8, 14);
    private Ticket ticket4 = new Ticket(34, 10,5);
    private Ticket ticket5 = new Ticket(35, 1, 10);
    private Ticket ticket6 = new Ticket(10, 9, 5);
    private Ticket ticket7 = new Ticket(16, 14, 2);
    private Ticket ticket8 = new Ticket(39, 11,13);

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
        assertTrue(ticket1.getPrice() < 30);
        assertTrue(ticket2.getPrice() < 30);
        assertTrue(ticket3.getPrice() < 30);
        assertTrue(ticket6.getPrice() < 30);
        assertTrue(ticket7.getPrice() < 30);
    }

    @Test
    public void isTicketPriceHigh() {
        assertTrue(ticket4.getPrice() > 30.0);
        assertTrue(ticket5.getPrice() > 30.0);
        assertTrue(ticket8.getPrice() > 30.0);
    }

    @Test
    public void isPlaceHigh() {
        assertTrue(ticket2.getNoOfRow() > 7);
        assertTrue(ticket3.getNoOfRow() > 7);
        assertTrue(ticket5.getNoOfRow() > 7);
        assertTrue(ticket8.getNoOfRow() > 7);
    }


    @Test
    public void isPlaceMedium() {
        assertTrue(ticket1.getNoOfRow() > 3 && ticket1.getNoOfRow() < 9);
        assertTrue(ticket4.getNoOfRow() > 3 && ticket4.getNoOfRow() < 9);
        assertTrue(ticket6.getNoOfRow() > 3 && ticket6.getNoOfRow() < 9);
    }

    @Test
    public void isPlaceLow() {
        assertTrue(ticket7.getNoOfRow() < 5);
    }

    @Test
    public void isPlaceRight() {
        assertTrue(ticket1.getNoOfSeat() < 8);
        assertTrue(ticket2.getNoOfSeat() < 8);
        assertTrue(ticket5.getNoOfSeat() < 8);
        assertTrue(ticket7.getNoOfSeat() < 8);
    }

    @Test
    public void isPlaceLeft() {
        assertTrue(ticket7.getNoOfSeat() > 12);
    }

    @Test
    public void isPlaceCentral() {
        assertTrue(ticket3.getNoOfSeat() > 7 && ticket8.getNoOfSeat() < 13);
        assertTrue(ticket4.getNoOfSeat() > 7 && ticket8.getNoOfSeat() < 13);
        assertTrue(ticket6.getNoOfSeat() > 7 && ticket8.getNoOfSeat() < 13);
        assertTrue(ticket8.getNoOfSeat() > 7 && ticket8.getNoOfSeat() < 13);
    }
}