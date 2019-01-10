package com.b2b.net.cinema;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    /**
     Przyklad prawidlowo zainicjalizowanych obiektow za pomoca konstruktora.
     Na wzor tego zainicjalizuj obiekty w pozostalych klasach testowych.
     */

    private Client ann = new Client(8, false);
    private Client john = new Client(20, true);
    private Client mark = new Client(18, true);
    private Client bob = new Client(13, false);
    private Client timmy = new Client(6, false);

    @Test
    public void isClientAdult() {
        assertTrue(john.isAdult());
        assertTrue(mark.isAdult());
    }

    @Test
    public void isClientNotAdult() {
        assertFalse(ann.isAdult());
        assertFalse(bob.isAdult());
        assertFalse(timmy.isAdult());
    }
}