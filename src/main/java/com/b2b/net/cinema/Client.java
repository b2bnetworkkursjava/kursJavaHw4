package com.b2b.net.cinema;

public class Client {

    /**
     Klasa pokazowa, na wzor tego uzupelnij pozostale klasy.
     Konstruktory w kazdej z klas i wszystkie metody get i set.
     */

    private int age;
    private boolean isAdult;

    public Client(int age, boolean isAdult) {
        this.age = age;
        this.isAdult = isAdult;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }
}
