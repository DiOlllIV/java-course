package lesson7;

import lesson6.Car;
import lesson6.DbConnector;
import lesson6.User;

public class Demo {
    public static void main(String[] args) {
        // how to create an object:
        // class name (type) object name = new class name(attributes);
        // or class name (type) object name = new class name();

        User user = new User();
        User user1 = new User();
        User user2 = new User();
        user1.login();

        User user33 = new User("Jack");

        Car car = new Car(10000, 2015, "Anton");

        DbConnector connector = new DbConnector(); // Each class declared empty constructor implicitly
        // but you have to create the empty constructor if you already declared another within this class

        // -----------------

    }
}
