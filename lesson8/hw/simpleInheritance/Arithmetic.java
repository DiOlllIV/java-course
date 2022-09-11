package lesson8.hw.simpleInheritance;

public class Arithmetic {
    boolean check(int[] array) {
        int maximum = 0;
        int minimum = 0;
        for (int i = 0; i < array.length; i++) {
            maximum = Math.max(array[i], maximum);
        }
        for (int i = 0; i < array.length; i++) {
            minimum = Math.min(array[i], minimum);
        }

        return (maximum + minimum) > 100;
    }
}
