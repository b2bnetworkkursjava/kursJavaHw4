package com.b2b.net.cinema;

public class Ticket {

    private double price;
    private int noOfSeat;
    private int noOfRow;

    public Ticket(double price, int noOfRow, int noOfSeat) {
        this.price = price;
        this.noOfRow = noOfRow;
        this.noOfSeat = noOfSeat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public int getNoOfRow() {
        return noOfRow;
    }

    public void setNoOfRow(int noOfRow) {
        this.noOfRow = noOfRow;

    }
}
