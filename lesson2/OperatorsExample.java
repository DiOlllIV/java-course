package lesson2;

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;

        int c1 = a / b; // division
        int c2 = a % b; // modulus

        System.out.println(c1);
        System.out.println(c2);

        a = a + 1;
        System.out.println(a);
        a++; // increment
        System.out.println(a);
        a--; // decrement
        System.out.println(a);

        int n  = 10;
        a += n; // a = a + n;
        System.out.println(a);
    }
}
