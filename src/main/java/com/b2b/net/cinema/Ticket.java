package com.b2b.net.cinema;

public class Ticket {

    private double price;
    private int noOfSeat;
    private int noOfRow;

    public Ticket(double price, int noOfSeat, int noOfRow) {
        this.price = price;
        this.noOfSeat = noOfSeat;
        this.noOfRow = noOfRow;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int newNoOfSeat) {
        this.noOfSeat = newNoOfSeat;
    }

    public int getNoOfRow() {
        return noOfRow;
    }

    public void setNoOfRow(int newNoOfRow) {
        this.noOfRow = newNoOfRow;
    }
}
