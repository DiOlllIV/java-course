package lesson4.hw;

public class FindDiv {
    public static void main(String[] args) {
        System.out.println(findDivCount((short) -23, (short) -3, 2));
    }
    public static int findDivCount(short a, short b, int n) {
        int count = 0;
        for(short i = a; i <= b; i++) {
            if(i  % n == 0) {
                count++;
            }
        }
        return count;
    }
}
