package flecorre.algo;

public class BubbleSort {

/*
    swap adjacent values to move large value to the right like bubbles
    in-place algorithm
    O(n²) quadratic complexity
    stable algorithm
*/

    public static void main(String[] args) {

        int[] array = {0, 13, 5, -6, 938, 1, 34, 69};

        for(int lastUnsortedIndex = array.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(array[i] > array[i+1]) {
                    swap(array, i, i+1);
                }
            }
        }

        print(array);
    }

    private static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
