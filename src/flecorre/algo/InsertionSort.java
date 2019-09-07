package flecorre.algo;

public class InsertionSort {

/*
    first value is designed as sorted and we insert other values by shifting
    in-place algorithm
    O(n²) quadratic complexity
    stable algorithm
*/

    public static void main(String[] args) {

        int[] array = {0, 13, 5, -6, 938, 1, 34, 69};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i-1] > newElement; i--) {
                array[i] = array[i-1];
            }
            array[i] = newElement;
        }
        print(array);
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

}
