package com.b2b.net.cinema;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private Movie dieHard = new Movie("die Hard", "Action", true, false);
    private Movie ironMan = new Movie("Iron Man","Action", false, true);

    @Test
    public void isMovieWithDubbing() {
        assertTrue(dieHard.isDubbing());
        assertFalse(ironMan.isDubbing());
    }

    @Test
    public void isMovieWithSubtitles() {
        assertFalse(dieHard.isSubtitles());
        assertTrue(ironMan.isSubtitles());
    }

    @Test
    public void isMovieGenreComedy() {
        assertEquals(dieHard.getGenre(), "Action");
        assertEquals(ironMan.getGenre(), "Action");
    }
}