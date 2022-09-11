package lesson4;

public class PractiseExample {
    public static void main(String[] args) {
        System.out.println(min(2, 3, 2));

        System.out.println(avarage(2));
        System.out.println(avarage(3, 10));
        System.out.println(avarage(2, 5));

        System.out.println(count(1, 100, 5));
    }

    public static int min(int a, int b, int c) {
        int res = a < b ? a : b;
        return res < c  ? res : c;
    }

    public static double avarage(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++ ){
            sum +=i;
        }
        return (double) sum / n;
    }

    public static double avarage(int a, int b) {
        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum += i;
        }

        return (double) sum / (b - a + 1);
    }

    public static int count(int a, int b, int n) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if(i % 10 == n) {
                count++;
            }
        }
        return count;
    }
}
