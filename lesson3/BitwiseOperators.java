package lesson3;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 60; // a = 0011 1100
        int b = 13; // b = 0000 1101

        int c = 0;

        c = a & b; // 12 = 0000 1100
        System.out.println(c);
        c = a | b; // 61 = 0011 1101
        System.out.println(c);
        c = a ^ b; // 49 = 0011 0001
        System.out.println(c);
    }
}
