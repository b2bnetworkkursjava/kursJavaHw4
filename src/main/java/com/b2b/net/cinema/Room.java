package com.b2b.net.cinema;

public class Room {

    private String name;
    private int size;

    public Room(String name, int size) {
        this.name=name;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
this.name=name;
    }

    public int getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }
}
