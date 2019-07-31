package selection_sort;

import java.util.Arrays;

public class SelectionSortDemo {

    public static void main(String[] args) {
        int[] in = {5, 3, 6, 2, 10};
        System.out.println(Arrays.toString(sort(in)));
    }

    private static int findSmallestIndex(int[] arr, int low) {
        int min = arr[low];
        int minIndex = low;
        for (int i = low + 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static int[] sort(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min = findSmallestIndex(arr, i);
            result[i] = arr[min];
            swap(arr, i, min);
        }
        return result;
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
}
