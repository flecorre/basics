package flecorre.algo;

public class ShellSort {

/*
    Use a gap to reduce amount of shifting. Can also be used to improve bubble sort
    in-place algorithm
    complexity hard to guess, depending on if array is almost sorted or not
    worst case: O(n²) quadratic complexity
    unstable algorithm (because of the gap we can jump over same numbers)
*/

    public static void main(String[] args) {

        int[] array = {0, 13, 5, -6, 938, 1, 34, 69};

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }

        print(array);
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

}
