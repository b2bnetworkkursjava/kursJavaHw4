package com.b2b.net.cinema;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    private Room room1 = new Room("Room1", 125);
    private Room room2 = new Room("Room2", 76);
    private Room room3 = new Room("Room3", 269);

    /**
    Sala jest mala, jezeli ma mniej niz 100 miejsc,
    srednia kiedy ma wiecej niz 100 miejsc, ale mniej niz 200
    i duza, kiedy ma ponad 250 miejsc.
     */

    @Test
    public void isRoomSmallSize() {
        assertFalse(room1.getSize() < 100);
        assertTrue(room2.getSize() < 100);
        assertFalse(room3.getSize()<100);
    }

    @Test
    public void isRoomMediumSize() {
        assertTrue(room1.getSize() > 100 && room1.getSize() < 200);
        assertFalse(room2.getSize() > 100 && room2.getSize() < 200);
        assertFalse(room3.getSize() > 100 && room3.getSize() < 200);
    }

    @Test
    public void isRoomLargeSize() {
        assertFalse(room1.getSize() > 250);
        assertFalse(room2.getSize() > 250);
        assertTrue(room3.getSize() > 250);
    }
}