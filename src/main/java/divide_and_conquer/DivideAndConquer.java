package divide_and_conquer;

public class DivideAndConquer {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {2, 4, 6};
        System.out.println("Sum of array:");
        System.out.println(sumOfArray(arr1));
        System.out.println(sumOfArray(arr2));
        System.out.println("---------------");
        System.out.println("Count elements of array:");
        System.out.println(countNumOfArray(arr1));
        System.out.println(countNumOfArray(arr2));

    }

    private static int sumOfArray(int[] arr) {
        int result;
        if (arr.length == 1) {
            result = arr[0];
        } else {
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 1, newArr, 0, newArr.length);
            result = arr[0] + sumOfArray(newArr);
        }
        return result;
    }

    private static int countNumOfArray(int[] arr) {
        int result;
        if (arr.length == 1) {
            result = 1;
        } else {
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 1, newArr, 0, newArr.length);
            result = 1 + countNumOfArray(newArr);
        }
        return result;
    }
}
