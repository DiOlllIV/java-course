package lesson6;

import java.util.Date;

public class User {
    String name;
    int age;
    String city;
    Date lastActiveDate;
    boolean isActive;

    public User(String name, int age, String city, Date lastActiveDate, boolean isActive) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.lastActiveDate = lastActiveDate;
        this.isActive = isActive;
    }

    public User(String name) {
        this.name = name;
    }

    public User() {}



    public void login() {
        lastActiveDate = new Date();
        System.out.println();
    }
    public void isActive (boolean status) {
        isActive = status;
    }
    public void increaseAge () {
        age++;
    }
}
