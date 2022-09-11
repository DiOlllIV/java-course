package lesson5;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] myArray = {1, 10, 22, 2, 7};
        int result = maxElement(myArray);
        System.out.println(result);
        int[] myArray2 = {1, 2, 11, 3, 6, 2, 5, 4, 2};
        System.out.println(nCount(myArray2, 2));
    }

    public static int maxElement(int[] array) {
        int result = 0;
        for (int elem : array) {
            result = result < elem ? elem : result;
        }
        return result;
    }

    public static int nCount(int[] array, int n) {
        int count = 0;
        for (int elem : array) {
            if (elem == n)
                count++;
        }
        return count;
    }
}
