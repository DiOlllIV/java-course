package lesson4;

public class StringsExample {
    public static void main(String[] args) {
        int a = 12;
        String firstString = "text or something else as string";
        String secondString = firstString;
        secondString += a;
        System.out.println(secondString);
        System.out.println(firstString);
        System.out.println("hello!");
    }
}
