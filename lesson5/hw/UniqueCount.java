package lesson5.hw;

public class UniqueCount {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 4, 2 , 1, 5};

        System.out.println(uniqueCount(myArray));
    }

    // [1, 2, 4, 2 , 1, 5]

    public static int uniqueCount(int[] array) {
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            count++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
