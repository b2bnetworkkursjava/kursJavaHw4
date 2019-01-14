package com.b2b.net.cinema;

public class Ticket {

    private double price;
    private int noOfSeat;
    private int noOfRow;

public Ticket (double price, int noOfRow, int noOfSeat){

    this.price=price;
    this.noOfSeat=noOfSeat;
    this.noOfRow=noOfRow;
}

    public double getPrice() {
        return price;
    }

    public void setPrice() {
this.price=price;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat() {
this.noOfSeat=noOfSeat;
    }

    public int getNoOfRow() {
        return noOfRow;
    }

    public void setNoOfRow() {
this.noOfRow=noOfRow;
    }
}
