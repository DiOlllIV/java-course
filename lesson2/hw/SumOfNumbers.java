package lesson2.hw;

public class SumOfNumbers {
    public static void main(String[] args) {
        long sum = 0;

        for(int a = 1; a <= 10000000; a++) {
            sum += a;
        }

        System.out.println(sum);
    }
}
