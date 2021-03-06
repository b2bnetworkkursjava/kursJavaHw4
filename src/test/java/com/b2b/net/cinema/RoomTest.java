package com.b2b.net.cinema;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    private Room room1;
    private Room room2;
    private Room room3;

    /**
    Sala jest mala, jezeli ma mniej niz 100 miejsc,
    srednia kiedy ma wiecej niz 100 miejsc, ale mniej niz 200
    i duza, kiedy ma ponad 250 miejsc.
     */

    @Test
    public void isRoomSmallSize() {
        assertTrue(room1.getSize() < 100);
    }

    @Test
    public void isRoomMediumSize() {
        assertTrue(room2.getSize() > 100 && room2.getSize() < 200);
    }

    @Test
    public void isRoomLargeSize() {
        assertTrue(room3.getSize() > 250);
    }
}