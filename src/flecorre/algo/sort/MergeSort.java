package flecorre.algo.sort;

public class MergeSort {

/*
    divide and conquer algorithm, first split array until one-element arrays and merge
    not in-place algorithm
    O(n log n)
    stable algorithm
*/

    public static void main(String[] args) {
        int[] array = {0, 13, 5, -6, 938, 1, 34, 69};
        mergeSort(array, 0, array.length);
        print(array);
    }

    private static void mergeSort(int[] array, int start, int end) {
        if(end - start < 2) { //meaning we have an one-element array
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    private static void merge(int[] array, int start, int mid, int end) {

        if(array[mid-1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while(i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        System.arraycopy(array, i, array, start+tempIndex, mid-i); // if there is a leftover in the left array, this code will move the remaining value to the end of the right array
        System.arraycopy(temp, 0, array, start, tempIndex); // copy temp array back into original array

    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
