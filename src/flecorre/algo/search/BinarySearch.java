package flecorre.algo.search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {0, 2, 5, 23, 47, 124, 302};

        System.out.println(iterativeBinarySearch(array, 23));
        System.out.println(iterativeBinarySearch(array, 44));

        System.out.println(recursiveBinarySearch(array, 23));
        System.out.println(recursiveBinarySearch(array, 44));

    }

    private static int iterativeBinarySearch(int[] array, int value) {

        int start = 0;
        int end = array.length;

        while (start < end) {
            int mid = (start + end) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (value > array[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return -1;
    }

    private static int recursiveBinarySearch(int[] array, int value) {
        return recursiveBinarySearch(array, 0, array.length, value);
    }

    private static int recursiveBinarySearch(int[] array, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (array[mid] == value) {
            return mid;
        } else if (array[mid] > value) {
            return recursiveBinarySearch(array, 0, mid, value);
        } else {
            return recursiveBinarySearch(array, (mid + 1), end, value);
        }
    }

}
