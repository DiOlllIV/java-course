package lesson6;

import java.sql.SQLOutput;

public class Car {
    // fields
    int price;
    int yearOfmManufacturing;
    String ownerName;
    String color;
    double weight;
    int horsePower;

    // constructor

    public Car(int price, int yearOfmManufacturing, String ownerName) {
        this.price = price;
        this.yearOfmManufacturing = yearOfmManufacturing;
        this.ownerName = ownerName;
    }


    // methods

    void startRunning() {
        System.out.println("I am running");
    }

    void stopRunning() {
        System.out.println("I stopped running");
    }

    void changeOwner(String newOwnerName) {
        ownerName = newOwnerName;
    }

    // inner classes

    private class Test {

    }

}
