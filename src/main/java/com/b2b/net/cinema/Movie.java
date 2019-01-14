package com.b2b.net.cinema;

public class Movie {

    private String title;
    private String genre;
    private boolean dubbing;
    private boolean subtitles;

    public Movie(String title, String genre, boolean dubbing, boolean subtitles) {
        this.title = title;
        this.genre = genre;
        this.dubbing = dubbing;
        this.subtitles = subtitles;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;

    }

    public boolean isDubbing() {
        return dubbing;
    }

    public void setDubbing(boolean dubbing) {
        this.dubbing = dubbing;

    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;

    }
}
