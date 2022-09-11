package lesson2.hw;

public class SumAndDivision {
    public static void main(String[] args) {
        long sum = 0;

        for(int i = 1; i <= 1000; i++) {
            sum += i;
        }

        long wholePart = sum / 1234;
        long remainder = sum % 1234;
        System.out.println(remainder > wholePart);
    }
}
