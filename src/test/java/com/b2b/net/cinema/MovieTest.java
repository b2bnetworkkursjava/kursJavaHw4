package com.b2b.net.cinema;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private Movie dieHard = new Movie("Die Hard","comedy", true, true);
    private Movie ironMan = new Movie( "Iron Man","comedy", true, true );

    @Test
    public void isMovieWithDubbing() {
        assertTrue(dieHard.isDubbing());
        assertTrue(ironMan.isDubbing());
    }

    @Test
    public void isMovieWithSubtitles() {
        assertTrue(dieHard.isSubtitles());
        assertTrue(ironMan.isSubtitles());
    }

    @Test
    public void isMovieGenreComedy() {
        assertEquals(dieHard.getGenre(), "comedy");
        assertEquals(ironMan.getGenre(), "comedy");
    }
}