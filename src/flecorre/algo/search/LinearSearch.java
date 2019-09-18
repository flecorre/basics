package flecorre.algo.search;

public class LinearSearch {

    public static void main(String[] args) {

        int[] array = {0, 13, 5, -6, 938, 1, 34, 69};

        System.out.println(linearSearch(array, 1));
        System.out.println(linearSearch(array, 3));

    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
