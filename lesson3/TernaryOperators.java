package lesson3;

public class TernaryOperators {
    public static void main(String[] args) {
        int a;
        byte b = 100;

        a = 500; // if b > 200
        a = 350; // if b <= 200
        a = b > 200 ? 500 : 350;
        System.out.println(a);
    }
}
