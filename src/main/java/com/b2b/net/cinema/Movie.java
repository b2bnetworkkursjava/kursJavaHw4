package com.b2b.net.cinema;

public class Movie {

    private String title;
    private String genre;
    private boolean dubbing;
    private boolean subtitles;

    public Movie(boolean dubbing, boolean subtitles) {
        this.title = title;
        this.genre = genre;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isDubbing() {
        return true;
    }

    public void setDubbing(boolean dubbing) {
this.dubbing = dubbing;
    }

    public boolean isSubtitles() {
        return true;
    }

    public void setSubtitles(boolean Subtitles) {
this.subtitles = subtitles;
    }
}
