// Binary Search

public class Problem110 {

    static int binarySearch(int arr[], int low, int high, int key) {
        if (low > high)
            return -1; // base case: not found

        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;

        else if (key < arr[mid])
            return binarySearch(arr, low, mid - 1, key); // left side

        else
            return binarySearch(arr, mid + 1, high, key); // right side
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 14, 20, 28, 34 };
        int key = 20;

        int index = binarySearch(arr, 0, arr.length - 1, key);

        System.out.println("Found at index: " + index);
    }
}
