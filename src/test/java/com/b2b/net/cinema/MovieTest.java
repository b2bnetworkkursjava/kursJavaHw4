package com.b2b.net.cinema;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private Movie dieHard = new Movie("Die Hard","action",false,true );
    private Movie ironMan = new Movie ("Iron Man","comedy",true,true);

    @Test
    public void isMovieWithDubbing() {
        assertTrue(ironMan.isDubbing());
    }

    @Test
    public void isMovieWithSubtitles() {
        assertTrue(dieHard.isSubtitles());
    }

    @Test
    public void isMovieGenreComedy() {
        assertEquals(ironMan.getGenre(), "comedy");
    }
}