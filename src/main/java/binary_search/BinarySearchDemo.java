package binary_search;

import org.junit.Assert;

public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9};
        Assert.assertEquals(-1, binarySearch(arr, -1));
        Assert.assertEquals(1, binarySearch(arr, 3));
    }

    private static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int guess = arr[mid];
            if (guess == item) {
                return mid;
            }
            if (item > guess) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
