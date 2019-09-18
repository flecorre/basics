package flecorre.algo.sort;

public class CountingSort {

/*
    count number of occurrences in array
    doesn't use comparisons
    works on discrete non negative value within a specific range
    O(n) linear complexity
    unstable algorithm
*/

    public static void main(String[] args) {

        int[] array = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(array, 2, 10);

        print(array);
    }

    private static void countingSort(int[] array, int min, int max) {

        int[] countingArray = new int[(max - min) + 1];

        for(int value : array) {
            countingArray[(value - min)]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++) {
            while(countingArray[i - min] > 0) {
                array[j++] = i;
                countingArray[i - min]--;
            }
        }

    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
