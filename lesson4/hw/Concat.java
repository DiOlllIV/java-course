package lesson4.hw;

public class Concat {
    public static void main(String[] args) {
        System.out.println(concat("hello ", "my name is Danya", " and I am 13 years old"));
    }

    public static String concat(String a, String b, String c) {
        return a + b + c;
    }

}
