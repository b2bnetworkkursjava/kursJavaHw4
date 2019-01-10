package com.b2b.net.cinema;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    private Movie dieHard;
    private Movie ironMan;

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