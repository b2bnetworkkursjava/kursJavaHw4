package com.b2b.net.cinema;

public class Movie {

    private String title;
    private String genre;
    private boolean isDubbing;
    private boolean isSubtitles;

    public Movie(String title, String genre, boolean dubbing, boolean subtitles) {
        this.title = title;
        this.genre = genre;
        this.isDubbing = dubbing;
        this.isSubtitles = subtitles;
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

    public void setGenre(String genre) { this.genre = genre;

    }

    public boolean isDubbing() {
        return isDubbing;
    }

    public void setDubbing(boolean dubbing) { isDubbing = dubbing;

    }

    public boolean isSubtitles() {
        return isSubtitles;
    }

    public void setSubtitles(boolean subtitles ) { isSubtitles = subtitles;

    }
}
