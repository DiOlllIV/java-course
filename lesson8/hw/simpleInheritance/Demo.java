package lesson8.hw.simpleInheritance;

public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 2 * 3;
        Adder adder = new Adder();
        int[] myArray = {1, 200, -33, 3};
        System.out.println(adder.check(myArray));
        System.out.println(adder.add(20, 33));
    }
}
