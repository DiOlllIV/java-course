package lesson4;

public class MethodExample {
    public static void main(String[] args) {
        int result = min(increaser(10, 5),11);
        System.out.println(result);
    }
    public static int increaser (int a, int index) {
        a += index;
        return a;
    }
    public static int min(int a , int b) {
        return Math.min(a, b);
    }

}

