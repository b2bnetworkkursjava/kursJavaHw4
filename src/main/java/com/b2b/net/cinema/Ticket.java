package com.b2b.net.cinema;

public class Ticket {

    private double price;
    private int noOfSeat;
    private int noOfRow;

    public Ticket (double price, int noOfSeat, int noOfRow) {
        this.price = price;
        this.noOfSeat = noOfSeat;
        this.noOfRow = noOfRow;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {this.price = price;
    }

    public int getNoOfSeat() { return noOfSeat; }
    public void setNoOfSeat(int noOfSeat) {this.noOfSeat = noOfSeat;

    }

    public int getNoOfRow() { return noOfRow; }
    public void setNoOfRow(int noOfRow) {this.noOfRow = noOfRow;

    }
}
