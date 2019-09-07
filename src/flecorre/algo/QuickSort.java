package flecorre.algo;

public class QuickSort {

/*
    divide and conquer algorithm like merge sort but tends to be quicker
    in-place algorithm
    O(n log n)
    unstable algorithm
*/

    public static void main(String[] args) {

        int[] array = {0, 13, 5, -6, 938, 1, 34, 69};

        quickSort(array, 0, array.length);


        print(array);
    }

    private static void quickSort(int[] array, int start, int end) {

        if(end - start < 2) { //meaning we have an one-element array
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex);
        quickSort(array, pivotIndex + 1, end);

    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[start];
        int i = start;
        int j = end;

        while(i < j) {

            // find first value less than pivot
            while(i < j && array[--j] >= pivot);
            if(i < j) {
                array[i] = array[j];
            }

            // find first value greater than pivot
            while(i < j && array[++i] <= pivot);
            if(i < j) {
                array[j] = array[i];
            }

        }

        array[j] = pivot;
        return j;
    }


    private static void print(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
