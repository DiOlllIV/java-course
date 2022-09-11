package lesson4.hw;

public class CompareSums {
    public static void main(String[] args) {
        System.out.println(compareSums(10, 18, 33, 37));
    }
    public static boolean compareSums(int a, int b, int c, int d) {
        int sum1 = 0;
        for(int i = a; i <= b; i++ ) {
            sum1 += i;
        }
        int sum2 = 0;
        for(int i = c; i <= d; i++ ) {
            sum2 += i;

        }
        return sum1 > sum2;
    }
}
