package quick_sort;

import java.util.Arrays;

public class QuickSortDemo {

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {

        int partition = partition(arr, start, end);

        if (partition - 1 > start) { // left sub array
            quickSort(arr, start, partition - 1);
        }
        if (partition + 1 < end) { // right sub array
            quickSort(arr, partition + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;

        return start;
    }
}
